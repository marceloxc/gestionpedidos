/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucue.ptc.gco.ngc;

import edu.ucue.ptc.gco.dao.DireccionDAOLocal;
import edu.ucue.ptc.gco.mdl.Direccion;
import java.util.List;
import javax.ejb.Stateful;
import javax.inject.Inject;

/**
 *
 * @author DELL
 */
@Stateful
public class DireccioManager implements DireccioManagerLocal {

    @Inject
    private DireccionDAOLocal direccionDao;
    
    @Override
    public void crear(Direccion direccion) {
        direccionDao.crear(direccion);
    }

    @Override
    public void actualizar(Direccion direccion) {
        direccionDao.actualizar(direccion);
    }

    @Override
    public void eliminar(Direccion direccion) {
        direccionDao.eliminar(direccion);
    }

    @Override
    public void eliminarc(String idDireccion) {
        direccionDao.eliminarc(idDireccion);
    }

    @Override
    public void eliminarc(Long idDireccion) {
        direccionDao.eliminarc(idDireccion);
    }

    @Override
    public List<Direccion> listarTodos() {
        return direccionDao.listarTodos();
    }

    @Override
    public Direccion obtenerPorId(String idDireccion) {
        return direccionDao.obtenerPorId(idDireccion);
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

}
