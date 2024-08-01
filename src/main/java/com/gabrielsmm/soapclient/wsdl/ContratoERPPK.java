
package com.gabrielsmm.soapclient.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de contratoERPPK complex type.</p>
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.</p>
 * 
 * <pre>{@code
 * <complexType name="contratoERPPK">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="diretoria" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="numero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contratoERPPK", propOrder = {
    "diretoria",
    "numero"
})
public class ContratoERPPK {

    protected long diretoria;
    protected String numero;

    /**
     * Obtém o valor da propriedade diretoria.
     * 
     */
    public long getDiretoria() {
        return diretoria;
    }

    /**
     * Define o valor da propriedade diretoria.
     * 
     */
    public void setDiretoria(long value) {
        this.diretoria = value;
    }

    /**
     * Obtém o valor da propriedade numero.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumero() {
        return numero;
    }

    /**
     * Define o valor da propriedade numero.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumero(String value) {
        this.numero = value;
    }

}
