package com.gabrielsmm.soapclient.util;

import com.gabrielsmm.soapclient.wsdl.AtendeCliente;
import jakarta.xml.ws.Service;

import javax.xml.namespace.QName;
import java.net.MalformedURLException;
import java.net.URL;

public class Conexao {

    private static final String WSDL = "https://apps.correios.com.br/SigepMasterJPA/AtendeClienteService/AtendeCliente?wsdl";
    private static final String TARGET = "http://cliente.bean.master.sigep.bsb.correios.com.br/";
    private static final String NAME = "AtendeClienteService";

    private static final AtendeCliente servicoCorreio = conexao();

    private static AtendeCliente conexao() {
        try {
            URL url = new URL(WSDL);
            QName qname = new QName(TARGET, NAME);
            Service service = Service.create(url, qname);
            return service.getPort(AtendeCliente.class);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static AtendeCliente getServicocorreio() {
        return servicoCorreio;
    }

}
