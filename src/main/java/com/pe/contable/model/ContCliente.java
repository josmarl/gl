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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "cont_cliente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ContCliente.findAll", query = "SELECT c FROM ContCliente c"),
    @NamedQuery(name = "ContCliente.findById", query = "SELECT c FROM ContCliente c WHERE c.id = :id"),
    @NamedQuery(name = "ContCliente.findByRazonSocial", query = "SELECT c FROM ContCliente c WHERE c.razonSocial = :razonSocial"),
    @NamedQuery(name = "ContCliente.findByContTipoDoc", query = "SELECT c FROM ContCliente c WHERE c.contTipoDoc = :contTipoDoc"),
    @NamedQuery(name = "ContCliente.findByNumeroDoc", query = "SELECT c FROM ContCliente c WHERE c.numeroDoc = :numeroDoc"),
    @NamedQuery(name = "ContCliente.findByDireccion", query = "SELECT c FROM ContCliente c WHERE c.direccion = :direccion"),
    @NamedQuery(name = "ContCliente.findByEstado", query = "SELECT c FROM ContCliente c WHERE c.estado = :estado")})
public class ContCliente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "razon_social")
    private String razonSocial;
    @Column(name = "cont_tipo_doc")
    private Integer contTipoDoc;
    @Column(name = "numero_doc")
    private String numeroDoc;
    @Column(name = "direccion")
    private String direccion;
    @Column(name = "estado")
    private Character estado;
    @JoinColumn(name = "cont_tipo_cliente", referencedColumnName = "id")
    @ManyToOne
    private ContTipoCliente contTipoCliente;
    @OneToMany(mappedBy = "contCliente")
    private Collection<ContVentas> contVentasCollection;

    public ContCliente() {
    }

    public ContCliente(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public Integer getContTipoDoc() {
        return contTipoDoc;
    }

    public void setContTipoDoc(Integer contTipoDoc) {
        this.contTipoDoc = contTipoDoc;
    }

    public String getNumeroDoc() {
        return numeroDoc;
    }

    public void setNumeroDoc(String numeroDoc) {
        this.numeroDoc = numeroDoc;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Character getEstado() {
        return estado;
    }

    public void setEstado(Character estado) {
        this.estado = estado;
    }

    public ContTipoCliente getContTipoCliente() {
        return contTipoCliente;
    }

    public void setContTipoCliente(ContTipoCliente contTipoCliente) {
        this.contTipoCliente = contTipoCliente;
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
        if (!(object instanceof ContCliente)) {
            return false;
        }
        ContCliente other = (ContCliente) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pe.contable.model.ContCliente[ id=" + id + " ]";
    }
    
}
