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
public class NotaEntrega {
    private int idNotaEntrega;
    private Pedido pedido;
    private Date fechaEntrega;
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
