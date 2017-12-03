/*
 * Created on @Nov 14, 2012
 * Copyright - Confidential use
 */
package cdbm.ucab.jmock;

import org.apache.log4j.Logger;

/**
 * Class AntenaServiceImpl
 *
 * @author Carlos D. Barroeta M.
 */
public class AntenaServiceImpl implements AntenaService {

    private AntenaDAO antenaDAO;

    private Logger logger = Logger.getLogger(getClass());

    public AntenaServiceImpl(AntenaDAO antenaDAO) {
        this.antenaDAO = antenaDAO;
    }

    //--------------------------------------------------------------------------
    // Implementacion de metodos de la interfaz AntenaService
    //--------------------------------------------------------------------------

    /**
     * @param nuevaAntena
     * @return
     * @throws BusinessException
     */
    public Antena registrarAntena(Antena nuevaAntena) throws BusinessException {

        logger.info("Iniciando registro de " + nuevaAntena);

        try {

            if (!antenaDAO.existeLaAntenaSegunElCodigo(nuevaAntena)
                    && !antenaDAO.existeUnaAntenaEnElCentro(nuevaAntena, nuevaAntena.getCentroDeInstalacion())) {

                logger.debug("Se trata de una nueva antena se procede a registrarla");

                nuevaAntena = antenaDAO.insertar(nuevaAntena);

            }

        } catch (DataAccessException dae) {

            logger.error("Error de acceso a datos al "
                    + "registrar la antena [" + dae.getMessage() + "]", dae);

            throw new BusinessException("El codigo de antena[" + nuevaAntena.getCodigoAntena()
                    + "] ya esta asignado", dae);
        }

        return nuevaAntena;
    }
}
