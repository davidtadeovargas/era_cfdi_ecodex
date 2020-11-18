
package Clientes;

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
 * generated in the Clientes package. 
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

    private final static QName _ResultadoRegistroEmisor_QNAME = new QName("http://Ecodex.WS.Model/2011/CFDI", "ResultadoRegistroEmisor");
    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _FallaValidacion_QNAME = new QName("http://Ecodex.WS.Model/2011/CFDI", "FallaValidacion");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _ArrayOfstring_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfstring");
    private final static QName _AltaEmisor_QNAME = new QName("http://Ecodex.WS.Model/2011/CFDI", "AltaEmisor");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _Avisos_QNAME = new QName("http://Ecodex.WS.Model/2011/CFDI", "Avisos");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _CuentaEstatus_QNAME = new QName("http://Ecodex.WS.Model/2011/CFDI", "CuentaEstatus");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _FallaServicio_QNAME = new QName("http://Ecodex.WS.Model/2011/CFDI", "FallaServicio");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _FallaSesion_QNAME = new QName("http://Ecodex.WS.Model/2011/CFDI", "FallaSesion");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _Aviso_QNAME = new QName("http://Ecodex.WS.Model/2011/CFDI", "Aviso");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _SolicitudAvisosNuevosToken_QNAME = new QName("http://Ecodex.WS.Model/2011/CFDI", "Token");
    private final static QName _SolicitudAvisosNuevosRFC_QNAME = new QName("http://Ecodex.WS.Model/2011/CFDI", "RFC");
    private final static QName _SolicitudRegistroClienteRfcIntegrador_QNAME = new QName("http://Ecodex.WS.Model/2011/CFDI", "RfcIntegrador");
    private final static QName _SolicitudRegistroClienteEmisor_QNAME = new QName("http://Ecodex.WS.Model/2011/CFDI", "Emisor");
    private final static QName _RespuestaRegistroRespuesta_QNAME = new QName("http://Ecodex.WS.Model/2011/CFDI", "Respuesta");
    private final static QName _RespuestaEstatusCuentaEstatus_QNAME = new QName("http://Ecodex.WS.Model/2011/CFDI", "Estatus");
    private final static QName _ResultadoRegistroEmisorClaveCertificado_QNAME = new QName("http://Ecodex.WS.Model/2011/CFDI", "ClaveCertificado");
    private final static QName _CuentaEstatusCodigo_QNAME = new QName("http://Ecodex.WS.Model/2011/CFDI", "Codigo");
    private final static QName _CuentaEstatusCertificados_QNAME = new QName("http://Ecodex.WS.Model/2011/CFDI", "Certificados");
    private final static QName _CuentaEstatusDescripcion_QNAME = new QName("http://Ecodex.WS.Model/2011/CFDI", "Descripcion");
    private final static QName _AltaEmisorRazonSocial_QNAME = new QName("http://Ecodex.WS.Model/2011/CFDI", "RazonSocial");
    private final static QName _AltaEmisorCorreoElectronico_QNAME = new QName("http://Ecodex.WS.Model/2011/CFDI", "CorreoElectronico");
    private final static QName _FallaValidacionSugerencia_QNAME = new QName("http://Ecodex.WS.Model/2011/CFDI", "Sugerencia");
    private final static QName _FallaValidacionAntecedente_QNAME = new QName("http://Ecodex.WS.Model/2011/CFDI", "Antecedente");
    private final static QName _FallaValidacionNodo_QNAME = new QName("http://Ecodex.WS.Model/2011/CFDI", "Nodo");
    private final static QName _FallaValidacionEvento_QNAME = new QName("http://Ecodex.WS.Model/2011/CFDI", "Evento");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: Clientes
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SolicitudAvisosNuevos }
     * 
     */
    public SolicitudAvisosNuevos createSolicitudAvisosNuevos() {
        return new SolicitudAvisosNuevos();
    }

    /**
     * Create an instance of {@link ResultadoRegistroEmisor }
     * 
     */
    public ResultadoRegistroEmisor createResultadoRegistroEmisor() {
        return new ResultadoRegistroEmisor();
    }

    /**
     * Create an instance of {@link FallaServicio }
     * 
     */
    public FallaServicio createFallaServicio() {
        return new FallaServicio();
    }

    /**
     * Create an instance of {@link RespuestaEstatusCuenta }
     * 
     */
    public RespuestaEstatusCuenta createRespuestaEstatusCuenta() {
        return new RespuestaEstatusCuenta();
    }

    /**
     * Create an instance of {@link CuentaEstatus }
     * 
     */
    public CuentaEstatus createCuentaEstatus() {
        return new CuentaEstatus();
    }

    /**
     * Create an instance of {@link SolicitudAsignacionTimbres }
     * 
     */
    public SolicitudAsignacionTimbres createSolicitudAsignacionTimbres() {
        return new SolicitudAsignacionTimbres();
    }

    /**
     * Create an instance of {@link FallaValidacion }
     * 
     */
    public FallaValidacion createFallaValidacion() {
        return new FallaValidacion();
    }

    /**
     * Create an instance of {@link SolicitudEstatusCuenta }
     * 
     */
    public SolicitudEstatusCuenta createSolicitudEstatusCuenta() {
        return new SolicitudEstatusCuenta();
    }

    /**
     * Create an instance of {@link FallaSesion }
     * 
     */
    public FallaSesion createFallaSesion() {
        return new FallaSesion();
    }

    /**
     * Create an instance of {@link AltaEmisor }
     * 
     */
    public AltaEmisor createAltaEmisor() {
        return new AltaEmisor();
    }

    /**
     * Create an instance of {@link RespuestaAsignacionTimbres }
     * 
     */
    public RespuestaAsignacionTimbres createRespuestaAsignacionTimbres() {
        return new RespuestaAsignacionTimbres();
    }

    /**
     * Create an instance of {@link Avisos }
     * 
     */
    public Avisos createAvisos() {
        return new Avisos();
    }

    /**
     * Create an instance of {@link SolicitudRegistroCliente }
     * 
     */
    public SolicitudRegistroCliente createSolicitudRegistroCliente() {
        return new SolicitudRegistroCliente();
    }

    /**
     * Create an instance of {@link RespuestaAvisosNuevos }
     * 
     */
    public RespuestaAvisosNuevos createRespuestaAvisosNuevos() {
        return new RespuestaAvisosNuevos();
    }

    /**
     * Create an instance of {@link Aviso }
     * 
     */
    public Aviso createAviso() {
        return new Aviso();
    }

    /**
     * Create an instance of {@link RespuestaRegistro }
     * 
     */
    public RespuestaRegistro createRespuestaRegistro() {
        return new RespuestaRegistro();
    }

    /**
     * Create an instance of {@link ArrayOfstring }
     * 
     */
    public ArrayOfstring createArrayOfstring() {
        return new ArrayOfstring();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResultadoRegistroEmisor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Ecodex.WS.Model/2011/CFDI", name = "ResultadoRegistroEmisor")
    public JAXBElement<ResultadoRegistroEmisor> createResultadoRegistroEmisor(ResultadoRegistroEmisor value) {
        return new JAXBElement<ResultadoRegistroEmisor>(_ResultadoRegistroEmisor_QNAME, ResultadoRegistroEmisor.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", name = "ArrayOfstring")
    public JAXBElement<ArrayOfstring> createArrayOfstring(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_ArrayOfstring_QNAME, ArrayOfstring.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AltaEmisor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Ecodex.WS.Model/2011/CFDI", name = "AltaEmisor")
    public JAXBElement<AltaEmisor> createAltaEmisor(AltaEmisor value) {
        return new JAXBElement<AltaEmisor>(_AltaEmisor_QNAME, AltaEmisor.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Avisos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Ecodex.WS.Model/2011/CFDI", name = "Avisos")
    public JAXBElement<Avisos> createAvisos(Avisos value) {
        return new JAXBElement<Avisos>(_Avisos_QNAME, Avisos.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CuentaEstatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Ecodex.WS.Model/2011/CFDI", name = "CuentaEstatus")
    public JAXBElement<CuentaEstatus> createCuentaEstatus(CuentaEstatus value) {
        return new JAXBElement<CuentaEstatus>(_CuentaEstatus_QNAME, CuentaEstatus.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "boolean")
    public JAXBElement<Boolean> createBoolean(Boolean value) {
        return new JAXBElement<Boolean>(_Boolean_QNAME, Boolean.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Aviso }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Ecodex.WS.Model/2011/CFDI", name = "Aviso")
    public JAXBElement<Aviso> createAviso(Aviso value) {
        return new JAXBElement<Aviso>(_Aviso_QNAME, Aviso.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Ecodex.WS.Model/2011/CFDI", name = "Token", scope = SolicitudAvisosNuevos.class)
    public JAXBElement<String> createSolicitudAvisosNuevosToken(String value) {
        return new JAXBElement<String>(_SolicitudAvisosNuevosToken_QNAME, String.class, SolicitudAvisosNuevos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Ecodex.WS.Model/2011/CFDI", name = "RFC", scope = SolicitudAvisosNuevos.class)
    public JAXBElement<String> createSolicitudAvisosNuevosRFC(String value) {
        return new JAXBElement<String>(_SolicitudAvisosNuevosRFC_QNAME, String.class, SolicitudAvisosNuevos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Ecodex.WS.Model/2011/CFDI", name = "Token", scope = RespuestaAsignacionTimbres.class)
    public JAXBElement<String> createRespuestaAsignacionTimbresToken(String value) {
        return new JAXBElement<String>(_SolicitudAvisosNuevosToken_QNAME, String.class, RespuestaAsignacionTimbres.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Ecodex.WS.Model/2011/CFDI", name = "RfcIntegrador", scope = SolicitudRegistroCliente.class)
    public JAXBElement<String> createSolicitudRegistroClienteRfcIntegrador(String value) {
        return new JAXBElement<String>(_SolicitudRegistroClienteRfcIntegrador_QNAME, String.class, SolicitudRegistroCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AltaEmisor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Ecodex.WS.Model/2011/CFDI", name = "Emisor", scope = SolicitudRegistroCliente.class)
    public JAXBElement<AltaEmisor> createSolicitudRegistroClienteEmisor(AltaEmisor value) {
        return new JAXBElement<AltaEmisor>(_SolicitudRegistroClienteEmisor_QNAME, AltaEmisor.class, SolicitudRegistroCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Ecodex.WS.Model/2011/CFDI", name = "Token", scope = SolicitudRegistroCliente.class)
    public JAXBElement<String> createSolicitudRegistroClienteToken(String value) {
        return new JAXBElement<String>(_SolicitudAvisosNuevosToken_QNAME, String.class, SolicitudRegistroCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResultadoRegistroEmisor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Ecodex.WS.Model/2011/CFDI", name = "Respuesta", scope = RespuestaRegistro.class)
    public JAXBElement<ResultadoRegistroEmisor> createRespuestaRegistroRespuesta(ResultadoRegistroEmisor value) {
        return new JAXBElement<ResultadoRegistroEmisor>(_RespuestaRegistroRespuesta_QNAME, ResultadoRegistroEmisor.class, RespuestaRegistro.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CuentaEstatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Ecodex.WS.Model/2011/CFDI", name = "Estatus", scope = RespuestaEstatusCuenta.class)
    public JAXBElement<CuentaEstatus> createRespuestaEstatusCuentaEstatus(CuentaEstatus value) {
        return new JAXBElement<CuentaEstatus>(_RespuestaEstatusCuentaEstatus_QNAME, CuentaEstatus.class, RespuestaEstatusCuenta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Ecodex.WS.Model/2011/CFDI", name = "ClaveCertificado", scope = ResultadoRegistroEmisor.class)
    public JAXBElement<String> createResultadoRegistroEmisorClaveCertificado(String value) {
        return new JAXBElement<String>(_ResultadoRegistroEmisorClaveCertificado_QNAME, String.class, ResultadoRegistroEmisor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Ecodex.WS.Model/2011/CFDI", name = "Estatus", scope = ResultadoRegistroEmisor.class)
    public JAXBElement<String> createResultadoRegistroEmisorEstatus(String value) {
        return new JAXBElement<String>(_RespuestaEstatusCuentaEstatus_QNAME, String.class, ResultadoRegistroEmisor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Ecodex.WS.Model/2011/CFDI", name = "RFC", scope = ResultadoRegistroEmisor.class)
    public JAXBElement<String> createResultadoRegistroEmisorRFC(String value) {
        return new JAXBElement<String>(_SolicitudAvisosNuevosRFC_QNAME, String.class, ResultadoRegistroEmisor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Ecodex.WS.Model/2011/CFDI", name = "Token", scope = SolicitudAsignacionTimbres.class)
    public JAXBElement<String> createSolicitudAsignacionTimbresToken(String value) {
        return new JAXBElement<String>(_SolicitudAvisosNuevosToken_QNAME, String.class, SolicitudAsignacionTimbres.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Ecodex.WS.Model/2011/CFDI", name = "RFC", scope = SolicitudAsignacionTimbres.class)
    public JAXBElement<String> createSolicitudAsignacionTimbresRFC(String value) {
        return new JAXBElement<String>(_SolicitudAvisosNuevosRFC_QNAME, String.class, SolicitudAsignacionTimbres.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Ecodex.WS.Model/2011/CFDI", name = "Codigo", scope = CuentaEstatus.class)
    public JAXBElement<String> createCuentaEstatusCodigo(String value) {
        return new JAXBElement<String>(_CuentaEstatusCodigo_QNAME, String.class, CuentaEstatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Ecodex.WS.Model/2011/CFDI", name = "Certificados", scope = CuentaEstatus.class)
    public JAXBElement<ArrayOfstring> createCuentaEstatusCertificados(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_CuentaEstatusCertificados_QNAME, ArrayOfstring.class, CuentaEstatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Ecodex.WS.Model/2011/CFDI", name = "Descripcion", scope = CuentaEstatus.class)
    public JAXBElement<String> createCuentaEstatusDescripcion(String value) {
        return new JAXBElement<String>(_CuentaEstatusDescripcion_QNAME, String.class, CuentaEstatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Ecodex.WS.Model/2011/CFDI", name = "RFC", scope = CuentaEstatus.class)
    public JAXBElement<String> createCuentaEstatusRFC(String value) {
        return new JAXBElement<String>(_SolicitudAvisosNuevosRFC_QNAME, String.class, CuentaEstatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Ecodex.WS.Model/2011/CFDI", name = "RazonSocial", scope = AltaEmisor.class)
    public JAXBElement<String> createAltaEmisorRazonSocial(String value) {
        return new JAXBElement<String>(_AltaEmisorRazonSocial_QNAME, String.class, AltaEmisor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Ecodex.WS.Model/2011/CFDI", name = "CorreoElectronico", scope = AltaEmisor.class)
    public JAXBElement<String> createAltaEmisorCorreoElectronico(String value) {
        return new JAXBElement<String>(_AltaEmisorCorreoElectronico_QNAME, String.class, AltaEmisor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Ecodex.WS.Model/2011/CFDI", name = "RFC", scope = AltaEmisor.class)
    public JAXBElement<String> createAltaEmisorRFC(String value) {
        return new JAXBElement<String>(_SolicitudAvisosNuevosRFC_QNAME, String.class, AltaEmisor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Ecodex.WS.Model/2011/CFDI", name = "Token", scope = SolicitudEstatusCuenta.class)
    public JAXBElement<String> createSolicitudEstatusCuentaToken(String value) {
        return new JAXBElement<String>(_SolicitudAvisosNuevosToken_QNAME, String.class, SolicitudEstatusCuenta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Ecodex.WS.Model/2011/CFDI", name = "RFC", scope = SolicitudEstatusCuenta.class)
    public JAXBElement<String> createSolicitudEstatusCuentaRFC(String value) {
        return new JAXBElement<String>(_SolicitudAvisosNuevosRFC_QNAME, String.class, SolicitudEstatusCuenta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Avisos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Ecodex.WS.Model/2011/CFDI", name = "Avisos", scope = RespuestaAvisosNuevos.class)
    public JAXBElement<Avisos> createRespuestaAvisosNuevosAvisos(Avisos value) {
        return new JAXBElement<Avisos>(_Avisos_QNAME, Avisos.class, RespuestaAvisosNuevos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Ecodex.WS.Model/2011/CFDI", name = "Descripcion", scope = FallaSesion.class)
    public JAXBElement<String> createFallaSesionDescripcion(String value) {
        return new JAXBElement<String>(_CuentaEstatusDescripcion_QNAME, String.class, FallaSesion.class, value);
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
        return new JAXBElement<String>(_CuentaEstatusDescripcion_QNAME, String.class, FallaValidacion.class, value);
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
        return new JAXBElement<String>(_CuentaEstatusDescripcion_QNAME, String.class, FallaServicio.class, value);
    }

}
