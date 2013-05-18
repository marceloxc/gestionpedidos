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
public interface PedidoDAOLocal {

    public void crear(edu.ucue.ptc.gco.mdl.Pedido pedido);
    
    public void actualizar(edu.ucue.ptc.gco.mdl.Pedido pedido);

    public void eliminar(edu.ucue.ptc.gco.mdl.Pedido pedido);

    public void eliminarc(java.lang.String idPedido);

    public java.util.List<edu.ucue.ptc.gco.mdl.Pedido> listarTodos();

    public edu.ucue.ptc.gco.mdl.Pedido obtenerPorId(java.lang.String idPedido);

    
}
