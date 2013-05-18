/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucue.ptc.gco.dao;

import edu.ucue.ptc.gco.mdl.DetallePedido;
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
public class DetallePedidoDAO implements DetallePedidoDAOLocal {

    @PersistenceContext(unitName="edu.ucue.gped_gestionpedidosee-ejb_ejb_1.0-SNAPSHOTPU")    
    private EntityManager entityManager;
   
    @Override
    public void crear(DetallePedido pedido) {
        entityManager.persist(pedido);
    }

    @Override
    public void actualizar(DetallePedido pedido) {
        entityManager.merge(pedido);
    }

    @Override
    public void eliminar(DetallePedido pedido) {
        entityManager.remove(pedido);
    }
/*
    public void eliminarc(DetallePedido idPedido) {
        DetallePedido pedido=obtenerPorId(idPedido);
        eliminar(pedido);
    }*/

    @Override
    public List<DetallePedido> listarTodos() {
        Query query = entityManager.createQuery("select c from DetallePedido c");
        
        return query.getResultList();
    }

    @Override
    public DetallePedido obtenerPorId(String idPedido) {
        Query query = entityManager.createQuery("select c from DetallePedido c "
                + "where c.idDetallePedido = :pidPedido");
        query.setParameter("pidPedido", idPedido);
        DetallePedido pedido = (DetallePedido)query.getSingleResult();
        
        return pedido;
    }

}
