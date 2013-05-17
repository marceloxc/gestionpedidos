/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucue.ptc.gco.dao;

import edu.ucue.ptc.gco.mdl.Empleado;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Johnny
 */
@Stateless
@Named(value="empleadoDao")
public class EmpleadoDAO implements EmpleadoDAOLocal {
@Inject
    private EntityManager entityManager;

    @Override
    public void crear(Empleado empleado) {
        entityManager.persist(empleado);
    }

    @Override
    public void modificar(Empleado empleado) {
        entityManager.merge(empleado);
    }

    @Override
    public List<Empleado> listar() {
        Query query = entityManager.createQuery("select c from Empleado c");
        return query.getResultList();
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

}
