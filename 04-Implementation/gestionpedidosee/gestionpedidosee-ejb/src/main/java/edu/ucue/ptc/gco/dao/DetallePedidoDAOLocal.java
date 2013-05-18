/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucue.ptc.gco.dao;

import javax.ejb.Local;

/**
 *
 * @author wilo
 */
@Local
public interface DetallePedidoDAOLocal {

    public void crear(edu.ucue.ptc.gco.mdl.DetallePedido pedido);

    public void actualizar(edu.ucue.ptc.gco.mdl.DetallePedido pedido);

    public void eliminar(edu.ucue.ptc.gco.mdl.DetallePedido pedido);

    public java.util.List<edu.ucue.ptc.gco.mdl.DetallePedido> listarTodos();

    public edu.ucue.ptc.gco.mdl.DetallePedido obtenerPorId(java.lang.String idPedido);
    
}
