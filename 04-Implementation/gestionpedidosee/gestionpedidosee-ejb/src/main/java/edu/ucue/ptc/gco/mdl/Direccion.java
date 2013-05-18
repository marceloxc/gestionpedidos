/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucue.ptc.gco.mdl;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
/**
 *
 * @author ROMAN
 */
@Entity
public class Direccion implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String idDireccion;
    @Column
    private String callePrincipal;
    @Column
    private String calleSecundaria;
    @Column
    private String referencia;
    @Column
    private String numeracion;
    @Column
    private String latitud;
    @Column
    private String longitud;
    @JoinColumn(name = "idCiudad", referencedColumnName = "idCiudad")
    @ManyToOne
    private Ciudad ciudad;

    /**
     * @return the idDireccion
     */
    public String getIdDireccion() {
        return idDireccion;
    }

    /**
     * @param idDireccion the idDireccion to set
     */
    public void setIdDireccion(String idDireccion) {
        this.idDireccion = idDireccion;
    }

    /**
     * @return the callePrincipal
     */
    public String getCallePrincipal() {
        return callePrincipal;
    }

    /**
     * @param callePrincipal the callePrincipal to set
     */
    public void setCallePrincipal(String callePrincipal) {
        this.callePrincipal = callePrincipal;
    }

    /**
     * @return the calleSecundaria
     */
    public String getCalleSecundaria() {
        return calleSecundaria;
    }

    /**
     * @param calleSecundaria the calleSecundaria to set
     */
    public void setCalleSecundaria(String calleSecundaria) {
        this.calleSecundaria = calleSecundaria;
    }

    /**
     * @return the referencia
     */
    public String getReferencia() {
        return referencia;
    }

    /**
     * @param referencia the referencia to set
     */
    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    /**
     * @return the numeracion
     */
    public String getNumeracion() {
        return numeracion;
    }

    /**
     * @param numeracion the numeracion to set
     */
    public void setNumeracion(String numeracion) {
        this.numeracion = numeracion;
    }

    /**
     * @return the latitud
     */
    public String getLatitud() {
        return latitud;
    }

    /**
     * @param latitud the latitud to set
     */
    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    /**
     * @return the longitud
     */
    public String getLongitud() {
        return longitud;
    }

    /**
     * @param longitud the longitud to set
     */
    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

    /**
     * @return the ciudad
     */
    public Ciudad getCiudad() {
        return ciudad;
    }

    /**
     * @param ciudad the ciudad to set
     */
    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }
    
}
