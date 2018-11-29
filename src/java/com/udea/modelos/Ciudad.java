/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.modelos;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Daniel
 */
@Entity
@XmlRootElement
public class Ciudad implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String nombre;
    
    private int temperatura;
    
    private String clima;

    /**
     * Get the value of clima
     *
     * @return the value of clima
     */
    public String getClima() {
        return clima;
    }

    /**
     * Set the value of clima
     *
     * @param clima new value of clima
     */
    public void setClima(String clima) {
        this.clima = clima;
    }


    /**
     * Get the value of temperatura
     *
     * @return the value of temperatura
     */
    public int getTemperatura() {
        return temperatura;
    }

    /**
     * Set the value of temperatura
     *
     * @param temperatura new value of temperatura
     */
    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }


    /**
     * Get the value of nombre
     *
     * @return the value of nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Set the value of nombre
     *
     * @param nombre new value of nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
        if (!(object instanceof Ciudad)) {
            return false;
        }
        Ciudad other = (Ciudad) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.udea.modelos.Ciudad[ id=" + id + " ]";
    }
    
}
