
package com.gabrielsmm.soapclient.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de servicoSigep complex type.</p>
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.</p>
 * 
 * <pre>{@code
 * <complexType name="servicoSigep">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="categoriaServico" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}categoriaServico" minOccurs="0"/>
 *         <element name="chancela" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}chancelaMaster" minOccurs="0"/>
 *         <element name="descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="exigeDimensoes" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="exigeValorCobrar" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="imitm" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="pagamentoEntrega" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="remessaAgrupada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="restricao" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}simNao" minOccurs="0"/>
 *         <element name="servico" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="servicoERP" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}servicoERP" minOccurs="0"/>
 *         <element name="ssiCoCodigoPostal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "servicoSigep", propOrder = {
    "categoriaServico",
    "chancela",
    "descricao",
    "exigeDimensoes",
    "exigeValorCobrar",
    "imitm",
    "pagamentoEntrega",
    "remessaAgrupada",
    "restricao",
    "servico",
    "servicoERP",
    "ssiCoCodigoPostal"
})
public class ServicoSigep {

    @XmlSchemaType(name = "string")
    protected CategoriaServico categoriaServico;
    protected ChancelaMaster chancela;
    protected String descricao;
    protected Boolean exigeDimensoes;
    protected Boolean exigeValorCobrar;
    protected long imitm;
    protected String pagamentoEntrega;
    protected String remessaAgrupada;
    @XmlSchemaType(name = "string")
    protected SimNao restricao;
    protected long servico;
    protected ServicoERP servicoERP;
    protected String ssiCoCodigoPostal;

    /**
     * Obtém o valor da propriedade categoriaServico.
     * 
     * @return
     *     possible object is
     *     {@link CategoriaServico }
     *     
     */
    public CategoriaServico getCategoriaServico() {
        return categoriaServico;
    }

    /**
     * Define o valor da propriedade categoriaServico.
     * 
     * @param value
     *     allowed object is
     *     {@link CategoriaServico }
     *     
     */
    public void setCategoriaServico(CategoriaServico value) {
        this.categoriaServico = value;
    }

    /**
     * Obtém o valor da propriedade chancela.
     * 
     * @return
     *     possible object is
     *     {@link ChancelaMaster }
     *     
     */
    public ChancelaMaster getChancela() {
        return chancela;
    }

    /**
     * Define o valor da propriedade chancela.
     * 
     * @param value
     *     allowed object is
     *     {@link ChancelaMaster }
     *     
     */
    public void setChancela(ChancelaMaster value) {
        this.chancela = value;
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
     * Obtém o valor da propriedade exigeDimensoes.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExigeDimensoes() {
        return exigeDimensoes;
    }

    /**
     * Define o valor da propriedade exigeDimensoes.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExigeDimensoes(Boolean value) {
        this.exigeDimensoes = value;
    }

    /**
     * Obtém o valor da propriedade exigeValorCobrar.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExigeValorCobrar() {
        return exigeValorCobrar;
    }

    /**
     * Define o valor da propriedade exigeValorCobrar.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExigeValorCobrar(Boolean value) {
        this.exigeValorCobrar = value;
    }

    /**
     * Obtém o valor da propriedade imitm.
     * 
     */
    public long getImitm() {
        return imitm;
    }

    /**
     * Define o valor da propriedade imitm.
     * 
     */
    public void setImitm(long value) {
        this.imitm = value;
    }

    /**
     * Obtém o valor da propriedade pagamentoEntrega.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPagamentoEntrega() {
        return pagamentoEntrega;
    }

    /**
     * Define o valor da propriedade pagamentoEntrega.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPagamentoEntrega(String value) {
        this.pagamentoEntrega = value;
    }

    /**
     * Obtém o valor da propriedade remessaAgrupada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemessaAgrupada() {
        return remessaAgrupada;
    }

    /**
     * Define o valor da propriedade remessaAgrupada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemessaAgrupada(String value) {
        this.remessaAgrupada = value;
    }

    /**
     * Obtém o valor da propriedade restricao.
     * 
     * @return
     *     possible object is
     *     {@link SimNao }
     *     
     */
    public SimNao getRestricao() {
        return restricao;
    }

    /**
     * Define o valor da propriedade restricao.
     * 
     * @param value
     *     allowed object is
     *     {@link SimNao }
     *     
     */
    public void setRestricao(SimNao value) {
        this.restricao = value;
    }

    /**
     * Obtém o valor da propriedade servico.
     * 
     */
    public long getServico() {
        return servico;
    }

    /**
     * Define o valor da propriedade servico.
     * 
     */
    public void setServico(long value) {
        this.servico = value;
    }

    /**
     * Obtém o valor da propriedade servicoERP.
     * 
     * @return
     *     possible object is
     *     {@link ServicoERP }
     *     
     */
    public ServicoERP getServicoERP() {
        return servicoERP;
    }

    /**
     * Define o valor da propriedade servicoERP.
     * 
     * @param value
     *     allowed object is
     *     {@link ServicoERP }
     *     
     */
    public void setServicoERP(ServicoERP value) {
        this.servicoERP = value;
    }

    /**
     * Obtém o valor da propriedade ssiCoCodigoPostal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSsiCoCodigoPostal() {
        return ssiCoCodigoPostal;
    }

    /**
     * Define o valor da propriedade ssiCoCodigoPostal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSsiCoCodigoPostal(String value) {
        this.ssiCoCodigoPostal = value;
    }

}
