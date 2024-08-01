package com.gabrielsmm.soapclient.controllers;

import com.gabrielsmm.soapclient.services.CorreiosService;
import com.gabrielsmm.soapclient.wsdl.EnderecoERP;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/correios")
public class CorreiosController {

    @Autowired
    private CorreiosService service;

    @GetMapping("/buscar-endereco/{cep}")
    public ResponseEntity<EnderecoERP> getEndereco(@PathVariable String cep) {
        EnderecoERP endereco = service.getEndereco(cep);
        return ResponseEntity.ok().body(endereco);
    }


}
