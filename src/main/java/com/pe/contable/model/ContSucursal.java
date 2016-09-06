/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pe.contable.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author josmarl
 */
@Entity
@Table(name = "cont_sucursal")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ContSucursal.findAll", query = "SELECT c FROM ContSucursal c"),
    @NamedQuery(name = "ContSucursal.findById", query = "SELECT c FROM ContSucursal c WHERE c.id = :id"),
    @NamedQuery(name = "ContSucursal.findByNombre", query = "SELECT c FROM ContSucursal c WHERE c.nombre = :nombre"),
    @NamedQuery(name = "ContSucursal.findBySerie", query = "SELECT c FROM ContSucursal c WHERE c.serie = :serie")})
public class ContSucursal implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "serie")
    private String serie;

    public ContSucursal() {
    }

    public ContSucursal(Integer id) {
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

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
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
        if (!(object instanceof ContSucursal)) {
            return false;
        }
        ContSucursal other = (ContSucursal) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pe.contable.model.ContSucursal[ id=" + id + " ]";
    }
    
}
