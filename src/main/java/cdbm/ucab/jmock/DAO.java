/*
 * Created on @Nov 14, 2012
 * Copyright - Confidential use
 */
package cdbm.ucab.jmock;

import java.io.Serializable;
import java.util.List;

/**
 * Interface DAO
 * 
 * @author Carlos D. Barroeta M.
 */
public interface DAO <E extends Serializable> {

    /**
     * 
     * @param entity
     * @return
     * @throws DataAccessException 
     */
    E insertar(E entity) throws DataAccessException;
    
    /**
     * 
     * @return
     * @throws DataAccessException 
     */
    List<E> buscarTodos() throws DataAccessException;
    
    /**
     * 
     * @param entidad
     * @return
     * @throws DataAccessException 
     */
    int eliminar(E entidad) throws DataAccessException;
}
