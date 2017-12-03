/*
 * Created on @Nov 14, 2012
 * Copyright - Confidential use
 */
package cdbm.ucab.jmock;

/**
 * Interface AntenaService
 * 
 * @author Carlos D. Barroeta M.
 */
public interface AntenaService {

    /**
     *
     * @param nuevaAntena
     * @return
     * @throws BusinessException
     */
    Antena registrarAntena(Antena nuevaAntena) throws BusinessException;

}
