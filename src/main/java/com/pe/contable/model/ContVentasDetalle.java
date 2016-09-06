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
@Table(name = "cont_ventas_detalle")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ContVentasDetalle.findAll", query = "SELECT c FROM ContVentasDetalle c"),
    @NamedQuery(name = "ContVentasDetalle.findById", query = "SELECT c FROM ContVentasDetalle c WHERE c.id = :id"),
    @NamedQuery(name = "ContVentasDetalle.findByCantidad", query = "SELECT c FROM ContVentasDetalle c WHERE c.cantidad = :cantidad"),
    @NamedQuery(name = "ContVentasDetalle.findByDescripcion", query = "SELECT c FROM ContVentasDetalle c WHERE c.descripcion = :descripcion"),
    @NamedQuery(name = "ContVentasDetalle.findByPrecioUnit", query = "SELECT c FROM ContVentasDetalle c WHERE c.precioUnit = :precioUnit"),
    @NamedQuery(name = "ContVentasDetalle.findByValorVenta", query = "SELECT c FROM ContVentasDetalle c WHERE c.valorVenta = :valorVenta"),
    @NamedQuery(name = "ContVentasDetalle.findByContVentas", query = "SELECT c FROM ContVentasDetalle c WHERE c.contVentas = :contVentas")})
public class ContVentasDetalle implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "cantidad")
    private Integer cantidad;
    @Column(name = "descripcion")
    private String descripcion;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "precio_unit")
    private Double precioUnit;
    @Column(name = "valor_venta")
    private Double valorVenta;
    @Column(name = "cont_ventas")
    private String contVentas;

    public ContVentasDetalle() {
    }

    public ContVentasDetalle(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPrecioUnit() {
        return precioUnit;
    }

    public void setPrecioUnit(Double precioUnit) {
        this.precioUnit = precioUnit;
    }

    public Double getValorVenta() {
        return valorVenta;
    }

    public void setValorVenta(Double valorVenta) {
        this.valorVenta = valorVenta;
    }

    public String getContVentas() {
        return contVentas;
    }

    public void setContVentas(String contVentas) {
        this.contVentas = contVentas;
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
        if (!(object instanceof ContVentasDetalle)) {
            return false;
        }
        ContVentasDetalle other = (ContVentasDetalle) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pe.contable.model.ContVentasDetalle[ id=" + id + " ]";
    }
    
}
