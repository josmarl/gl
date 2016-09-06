/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pe.contable.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author josmarl
 */
@Entity
@Table(name = "cont_ventas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ContVentas.findAll", query = "SELECT c FROM ContVentas c"),
    @NamedQuery(name = "ContVentas.findById", query = "SELECT c FROM ContVentas c WHERE c.id = :id"),
    @NamedQuery(name = "ContVentas.findByCorrelativo", query = "SELECT c FROM ContVentas c WHERE c.correlativo = :correlativo"),
    @NamedQuery(name = "ContVentas.findByFechaEmision", query = "SELECT c FROM ContVentas c WHERE c.fechaEmision = :fechaEmision"),
    @NamedQuery(name = "ContVentas.findByFechaVencimiento", query = "SELECT c FROM ContVentas c WHERE c.fechaVencimiento = :fechaVencimiento"),
    @NamedQuery(name = "ContVentas.findBySerie", query = "SELECT c FROM ContVentas c WHERE c.serie = :serie"),
    @NamedQuery(name = "ContVentas.findByNumero", query = "SELECT c FROM ContVentas c WHERE c.numero = :numero"),
    @NamedQuery(name = "ContVentas.findByNroDoc", query = "SELECT c FROM ContVentas c WHERE c.nroDoc = :nroDoc"),
    @NamedQuery(name = "ContVentas.findByValorFacExport", query = "SELECT c FROM ContVentas c WHERE c.valorFacExport = :valorFacExport"),
    @NamedQuery(name = "ContVentas.findByBaseImponible", query = "SELECT c FROM ContVentas c WHERE c.baseImponible = :baseImponible"),
    @NamedQuery(name = "ContVentas.findByImporteExonerada", query = "SELECT c FROM ContVentas c WHERE c.importeExonerada = :importeExonerada"),
    @NamedQuery(name = "ContVentas.findByImporteInafecta", query = "SELECT c FROM ContVentas c WHERE c.importeInafecta = :importeInafecta"),
    @NamedQuery(name = "ContVentas.findByIsc", query = "SELECT c FROM ContVentas c WHERE c.isc = :isc"),
    @NamedQuery(name = "ContVentas.findByIgvIpm", query = "SELECT c FROM ContVentas c WHERE c.igvIpm = :igvIpm"),
    @NamedQuery(name = "ContVentas.findByOtrosTributos", query = "SELECT c FROM ContVentas c WHERE c.otrosTributos = :otrosTributos"),
    @NamedQuery(name = "ContVentas.findByImporteTotal", query = "SELECT c FROM ContVentas c WHERE c.importeTotal = :importeTotal"),
    @NamedQuery(name = "ContVentas.findByFechaDocReferencia", query = "SELECT c FROM ContVentas c WHERE c.fechaDocReferencia = :fechaDocReferencia"),
    @NamedQuery(name = "ContVentas.findByTipoDocReferencia", query = "SELECT c FROM ContVentas c WHERE c.tipoDocReferencia = :tipoDocReferencia"),
    @NamedQuery(name = "ContVentas.findBySerieDocReferencia", query = "SELECT c FROM ContVentas c WHERE c.serieDocReferencia = :serieDocReferencia"),
    @NamedQuery(name = "ContVentas.findByNroDocReferencia", query = "SELECT c FROM ContVentas c WHERE c.nroDocReferencia = :nroDocReferencia")})
