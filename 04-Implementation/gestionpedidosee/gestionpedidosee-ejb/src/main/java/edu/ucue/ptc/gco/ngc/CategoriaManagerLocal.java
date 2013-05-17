/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucue.ptc.gco.ngc;

import edu.ucue.ptc.gco.mdl.Categoria;
import java.util.List;
import javax.ejb.Local;

/**
 * @author edwin
 */
@Local
public interface CategoriaManagerLocal {
    public void crear(Categoria categoria);
    public void actualizar(Categoria categoria);
    public void eliminar(Categoria categoria);
    
    public List<Categoria> listarTodos();
    public Categoria obtenerPorId(int idCategoria);
}
