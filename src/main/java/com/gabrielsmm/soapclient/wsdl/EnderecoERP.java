
package com.gabrielsmm.soapclient.wsdl;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de enderecoERP complex type.</p>
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.</p>
 * 
 * <pre>{@code
 * <complexType name="enderecoERP">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="bairro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="cep" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="cidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="complemento2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="end" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="uf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="unidadesPostagem" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}unidadePostagemERP" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "enderecoERP", propOrder = {
    "bairro",
    "cep",
    "cidade",
    "complemento2",
    "end",
    "uf",
    "unidadesPostagem"
})
public class EnderecoERP {

    protected String bairro;
    protected String cep;
    protected String cidade;
    protected String complemento2;
    protected String end;
    protected String uf;
    @XmlElement(nillable = true)
    protected List<UnidadePostagemERP> unidadesPostagem;

    /**
     * Obtém o valor da propriedade bairro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBairro() {
        return bairro;
    }

    /**
     * Define o valor da propriedade bairro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBairro(String value) {
        this.bairro = value;
    }

    /**
     * Obtém o valor da propriedade cep.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCep() {
        return cep;
    }

    /**
     * Define o valor da propriedade cep.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCep(String value) {
        this.cep = value;
    }

    /**
     * Obtém o valor da propriedade cidade.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * Define o valor da propriedade cidade.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCidade(String value) {
        this.cidade = value;
    }

    /**
     * Obtém o valor da propriedade complemento2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComplemento2() {
        return complemento2;
    }

    /**
     * Define o valor da propriedade complemento2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComplemento2(String value) {
        this.complemento2 = value;
    }

    /**
     * Obtém o valor da propriedade end.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnd() {
        return end;
    }

    /**
     * Define o valor da propriedade end.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnd(String value) {
        this.end = value;
    }

    /**
     * Obtém o valor da propriedade uf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUf() {
        return uf;
    }

    /**
     * Define o valor da propriedade uf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUf(String value) {
        this.uf = value;
    }

    /**
     * Gets the value of the unidadesPostagem property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unidadesPostagem property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getUnidadesPostagem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UnidadePostagemERP }
     * </p>
     * 
     * 
     * @return
     *     The value of the unidadesPostagem property.
     */
    public List<UnidadePostagemERP> getUnidadesPostagem() {
        if (unidadesPostagem == null) {
            unidadesPostagem = new ArrayList<>();
        }
        return this.unidadesPostagem;
    }

}
