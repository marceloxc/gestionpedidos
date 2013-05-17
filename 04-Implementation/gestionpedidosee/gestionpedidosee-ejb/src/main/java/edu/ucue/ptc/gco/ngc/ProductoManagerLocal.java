/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucue.ptc.gco.ngc;

import edu.ucue.ptc.gco.mdl.Producto;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Marcelo
 */
@Local
public interface ProductoManagerLocal {
    public void crear(Producto producto);
    public void actualizar(Producto producto);
    public void eliminar(Producto producto);
    
    public List<Producto> listarTodos();
    
    public Producto obtenerPorId(int idProducto);
}
