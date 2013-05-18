/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucue.ptc.gco.mdl;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author Johnny
 */
@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class Empleado extends Persona implements Serializable{    
    @OneToMany(mappedBy="idRuta")
    private List<Ruta> rutas;
    @OneToMany(mappedBy="idObjetivo")
    private List<ObjetivoEmpleado> objetivos;
    @ManyToOne(optional = false)
    @JoinColumn(name="idCargo")
    private Cargo cargo;

    public List<ObjetivoEmpleado> getObjetivos() {
        return objetivos;
    }

    public void setObjetivos(List<ObjetivoEmpleado> objetivos) {
        this.objetivos = objetivos;
    }
    @OneToOne(mappedBy="empleado")
    private Usuario usuario;
    @OneToMany(mappedBy="idNotaEntrega")
    private List<NotaEntrega> notaEntrega;
    

    /**
     * @return the rutas
     */
    public List<Ruta> getRutas() {
        return rutas;
    }

    /**
     * @param rutas the rutas to set
     */
    public void setRutas(List<Ruta> rutas) {
        this.rutas = rutas;
    }

    /**
     * @return the cargo
     */
    public Cargo getCargo() {
        return cargo;
    }

    /**
     * @param cargo the cargo to set
     */
    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<NotaEntrega> getNotaEntrega() {
        return notaEntrega;
    }

    public void setNotaEntrega(List<NotaEntrega> notaEntrega) {
        this.notaEntrega = notaEntrega;
    }
    
    
}
