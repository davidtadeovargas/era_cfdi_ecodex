
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
 *         &lt;element name="SaldoAnterior" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="SaldoNuevo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Token" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "saldoAnterior",
    "saldoNuevo",
    "token",
    "transaccionId"
})
@XmlRootElement(name = "RespuestaAsignacionTimbres")
public class RespuestaAsignacionTimbres {

    @XmlElement(name = "SaldoAnterior")
    protected Long saldoAnterior;
    @XmlElement(name = "SaldoNuevo")
    protected Integer saldoNuevo;
    @XmlElementRef(name = "Token", namespace = "http://Ecodex.WS.Model/2011/CFDI", type = JAXBElement.class, required = false)
    protected JAXBElement<String> token;
    @XmlElement(name = "TransaccionId")
    protected Long transaccionId;

    /**
     * Obtiene el valor de la propiedad saldoAnterior.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSaldoAnterior() {
        return saldoAnterior;
    }

    /**
     * Define el valor de la propiedad saldoAnterior.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSaldoAnterior(Long value) {
        this.saldoAnterior = value;
    }

    /**
     * Obtiene el valor de la propiedad saldoNuevo.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSaldoNuevo() {
        return saldoNuevo;
    }

    /**
     * Define el valor de la propiedad saldoNuevo.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSaldoNuevo(Integer value) {
        this.saldoNuevo = value;
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
