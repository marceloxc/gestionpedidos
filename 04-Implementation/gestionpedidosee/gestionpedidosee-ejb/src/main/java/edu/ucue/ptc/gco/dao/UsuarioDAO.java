/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucue.ptc.gco.dao;

import edu.ucue.ptc.gco.mdl.Usuario;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author CHRISTIAN
 */
@Stateless
public class UsuarioDAO implements UsuarioDAOLocal{
    @PersistenceContext(unitName="edu.ucue.gped_gestionpedidosee-ejb_ejb_1.0-SNAPSHOTPU")    
    private EntityManager entityManager;
    
    @Override
    public void crearUsuario(Usuario usuario) {
        entityManager.persist(usuario);
    }

    @Override
    public void actualizarUsuario(Usuario usuario) {
        entityManager.merge(usuario);
    }

    @Override
    public void eliminarUsuario(Usuario usuario) {
        entityManager.remove(usuario);
    }


    @Override
    public List<Usuario> listarTodosUsuario() {
        Query query = entityManager.createQuery("select c from Usuario c");
        
        return query.getResultList();
    }

    @Override
    public Usuario obtenerUsuarioPorId(int idUsuario) {
        Query query = entityManager.createQuery("select c from Usuario c "
                + "where c.idUsuario = :pidUsuario");
        query.setParameter("pidUsuario", idUsuario);
        Usuario usuario = (Usuario)query.getSingleResult();
        
        return usuario;
    }
}
