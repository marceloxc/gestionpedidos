/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucue.ptc.gco.ngc;

import edu.ucue.ptc.gco.mdl.Ciudad;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author DELL
 */
@Local
public interface CiudadManagerLocal {
    public void crear(Ciudad ciudad);
    public void actualizar(Ciudad ciudad);
    public void eliminar(Ciudad ciudad);
    public void eliminarc(String idCiudad);
    public void eliminarc(Long idCiudad);
    
    public Ciudad obtenerPorId(String idCiudad);
    public List<Ciudad> listar();
}
