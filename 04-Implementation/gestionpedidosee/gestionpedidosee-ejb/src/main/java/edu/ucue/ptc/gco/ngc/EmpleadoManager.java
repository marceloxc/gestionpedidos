/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucue.ptc.gco.ngc;

import edu.ucue.ptc.gco.dao.EmpleadoDAOLocal;
import edu.ucue.ptc.gco.mdl.Empleado;
import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.ejb.Stateful;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Johnny
 */
@Stateful
@Named(value="empleadoManager")

public class EmpleadoManager implements EmpleadoManagerLocal {

    @Inject
    private EmpleadoDAOLocal empleadoDao;
    
    
    public void crear(Empleado empleado) {
        //validar(empleado);
        empleadoDao.crear(empleado);
    }

    @Override
    public void modificar(Empleado empleado) {
        
        //validar(empleado);
        empleadoDao.modificar(empleado);
    }

    @Override
    public List<Empleado> listar() {
        return empleadoDao.listar();
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

}
