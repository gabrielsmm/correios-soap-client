package com.gabrielsmm.soapclient.services;

import com.gabrielsmm.soapclient.exceptions.ConexaoException;
import com.gabrielsmm.soapclient.exceptions.ValidacaoException;
import com.gabrielsmm.soapclient.util.Conexao;
import com.gabrielsmm.soapclient.util.UteisMetodos;
import com.gabrielsmm.soapclient.wsdl.AtendeCliente;
import com.gabrielsmm.soapclient.wsdl.EnderecoERP;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CorreiosService {

    private AtendeCliente atendeCliente;

    @Autowired
    public CorreiosService(Conexao conexao) {
        atendeCliente = Conexao.getServicocorreio();
    }

    public EnderecoERP getEndereco(String cep) {
        if (!UteisMetodos.validarCep(cep)) throw new ValidacaoException("CEP inválido.");

        try {
            return atendeCliente.consultaCEP(cep, Conexao.getUSUARIO(), Conexao.getSENHA());
        } catch (Exception e) {
            throw new ConexaoException("Erro ao realizar a consulta pelo CEP. " + e.getMessage());
        }
    }

}
