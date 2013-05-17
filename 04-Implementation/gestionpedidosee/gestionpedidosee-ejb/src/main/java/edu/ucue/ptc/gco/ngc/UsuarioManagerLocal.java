/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucue.ptc.gco.ngc;

import edu.ucue.ptc.gco.mdl.Usuario;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author CHRISTIAN
 */
@Local
public interface UsuarioManagerLocal {
    public void crearUsuario(Usuario usuario);
    public void actualizarUsuario(Usuario usuario);
    public void eliminarUsuario(Usuario usuario);
    
    public Usuario obtenerUsuarioPorId(int idUsuario);
    public List<Usuario> listarUsuario();
}
