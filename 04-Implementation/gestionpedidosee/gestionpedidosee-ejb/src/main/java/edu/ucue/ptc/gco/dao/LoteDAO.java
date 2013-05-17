/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucue.ptc.gco.dao;

import edu.ucue.ptc.gco.mdl.Lote;
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
@Named(value="loteDao")
public class LoteDAO implements LoteDAOLocal {
    @Inject
    private EntityManager entityManager;

    @Override
    public void crear(Lote lote) {
        entityManager.persist(lote);
    }

    @Override
    public void actualizar(Lote lote) {
        entityManager.merge(lote);
    }

    @Override
    public void eliminar(Lote lote) {
        entityManager.remove(lote);
    }

    @Override
    public List<Lote> listarTodos() {
        Query query = entityManager.createQuery("select l from Lote l");
        return query.getResultList();
    }

    @Override
    public Lote obtenerPorId(int idLote) {
        return entityManager.find(Lote.class, idLote);
    }

}
