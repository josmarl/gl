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
@Table(name = "cont_estado_comprobante")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ContEstadoComprobante.findAll", query = "SELECT c FROM ContEstadoComprobante c"),
    @NamedQuery(name = "ContEstadoComprobante.findById", query = "SELECT c FROM ContEstadoComprobante c WHERE c.id = :id"),
    @NamedQuery(name = "ContEstadoComprobante.findByNombre", query = "SELECT c FROM ContEstadoComprobante c WHERE c.nombre = :nombre"),
    @NamedQuery(name = "ContEstadoComprobante.findByDescripcion", query = "SELECT c FROM ContEstadoComprobante c WHERE c.descripcion = :descripcion"),
    @NamedQuery(name = "ContEstadoComprobante.findByEstado", query = "SELECT c FROM ContEstadoComprobante c WHERE c.estado = :estado")})
public class ContEstadoComprobante implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "estado")
    private Character estado;
    @OneToMany(mappedBy = "contEstadoComprobante")
    private Collection<ContVentas> contVentasCollection;

    public ContEstadoComprobante() {
    }

    public ContEstadoComprobante(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
        if (!(object instanceof ContEstadoComprobante)) {
            return false;
        }
        ContEstadoComprobante other = (ContEstadoComprobante) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pe.contable.model.ContEstadoComprobante[ id=" + id + " ]";
    }
    
}
