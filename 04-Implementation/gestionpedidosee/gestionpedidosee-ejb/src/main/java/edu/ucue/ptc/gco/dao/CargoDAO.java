/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucue.ptc.gco.dao;

import edu.ucue.ptc.gco.mdl.Cargo;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author CHRISTIAN
 */
@Stateless
public class CargoDAO implements CargoDAOLocal{
    
    @PersistenceContext(unitName="edu.ucue.gped_gestionpedidosee-ejb_ejb_1.0-SNAPSHOTPU")    
    private EntityManager entityManager;
    
    @Override
    public void crearCargo(Cargo cargo) {
        entityManager.persist(cargo);
    }

    @Override
    public void actualizarCargo(Cargo cargo) {
        entityManager.merge(cargo);
    }

    @Override
    public void eliminarCargo(Cargo cargo) {
        entityManager.remove(cargo);
    }


    @Override
    public List<Cargo> listarTodosCargo() {
        Query query = entityManager.createQuery("select c from Cargo c");
        
        return query.getResultList();
    }

    @Override
    public Cargo obtenerCargoPorId(int idCargo) {
        Query query = entityManager.createQuery("select c from Cargo c "
                + "where c.idCargo = :pidCargo");
        query.setParameter("pidCargo", idCargo);
        Cargo cargo = (Cargo)query.getSingleResult();
        
        return cargo;
    }
}
