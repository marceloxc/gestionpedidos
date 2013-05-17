/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucue.ptc.gco.dao;

import edu.ucue.ptc.gco.mdl.Direccion;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author DELL
 */
@Stateless
public class DireccionDAO implements DireccionDAOLocal {

    @PersistenceContext(unitName="edu.ucue.gped_gestionpedidosee-ejb_ejb_1.0-SNAPSHOTPU")    
    private EntityManager entityManager;
    
    @Override
    public void crear(Direccion direccion) {
        entityManager.persist(direccion);
    }

    @Override
    public void actualizar(Direccion direccion) {
        entityManager.merge(direccion);
    }

    @Override
    public void eliminar(Direccion direccion) {
        entityManager.remove(direccion);
    }

    @Override
    public void eliminarc(String idDireccion) {
        Direccion direccion = obtenerPorId(idDireccion);
        eliminar(direccion);
    }

    @Override
    public void eliminarc(Long idDireccion) {
        Direccion direccion  = entityManager.find(Direccion.class, idDireccion);
        eliminar(direccion );
    }

    @Override
    public List<Direccion> listarTodos() {
        Query query = entityManager.createQuery("select d from Direccion d");       
        return query.getResultList();
    }

    @Override
    public Direccion obtenerPorId(String idDireccion) {
        Query query = entityManager.createQuery("select d from Direccion d "
                + "where c.idDireccion = :pidDireccion");
        query.setParameter("pidDireccion", idDireccion);
        Direccion direccion = (Direccion)query.getSingleResult();
        
        return direccion;
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

}
