
package Clientes;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Avisos complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Avisos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Aviso" type="{http://Ecodex.WS.Model/2011/CFDI}Aviso" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Avisos", propOrder = {
    "aviso"
})
public class Avisos {

    @XmlElement(name = "Aviso", nillable = true)
    protected List<Aviso> aviso;

    /**
     * Gets the value of the aviso property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aviso property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAviso().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Aviso }
     * 
     * 
     */
    public List<Aviso> getAviso() {
        if (aviso == null) {
            aviso = new ArrayList<Aviso>();
        }
        return this.aviso;
    }

}
