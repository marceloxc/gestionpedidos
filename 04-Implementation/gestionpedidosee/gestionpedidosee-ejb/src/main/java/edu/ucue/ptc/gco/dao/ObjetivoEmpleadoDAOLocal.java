/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucue.ptc.gco.dao;

import edu.ucue.ptc.gco.mdl.Empleado;
import edu.ucue.ptc.gco.mdl.ObjetivoEmpleado;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Johnny
 */
@Local
public interface ObjetivoEmpleadoDAOLocal {
    public void crear(ObjetivoEmpleado objetivoempleado);
   public void modificar(ObjetivoEmpleado objetivoempleado);
   public List<ObjetivoEmpleado> listar(Empleado empleado);
}
