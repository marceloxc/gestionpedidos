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
    public List<Ciudad> listar();
}
