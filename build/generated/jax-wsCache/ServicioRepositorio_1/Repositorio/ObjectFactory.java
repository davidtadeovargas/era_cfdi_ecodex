
package Repositorio;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the Repositorio package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _FallaValidacion_QNAME = new QName("http://Ecodex.WS.Model/2011/CFDI", "FallaValidacion");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _InformacionQR_QNAME = new QName("http://Ecodex.WS.Model/2011/CFDI", "InformacionQR");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _FallaServicio_QNAME = new QName("http://Ecodex.WS.Model/2011/CFDI", "FallaServicio");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _ComprobanteXML_QNAME = new QName("http://Ecodex.WS.Model/2011/CFDI", "ComprobanteXML");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _ComprobanteEstatus_QNAME = new QName("http://Ecodex.WS.Model/2011/CFDI", "ComprobanteEstatus");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _FallaSesion_QNAME = new QName("http://Ecodex.WS.Model/2011/CFDI", "FallaSesion");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _InformacionQRImagen_QNAME = new QName("http://Ecodex.WS.Model/2011/CFDI", "Imagen");
    private final static QName _RespuestaEstatusComprobanteEstatus_QNAME = new QName("http://Ecodex.WS.Model/2011/CFDI", "Estatus");
    private final static QName _ComprobanteXMLDatosXML_QNAME = new QName("http://Ecodex.WS.Model/2011/CFDI", "DatosXML");
    private final static QName _FallaValidacionSugerencia_QNAME = new QName("http://Ecodex.WS.Model/2011/CFDI", "Sugerencia");
    private final static QName _FallaValidacionAntecedente_QNAME = new QName("http://Ecodex.WS.Model/2011/CFDI", "Antecedente");
    private final static QName _FallaValidacionNodo_QNAME = new QName("http://Ecodex.WS.Model/2011/CFDI", "Nodo");
    private final static QName _FallaValidacionEvento_QNAME = new QName("http://Ecodex.WS.Model/2011/CFDI", "Evento");
    private final static QName _FallaValidacionDescripcion_QNAME = new QName("http://Ecodex.WS.Model/2011/CFDI", "Descripcion");
    private final static QName _SolicitudObtenerQRToken_QNAME = new QName("http://Ecodex.WS.Model/2011/CFDI", "Token");
    private final static QName _SolicitudObtenerQRUUID_QNAME = new QName("http://Ecodex.WS.Model/2011/CFDI", "UUID");
    private final static QName _SolicitudObtenerQRRFC_QNAME = new QName("http://Ecodex.WS.Model/2011/CFDI", "RFC");
    private final static QName _ComprobanteEstatusCodigo_QNAME = new QName("http://Ecodex.WS.Model/2011/CFDI", "Codigo");
    private final static QName _RespuestaObtenerQRQR_QNAME = new QName("http://Ecodex.WS.Model/2011/CFDI", "QR");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: Repositorio
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FallaServicio }
     * 
     */
    public FallaServicio createFallaServicio() {
        return new FallaServicio();
    }

    /**
     * Create an instance of {@link ComprobanteXML }
     * 
     */
    public ComprobanteXML createComprobanteXML() {
        return new ComprobanteXML();
    }

    /**
     * Create an instance of {@link RespuestaObtenerQR }
     * 
     */
    public RespuestaObtenerQR createRespuestaObtenerQR() {
        return new RespuestaObtenerQR();
    }

    /**
     * Create an instance of {@link InformacionQR }
     * 
     */
    public InformacionQR createInformacionQR() {
        return new InformacionQR();
    }

    /**
     * Create an instance of {@link RespuestaCancelaComprobante }
     * 
     */
    public RespuestaCancelaComprobante createRespuestaCancelaComprobante() {
        return new RespuestaCancelaComprobante();
    }

    /**
     * Create an instance of {@link SolicitudEstatusComprobante }
     * 
     */
    public SolicitudEstatusComprobante createSolicitudEstatusComprobante() {
        return new SolicitudEstatusComprobante();
    }

    /**
     * Create an instance of {@link FallaValidacion }
     * 
     */
    public FallaValidacion createFallaValidacion() {
        return new FallaValidacion();
    }

    /**
     * Create an instance of {@link ComprobanteEstatus }
     * 
     */
    public ComprobanteEstatus createComprobanteEstatus() {
        return new ComprobanteEstatus();
    }

    /**
     * Create an instance of {@link SolicitudObtenerComprobante }
     * 
     */
    public SolicitudObtenerComprobante createSolicitudObtenerComprobante() {
        return new SolicitudObtenerComprobante();
    }

    /**
     * Create an instance of {@link FallaSesion }
     * 
     */
    public FallaSesion createFallaSesion() {
        return new FallaSesion();
    }

    /**
     * Create an instance of {@link RespuestaObtenerComprobante }
     * 
     */
    public RespuestaObtenerComprobante createRespuestaObtenerComprobante() {
        return new RespuestaObtenerComprobante();
    }

    /**
     * Create an instance of {@link SolicitudObtenerQR }
     * 
     */
    public SolicitudObtenerQR createSolicitudObtenerQR() {
        return new SolicitudObtenerQR();
    }

    /**
     * Create an instance of {@link RespuestaEstatusComprobante }
     * 
     */
    public RespuestaEstatusComprobante createRespuestaEstatusComprobante() {
        return new RespuestaEstatusComprobante();
    }

    /**
     * Create an instance of {@link SolicitudCancelaComprobante }
     * 
     */
    public SolicitudCancelaComprobante createSolicitudCancelaComprobante() {
        return new SolicitudCancelaComprobante();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedLong")
    public JAXBElement<BigInteger> createUnsignedLong(BigInteger value) {
        return new JAXBElement<BigInteger>(_UnsignedLong_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedByte")
    public JAXBElement<Short> createUnsignedByte(Short value) {
        return new JAXBElement<Short>(_UnsignedByte_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedShort")
    public JAXBElement<Integer> createUnsignedShort(Integer value) {
        return new JAXBElement<Integer>(_UnsignedShort_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FallaValidacion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Ecodex.WS.Model/2011/CFDI", name = "FallaValidacion")
    public JAXBElement<FallaValidacion> createFallaValidacion(FallaValidacion value) {
        return new JAXBElement<FallaValidacion>(_FallaValidacion_QNAME, FallaValidacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "duration")
    public JAXBElement<Duration> createDuration(Duration value) {
        return new JAXBElement<Duration>(_Duration_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InformacionQR }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Ecodex.WS.Model/2011/CFDI", name = "InformacionQR")
    public JAXBElement<InformacionQR> createInformacionQR(InformacionQR value) {
        return new JAXBElement<InformacionQR>(_InformacionQR_QNAME, InformacionQR.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "long")
    public JAXBElement<Long> createLong(Long value) {
        return new JAXBElement<Long>(_Long_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "float")
    public JAXBElement<Float> createFloat(Float value) {
        return new JAXBElement<Float>(_Float_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "dateTime")
    public JAXBElement<XMLGregorianCalendar> createDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyType")
    public JAXBElement<Object> createAnyType(Object value) {
        return new JAXBElement<Object>(_AnyType_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedInt")
    public JAXBElement<Long> createUnsignedInt(Long value) {
        return new JAXBElement<Long>(_UnsignedInt_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "char")
    public JAXBElement<Integer> createChar(Integer value) {
        return new JAXBElement<Integer>(_Char_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "short")
    public JAXBElement<Short> createShort(Short value) {
        return new JAXBElement<Short>(_Short_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "guid")
    public JAXBElement<String> createGuid(String value) {
        return new JAXBElement<String>(_Guid_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FallaServicio }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Ecodex.WS.Model/2011/CFDI", name = "FallaServicio")
    public JAXBElement<FallaServicio> createFallaServicio(FallaServicio value) {
        return new JAXBElement<FallaServicio>(_FallaServicio_QNAME, FallaServicio.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "decimal")
    public JAXBElement<BigDecimal> createDecimal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Decimal_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ComprobanteXML }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Ecodex.WS.Model/2011/CFDI", name = "ComprobanteXML")
    public JAXBElement<ComprobanteXML> createComprobanteXML(ComprobanteXML value) {
        return new JAXBElement<ComprobanteXML>(_ComprobanteXML_QNAME, ComprobanteXML.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "boolean")
    public JAXBElement<Boolean> createBoolean(Boolean value) {
        return new JAXBElement<Boolean>(_Boolean_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ComprobanteEstatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Ecodex.WS.Model/2011/CFDI", name = "ComprobanteEstatus")
    public JAXBElement<ComprobanteEstatus> createComprobanteEstatus(ComprobanteEstatus value) {
        return new JAXBElement<ComprobanteEstatus>(_ComprobanteEstatus_QNAME, ComprobanteEstatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "base64Binary")
    public JAXBElement<byte[]> createBase64Binary(byte[] value) {
        return new JAXBElement<byte[]>(_Base64Binary_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FallaSesion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Ecodex.WS.Model/2011/CFDI", name = "FallaSesion")
    public JAXBElement<FallaSesion> createFallaSesion(FallaSesion value) {
        return new JAXBElement<FallaSesion>(_FallaSesion_QNAME, FallaSesion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "int")
    public JAXBElement<Integer> createInt(Integer value) {
        return new JAXBElement<Integer>(_Int_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyURI")
    public JAXBElement<String> createAnyURI(String value) {
        return new JAXBElement<String>(_AnyURI_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "byte")
    public JAXBElement<Byte> createByte(Byte value) {
        return new JAXBElement<Byte>(_Byte_QNAME, Byte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "double")
    public JAXBElement<Double> createDouble(Double value) {
        return new JAXBElement<Double>(_Double_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "QName")
    public JAXBElement<QName> createQName(QName value) {
        return new JAXBElement<QName>(_QName_QNAME, QName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Ecodex.WS.Model/2011/CFDI", name = "Imagen", scope = InformacionQR.class)
    public JAXBElement<byte[]> createInformacionQRImagen(byte[] value) {
        return new JAXBElement<byte[]>(_InformacionQRImagen_QNAME, byte[].class, InformacionQR.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ComprobanteEstatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Ecodex.WS.Model/2011/CFDI", name = "Estatus", scope = RespuestaEstatusComprobante.class)
    public JAXBElement<ComprobanteEstatus> createRespuestaEstatusComprobanteEstatus(ComprobanteEstatus value) {
        return new JAXBElement<ComprobanteEstatus>(_RespuestaEstatusComprobanteEstatus_QNAME, ComprobanteEstatus.class, RespuestaEstatusComprobante.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Ecodex.WS.Model/2011/CFDI", name = "DatosXML", scope = ComprobanteXML.class)
    public JAXBElement<String> createComprobanteXMLDatosXML(String value) {
        return new JAXBElement<String>(_ComprobanteXMLDatosXML_QNAME, String.class, ComprobanteXML.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Ecodex.WS.Model/2011/CFDI", name = "Sugerencia", scope = FallaValidacion.class)
    public JAXBElement<String> createFallaValidacionSugerencia(String value) {
        return new JAXBElement<String>(_FallaValidacionSugerencia_QNAME, String.class, FallaValidacion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Ecodex.WS.Model/2011/CFDI", name = "Antecedente", scope = FallaValidacion.class)
    public JAXBElement<String> createFallaValidacionAntecedente(String value) {
        return new JAXBElement<String>(_FallaValidacionAntecedente_QNAME, String.class, FallaValidacion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Ecodex.WS.Model/2011/CFDI", name = "Nodo", scope = FallaValidacion.class)
    public JAXBElement<String> createFallaValidacionNodo(String value) {
        return new JAXBElement<String>(_FallaValidacionNodo_QNAME, String.class, FallaValidacion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Ecodex.WS.Model/2011/CFDI", name = "Evento", scope = FallaValidacion.class)
    public JAXBElement<String> createFallaValidacionEvento(String value) {
        return new JAXBElement<String>(_FallaValidacionEvento_QNAME, String.class, FallaValidacion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Ecodex.WS.Model/2011/CFDI", name = "Descripcion", scope = FallaValidacion.class)
    public JAXBElement<String> createFallaValidacionDescripcion(String value) {
        return new JAXBElement<String>(_FallaValidacionDescripcion_QNAME, String.class, FallaValidacion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Ecodex.WS.Model/2011/CFDI", name = "Token", scope = SolicitudObtenerQR.class)
    public JAXBElement<String> createSolicitudObtenerQRToken(String value) {
        return new JAXBElement<String>(_SolicitudObtenerQRToken_QNAME, String.class, SolicitudObtenerQR.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Ecodex.WS.Model/2011/CFDI", name = "UUID", scope = SolicitudObtenerQR.class)
    public JAXBElement<String> createSolicitudObtenerQRUUID(String value) {
        return new JAXBElement<String>(_SolicitudObtenerQRUUID_QNAME, String.class, SolicitudObtenerQR.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Ecodex.WS.Model/2011/CFDI", name = "RFC", scope = SolicitudObtenerQR.class)
    public JAXBElement<String> createSolicitudObtenerQRRFC(String value) {
        return new JAXBElement<String>(_SolicitudObtenerQRRFC_QNAME, String.class, SolicitudObtenerQR.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Ecodex.WS.Model/2011/CFDI", name = "Token", scope = SolicitudCancelaComprobante.class)
    public JAXBElement<String> createSolicitudCancelaComprobanteToken(String value) {
        return new JAXBElement<String>(_SolicitudObtenerQRToken_QNAME, String.class, SolicitudCancelaComprobante.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Ecodex.WS.Model/2011/CFDI", name = "UUID", scope = SolicitudCancelaComprobante.class)
    public JAXBElement<String> createSolicitudCancelaComprobanteUUID(String value) {
        return new JAXBElement<String>(_SolicitudObtenerQRUUID_QNAME, String.class, SolicitudCancelaComprobante.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Ecodex.WS.Model/2011/CFDI", name = "RFC", scope = SolicitudCancelaComprobante.class)
    public JAXBElement<String> createSolicitudCancelaComprobanteRFC(String value) {
        return new JAXBElement<String>(_SolicitudObtenerQRRFC_QNAME, String.class, SolicitudCancelaComprobante.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ComprobanteXML }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Ecodex.WS.Model/2011/CFDI", name = "ComprobanteXML", scope = RespuestaObtenerComprobante.class)
    public JAXBElement<ComprobanteXML> createRespuestaObtenerComprobanteComprobanteXML(ComprobanteXML value) {
        return new JAXBElement<ComprobanteXML>(_ComprobanteXML_QNAME, ComprobanteXML.class, RespuestaObtenerComprobante.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Ecodex.WS.Model/2011/CFDI", name = "Evento", scope = FallaServicio.class)
    public JAXBElement<String> createFallaServicioEvento(String value) {
        return new JAXBElement<String>(_FallaValidacionEvento_QNAME, String.class, FallaServicio.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Ecodex.WS.Model/2011/CFDI", name = "Descripcion", scope = FallaServicio.class)
    public JAXBElement<String> createFallaServicioDescripcion(String value) {
        return new JAXBElement<String>(_FallaValidacionDescripcion_QNAME, String.class, FallaServicio.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Ecodex.WS.Model/2011/CFDI", name = "Codigo", scope = ComprobanteEstatus.class)
    public JAXBElement<String> createComprobanteEstatusCodigo(String value) {
        return new JAXBElement<String>(_ComprobanteEstatusCodigo_QNAME, String.class, ComprobanteEstatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Ecodex.WS.Model/2011/CFDI", name = "Descripcion", scope = ComprobanteEstatus.class)
    public JAXBElement<String> createComprobanteEstatusDescripcion(String value) {
        return new JAXBElement<String>(_FallaValidacionDescripcion_QNAME, String.class, ComprobanteEstatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InformacionQR }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Ecodex.WS.Model/2011/CFDI", name = "QR", scope = RespuestaObtenerQR.class)
    public JAXBElement<InformacionQR> createRespuestaObtenerQRQR(InformacionQR value) {
        return new JAXBElement<InformacionQR>(_RespuestaObtenerQRQR_QNAME, InformacionQR.class, RespuestaObtenerQR.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Ecodex.WS.Model/2011/CFDI", name = "Descripcion", scope = FallaSesion.class)
    public JAXBElement<String> createFallaSesionDescripcion(String value) {
        return new JAXBElement<String>(_FallaValidacionDescripcion_QNAME, String.class, FallaSesion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Ecodex.WS.Model/2011/CFDI", name = "Token", scope = SolicitudEstatusComprobante.class)
    public JAXBElement<String> createSolicitudEstatusComprobanteToken(String value) {
        return new JAXBElement<String>(_SolicitudObtenerQRToken_QNAME, String.class, SolicitudEstatusComprobante.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Ecodex.WS.Model/2011/CFDI", name = "UUID", scope = SolicitudEstatusComprobante.class)
    public JAXBElement<String> createSolicitudEstatusComprobanteUUID(String value) {
        return new JAXBElement<String>(_SolicitudObtenerQRUUID_QNAME, String.class, SolicitudEstatusComprobante.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Ecodex.WS.Model/2011/CFDI", name = "RFC", scope = SolicitudEstatusComprobante.class)
    public JAXBElement<String> createSolicitudEstatusComprobanteRFC(String value) {
        return new JAXBElement<String>(_SolicitudObtenerQRRFC_QNAME, String.class, SolicitudEstatusComprobante.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Ecodex.WS.Model/2011/CFDI", name = "Token", scope = SolicitudObtenerComprobante.class)
    public JAXBElement<String> createSolicitudObtenerComprobanteToken(String value) {
        return new JAXBElement<String>(_SolicitudObtenerQRToken_QNAME, String.class, SolicitudObtenerComprobante.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Ecodex.WS.Model/2011/CFDI", name = "UUID", scope = SolicitudObtenerComprobante.class)
    public JAXBElement<String> createSolicitudObtenerComprobanteUUID(String value) {
        return new JAXBElement<String>(_SolicitudObtenerQRUUID_QNAME, String.class, SolicitudObtenerComprobante.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Ecodex.WS.Model/2011/CFDI", name = "RFC", scope = SolicitudObtenerComprobante.class)
    public JAXBElement<String> createSolicitudObtenerComprobanteRFC(String value) {
        return new JAXBElement<String>(_SolicitudObtenerQRRFC_QNAME, String.class, SolicitudObtenerComprobante.class, value);
    }

}
