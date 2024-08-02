package com.gabrielsmm.soapclient.util;

import com.gabrielsmm.soapclient.wsdl.AtendeCliente;
import jakarta.annotation.PostConstruct;
import jakarta.xml.ws.Service;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.xml.namespace.QName;
import java.net.URI;
import java.net.URL;

@Component
public class Conexao {

    private static final String WSDL = "https://apps.correios.com.br/SigepMasterJPA/AtendeClienteService/AtendeCliente?wsdl";
    private static final String TARGET = "http://cliente.bean.master.sigep.bsb.correios.com.br/";
    private static final String NAME = "AtendeClienteService";

    @Value("${correios.usuario}")
    private String usuario;

    @Value("${correios.senha}")
    private String senha;

    private static String USUARIO;
    private static String SENHA;
    private static AtendeCliente servicoCorreio;

    @PostConstruct
    private void init() {
        USUARIO = this.usuario;
        SENHA = this.senha;
        servicoCorreio = conexao();
    }

    private AtendeCliente conexao() {
        try {
            URL url = new URI(WSDL).parseServerAuthority().toURL();
            QName qname = new QName(TARGET, NAME);
            Service service = Service.create(url, qname);
            return service.getPort(AtendeCliente.class);
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public static AtendeCliente getServicocorreio() {
        return servicoCorreio;
    }

    public static String getUSUARIO() {
        return USUARIO;
    }

    public static String getSENHA() {
        return SENHA;
    }

}
