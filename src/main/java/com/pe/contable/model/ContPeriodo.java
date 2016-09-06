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
@Table(name = "cont_periodo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ContPeriodo.findAll", query = "SELECT c FROM ContPeriodo c"),
    @NamedQuery(name = "ContPeriodo.findById", query = "SELECT c FROM ContPeriodo c WHERE c.id = :id"),
    @NamedQuery(name = "ContPeriodo.findByNombre", query = "SELECT c FROM ContPeriodo c WHERE c.nombre = :nombre"),
    @NamedQuery(name = "ContPeriodo.findByEstado", query = "SELECT c FROM ContPeriodo c WHERE c.estado = :estado")})
public class ContPeriodo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "estado")
    private Character estado;
    @OneToMany(mappedBy = "contPeriodo")
    private Collection<ContVentas> contVentasCollection;

    public ContPeriodo() {
    }

    public ContPeriodo(Integer id) {
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
        if (!(object instanceof ContPeriodo)) {
            return false;
        }
        ContPeriodo other = (ContPeriodo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pe.contable.model.ContPeriodo[ id=" + id + " ]";
    }
    
}
