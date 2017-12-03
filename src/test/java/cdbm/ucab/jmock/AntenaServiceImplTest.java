 /*
 * Created on @Nov 14, 2012
 * Copyright - Confidential use
 */
package cdbm.ucab.jmock;

import org.jmock.Expectations;
import org.jmock.Mockery;
import org.jmock.integration.junit4.JMock;
import org.jmock.integration.junit4.JUnit4Mockery;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Test Class AntenaServiceImplTest
 *
 * @author Carlos D. Barroeta M.
 */
@RunWith(JMock.class)
public class AntenaServiceImplTest {

    private AntenaServiceImpl serviceImpl;

    private AntenaDAO antenaDAOMock;

    private Mockery context = new JUnit4Mockery();

    public AntenaServiceImplTest() {
    }

    /**
     * Fase de inicializacion donde se realiza la puesta a punto de todos los
     * Fixtures involucrados en la prueba.
     */
    @Before
    public void inicializacion() {
        antenaDAOMock = context.mock(AntenaDAO.class);

        serviceImpl = new AntenaServiceImpl(antenaDAOMock);
    }

    /**
     * Fase de finalizacion de los elementos usados durante la ejecucion de cada
     * prueba.
     */
    @After
    public void tearDown() {
        context = null;
        antenaDAOMock = null;
        serviceImpl = null;
    }

    //--------------------------------------------------------------------------
    // Test Case Scenarios
    //--------------------------------------------------------------------------
    /**
     * Escenario de prueba que permite el registro de antenas con datos validos.
     */
    @Test
    public void testRegistrarAntenaValida() {

        final CentroDeInstalacion centroDeInstalacion = new CentroDeInstalacion("12345678");

        final Antena antena = new Antena(1234, 1234, centroDeInstalacion);

        context.checking(new Expectations() {
            {
                // esperamos que este metodo sea invocado y su valor de retorno sea FALSE
                oneOf(antenaDAOMock).existeLaAntenaSegunElCodigo(antena);
                will(returnValue(Boolean.FALSE));

                // esperamos que este metodo sea invocado y su valor de retorno sea FALSE
                oneOf(antenaDAOMock).existeUnaAntenaEnElCentro(antena, antena.getCentroDeInstalacion());
                will(returnValue(Boolean.FALSE));

                // despues de ejecutadas las validaciones esperamos sea invocado el metodo insertar
                oneOf(antenaDAOMock).insertar(antena);
                will(returnValue(antena));
            }
        });

        try {
            // Fase de ejecucion....
            Antena antena1 = serviceImpl.registrarAntena(antena);

            Assert.assertEquals("La antena creada no es igual", antena1, antena);

        } catch (Throwable businessException) {

            // en caso de generarse una excepcion marcar esta prueba como fallida
            Assert.fail(businessException.getMessage());
        }
    }

    /**
     *
     */
    @Test()
    public void testRegistrarAntenaConCodigoRepetido() {

        final CentroDeInstalacion centroDeInstalacion = new CentroDeInstalacion("12345678");

        final Antena antena = new Antena(12, 5678, centroDeInstalacion);

        context.checking(new Expectations() {
            {
                // esperamos que este metodo sea invocado y su valor de retorno sea FALSE
                oneOf(antenaDAOMock).existeLaAntenaSegunElCodigo(antena);
                will(throwException(new DataAccessException("Violacion de Restriccion de "
                        + "Unicidad en Antena : codigo = " + antena.getCodigoAntena())));
            }
        });

        try {
            serviceImpl.registrarAntena(antena);
        } catch (BusinessException businessException) {

            // en caso de generarse una excepcion marcar esta prueba como fallida
            Assert.fail(businessException.getMessage());
        }
    }
}
