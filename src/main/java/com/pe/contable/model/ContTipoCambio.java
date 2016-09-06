/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pe.contable.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import org.codehaus.jackson.annotate.JsonIgnore;

/**
 *
 * @author josmarl
 */
@Entity
@Table(name = "cont_tipo_cambio")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ContTipoCambio.findAll", query = "SELECT c FROM ContTipoCambio c"),
    @NamedQuery(name = "ContTipoCambio.findById", query = "SELECT c FROM ContTipoCambio c WHERE c.id = :id"),
    @NamedQuery(name = "ContTipoCambio.findByDe", query = "SELECT c FROM ContTipoCambio c WHERE c.de = :de"),
    @NamedQuery(name = "ContTipoCambio.findByA", query = "SELECT c FROM ContTipoCambio c WHERE c.a = :a"),
    @NamedQuery(name = "ContTipoCambio.findByValor", query = "SELECT c FROM ContTipoCambio c WHERE c.valor = :valor"),
    @NamedQuery(name = "ContTipoCambio.findByFecha", query = "SELECT c FROM ContTipoCambio c WHERE c.fecha = :fecha"),
    @NamedQuery(name = "ContTipoCambio.findByEstado", query = "SELECT c FROM ContTipoCambio c WHERE c.estado = :estado")})
public class ContTipoCambio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "de")
    private String de;
    @Column(name = "a")
    private String a;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "valor")
    private Double valor;
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Column(name = "estado")
    private Character estado;
    @OneToMany(mappedBy = "contTipoCambio")
    private Collection<ContVentas> contVentasCollection;

    public ContTipoCambio() {
    }

    public ContTipoCambio(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDe() {
        return de;
    }

    public void setDe(String de) {
        this.de = de;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Character getEstado() {
        return estado;
    }

    public void setEstado(Character estado) {
        this.estado = estado;
    }

    @XmlTransient
    @JsonIgnore
    public Collection<ContVentas> getContVentasCollection() {
        return contVentasCollection;
    }

    public void setContVentasCollection(Collection<ContVentas> contVentasCollection) {
        this.contVentasCollection = contVentasCollection;
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
        if (!(object instanceof ContTipoCambio)) {
            return false;
        }
        ContTipoCambio other = (ContTipoCambio) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pe.contable.model.ContTipoCambio[ id=" + id + " ]";
    }
    
}
