/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucue.ptc.gco.dao;

import edu.ucue.ptc.gco.mdl.Empleado;
import edu.ucue.ptc.gco.mdl.ObjetivoEmpleado;
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
@Named(value="objetivoEmpleadoDao")

public class ObjetivoEmpleadoDAO implements ObjetivoEmpleadoDAOLocal {
    @Inject
    private EntityManager entityManager;

    @Override
    public void crear(ObjetivoEmpleado objetivoempleado) {
        
        entityManager.persist(objetivoempleado);
    }

    @Override
    public void modificar(ObjetivoEmpleado objetivoempleado) {
        entityManager.merge(objetivoempleado);
    }

    @Override
    public List<ObjetivoEmpleado> listar(Empleado empleado) {
        Query query = entityManager.createQuery("select c from ObjetivoEmpleado c "
                + "where c.cedulaRuc = :pCedulaRuc");
        query.setParameter("pCedulaRuc", empleado.getCedulaRuc());
        List<ObjetivoEmpleado> listaobjetivos = query.getResultList();
        
        return listaobjetivos;
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

}
