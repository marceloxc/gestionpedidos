/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucue.ptc.gco.dao;

import edu.ucue.ptc.gco.mdl.Categoria;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 * @author edwin
 */
@Stateless
@Named(value="categoriaDao")
public class CategoriaDAO implements CategoriaDAOLocal {
    @Inject
    private EntityManager entityManager;

    @Override
    public void crear(Categoria categoria) {
        entityManager.persist(categoria);
    }

    @Override
    public void actualizar(Categoria categoria) {
        entityManager.merge(categoria);
    }

    @Override
    public void eliminar(Categoria categoria) {
        entityManager.remove(categoria);
    }

    @Override
    public List<Categoria> listarTodos() {
        Query query = entityManager.createQuery("select c from Categoria c");
        return query.getResultList();
    }

    @Override
    public Categoria obtenerPorId(int idCategoria) {
        return entityManager.find(Categoria.class, idCategoria);
    }

}
