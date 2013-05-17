/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucue.ptc.gco.ngc;

import edu.ucue.ptc.gco.mdl.Lote;
import java.util.List;
import javax.ejb.Local;

/**
 * @author edwin
 */
@Local
public interface LoteManagerLocal {
    public void crear(Lote lote);
    public void actualizar(Lote lote);
    public void eliminar(Lote lote);
    
    public List<Lote> listarTodos();
    public Lote obtenerPorId(int idLote);
}
