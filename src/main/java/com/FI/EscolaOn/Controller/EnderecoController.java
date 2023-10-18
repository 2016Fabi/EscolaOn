package com.FI.EscolaOn.Controller;

import com.FI.EscolaOn.entity.Endereco;
import com.FI.EscolaOn.service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Endereco")
@CrossOrigin(origins = "*")
public class EnderecoController {
    @Autowired
    EnderecoService enderecoService;
    @PostMapping
    ResponseEntity<Object> saveEndereco(@RequestBody Endereco endereco){
        return ResponseEntity.status(HttpStatus.CREATED).body(enderecoService.save(endereco));
    }
}
