/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucue.ptc.gco.mdl;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author ANGIE
 */
@Entity
@Table(name="nota_entrega")
public class NotaEntrega {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idNotaEntrega;
    @OneToOne
    private Pedido pedido;
    @Column
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaEntrega;
    @ManyToOne
    private Empleado empleado;
    /**
     * @return the idNotaEntrega
     */
    public int getIdNotaEntrega() {
        return idNotaEntrega;
    }

    /**
     * @param idNotaEntrega the idNotaEntrega to set
     */
    public void setIdNotaEntrega(int idNotaEntrega) {
        this.idNotaEntrega = idNotaEntrega;
    }

    /**
     * @return the pedido
     */
    public Pedido getPedido() {
        return pedido;
    }

    /**
     * @param pedido the pedido to set
     */
    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    /**
     * @return the fechaEntrega
     */
    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    /**
     * @param fechaEntrega the fechaEntrega to set
     */
    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }
    public Empleado getEmpleado(){
        return empleado;
    }
    public void setEmpleado(Empleado empleado){
        this.empleado=empleado;
    }
}
