
package pruebaSeguridad;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Seguridad", targetNamespace = "http://Ecodex.WS.Model/2011/CFDI")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Seguridad {


    /**
     * 
     * @param parameters
     * @return
     *     returns pruebaSeguridad.RespuestaObtenerToken
     * @throws SeguridadObtenerTokenFallaServicioFaultFaultMessage
     * @throws SeguridadObtenerTokenFallaSesionFaultFaultMessage
     */
    @WebMethod(operationName = "ObtenerToken", action = "http://Ecodex.WS.Model/2011/CFDI/Seguridad/ObtenerToken")
    @WebResult(name = "RespuestaObtenerToken", targetNamespace = "http://Ecodex.WS.Model/2011/CFDI", partName = "parameters")
    public RespuestaObtenerToken obtenerToken(
        @WebParam(name = "SolicitudObtenerToken", targetNamespace = "http://Ecodex.WS.Model/2011/CFDI", partName = "parameters")
        SolicitudObtenerToken parameters)
        throws SeguridadObtenerTokenFallaServicioFaultFaultMessage, SeguridadObtenerTokenFallaSesionFaultFaultMessage
    ;

}
