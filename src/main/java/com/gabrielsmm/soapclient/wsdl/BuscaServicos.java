
package com.gabrielsmm.soapclient.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de buscaServicos complex type.</p>
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.</p>
 * 
 * <pre>{@code
 * <complexType name="buscaServicos">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="idContrato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="idCartaoPostagem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="usuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="senha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "buscaServicos", propOrder = {
    "idContrato",
    "idCartaoPostagem",
    "usuario",
    "senha"
})
public class BuscaServicos {

    protected String idContrato;
    protected String idCartaoPostagem;
    protected String usuario;
    protected String senha;

    /**
     * Obtém o valor da propriedade idContrato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdContrato() {
        return idContrato;
    }

    /**
     * Define o valor da propriedade idContrato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdContrato(String value) {
        this.idContrato = value;
    }

    /**
     * Obtém o valor da propriedade idCartaoPostagem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdCartaoPostagem() {
        return idCartaoPostagem;
    }

    /**
     * Define o valor da propriedade idCartaoPostagem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdCartaoPostagem(String value) {
        this.idCartaoPostagem = value;
    }

    /**
     * Obtém o valor da propriedade usuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Define o valor da propriedade usuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuario(String value) {
        this.usuario = value;
    }

    /**
     * Obtém o valor da propriedade senha.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenha() {
        return senha;
    }

    /**
     * Define o valor da propriedade senha.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenha(String value) {
        this.senha = value;
    }

}
