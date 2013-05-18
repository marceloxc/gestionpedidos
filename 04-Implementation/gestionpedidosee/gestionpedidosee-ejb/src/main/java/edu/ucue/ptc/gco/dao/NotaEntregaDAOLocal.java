/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucue.ptc.gco.dao;

import javax.ejb.Local;

/**
 *
 * @author Valex
 */
@Local
public interface NotaEntregaDAOLocal {

    public void crearNotaEntrega(edu.ucue.ptc.gco.mdl.NotaEntrega notaEntrega);
    public void actualizarNotaEntrega(edu.ucue.ptc.gco.mdl.NotaEntrega notaEntrega);
    public void eliminarNotaEntrega(edu.ucue.ptc.gco.mdl.NotaEntrega notaEntrega);
    public java.util.List<edu.ucue.ptc.gco.mdl.NotaEntrega> listarTodosNotaEntrega();
    public edu.ucue.ptc.gco.mdl.NotaEntrega obtenerNotaEntregaPorId(int idNotaEntrega);
    
}
