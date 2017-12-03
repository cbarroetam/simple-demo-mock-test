/*
 * Created on @Nov 14, 2012
 * Copyright - Confidential use
 */
package cdbm.ucab.jmock;

import java.io.Serializable;

/**
 * Class Antena
 *
 * @author Carlos D. Barroeta M.
 */
public class Antena implements Serializable {

    private int id;

    private int codigoAntena;

    private CentroDeInstalacion centroDeInstalacion;

    public Antena() {
    }

    /**
     *
     * @param id
     * @param codigoAntena
     * @param centroDeInstalacion
     */
    public Antena(int id, int codigoAntena, CentroDeInstalacion centroDeInstalacion) {
        this.id = id;
        this.codigoAntena = codigoAntena;
        this.centroDeInstalacion = centroDeInstalacion;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the codigoAntena
     */
    public int getCodigoAntena() {
        return codigoAntena;
    }

    /**
     * @param codigoAntena the codigoAntena to set
     */
    public void setCodigoAntena(int codigoAntena) {
        this.codigoAntena = codigoAntena;
    }

    /**
     * @return the centroDeInstalacion
     */
    public CentroDeInstalacion getCentroDeInstalacion() {
        return centroDeInstalacion;
    }

    /**
     * @param centroDeInstalacion the centroDeInstalacion to set
     */
    public void setCentroDeInstalacion(CentroDeInstalacion centroDeInstalacion) {
        this.centroDeInstalacion = centroDeInstalacion;
    }

    //--------------------------------------------------------------------------
    // Metodos sobreescritos de la clase Object
    //--------------------------------------------------------------------------
    @Override
    public boolean equals(Object obj) {

        if (obj == null || !(obj instanceof Antena)) {
            return false;
        }
        Antena otra = (Antena) obj;
                
        return otra.id == this.id;
    }

    /**
     * @see Object#toString()
     */
    @Override
    public String toString() {
        return getClass().getSimpleName() + "["
                + "id= " + getId()
                + ", codigoAntena= " + getCodigoAntena()
                + ", centroDeInstalacion= " + getCentroDeInstalacion()
                + "]";
    }
}
