package com.gabrielsmm.soapclient.util;

import java.util.regex.Pattern;

public class UteisMetodos {

    private static final String CEP_REGEX = "^[0-9]{8}$";
    private static final Pattern CEP_PATTERN = Pattern.compile(CEP_REGEX);

    /**
     * Valida se o CEP fornecido está no formato correto (8 dígitos sem hífen).
     *
     * @param cep o CEP a ser validado
     * @return true se o CEP for válido, false caso contrário
     */
    public static boolean validarCep(String cep) {
        if (cep == null) {
            return false;
        }
        return CEP_PATTERN.matcher(cep).matches();
    }

}
