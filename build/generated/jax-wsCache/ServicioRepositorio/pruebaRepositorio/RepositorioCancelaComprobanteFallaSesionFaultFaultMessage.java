
package pruebaRepositorio;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "FallaSesion", targetNamespace = "http://Ecodex.WS.Model/2011/CFDI")
public class RepositorioCancelaComprobanteFallaSesionFaultFaultMessage
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private FallaSesion faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public RepositorioCancelaComprobanteFallaSesionFaultFaultMessage(String message, FallaSesion faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public RepositorioCancelaComprobanteFallaSesionFaultFaultMessage(String message, FallaSesion faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: pruebaRepositorio.FallaSesion
     */
    public FallaSesion getFaultInfo() {
        return faultInfo;
    }

}
