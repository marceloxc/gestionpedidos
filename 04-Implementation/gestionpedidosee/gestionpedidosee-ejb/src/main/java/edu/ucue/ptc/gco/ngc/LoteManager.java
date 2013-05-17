/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucue.ptc.gco.ngc;

import edu.ucue.ptc.gco.dao.LoteDAOLocal;
import edu.ucue.ptc.gco.mdl.Lote;
import java.util.List;
import javax.ejb.Stateful;
import javax.inject.Inject;
import javax.inject.Named;

/**
 * @author edwin
 */
@Stateful
@Named(value="loteManager")
public class LoteManager implements LoteManagerLocal {
    @Inject
    private LoteDAOLocal loteDao;

    @Override
    public void crear(Lote lote) {
        loteDao.crear(lote);
    }

    @Override
    public void actualizar(Lote lote) {
        loteDao.actualizar(lote);
    }

    @Override
    public void eliminar(Lote lote) {
        loteDao.eliminar(lote);
    }

    @Override
    public List<Lote> listarTodos() {
        return loteDao.listarTodos();
    }

    @Override
    public Lote obtenerPorId(int idLote) {
        return loteDao.obtenerPorId(idLote);
    }
    
}
