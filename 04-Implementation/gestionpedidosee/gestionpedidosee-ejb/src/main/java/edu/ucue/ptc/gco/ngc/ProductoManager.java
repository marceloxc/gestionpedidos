/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucue.ptc.gco.ngc;

import edu.ucue.ptc.gco.dao.ProductoDAOLocal;
import edu.ucue.ptc.gco.mdl.Producto;
import java.util.List;
import javax.ejb.Stateful;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Marcelo
 */
@Stateful
@Named(value="productoManager")
public class ProductoManager implements ProductoManagerLocal {
    @Inject
    private ProductoDAOLocal productoDao;

    @Override
    public void crear(Producto producto) {
        productoDao.crear(producto);
    }

    @Override
    public void actualizar(Producto producto) {
        productoDao.actualizar(producto);
    }

    @Override
    public void eliminar(Producto producto) {
        productoDao.eliminar(producto);
    }

    @Override
    public List<Producto> listarTodos() {
        return productoDao.listarTodos();
    }

    @Override
    public Producto obtenerPorId(int idProducto) {
        return productoDao.obtenerPorId(idProducto);
    }
    
}
