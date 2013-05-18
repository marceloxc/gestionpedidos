/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucue.ptc.gco.dao;

import edu.ucue.ptc.gco.mdl.Pedido;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author wilo
 */
@Stateless
public class PedidoDAO implements PedidoDAOLocal {

    @PersistenceContext(unitName="edu.ucue.gped_gestionpedidosee-ejb_ejb_1.0-SNAPSHOTPU")    
    private EntityManager entityManager;
   
    @Override
    public void crear(Pedido pedido) {
        entityManager.persist(pedido);
    }

    @Override
    public void actualizar(Pedido pedido) {
        entityManager.merge(pedido);
    }

    @Override
    public void eliminar(Pedido pedido) {
        entityManager.remove(pedido);
    }

    @Override
    public void eliminarc(String idPedido) {
        Pedido pedido=obtenerPorId(idPedido);
        eliminar(pedido);
    }

    @Override
    public List<Pedido> listarTodos() {
        Query query = entityManager.createQuery("select c from Pedido c");
        
        return query.getResultList();
    }

    @Override
    public Pedido obtenerPorId(String idPedido) {
        Query query = entityManager.createQuery("select c from Pedido c "
                + "where c.idPedido = :pidPedido");
        query.setParameter("pidPedido", idPedido);
        Pedido pedido = (Pedido)query.getSingleResult();
        
        return pedido;
    }
}
