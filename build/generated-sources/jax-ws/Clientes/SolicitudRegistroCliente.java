
package Clientes;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Emisor" type="{http://Ecodex.WS.Model/2011/CFDI}AltaEmisor" minOccurs="0"/>
 *         &lt;element name="RfcIntegrador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Token" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TransaccionID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "emisor",
    "rfcIntegrador",
    "token",
    "transaccionID"
})
@XmlRootElement(name = "SolicitudRegistroCliente")
public class SolicitudRegistroCliente {

    @XmlElementRef(name = "Emisor", namespace = "http://Ecodex.WS.Model/2011/CFDI", type = JAXBElement.class, required = false)
    protected JAXBElement<AltaEmisor> emisor;
    @XmlElementRef(name = "RfcIntegrador", namespace = "http://Ecodex.WS.Model/2011/CFDI", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rfcIntegrador;
    @XmlElementRef(name = "Token", namespace = "http://Ecodex.WS.Model/2011/CFDI", type = JAXBElement.class, required = false)
    protected JAXBElement<String> token;
    @XmlElement(name = "TransaccionID")
    protected Long transaccionID;

    /**
     * Obtiene el valor de la propiedad emisor.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AltaEmisor }{@code >}
     *     
     */
    public JAXBElement<AltaEmisor> getEmisor() {
        return emisor;
    }

    /**
     * Define el valor de la propiedad emisor.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AltaEmisor }{@code >}
     *     
     */
    public void setEmisor(JAXBElement<AltaEmisor> value) {
        this.emisor = value;
    }

    /**
     * Obtiene el valor de la propiedad rfcIntegrador.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRfcIntegrador() {
        return rfcIntegrador;
    }

    /**
     * Define el valor de la propiedad rfcIntegrador.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRfcIntegrador(JAXBElement<String> value) {
        this.rfcIntegrador = value;
    }

    /**
     * Obtiene el valor de la propiedad token.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getToken() {
        return token;
    }

    /**
     * Define el valor de la propiedad token.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setToken(JAXBElement<String> value) {
        this.token = value;
    }

    /**
     * Obtiene el valor de la propiedad transaccionID.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTransaccionID() {
        return transaccionID;
    }

    /**
     * Define el valor de la propiedad transaccionID.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTransaccionID(Long value) {
        this.transaccionID = value;
    }

}
