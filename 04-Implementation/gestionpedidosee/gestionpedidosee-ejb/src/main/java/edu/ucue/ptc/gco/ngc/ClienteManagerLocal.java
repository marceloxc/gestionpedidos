/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucue.ptc.gco.ngc;

import edu.ucue.ptc.gco.mdl.Cliente;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author xaferima
 */
@Local
public interface ClienteManagerLocal {
    public void crearCliente(Cliente cliente);
    public void actualizarCliente(Cliente cliente);
    public void eliminarCliente(Cliente cliente);
    
    public Cliente obtenerClienePorId(int idCliente);
    public List<Cliente> listarCliente();
}
