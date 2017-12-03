/*
 * Created on @Nov 14, 2012
 * Copyright - Confidential use
 */
package cdbm.ucab.jmock;

/**
 * Exception Class DataAccessException
 * 
 * @author Carlos D. Barroeta M.
 */
public class DataAccessException extends RuntimeException {

    /**
     * Creates a new instance of <code>DataAccessException</code> without detail message.
     */
    public DataAccessException() {
    }


    /**
     * Constructs an instance of <code>DataAccessException</code> with the 
     * specified detail message.
     * @param msg the detail message.
     */
    public DataAccessException(String msg) {
        super(msg);
    }
}
