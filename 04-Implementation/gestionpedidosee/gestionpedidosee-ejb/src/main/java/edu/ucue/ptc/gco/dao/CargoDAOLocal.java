/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucue.ptc.gco.dao;

import edu.ucue.ptc.gco.mdl.Cargo;
import java.util.List;

/**
 *
 * @author CHRISTIAN
 */
public interface CargoDAOLocal {
    public void crearCargo(Cargo cargo);
    public void actualizarCargo(Cargo cargo);
    public void eliminarCargo(Cargo cargo);
    
    public Cargo obtenerCargoPorId(int idCargo);
    public List<Cargo> listarTodosCargo();
}
