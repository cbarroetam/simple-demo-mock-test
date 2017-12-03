/*
 * Created on @Nov 14, 2012
 * Copyright - Confidential use
 */
package cdbm.ucab.jmock;

/**
 * Exception Class BusinessException
 *
 * @author Carlos D. Barroeta M.
 */
public class BusinessException extends RuntimeException {

    /**
     * Creates a new instance of
     * <code>BusinessException</code> without detail message.
     */
    public BusinessException() {
    }

    /**
     * Constructs an instance of
     * <code>BusinessException</code> with the specified detail message.
     *
     * @param msg the detail message.
     */
    public BusinessException(String msg) {
        super(msg);
    }

    /**
     * Constructs an instance of
     * <code>BusinessException</code> with the specified detail message and
     * original cause
     *     
     * @param msg the detail message.
     * @param cause root exception 
     */
    public BusinessException(String message, Throwable cause) {
        super(message, cause);
    }
}
