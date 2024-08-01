
package com.gabrielsmm.soapclient.wsdl;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Classe Java de categoriaServico.</p>
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.</p>
 * <pre>{@code
 * <simpleType name="categoriaServico">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="SEM_CATEGORIA"/>
 *     <enumeration value="PAC"/>
 *     <enumeration value="SEDEX"/>
 *     <enumeration value="CARTA"/>
 *     <enumeration value="GRANDES_FORMATOS"/>
 *     <enumeration value="REVERSO"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "categoriaServico")
@XmlEnum
public enum CategoriaServico {

    SEM_CATEGORIA,
    PAC,
    SEDEX,
    CARTA,
    GRANDES_FORMATOS,
    REVERSO;

    public String value() {
        return name();
    }

    public static CategoriaServico fromValue(String v) {
        return valueOf(v);
    }

}
