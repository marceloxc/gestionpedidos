/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucue.ptc.gco.ngc;

import edu.ucue.ptc.gco.mdl.Cargo;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author CHRISTIAN
 */
@Local
public interface CargoManagerLocal {
    public void crearCargo(Cargo cargo);
    public void actualizarCargo(Cargo cargo);
    public void eliminarCargo(Cargo cargo);
    
    public Cargo obtenerCargoPorId(int idCargo);
    public List<Cargo> listarCargo();
}
