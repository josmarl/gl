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
@Table(name = "cont_tipo_cliente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ContTipoCliente.findAll", query = "SELECT c FROM ContTipoCliente c"),
    @NamedQuery(name = "ContTipoCliente.findById", query = "SELECT c FROM ContTipoCliente c WHERE c.id = :id"),
    @NamedQuery(name = "ContTipoCliente.findByNombre", query = "SELECT c FROM ContTipoCliente c WHERE c.nombre = :nombre"),
    @NamedQuery(name = "ContTipoCliente.findByDescripcion", query = "SELECT c FROM ContTipoCliente c WHERE c.descripcion = :descripcion"),
    @NamedQuery(name = "ContTipoCliente.findByEstado", query = "SELECT c FROM ContTipoCliente c WHERE c.estado = :estado")})
public class ContTipoCliente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "estado")
    private Character estado;
    @OneToMany(mappedBy = "contTipoCliente")
    private Collection<ContCliente> contClienteCollection;

    public ContTipoCliente() {
    }

    public ContTipoCliente(Integer id) {
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
    public Collection<ContCliente> getContClienteCollection() {
        return contClienteCollection;
    }

    public void setContClienteCollection(Collection<ContCliente> contClienteCollection) {
        this.contClienteCollection = contClienteCollection;
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
        if (!(object instanceof ContTipoCliente)) {
            return false;
        }
        ContTipoCliente other = (ContTipoCliente) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pe.contable.model.ContTipoCliente[ id=" + id + " ]";
    }
    
}
