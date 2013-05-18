/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucue.ptc.gco.dao;

import edu.ucue.ptc.gco.mdl.Cargo;
import edu.ucue.ptc.gco.mdl.Ruta;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Valex
 */
@Stateless
public class RutaDAO implements RutaDAOLocal {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    @PersistenceContext(unitName="edu.ucue.gped_gestionpedidosee-ejb_ejb_1.0-SNAPSHOTPU")    
    private EntityManager entityManager;
    
    @Override
    public void crearRuta(Ruta ruta) {
        entityManager.persist(ruta);
    }

    @Override
    public void actualizarRuta(Ruta ruta) {
        entityManager.merge(ruta);
    }

    @Override
    public void eliminarRuta(Ruta ruta) {
        entityManager.remove(ruta);
    }


    @Override
    public List<Ruta> listarTodosRuta() {
        Query query = entityManager.createQuery("select c from Ruta c");
        
        return query.getResultList();
    }

    @Override
    public Ruta obtenerRutaPorId(int idRuta) {
        Query query = entityManager.createQuery("select c from Ruta c "
                + "where c.idRuta = :pidRuta");
        query.setParameter("pidRuta", idRuta);
        Ruta ruta = (Ruta)query.getSingleResult();
        
        return ruta;
    }

}
