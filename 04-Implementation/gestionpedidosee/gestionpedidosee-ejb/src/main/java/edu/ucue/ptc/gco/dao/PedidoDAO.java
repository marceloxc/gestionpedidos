/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucue.ptc.gco.dao;

import edu.ucue.ptc.gco.mdl.Visita;
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
    public void crear(Visita pedido) {
        entityManager.persist(pedido);
    }

    @Override
    public void actualizar(Visita pedido) {
        entityManager.merge(pedido);
    }

    @Override
    public void eliminar(Visita pedido) {
        entityManager.remove(pedido);
    }

    @Override
    public void eliminarc(String idPedido) {
        Visita pedido=obtenerPorId(idPedido);
        eliminar(pedido);
    }

    @Override
    public List<Visita> listarTodos() {
        Query query = entityManager.createQuery("select c from Pedido c");
        
        return query.getResultList();
    }

    @Override
    public Visita obtenerPorId(String idPedido) {
        Query query = entityManager.createQuery("select c from Pedido c "
                + "where c.idPedido = :pidPedido");
        query.setParameter("pidPedido", idPedido);
        Visita pedido = (Visita)query.getSingleResult();
        
        return pedido;
    }
}
