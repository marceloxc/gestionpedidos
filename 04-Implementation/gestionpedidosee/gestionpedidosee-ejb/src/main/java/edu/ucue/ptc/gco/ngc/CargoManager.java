/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucue.ptc.gco.ngc;

import edu.ucue.ptc.gco.dao.CargoDAOLocal;
import edu.ucue.ptc.gco.mdl.Cargo;
import java.util.List;
import javax.ejb.Stateful;
import javax.inject.Inject;

/**
 *
 * @author CHRISTIAN
 */
@Stateful
public class CargoManager implements CargoManagerLocal{
    
    @Inject
    private CargoDAOLocal cargoDAOLocal;
    
    @Override
    public void crearCargo(Cargo cargo) {        
        cargoDAOLocal.crearCargo(cargo);
    }

    @Override
    public List<Cargo> listarCargo() {
        return cargoDAOLocal.listarTodosCargo();
    }    

    @Override
    public void actualizarCargo(Cargo cargo) {
        cargoDAOLocal.actualizarCargo(cargo);
    }

    @Override
    public void eliminarCargo(Cargo cargo) {
        cargoDAOLocal.eliminarCargo(cargo);
    }

    @Override
    public Cargo obtenerCargoPorId(int idCargo) {
        return cargoDAOLocal.obtenerCargoPorId(idCargo);
    }
}
