package com.FI.EscolaOn.Controller;

import com.FI.EscolaOn.entity.Aluno;
import com.FI.EscolaOn.Enuns.NivelAcesso;
import com.FI.EscolaOn.service.impl.AlunoService;
import com.FI.EscolaOn.dto.AlunoDTO;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.ZoneId;

@RestController
@RequestMapping("/Aluno")
@CrossOrigin(origins = "*")
public class AlunoController {

    @Autowired
    AlunoService alunoService;

    @PostMapping
    public ResponseEntity<Object> saveAluno(@RequestBody @Valid AlunoDTO alunoDTO){

        var aluno = new Aluno();
        BeanUtils.copyProperties(alunoDTO, aluno);
        if(alunoDTO.getNivelDeAcesso().equals("aluno")){
            aluno.setNiveldeacesso(NivelAcesso.ALUNO);
        } else if (alunoDTO.getNivelDeAcesso().equals("professor")) {
            aluno.setNiveldeacesso(NivelAcesso.PROFESSOR);
        }else {
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Este nível de Acesso não existe");
        }
        aluno.setDataDeCadastro(LocalDateTime.now(ZoneId.of("UTC")));
        return ResponseEntity.status(HttpStatus.CREATED).body(alunoService.save(aluno));

    }

}
