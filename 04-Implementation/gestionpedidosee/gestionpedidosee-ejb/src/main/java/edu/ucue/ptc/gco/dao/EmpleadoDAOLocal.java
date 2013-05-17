/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucue.ptc.gco.dao;

import edu.ucue.ptc.gco.mdl.Empleado;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Johnny
 */
@Local
public interface EmpleadoDAOLocal {
  public void crear(Empleado empleado);
   public void modificar(Empleado empleado);
   public List<Empleado> listar();  
}
