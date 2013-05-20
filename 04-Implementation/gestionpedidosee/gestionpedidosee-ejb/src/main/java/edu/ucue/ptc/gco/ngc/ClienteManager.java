/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucue.ptc.gco.ngc;

import edu.ucue.ptc.gco.ngc.*;
import edu.ucue.ptc.gco.dao.ClienteDAOLocal;
import edu.ucue.ptc.gco.mdl.Cliente;
import edu.ucue.ptc.gco.mdl.Cliente;
import java.util.List;
import javax.ejb.Local;
import javax.inject.Inject;

/**
 *
 * @author xaferima
 */
@Local
public abstract class ClienteManager implements ClienteManagerLocal{
    @Inject
    private ClienteDAOLocal clienteDAOLocal;
    
    @Override
    public void crearCliente(Cliente cliente) {        
        clienteDAOLocal.crearCliente(cliente);
    }

    
    public List<Cliente> listarUsuario() {
        return clienteDAOLocal.listarTodosCliente();
    }    
    
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public void actualizarCliente(Cliente cliente) {        
        clienteDAOLocal.actualizarCliente(cliente);
    }

    @Override
    public void eliminarCliente(Cliente cliente) {        
        clienteDAOLocal.eliminarCliente(cliente);
    }

   
    public Cliente obtenerClientePorId(int idCliente) {
        return clienteDAOLocal.obtenerClientePorId(idCliente);
    }
}
