/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucue.ptc.gco.ngc;

import edu.ucue.ptc.gco.mdl.Empleado;
import edu.ucue.ptc.gco.mdl.ObjetivoEmpleado;
import java.util.List;
import javax.ejb.Stateful;
import javax.inject.Named;

/**
 *
 * @author Johnny
 */
@Stateful
@Named(value="objetivoEmpleadoManager")
public class ObjetivoEmpleadoManajer implements ObjetivoEmpleadoManajerLocal {

    @Override
    public void crear(ObjetivoEmpleado objetivoempleado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void modificar(ObjetivoEmpleado objetivoempleado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ObjetivoEmpleado> listar(Empleado empleado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

}
