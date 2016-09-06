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
@Table(name = "cont_usuario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ContUsuario.findAll", query = "SELECT c FROM ContUsuario c"),
    @NamedQuery(name = "ContUsuario.findById", query = "SELECT c FROM ContUsuario c WHERE c.id = :id"),
    @NamedQuery(name = "ContUsuario.findByLogin", query = "SELECT c FROM ContUsuario c WHERE c.login = :login"),
    @NamedQuery(name = "ContUsuario.findByPassword", query = "SELECT c FROM ContUsuario c WHERE c.password = :password"),
    @NamedQuery(name = "ContUsuario.findByEstado", query = "SELECT c FROM ContUsuario c WHERE c.estado = :estado")})
public class ContUsuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "login")
    private String login;
    @Column(name = "password")
    private String password;
    @Column(name = "estado")
    private Integer estado;

    public ContUsuario() {
    }

    public ContUsuario(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
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
        if (!(object instanceof ContUsuario)) {
            return false;
        }
        ContUsuario other = (ContUsuario) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pe.contable.model.ContUsuario[ id=" + id + " ]";
    }
    
}
