/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucue.ptc.gco.ngc;

import edu.ucue.ptc.gco.mdl.Direccion;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author DELL
 */
@Local
public interface DireccioManagerLocal {
    public void crear(Direccion direccion);
    public void actualizar(Direccion direccion);
    public void eliminar(Direccion direccion);
    public void eliminarc(String idDireccion);
    public void eliminarc(Long idDireccion);
    
    public List<Direccion> listarTodos();
    
    public Direccion obtenerPorId(String idDireccion);
}