public class ContVentas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "correlativo")
    private String correlativo;
    @Column(name = "fecha_emision")
    @Temporal(TemporalType.DATE)
    private Date fechaEmision;
    @Column(name = "fecha_vencimiento")
    @Temporal(TemporalType.DATE)
    private Date fechaVencimiento;
    @Column(name = "serie")
    private Integer serie;
    @Column(name = "numero")
    private Integer numero;
    @Column(name = "nro_doc")
    private String nroDoc;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "valor_fac_export")
    private Double valorFacExport;
    @Column(name = "base_imponible")
    private Double baseImponible;
    @Column(name = "importe_exonerada")
    private Double importeExonerada;
    @Column(name = "importe_inafecta")
    private Double importeInafecta;
    @Column(name = "isc")
    private Double isc;
    @Column(name = "igv_ipm")
    private Double igvIpm;
    @Column(name = "otros_tributos")
    private Double otrosTributos;
    @Column(name = "importe_total")
    private Double importeTotal;
    @Column(name = "fecha_doc_referencia")
    @Temporal(TemporalType.DATE)
    private Date fechaDocReferencia;
    @Column(name = "tipo_doc_referencia")
    private String tipoDocReferencia;
    @Column(name = "serie_doc_referencia")
    private Integer serieDocReferencia;
    @Column(name = "nro_doc_referencia")
    private Integer nroDocReferencia;
    @JoinColumn(name = "cont_cliente", referencedColumnName = "id")
    @ManyToOne
    private ContCliente contCliente;
    @JoinColumn(name = "cont_estado_comprobante", referencedColumnName = "id")
    @ManyToOne
    private ContEstadoComprobante contEstadoComprobante;
    @JoinColumn(name = "cont_periodo", referencedColumnName = "id")
    @ManyToOne
    private ContPeriodo contPeriodo;
    @JoinColumn(name = "cont_tipo_cambio", referencedColumnName = "id")
    @ManyToOne
    private ContTipoCambio contTipoCambio;
    @JoinColumn(name = "cont_tipo_comprobante", referencedColumnName = "id")
    @ManyToOne
    private ContTipoComprobante contTipoComprobante;
    @JoinColumn(name = "cont_tipo_doc", referencedColumnName = "id")
    @ManyToOne
    private ContTipoDoc contTipoDoc;

    public ContVentas() {
    }

    public ContVentas(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCorrelativo() {
        return correlativo;
    }

    public void setCorrelativo(String correlativo) {
        this.correlativo = correlativo;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public Integer getSerie() {
        return serie;
    }

    public void setSerie(Integer serie) {
        this.serie = serie;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getNroDoc() {
        return nroDoc;
    }

    public void setNroDoc(String nroDoc) {
        this.nroDoc = nroDoc;
    }

    public Double getValorFacExport() {
        return valorFacExport;
    }

    public void setValorFacExport(Double valorFacExport) {
        this.valorFacExport = valorFacExport;
    }

    public Double getBaseImponible() {
        return baseImponible;
    }

    public void setBaseImponible(Double baseImponible) {
        this.baseImponible = baseImponible;
    }

    public Double getImporteExonerada() {
        return importeExonerada;
    }

    public void setImporteExonerada(Double importeExonerada) {
        this.importeExonerada = importeExonerada;
    }

    public Double getImporteInafecta() {
        return importeInafecta;
    }

    public void setImporteInafecta(Double importeInafecta) {
        this.importeInafecta = importeInafecta;
    }

    public Double getIsc() {
        return isc;
    }

    public void setIsc(Double isc) {
        this.isc = isc;
    }

    public Double getIgvIpm() {
        return igvIpm;
    }

    public void setIgvIpm(Double igvIpm) {
        this.igvIpm = igvIpm;
    }

    public Double getOtrosTributos() {
        return otrosTributos;
    }

    public void setOtrosTributos(Double otrosTributos) {
        this.otrosTributos = otrosTributos;
    }

    public Double getImporteTotal() {
        return importeTotal;
    }

    public void setImporteTotal(Double importeTotal) {
        this.importeTotal = importeTotal;
    }

    public Date getFechaDocReferencia() {
        return fechaDocReferencia;
    }

    public void setFechaDocReferencia(Date fechaDocReferencia) {
        this.fechaDocReferencia = fechaDocReferencia;
    }

    public String getTipoDocReferencia() {
        return tipoDocReferencia;
    }

    public void setTipoDocReferencia(String tipoDocReferencia) {
        this.tipoDocReferencia = tipoDocReferencia;
    }

    public Integer getSerieDocReferencia() {
        return serieDocReferencia;
    }

    public void setSerieDocReferencia(Integer serieDocReferencia) {
        this.serieDocReferencia = serieDocReferencia;
    }

    public Integer getNroDocReferencia() {
        return nroDocReferencia;
    }

    public void setNroDocReferencia(Integer nroDocReferencia) {
        this.nroDocReferencia = nroDocReferencia;
    }

    public ContCliente getContCliente() {
        return contCliente;
    }

    public void setContCliente(ContCliente contCliente) {
        this.contCliente = contCliente;
    }

    public ContEstadoComprobante getContEstadoComprobante() {
        return contEstadoComprobante;
    }

    public void setContEstadoComprobante(ContEstadoComprobante contEstadoComprobante) {
        this.contEstadoComprobante = contEstadoComprobante;
    }

    public ContPeriodo getContPeriodo() {
        return contPeriodo;
    }

    public void setContPeriodo(ContPeriodo contPeriodo) {
        this.contPeriodo = contPeriodo;
    }

    public ContTipoCambio getContTipoCambio() {
        return contTipoCambio;
    }

    public void setContTipoCambio(ContTipoCambio contTipoCambio) {
        this.contTipoCambio = contTipoCambio;
    }

    public ContTipoComprobante getContTipoComprobante() {
        return contTipoComprobante;
    }

    public void setContTipoComprobante(ContTipoComprobante contTipoComprobante) {
        this.contTipoComprobante = contTipoComprobante;
    }

    public ContTipoDoc getContTipoDoc() {
        return contTipoDoc;
    }

    public void setContTipoDoc(ContTipoDoc contTipoDoc) {
        this.contTipoDoc = contTipoDoc;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ContVentas)) {
            return false;
        }
        ContVentas other = (ContVentas) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pe.contable.model.ContVentas[ id=" + id + " ]";
    }
    
}
