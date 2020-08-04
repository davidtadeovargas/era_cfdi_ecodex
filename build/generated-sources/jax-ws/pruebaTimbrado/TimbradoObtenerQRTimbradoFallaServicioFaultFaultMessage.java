
package pruebaTimbrado;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "FallaServicio", targetNamespace = "http://Ecodex.WS.Model/2011/CFDI")
public class TimbradoObtenerQRTimbradoFallaServicioFaultFaultMessage
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private FallaServicio faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public TimbradoObtenerQRTimbradoFallaServicioFaultFaultMessage(String message, FallaServicio faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public TimbradoObtenerQRTimbradoFallaServicioFaultFaultMessage(String message, FallaServicio faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: pruebaTimbrado.FallaServicio
     */
    public FallaServicio getFaultInfo() {
        return faultInfo;
    }

}
