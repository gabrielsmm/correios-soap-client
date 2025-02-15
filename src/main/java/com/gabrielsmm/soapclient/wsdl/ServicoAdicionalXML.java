
package com.gabrielsmm.soapclient.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de servicoAdicionalXML complex type.</p>
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.</p>
 * 
 * <pre>{@code
 * <complexType name="servicoAdicionalXML">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="categoria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="codigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="maximoValorDeclarado" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="minimoValorDeclarado" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="sigla" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "servicoAdicionalXML", propOrder = {
    "categoria",
    "codigo",
    "descricao",
    "maximoValorDeclarado",
    "minimoValorDeclarado",
    "sigla"
})
public class ServicoAdicionalXML {

    protected String categoria;
    protected String codigo;
    protected String descricao;
    protected Double maximoValorDeclarado;
    protected Double minimoValorDeclarado;
    protected String sigla;

    /**
     * Obtém o valor da propriedade categoria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * Define o valor da propriedade categoria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoria(String value) {
        this.categoria = value;
    }

    /**
     * Obtém o valor da propriedade codigo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Define o valor da propriedade codigo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigo(String value) {
        this.codigo = value;
    }

    /**
     * Obtém o valor da propriedade descricao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Define o valor da propriedade descricao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricao(String value) {
        this.descricao = value;
    }

    /**
     * Obtém o valor da propriedade maximoValorDeclarado.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaximoValorDeclarado() {
        return maximoValorDeclarado;
    }

    /**
     * Define o valor da propriedade maximoValorDeclarado.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaximoValorDeclarado(Double value) {
        this.maximoValorDeclarado = value;
    }

    /**
     * Obtém o valor da propriedade minimoValorDeclarado.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMinimoValorDeclarado() {
        return minimoValorDeclarado;
    }

    /**
     * Define o valor da propriedade minimoValorDeclarado.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMinimoValorDeclarado(Double value) {
        this.minimoValorDeclarado = value;
    }

    /**
     * Obtém o valor da propriedade sigla.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSigla() {
        return sigla;
    }

    /**
     * Define o valor da propriedade sigla.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSigla(String value) {
        this.sigla = value;
    }

}
