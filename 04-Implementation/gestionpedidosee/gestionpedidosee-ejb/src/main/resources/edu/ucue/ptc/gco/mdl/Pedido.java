/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucue.ptc.gco.mdl;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Johnny
 */
public class Pedido {
    private int idPedido;
    private Empleado empleado;
    private Cliente cliente;
    private Date fechaIngreso;
    private Direccion direccion;
    private double subtotal;
    private double iva;
    private double total;
    private List<DetallePedido> detalle;
    
}
