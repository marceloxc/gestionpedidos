/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucue.ptc.gco.mdl;

import java.util.Date;

/**
 *
 * @author Johnny
 */
public class Lote {
    private int idLote;
    private int cantidadInicial;
    private int cantidadActual;
    private Date fechaCaducidad;
    private double costoVenta;

    /**
     * @return the idLote
     */
    public int getIdLote() {
        return idLote;
    }

    /**
     * @param idLote the idLote to set
     */
    public void setIdLote(int idLote) {
        this.idLote = idLote;
    }

    /**
     * @return the cantidadInicial
     */
    public int getCantidadInicial() {
        return cantidadInicial;
    }

    /**
     * @param cantidadInicial the cantidadInicial to set
     */
    public void setCantidadInicial(int cantidadInicial) {
        this.cantidadInicial = cantidadInicial;
    }

    /**
     * @return the cantidadActual
     */
    public int getCantidadActual() {
        return cantidadActual;
    }

    /**
     * @param cantidadActual the cantidadActual to set
     */
    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    /**
     * @return the fechaCaducidad
     */
    public Date getFechaCaducidad() {
        return fechaCaducidad;
    }

    /**
     * @param fechaCaducidad the fechaCaducidad to set
     */
    public void setFechaCaducidad(Date fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    /**
     * @return the costoVenta
     */
    public double getCostoVenta() {
        return costoVenta;
    }

    /**
     * @param costoVenta the costoVenta to set
     */
    public void setCostoVenta(double costoVenta) {
        this.costoVenta = costoVenta;
    }
}
