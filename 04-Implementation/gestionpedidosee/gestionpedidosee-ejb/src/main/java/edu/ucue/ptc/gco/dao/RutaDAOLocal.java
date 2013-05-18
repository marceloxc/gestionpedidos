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
public interface RutaDAOLocal {
  
    public void crearRuta(edu.ucue.ptc.gco.mdl.Ruta ruta);
    public void actualizarRuta(edu.ucue.ptc.gco.mdl.Ruta ruta);
    public void eliminarRuta(edu.ucue.ptc.gco.mdl.Ruta ruta);
    public java.util.List<edu.ucue.ptc.gco.mdl.Ruta> listarTodosRuta();
    public edu.ucue.ptc.gco.mdl.Ruta obtenerRutaPorId(int idRuta);
    
}
