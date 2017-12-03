/*
 * Created on @Nov 14, 2012
 * Copyright - Confidential use
 */
package cdbm.ucab.jmock;

/**
 * Interface AntenaDAO
 *
 * @author Carlos D. Barroeta M.
 */
public interface AntenaDAO extends DAO<Antena> {

    /**
     *
     * @param antena
     * @return
     * @throws DataAccessException
     */
    boolean existeLaAntenaSegunElCodigo(Antena antena) throws DataAccessException;

    /**
     *
     * @param antena
     * @param cdi
     * @return
     * @throws DataAccessException
     */
    boolean existeUnaAntenaEnElCentro(Antena antena,
            CentroDeInstalacion cdi) throws DataAccessException;
}
