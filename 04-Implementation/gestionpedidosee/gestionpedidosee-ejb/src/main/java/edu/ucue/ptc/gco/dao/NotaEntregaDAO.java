/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucue.ptc.gco.dao;

import edu.ucue.ptc.gco.mdl.Cargo;
import edu.ucue.ptc.gco.mdl.Cliente;
import edu.ucue.ptc.gco.mdl.NotaEntrega;
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
public class NotaEntregaDAO implements NotaEntregaDAOLocal {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
@PersistenceContext(unitName="edu.ucue.gped_gestionpedidosee-ejb_ejb_1.0-SNAPSHOTPU")    
    private EntityManager entityManager;
    
    @Override
    public void crearNotaEntrega(NotaEntrega notaEntrega) {
        entityManager.persist(notaEntrega);
    }

    @Override
    public void actualizarNotaEntrega(NotaEntrega notaEntrega) {
        entityManager.merge(notaEntrega);
    }

    @Override
    public void eliminarNotaEntrega(NotaEntrega notaEntrega) {
        entityManager.remove(notaEntrega);
    }


    @Override
    public List<NotaEntrega> listarTodosNotaEntrega() {
        Query query = entityManager.createQuery("select c from NotaEntrega c");
        
        return query.getResultList();
    }

    @Override
    public NotaEntrega obtenerNotaEntregaPorId(int idNotaEntrega) {
        Query query = entityManager.createQuery("select c from NotaEntrega c "
                + "where c.idNotaEntrega = :pidNotaEntrega");
        query.setParameter("pidNotaEntrega", idNotaEntrega);
        NotaEntrega notaEntrega = (NotaEntrega)query.getSingleResult();
        
        return notaEntrega;
    }
}
