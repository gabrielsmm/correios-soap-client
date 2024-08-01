
package com.gabrielsmm.soapclient.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de obterMensagemParametrizadaResponse complex type.</p>
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.</p>
 * 
 * <pre>{@code
 * <complexType name="obterMensagemParametrizadaResponse">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="return" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}mensagemParametrizadaTO" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obterMensagemParametrizadaResponse", propOrder = {
    "_return"
})
public class ObterMensagemParametrizadaResponse {

    @XmlElement(name = "return")
    protected MensagemParametrizadaTO _return;

    /**
     * Obtém o valor da propriedade return.
     * 
     * @return
     *     possible object is
     *     {@link MensagemParametrizadaTO }
     *     
     */
    public MensagemParametrizadaTO getReturn() {
        return _return;
    }

    /**
     * Define o valor da propriedade return.
     * 
     * @param value
     *     allowed object is
     *     {@link MensagemParametrizadaTO }
     *     
     */
    public void setReturn(MensagemParametrizadaTO value) {
        this._return = value;
    }

}
