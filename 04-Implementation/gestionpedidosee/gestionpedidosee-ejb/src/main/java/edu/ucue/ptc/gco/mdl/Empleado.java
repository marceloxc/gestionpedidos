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
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idEmpleado;
    @Column
    private String user;
    @Column
    private String password;
    @OneToMany(mappedBy="idRuta")
    private List<Ruta> rutas;
    private List<ObjetivoEmpleado> objetivos;
    @ManyToOne(optional = false)
    @JoinColumn(name="idCargo")
    private Cargo cargo;
    @OneToOne(mappedBy="empleado")
    private Usuario usuario;

    /**
     * @return the idPersona
     */
    

    /**
     * @param idPersona the idPersona to set
     */
    
    /**
     * @return the idEmpleado
     */
    public int getIdEmpleado() {
        return idEmpleado;
    }

    /**
     * @param idEmpleado the idEmpleado to set
     */
    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    /**
     * @return the user
     */
    public String getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * @return the Password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param Password the Password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

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
    
}
