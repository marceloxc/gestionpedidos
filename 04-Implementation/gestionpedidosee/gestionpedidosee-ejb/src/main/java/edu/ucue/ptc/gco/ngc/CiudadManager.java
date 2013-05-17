/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucue.ptc.gco.ngc;

import edu.ucue.ptc.gco.dao.CiudadDAO;
import edu.ucue.ptc.gco.dao.CiudadDAOLocal;
import edu.ucue.ptc.gco.mdl.Ciudad;
import java.util.List;
import javax.ejb.Stateful;
import javax.inject.Inject;

/**
 *
 * @author DELL
 */
@Stateful
public class CiudadManager implements CiudadManagerLocal {

    @Inject
    private CiudadDAOLocal ciudadDao;
    
    @Override
    public void crear(Ciudad ciudad) {        
        ciudadDao.crear(ciudad);
    }

    @Override
    public List<Ciudad> listar() {
        return ciudadDao.listarTodos();
    }    
    
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public void actualizar(Ciudad ciudad) {
        ciudadDao.actualizar(ciudad);
    }

    @Override
    public void eliminar(Ciudad ciudad) {
        ciudadDao.eliminar(ciudad);
    }

    @Override
    public void eliminarc(String idCiudad) {
        ciudadDao.eliminarc(idCiudad);
    }

    @Override
    public void eliminarc(Long idCiudad) {
        ciudadDao.eliminarc(idCiudad);
    }

    @Override
    public Ciudad obtenerPorId(String idCiudad) {
        return ciudadDao.obtenerPorId(idCiudad);
    }

}
