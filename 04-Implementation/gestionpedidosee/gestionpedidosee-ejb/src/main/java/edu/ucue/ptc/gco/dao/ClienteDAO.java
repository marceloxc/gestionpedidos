/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucue.ptc.gco.dao;

import edu.ucue.ptc.gco.mdl.Cargo;
import edu.ucue.ptc.gco.mdl.Cliente;
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
public class ClienteDAO implements ClienteDAOLocal {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
@PersistenceContext(unitName="edu.ucue.gped_gestionpedidosee-ejb_ejb_1.0-SNAPSHOTPU")    
    private EntityManager entityManager;
    
    @Override
    public void crearCliente(Cliente cliente) {
        entityManager.persist(cliente);
    }

    @Override
    public void actualizarCliente(Cliente cliente) {
        entityManager.merge(cliente);
    }

    @Override
    public void eliminarCliente(Cliente cliente) {
        entityManager.remove(cliente);
    }


    @Override
    public List<Cargo> listarTodosCliente() {
        Query query = entityManager.createQuery("select c from Cliente c");
        
        return query.getResultList();
    }

    @Override
    public Cliente obtenerClientePorId(int idCliente) {
        Query query = entityManager.createQuery("select c from Cliente c "
                + "where c.idCliente = :pidCliente");
        query.setParameter("pidCliente", idCliente);
        Cliente cliente = (Cliente)query.getSingleResult();
        
        return cliente;
    }
}
