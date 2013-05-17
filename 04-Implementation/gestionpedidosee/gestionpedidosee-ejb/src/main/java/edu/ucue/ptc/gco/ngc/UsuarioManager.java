/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucue.ptc.gco.ngc;

import edu.ucue.ptc.gco.dao.UsuarioDAOLocal;
import edu.ucue.ptc.gco.mdl.Usuario;
import java.util.List;
import javax.ejb.Local;
import javax.inject.Inject;

/**
 *
 * @author CHRISTIAN
 */
@Local
public class UsuarioManager implements UsuarioManagerLocal{
    @Inject
    private UsuarioDAOLocal usuarioDAOLocal;
    
    @Override
    public void crearUsuario(Usuario usuario) {        
        usuarioDAOLocal.crearUsuario(usuario);
    }

    @Override
    public List<Usuario> listarUsuario() {
        return usuarioDAOLocal.listarTodosUsuario();
    }    
    
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public void actualizarUsuario(Usuario usuario) {
        usuarioDAOLocal.actualizarUsuario(usuario);
    }

    @Override
    public void eliminarUsuario(Usuario usuario) {
        usuarioDAOLocal.eliminarUsuario(usuario);
    }

    @Override
    public Usuario obtenerUsuarioPorId(int idUsuario) {
        return usuarioDAOLocal.obtenerUsuarioPorId(idUsuario);
    }
}
