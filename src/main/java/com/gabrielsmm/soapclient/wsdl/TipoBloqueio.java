
package com.gabrielsmm.soapclient.wsdl;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Classe Java de tipoBloqueio.</p>
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.</p>
 * <pre>{@code
 * <simpleType name="tipoBloqueio">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="FRAUDE_BLOQUEIO"/>
 *     <enumeration value="EXTRAVIO_VAREJO_PRE_INDENIZADO"/>
 *     <enumeration value="EXTRAVIO_VAREJO_POS_INDENIZADO"/>
 *     <enumeration value="EXTRAVIO_CORPORATIVO"/>
 *     <enumeration value="INTERNACIONAL_LDI"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "tipoBloqueio")
@XmlEnum
public enum TipoBloqueio {

    FRAUDE_BLOQUEIO,
    EXTRAVIO_VAREJO_PRE_INDENIZADO,
    EXTRAVIO_VAREJO_POS_INDENIZADO,
    EXTRAVIO_CORPORATIVO,
    INTERNACIONAL_LDI;

    public String value() {
        return name();
    }

    public static TipoBloqueio fromValue(String v) {
        return valueOf(v);
    }

}
