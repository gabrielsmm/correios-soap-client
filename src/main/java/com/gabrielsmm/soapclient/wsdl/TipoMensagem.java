
package com.gabrielsmm.soapclient.wsdl;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Classe Java de tipoMensagem.</p>
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.</p>
 * <pre>{@code
 * <simpleType name="tipoMensagem">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="A"/>
 *     <enumeration value="E"/>
 *     <enumeration value="S"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "tipoMensagem")
@XmlEnum
public enum TipoMensagem {

    A,
    E,
    S;

    public String value() {
        return name();
    }

    public static TipoMensagem fromValue(String v) {
        return valueOf(v);
    }

}
