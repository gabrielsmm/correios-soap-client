
package com.gabrielsmm.soapclient.wsdl;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Classe Java de acao.</p>
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.</p>
 * <pre>{@code
 * <simpleType name="acao">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="DEVOLVIDO_AO_REMETENTE"/>
 *     <enumeration value="ENCAMINHADO_PARA_REFUGO"/>
 *     <enumeration value="REINTEGRADO_E_DEVOLVIDO_AO_REMETENTE"/>
 *     <enumeration value="DESBLOQUEADO"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "acao")
@XmlEnum
public enum Acao {

    DEVOLVIDO_AO_REMETENTE,
    ENCAMINHADO_PARA_REFUGO,
    REINTEGRADO_E_DEVOLVIDO_AO_REMETENTE,
    DESBLOQUEADO;

    public String value() {
        return name();
    }

    public static Acao fromValue(String v) {
        return valueOf(v);
    }

}
