package com.gabrielsmm.soapclient.services;

import com.gabrielsmm.soapclient.exceptions.ConexaoException;
import com.gabrielsmm.soapclient.util.Conexao;
import com.gabrielsmm.soapclient.wsdl.*;
import org.springframework.stereotype.Service;

import java.lang.Exception;

@Service
public class CorreiosService {

    private AtendeCliente atendeCliente;

    public CorreiosService() {
        atendeCliente = Conexao.getServicocorreio();
    }

    public EnderecoERP getEndereco(String cep) {
        try {
            return atendeCliente.consultaCEP(cep, "", "");
        } catch (Exception e) {
            throw new ConexaoException("Erro ao realizar a consulta pelo CEP. " + e.getMessage());
        }
    }

}
