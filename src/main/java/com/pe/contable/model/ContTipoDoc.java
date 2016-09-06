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
@Table(name = "cont_tipo_doc")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ContTipoDoc.findAll", query = "SELECT c FROM ContTipoDoc c"),
    @NamedQuery(name = "ContTipoDoc.findById", query = "SELECT c FROM ContTipoDoc c WHERE c.id = :id"),
    @NamedQuery(name = "ContTipoDoc.findByCodigo", query = "SELECT c FROM ContTipoDoc c WHERE c.codigo = :codigo"),
    @NamedQuery(name = "ContTipoDoc.findByDescripcion", query = "SELECT c FROM ContTipoDoc c WHERE c.descripcion = :descripcion"),
    @NamedQuery(name = "ContTipoDoc.findByCantCaracteres", query = "SELECT c FROM ContTipoDoc c WHERE c.cantCaracteres = :cantCaracteres"),
    @NamedQuery(name = "ContTipoDoc.findByEstado", query = "SELECT c FROM ContTipoDoc c WHERE c.estado = :estado")})
public class ContTipoDoc implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "codigo")
    private Integer codigo;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "cant_caracteres")
    private Integer cantCaracteres;
    @Column(name = "estado")
    private Character estado;
    @OneToMany(mappedBy = "contTipoDoc")
    private Collection<ContVentas> contVentasCollection;

    public ContTipoDoc() {
    }

    public ContTipoDoc(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getCantCaracteres() {
        return cantCaracteres;
    }

    public void setCantCaracteres(Integer cantCaracteres) {
        this.cantCaracteres = cantCaracteres;
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
        if (!(object instanceof ContTipoDoc)) {
            return false;
        }
        ContTipoDoc other = (ContTipoDoc) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pe.contable.model.ContTipoDoc[ id=" + id + " ]";
    }
    
}
