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
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Ciudad> listar() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

}
