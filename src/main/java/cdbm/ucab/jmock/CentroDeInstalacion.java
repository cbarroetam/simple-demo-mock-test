/*
 * Created on @Nov 14, 2012
 * Copyright - Confidential use
 */
package cdbm.ucab.jmock;

import java.io.Serializable;

/**
 * Class CentroDeInstalacion
 * 
 * @author Carlos D. Barroeta M.
 */
public class CentroDeInstalacion implements Serializable {

    private String codigo;

    public CentroDeInstalacion() {
    }

    /**
     * 
     * @param codigo 
     */
    public CentroDeInstalacion(String codigo) {
        this.codigo = codigo;
    }
    
    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    
    //--------------------------------------------------------------------------
    // Metodos sobreescritos de la clase Object
    //--------------------------------------------------------------------------
    
    /**
     * @see Object#toString() 
     */
    @Override
    public String toString() {
        return getClass().getSimpleName() + "[codigo= " + getCodigo() + "]";
    }
}
