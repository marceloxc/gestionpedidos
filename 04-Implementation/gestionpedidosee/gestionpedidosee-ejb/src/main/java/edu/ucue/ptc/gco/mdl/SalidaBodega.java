/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucue.ptc.gco.mdl;

import java.util.Date;

/**
 *
 * @author PE;ALOZA
 */
public class SalidaBodega {
    private int idSalidaBodega;
    private Lote lote;
    private Date fechaSalida;

    /**
     * @return the idSalidaBodega
     */
    public int getIdSalidaBodega() {
        return idSalidaBodega;
    }

    /**
     * @param idSalidaBodega the idSalidaBodega to set
     */
    public void setIdSalidaBodega(int idSalidaBodega) {
        this.idSalidaBodega = idSalidaBodega;
    }

    /**
     * @return the lote
     */
    public Lote getLote() {
        return lote;
    }

    /**
     * @param lote the lote to set
     */
    public void setLote(Lote lote) {
        this.lote = lote;
    }

    /**
     * @return the fechaSalida
     */
    public Date getFechaSalida() {
        return fechaSalida;
    }

    /**
     * @param fechaSalida the fechaSalida to set
     */
    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }
}
