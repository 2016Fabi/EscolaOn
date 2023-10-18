package com.FI.EscolaOn.Controller;

import com.FI.EscolaOn.entity.Aluno;
import com.FI.EscolaOn.Enuns.NivelAcesso;
import com.FI.EscolaOn.service.AlunoService;
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
        if(alunoService.existsBycpf(alunoDTO.getCpf())){
              return ResponseEntity.status(HttpStatus.CONFLICT).body("O CPF já existe");
        }
        BeanUtils.copyProperties(alunoDTO, aluno);
        aluno.setDataDeCadastro(LocalDateTime.now(ZoneId.of("UTC")));
        aluno.setNiveldeacesso(NivelAcesso.ALUNO);
        return ResponseEntity.status(HttpStatus.CREATED).body(alunoService.save(aluno));

    }

}
