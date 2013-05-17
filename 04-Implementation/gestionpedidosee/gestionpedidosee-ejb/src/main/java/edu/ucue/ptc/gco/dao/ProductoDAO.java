/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucue.ptc.gco.dao;

import edu.ucue.ptc.gco.mdl.Producto;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Marcelo
 */
@Stateless
@Named(value="productoDao")
public class ProductoDAO implements ProductoDAOLocal {
    @Inject
    private EntityManager entityManager;

    @Override
    public void crear(Producto producto) {
        entityManager.persist(producto);
    }

    @Override
    public void actualizar(Producto producto) {
        entityManager.merge(producto);
    }

    @Override
    public void eliminar(Producto producto) {
        entityManager.remove(producto);
    }

    @Override
    public List<Producto> listarTodos() {
        Query query = entityManager.createQuery("select c from Empleado c");
        return query.getResultList();
    }

    @Override
    public Producto obtenerPorId(int idProducto) {
        return entityManager.find(Producto.class, idProducto);
    }

}
