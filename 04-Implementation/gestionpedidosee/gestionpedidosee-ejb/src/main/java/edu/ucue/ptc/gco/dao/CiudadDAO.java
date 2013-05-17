/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucue.ptc.gco.dao;

import edu.ucue.ptc.gco.mdl.Ciudad;
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
public class CiudadDAO implements CiudadDAOLocal {

    @PersistenceContext(unitName="edu.ucue.gped_gestionpedidosee-ejb_ejb_1.0-SNAPSHOTPU")    
    private EntityManager entityManager;
    
    @Override
    public void crear(Ciudad ciudad) {
        entityManager.persist(ciudad);
    }

    @Override
    public void actualizar(Ciudad ciudad) {
        entityManager.merge(ciudad);
    }

    @Override
    public void eliminar(Ciudad ciudad) {
        entityManager.remove(ciudad);
    }

    @Override
    public void eliminarc(String idCiudad) {
        Ciudad ciudad=obtenerPorId(idCiudad);
        eliminar(ciudad);
    }

    @Override
    public void eliminarc(Long idCiudad) {
        Ciudad ciudad = entityManager.find(Ciudad.class, idCiudad);
        eliminar(ciudad);
    }

    @Override
    public List<Ciudad> listarTodos() {
        Query query = entityManager.createQuery("select c from Ciudad c");
        
        return query.getResultList();
    }

    @Override
    public Ciudad obtenerPorId(String idCiudad) {
        Query query = entityManager.createQuery("select c from Ciudad c "
                + "where c.idCiudad = :pidCiudad");
        query.setParameter("pCedulaRuc", idCiudad);
        Ciudad ciudad = (Ciudad)query.getSingleResult();
        
        return ciudad;
    }
    
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

}
