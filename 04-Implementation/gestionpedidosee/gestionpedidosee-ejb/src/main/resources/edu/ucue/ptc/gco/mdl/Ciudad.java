/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucue.ptc.gco.mdl;

import java.util.List;

/**
 *
 * @author Johnny
 */
public class Ciudad {
    private int idCiudad;
    private String nombre;
    private List<Direccion> direcciones;

    /**
     * @return the idCiudad
     */
    public int getIdCiudad() {
        return idCiudad;
    }

    /**
     * @param idCiudad the idCiudad to set
     */
    public void setIdCiudad(int idCiudad) {
        this.idCiudad = idCiudad;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the direcciones
     */
    public List<Direccion> getDirecciones() {
        return direcciones;
    }

    /**
     * @param direcciones the direcciones to set
     */
    public void setDirecciones(List<Direccion> direcciones) {
        this.direcciones = direcciones;
    }
}
