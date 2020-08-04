
package pruebaCancelacion;

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
@WebService(name = "Cancelaciones", targetNamespace = "http://Ecodex.WS.Model/2011/CFDI")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Cancelaciones {


    /**
     * 
     * @param parameters
     * @return
     *     returns pruebaCancelacion.RespuestaCancelaMultiple
     * @throws CancelacionesCancelaMultipleFallaServicioFaultFaultMessage
     * @throws CancelacionesCancelaMultipleFallaSesionFaultFaultMessage
     */
    @WebMethod(operationName = "CancelaMultiple", action = "http://Ecodex.WS.Model/2011/CFDI/Cancelaciones/CancelaMultiple")
    @WebResult(name = "RespuestaCancelaMultiple", targetNamespace = "http://Ecodex.WS.Model/2011/CFDI", partName = "parameters")
    public RespuestaCancelaMultiple cancelaMultiple(
        @WebParam(name = "SolicitudCancelaMultiple", targetNamespace = "http://Ecodex.WS.Model/2011/CFDI", partName = "parameters")
        SolicitudCancelaMultiple parameters)
        throws CancelacionesCancelaMultipleFallaServicioFaultFaultMessage, CancelacionesCancelaMultipleFallaSesionFaultFaultMessage
    ;

    /**
     * 
     * @param parameters
     * @return
     *     returns pruebaCancelacion.RespuestaRecuperarAcuse
     * @throws CancelacionesRecuperarAcusesFallaSesionFaultFaultMessage
     * @throws CancelacionesRecuperarAcusesFallaValidacionFaultFaultMessage
     * @throws CancelacionesRecuperarAcusesFallaServicioFaultFaultMessage
     */
    @WebMethod(operationName = "RecuperarAcuses", action = "http://Ecodex.WS.Model/2011/CFDI/Cancelaciones/RecuperarAcuses")
    @WebResult(name = "RespuestaRecuperarAcuse", targetNamespace = "http://Ecodex.WS.Model/2011/CFDI", partName = "parameters")
    public RespuestaRecuperarAcuse recuperarAcuses(
        @WebParam(name = "SolicitudAcuse", targetNamespace = "http://Ecodex.WS.Model/2011/CFDI", partName = "parameters")
        SolicitudAcuse parameters)
        throws CancelacionesRecuperarAcusesFallaServicioFaultFaultMessage, CancelacionesRecuperarAcusesFallaSesionFaultFaultMessage, CancelacionesRecuperarAcusesFallaValidacionFaultFaultMessage
    ;

    /**
     * 
     * @param parameters
     * @return
     *     returns pruebaCancelacion.RespuestaCancelaOtros
     * @throws CancelacionesCancelaOtrosFallaSesionFaultFaultMessage
     * @throws CancelacionesCancelaOtrosFallaServicioFaultFaultMessage
     * @throws CancelacionesCancelaOtrosFallaValidacionFaultFaultMessage
     */
    @WebMethod(operationName = "CancelaOtros", action = "http://Ecodex.WS.Model/2011/CFDI/Cancelaciones/CancelaOtros")
    @WebResult(name = "RespuestaCancelaOtros", targetNamespace = "http://Ecodex.WS.Model/2011/CFDI", partName = "parameters")
    public RespuestaCancelaOtros cancelaOtros(
        @WebParam(name = "SolicitudCancelaOtros", targetNamespace = "http://Ecodex.WS.Model/2011/CFDI", partName = "parameters")
        SolicitudCancelaOtros parameters)
        throws CancelacionesCancelaOtrosFallaServicioFaultFaultMessage, CancelacionesCancelaOtrosFallaSesionFaultFaultMessage, CancelacionesCancelaOtrosFallaValidacionFaultFaultMessage
    ;

}
