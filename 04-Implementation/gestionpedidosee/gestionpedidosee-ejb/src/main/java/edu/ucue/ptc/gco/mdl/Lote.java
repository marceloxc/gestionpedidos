/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucue.ptc.gco.mdl;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;

@Entity
public class Lote implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idLote;
    
    @Column
    private int cantidadInicial;
    @Column
    private int cantidadActual;
    @Column
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaCaducidad;
    @Column
    private double costoVenta;

    @ManyToOne
    private Producto producto; 
    
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

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    
    
}
