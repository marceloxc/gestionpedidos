/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucue.ptc.gco.dao;

import javax.ejb.Local;

/**
 *
 * @author Valex
 */
@Local
public interface ClienteDAOLocal {

    public void crearCliente(edu.ucue.ptc.gco.mdl.Cliente cliente);
    public void actualizarCliente(edu.ucue.ptc.gco.mdl.Cliente cliente);
    public void eliminarCliente(edu.ucue.ptc.gco.mdl.Cliente cliente);
    public java.util.List<edu.ucue.ptc.gco.mdl.Cliente> listarTodosCliente();
    public edu.ucue.ptc.gco.mdl.Cliente obtenerClientePorId(int idCliente);
    
}
