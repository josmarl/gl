/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pe.contable.model;

import java.io.Serializable;
import java.util.Collection;
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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import org.codehaus.jackson.annotate.JsonIgnore;

/**
 *
 * @author josmarl
 */
@Entity
@Table(name = "cont_tipo_comprobante")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ContTipoComprobante.findAll", query = "SELECT c FROM ContTipoComprobante c"),
    @NamedQuery(name = "ContTipoComprobante.findById", query = "SELECT c FROM ContTipoComprobante c WHERE c.id = :id"),
    @NamedQuery(name = "ContTipoComprobante.findByCodigo", query = "SELECT c FROM ContTipoComprobante c WHERE c.codigo = :codigo"),
    @NamedQuery(name = "ContTipoComprobante.findByDescripcion", query = "SELECT c FROM ContTipoComprobante c WHERE c.descripcion = :descripcion"),
    @NamedQuery(name = "ContTipoComprobante.findByEstado", query = "SELECT c FROM ContTipoComprobante c WHERE c.estado = :estado")})
public class ContTipoComprobante implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "codigo")
    private String codigo;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "estado")
    private Character estado;
    @OneToMany(mappedBy = "contTipoComprobante")
    private Collection<ContVentas> contVentasCollection;

    public ContTipoComprobante() {
    }

    public ContTipoComprobante(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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
        if (!(object instanceof ContTipoComprobante)) {
            return false;
        }
        ContTipoComprobante other = (ContTipoComprobante) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pe.contable.model.ContTipoComprobante[ id=" + id + " ]";
    }
    
}
