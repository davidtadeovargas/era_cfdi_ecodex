
package Repositorio;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "FallaValidacion", targetNamespace = "http://Ecodex.WS.Model/2011/CFDI")
public class RepositorioCancelaComprobanteFallaValidacionFaultFaultMessage
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private FallaValidacion faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public RepositorioCancelaComprobanteFallaValidacionFaultFaultMessage(String message, FallaValidacion faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public RepositorioCancelaComprobanteFallaValidacionFaultFaultMessage(String message, FallaValidacion faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: Repositorio.FallaValidacion
     */
    public FallaValidacion getFaultInfo() {
        return faultInfo;
    }

}
