/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucue.ptc.gco.mdl;

import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author WILSON
 */

@Entity
@Table(name="pedido")
public class Visita {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idVisita;
   
    @ManyToOne(optional = false)
    @JoinColumn(name="idPersona")
    private Cliente cliente;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    @Column
    private Date fechaIngreso;
    
    @OneToOne(mappedBy="direccion")
    private Direccion direccion;
    
    @Column
    private double subtotal;
    
    @Column
    private double iva;
    
    @Column
    private double total;
    
    @Column
    private int estado;
    
    @OneToMany(mappedBy="detallePedido")
    private List<DetallePedido> detalle;

    /**
     * @return the idPedido
     */
    public int getIdVisita() {
        return idVisita;
    }

    /**
     * @param idPedido the idPedido to set
     */
    public void setIdVisita(int idPedido) {
        this.idVisita = idPedido;
    }  

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the fechaIngreso
     */
    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    /**
     * @param fechaIngreso the fechaIngreso to set
     */
    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    /**
     * @return the direccion
     */
    public Direccion getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the subtotal
     */
    public double getSubtotal() {
        return subtotal;
    }

    /**
     * @param subtotal the subtotal to set
     */
    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    /**
     * @return the iva
     */
    public double getIva() {
        return iva;
    }

    /**
     * @param iva the iva to set
     */
    public void setIva(double iva) {
        this.iva = iva;
    }

    /**
     * @return the total
     */
    public double getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(double total) {
        this.total = total;
    }

    /**
     * @return the detalle
     */
    public List<DetallePedido> getDetalle() {
        return detalle;
    }

    /**
     * @param detalle the detalle to set
     */
    public void setDetalle(List<DetallePedido> detalle) {
        this.detalle = detalle;
    }
    
}
