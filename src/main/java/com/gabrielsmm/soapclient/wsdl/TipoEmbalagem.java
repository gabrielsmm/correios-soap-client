
package com.gabrielsmm.soapclient.wsdl;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Classe Java de tipoEmbalagem.</p>
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.</p>
 * <pre>{@code
 * <simpleType name="tipoEmbalagem">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="DE"/>
 *     <enumeration value="PD"/>
 *     <enumeration value="RL"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "tipoEmbalagem")
@XmlEnum
public enum TipoEmbalagem {

    DE,
    PD,
    RL;

    public String value() {
        return name();
    }

    public static TipoEmbalagem fromValue(String v) {
        return valueOf(v);
    }

}
