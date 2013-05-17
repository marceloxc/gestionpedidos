/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucue.ptc.gco.ngc;

import edu.ucue.ptc.gco.dao.CategoriaDAOLocal;
import edu.ucue.ptc.gco.mdl.Categoria;
import java.util.List;
import javax.ejb.Stateful;
import javax.inject.Inject;
import javax.inject.Named;

/**
 * @author edwin
 */
@Stateful
@Named(value="categoriaManager")
public class CategoriaManager implements CategoriaManagerLocal {
    @Inject
    private CategoriaDAOLocal categoriaDao;

    @Override
    public void crear(Categoria categoria) {
        categoriaDao.crear(categoria);
    }

    @Override
    public void actualizar(Categoria categoria) {
        categoriaDao.actualizar(categoria);
    }

    @Override
    public void eliminar(Categoria categoria) {
        categoriaDao.eliminar(categoria);
    }

    @Override
    public List<Categoria> listarTodos() {
        return categoriaDao.listarTodos();
    }

    @Override
    public Categoria obtenerPorId(int idCategoria) {
        return categoriaDao.obtenerPorId(idCategoria);
    }
    
}
