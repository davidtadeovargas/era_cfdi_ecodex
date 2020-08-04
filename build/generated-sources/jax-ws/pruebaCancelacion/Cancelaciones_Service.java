
package pruebaCancelacion;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "Cancelaciones", targetNamespace = "http://Ecodex.WS.Model/2011/CFDI", wsdlLocation = "http://wsdev.ecodex.com.mx:2044/ServicioCancelacion.svc?wsdl")
public class Cancelaciones_Service
    extends Service
{

    private final static URL CANCELACIONES_WSDL_LOCATION;
    private final static WebServiceException CANCELACIONES_EXCEPTION;
    private final static QName CANCELACIONES_QNAME = new QName("http://Ecodex.WS.Model/2011/CFDI", "Cancelaciones");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://wsdev.ecodex.com.mx:2044/ServicioCancelacion.svc?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CANCELACIONES_WSDL_LOCATION = url;
        CANCELACIONES_EXCEPTION = e;
    }

    public Cancelaciones_Service() {
        super(__getWsdlLocation(), CANCELACIONES_QNAME);
    }

    public Cancelaciones_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), CANCELACIONES_QNAME, features);
    }

    public Cancelaciones_Service(URL wsdlLocation) {
        super(wsdlLocation, CANCELACIONES_QNAME);
    }

    public Cancelaciones_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CANCELACIONES_QNAME, features);
    }

    public Cancelaciones_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Cancelaciones_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Cancelaciones
     */
    @WebEndpoint(name = "PuertoCancelacionSeguro")
    public Cancelaciones getPuertoCancelacionSeguro() {
        return super.getPort(new QName("http://Ecodex.WS.Model/2011/CFDI", "PuertoCancelacionSeguro"), Cancelaciones.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Cancelaciones
     */
    @WebEndpoint(name = "PuertoCancelacionSeguro")
    public Cancelaciones getPuertoCancelacionSeguro(WebServiceFeature... features) {
        return super.getPort(new QName("http://Ecodex.WS.Model/2011/CFDI", "PuertoCancelacionSeguro"), Cancelaciones.class, features);
    }

    /**
     * 
     * @return
     *     returns Cancelaciones
     */
    @WebEndpoint(name = "PuertoCancelacion")
    public Cancelaciones getPuertoCancelacion() {
        return super.getPort(new QName("http://Ecodex.WS.Model/2011/CFDI", "PuertoCancelacion"), Cancelaciones.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Cancelaciones
     */
    @WebEndpoint(name = "PuertoCancelacion")
    public Cancelaciones getPuertoCancelacion(WebServiceFeature... features) {
        return super.getPort(new QName("http://Ecodex.WS.Model/2011/CFDI", "PuertoCancelacion"), Cancelaciones.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CANCELACIONES_EXCEPTION!= null) {
            throw CANCELACIONES_EXCEPTION;
        }
        return CANCELACIONES_WSDL_LOCATION;
    }

}
