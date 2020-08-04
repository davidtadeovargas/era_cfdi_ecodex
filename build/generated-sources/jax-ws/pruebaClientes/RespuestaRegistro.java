
package pruebaClientes;

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
 *         &lt;element name="Respuesta" type="{http://Ecodex.WS.Model/2011/CFDI}ResultadoRegistroEmisor" minOccurs="0"/>
 *         &lt;element name="TransaccionId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
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
    "respuesta",
    "transaccionId"
})
@XmlRootElement(name = "RespuestaRegistro")
public class RespuestaRegistro {

    @XmlElementRef(name = "Respuesta", namespace = "http://Ecodex.WS.Model/2011/CFDI", type = JAXBElement.class, required = false)
    protected JAXBElement<ResultadoRegistroEmisor> respuesta;
    @XmlElement(name = "TransaccionId")
    protected Long transaccionId;

    /**
     * Obtiene el valor de la propiedad respuesta.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ResultadoRegistroEmisor }{@code >}
     *     
     */
    public JAXBElement<ResultadoRegistroEmisor> getRespuesta() {
        return respuesta;
    }

    /**
     * Define el valor de la propiedad respuesta.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ResultadoRegistroEmisor }{@code >}
     *     
     */
    public void setRespuesta(JAXBElement<ResultadoRegistroEmisor> value) {
        this.respuesta = value;
    }

    /**
     * Obtiene el valor de la propiedad transaccionId.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTransaccionId() {
        return transaccionId;
    }

    /**
     * Define el valor de la propiedad transaccionId.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTransaccionId(Long value) {
        this.transaccionId = value;
    }

}
