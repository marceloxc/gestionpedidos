/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucue.ptc.gco.mdl;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 *
 * @author ANGIE
 */
@Entity
@PrimaryKeyJoinColumn(name="idPersona")
public class Cliente extends Persona implements Serializable{
    
}
