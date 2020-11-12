/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xmlcfdi;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import org.apache.commons.ssl.Base64;

import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.w3c.dom.Attr;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;


/**
 *
 * @author Hp EliteBook
 */


public class Cfdi {

    private static Document doc;
    private Element rootElement, nodoActual;
    private ArrayList<Cfdi> elementos, retenciones, traslados, pagosRelacionados;
    private static String idEcodex;
    //Datos necesarios para el timbrado
    private String rutaGeneracionXml,rutaXMLTimbrado;
    private String sCertificadoSaat,sFolioFiscal, sTransactionID, sSelloSat, sVersion, sFechaTimbrado,flujoXML,sSelloDigital;
    private boolean esPrueba;
    
    
    public Cfdi(Element nodo, Element nodoRaiz) {
        nodoActual = nodo;
        rootElement = nodo;
        elementos = new ArrayList<>();
        retenciones = new ArrayList<>();
        traslados = new ArrayList<>();
        pagosRelacionados = new ArrayList<>();
    }
    
    public Cfdi DocumentoPago(Cfdi Nodo) {
        Cfdi nuevo = Nodo;
        elementos.add(nuevo);
        return nuevo;
    }
    
    public Cfdi DocumentoRelacionado(Cfdi Nodo) {
        Cfdi nuevo = Nodo;
        elementos.add(nuevo);
        return nuevo;
    }

    public Cfdi() throws Exception {
        doc=null;
        try {
            crearNodo("cfdi:Comprobante");
        } catch (Exception ex) {
            throw new Exception("Error al crear nodo: " + ex.getMessage());
        }
        elementos = new ArrayList<>();
        retenciones = new ArrayList<>();
        traslados = new ArrayList<>();
        pagosRelacionados = new ArrayList<>();
        idEcodex = "c2b7e31b-4e82-4a4a-82cf-8632969beb57";
        
    }

    public Cfdi(String nombreNodo) throws Exception {
        try {
            crearNodo(nombreNodo);
        } catch (Exception ex) {
            throw new Exception("Error al crear nodo: " + ex.getMessage());
        }
        elementos = new ArrayList<>();
        retenciones = new ArrayList<>();
        traslados = new ArrayList<>();
        pagosRelacionados = new ArrayList<>();
    }
   
    public Cfdi emisor() throws Exception {
        return verificarNodos("cfdi:Emisor");
    }

    public Cfdi receptor() throws Exception {
        return verificarNodos("cfdi:Receptor");
    }

    public Cfdi conceptos() throws Exception {
        return verificarNodos("cfdi:Conceptos");
    }

    public Cfdi impuestos() throws Exception {
        return verificarNodos("cfdi:Impuestos");
    }
    
    public Cfdi nuevoNodo(String nombre) throws Exception {
        return verificarNodos(nombre);
    }

    public Cfdi Traslados() throws Exception {
        return verificarNodos("cfdi:Traslados");
    }

    public Cfdi Retenciones() throws Exception {
        return verificarNodos("cfdi:Retenciones");
    }
    public Cfdi Complemento() throws Exception {
        return verificarNodos("cfdi:Complemento");
    }
    
    public Cfdi Pagos() throws Exception{
        return verificarNodos("pago10:Pagos");
    }
    
    public Cfdi Pago() throws Exception{
        return verificarNodos("pago10:Pago");
    }
    
    public Cfdi DocumentoRelacionado(int pos) throws Exception{
        return crearNodos(pos, "pago10:DoctoRelacionado", pagosRelacionados);
    }
    
    public Cfdi Traslado(int pos) throws Exception {
        return crearNodos(pos, "cfdi:Traslado", traslados);
    }

    public Cfdi Retencion(int pos) throws Exception {
        return crearNodos(pos, "cfdi:Retencion", retenciones);
    }

    public Cfdi concepto(int pos) throws Exception {
        return crearNodos(pos, "cfdi:Concepto", elementos);
    }

    private Cfdi crearNodos(int pos, String nombre, ArrayList<Cfdi> elementos) throws Exception {
        Cfdi tmp;
        try{
        if (elementos.isEmpty()) {
            if (pos == 0) {
                Cfdi nuevo = new Cfdi(nombre);
                elementos.add(nuevo);
            } else {
                throw new ArrayIndexOutOfBoundsException();
            }
        } else if (pos - (elementos.size() - 1) > 1) {
            throw new ArrayIndexOutOfBoundsException();
        } else if (pos - (elementos.size() - 1) == 1) {
            Cfdi nuevo = new Cfdi(nombre);
            elementos.add(nuevo);
        }
        }catch(Exception ex){
            throw ex;
        }
        tmp = elementos.get(pos);
        return tmp;
    }

    public Element getRaiz() {
        return rootElement;
    }

    public void setCertificado(String rutaCertificado) {
        
        String sNumeroCertificado     = sGetNumeroCertificado(rutaCertificado);
        String sCertificado        = getCertificado(rutaCertificado);
        
        setAtributo("NoCertificado",sNumeroCertificado);
        setAtributo("Certificado",sCertificado);
    }

    public void setAtributo(String nomAtributo, String valorAtributo) {
        valorAtributo=verAtributosEspeciales(valorAtributo);
        Attr attr = doc.createAttribute(nomAtributo);
        attr.setValue(valorAtributo);
//        rootElement.setAttributeNode(attr);
        rootElement.setAttributeNodeNS(attr);
    }
    private String verAtributosEspeciales(String atributo){
        String tmp;
        switch(atributo){
            case "ISR":
                tmp="001";
                break;
            case "IVA":
                tmp="002";
                break;
            default: tmp=atributo;
        }
        return tmp;
    }
    private Cfdi verificarNodos(String nombreNodo) throws Exception {
        boolean crearNuevoHijo = true;
        Cfdi nuevo = null;
        for (Cfdi elemento : elementos) {
            if (elemento.rootElement.getTagName().compareTo(nombreNodo) == 0) {
                nuevo = elemento;
                crearNuevoHijo = false;
                break;
            }
        }
        if (crearNuevoHijo) {
            nuevo = new Cfdi(nombreNodo);
            elementos.add(nuevo);
        }
        return nuevo;
    }

    private void crearNodo(String nombreNodo) throws Exception {
        try {
            if (doc == null) {
                DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
                DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

                doc = docBuilder.newDocument();
                rootElement = doc.createElement(nombreNodo);

                doc.appendChild(rootElement);
                nodoActual = rootElement;
                //atributosPrivados();
            } else {
                Element nuevoNodo = doc.createElement(nombreNodo);
                rootElement = nodoActual = nuevoNodo;
            }

        } catch (ParserConfigurationException | DOMException ex) {
            throw new Exception("Error al añadir nodo: " + ex.getMessage());
        }
    }

    public void timbrar(String RFC) throws Exception {
        String token = sCreaToken(RFC);
        java.util.StringTokenizer stk = new java.util.StringTokenizer(token, "|");
        token = stk.nextToken();
        String sTransId = stk.nextToken();
        CrearXMLaTimbrar();
        byte[] encoded = null;
        try {
            encoded = Files.readAllBytes(Paths.get(rutaGeneracionXml));
        } catch (IOException ex) {
            throw new Exception("Encoding error: " + ex.getMessage());
        }

        String XML = new String(encoded, Charset.forName("UTF-8"));
        //XML = XML.replace("&","&amp;");
        
        if (esPrueba) {
            pruebaTimbrado.ObjectFactory facCli = new pruebaTimbrado.ObjectFactory();
            pruebaTimbrado.ComprobanteXML xmlComp = new pruebaTimbrado.ComprobanteXML();
            xmlComp.setDatosXML(facCli.createComprobanteXMLDatosXML(XML));

            pruebaTimbrado.SolicitudTimbraXML wbPara = new pruebaTimbrado.SolicitudTimbraXML();
            wbPara.setTransaccionID(Long.parseLong(sTransId));
            wbPara.setToken(facCli.createSolicitudTimbraXMLToken(token));
            wbPara.setRFC(facCli.createSolicitudTimbraXMLRFC(RFC));
            wbPara.setComprobanteXML(facCli.createComprobanteXML(xmlComp));

            pruebaTimbrado.RespuestaTimbraXML wsResp;

            try {
                pruebaTimbrado.Timbrado_Service servicioX = new pruebaTimbrado.Timbrado_Service();
                pruebaTimbrado.Timbrado puertoX = servicioX.getPuertoTimbrado();

                wsResp = puertoX.timbraXML(wbPara);
                sTransactionID = wsResp.getTransaccionID().toString();
                XML = wsResp.getComprobanteXML().getValue().getDatosXML().getValue();
                flujoXML=XML;
                CrearXMLTimbrado(rutaXMLTimbrado, XML);
                obtenerDatosTimbrado(XML);

            } catch (pruebaTimbrado.TimbradoTimbraXMLFallaValidacionFaultFaultMessage | pruebaTimbrado.TimbradoTimbraXMLFallaSesionFaultFaultMessage | pruebaTimbrado.TimbradoTimbraXMLFallaServicioFaultFaultMessage ex) {
                 throw new Exception("Error al timbrar por: " + ex.getMessage());
            }
        }else{
            Timbrado.ObjectFactory facCli = new Timbrado.ObjectFactory();
            Timbrado.ComprobanteXML xmlComp = new Timbrado.ComprobanteXML();
            xmlComp.setDatosXML(facCli.createComprobanteXMLDatosXML(XML));

            Timbrado.SolicitudTimbraXML wbPara = new Timbrado.SolicitudTimbraXML();
            wbPara.setTransaccionID(Long.parseLong(sTransId));
            wbPara.setToken(facCli.createSolicitudTimbraXMLToken(token));
            wbPara.setRFC(facCli.createSolicitudTimbraXMLRFC(RFC));
            wbPara.setComprobanteXML(facCli.createComprobanteXML(xmlComp));

            Timbrado.RespuestaTimbraXML wsResp;

            try {
                Timbrado.Timbrado_Service servicioX = new Timbrado.Timbrado_Service();
                Timbrado.Timbrado puertoX = servicioX.getPuertoTimbrado();

                wsResp = puertoX.timbraXML(wbPara);
                sTransactionID = wsResp.getTransaccionID().toString();
                XML = wsResp.getComprobanteXML().getValue().getDatosXML().getValue();
                flujoXML=XML;
                CrearXMLTimbrado(rutaXMLTimbrado, XML);
                obtenerDatosTimbrado(XML);

            } catch (Timbrado.TimbradoTimbraXMLFallaValidacionFaultFaultMessage | Timbrado.TimbradoTimbraXMLFallaSesionFaultFaultMessage | Timbrado.TimbradoTimbraXMLFallaServicioFaultFaultMessage ex) {
                throw new Exception("Error al timbrar por: " + ex.getMessage());
            }
        }
    }
    
    public void timbrar(String RFC,String XML) throws Exception {
        String token = sCreaToken(RFC);
        java.util.StringTokenizer stk = new java.util.StringTokenizer(token, "|");
        token = stk.nextToken();
        String sTransId = stk.nextToken();
             
        if (esPrueba) {
            pruebaTimbrado.ObjectFactory facCli = new pruebaTimbrado.ObjectFactory();
            pruebaTimbrado.ComprobanteXML xmlComp = new pruebaTimbrado.ComprobanteXML();
            xmlComp.setDatosXML(facCli.createComprobanteXMLDatosXML(XML));

            pruebaTimbrado.SolicitudTimbraXML wbPara = new pruebaTimbrado.SolicitudTimbraXML();
            wbPara.setTransaccionID(Long.parseLong(sTransId));
            wbPara.setToken(facCli.createSolicitudTimbraXMLToken(token));
            wbPara.setRFC(facCli.createSolicitudTimbraXMLRFC(RFC));
            wbPara.setComprobanteXML(facCli.createComprobanteXML(xmlComp));

            pruebaTimbrado.RespuestaTimbraXML wsResp;

            try {
                pruebaTimbrado.Timbrado_Service servicioX = new pruebaTimbrado.Timbrado_Service();
                pruebaTimbrado.Timbrado puertoX = servicioX.getPuertoTimbrado();

                wsResp = puertoX.timbraXML(wbPara);
                sTransactionID = wsResp.getTransaccionID().toString();
                XML = wsResp.getComprobanteXML().getValue().getDatosXML().getValue();
                flujoXML=XML;
                CrearXMLTimbrado(rutaXMLTimbrado, XML);
                obtenerDatosTimbrado(XML);

            } catch (pruebaTimbrado.TimbradoTimbraXMLFallaValidacionFaultFaultMessage | pruebaTimbrado.TimbradoTimbraXMLFallaSesionFaultFaultMessage | pruebaTimbrado.TimbradoTimbraXMLFallaServicioFaultFaultMessage ex) {
                 throw new Exception("Error al timbrar por: " + ex.getMessage());
            }
        }else{
            Timbrado.ObjectFactory facCli = new Timbrado.ObjectFactory();
            Timbrado.ComprobanteXML xmlComp = new Timbrado.ComprobanteXML();
            xmlComp.setDatosXML(facCli.createComprobanteXMLDatosXML(XML));

            Timbrado.SolicitudTimbraXML wbPara = new Timbrado.SolicitudTimbraXML();
            wbPara.setTransaccionID(Long.parseLong(sTransId));
            wbPara.setToken(facCli.createSolicitudTimbraXMLToken(token));
            wbPara.setRFC(facCli.createSolicitudTimbraXMLRFC(RFC));
            wbPara.setComprobanteXML(facCli.createComprobanteXML(xmlComp));

            Timbrado.RespuestaTimbraXML wsResp;

            try {
                Timbrado.Timbrado_Service servicioX = new Timbrado.Timbrado_Service();
                Timbrado.Timbrado puertoX = servicioX.getPuertoTimbrado();

                wsResp = puertoX.timbraXML(wbPara);
                sTransactionID = wsResp.getTransaccionID().toString();
                
                System.out.println(sTransactionID);
                
                XML = wsResp.getComprobanteXML().getValue().getDatosXML().getValue();
                flujoXML=XML;
                
                System.out.println(sTransactionID);
                
                CrearXMLTimbrado(rutaXMLTimbrado, XML);
                obtenerDatosTimbrado(XML);

            } catch (Timbrado.TimbradoTimbraXMLFallaValidacionFaultFaultMessage | Timbrado.TimbradoTimbraXMLFallaSesionFaultFaultMessage | Timbrado.TimbradoTimbraXMLFallaServicioFaultFaultMessage ex) {
                throw new Exception("Error al timbrar por: " + ex.getMessage());
            }
        }
    }
    
    private void obtenerDatosTimbrado(String XMLTimbrado){
        java.util.StringTokenizer tokensXml    = new java.util.StringTokenizer(XMLTimbrado, " ");
        while(tokensXml.hasMoreTokens())
        {
            String tmp    = tokensXml.nextToken();
            String [] tokens =tmp.split("=");
            switch(tokens[0]){
                case "UUID":
                    sFolioFiscal=tokens[1];
                    break;
                case "SelloSAT":
                    sSelloSat=tokens[1];
                    break;
                case "FechaTimbrado":
                    sFechaTimbrado=tokens[1];
                    break;
                case "Version":
                    sVersion=tokens[1];
                    break;
                case "NoCertificadoSAT":
                    sCertificadoSaat=tokens[1];
                    break;
            }
        }
    }
    public void setRutaGeneracionXML(String value){
        rutaGeneracionXml=value;
    }
    public void setRutaXMLTimbrado(String value){
        rutaXMLTimbrado=value;
    }
    public String getUUID(){
        return sFolioFiscal;
    }
    public String getSelloSAT(){
        return sSelloSat;
    }
    public String getFechaTimbrado(){
        return sFechaTimbrado;
    }
    public String getVersion(){
        return sVersion;
    }
    public String getNoCertificadoSat(){
        return sCertificadoSaat;
    }
    public String getXMLflujo(){
        return flujoXML;
    }
    public String getsTransactionID(){
        return sTransactionID;
    }
    public String getsSelloDigital(){
        return sSelloDigital;
    }
    private Cfdi crearArbol(Cfdi nodoPadre) {
        Cfdi tmp = nodoPadre;
        if (!traslados.isEmpty()) {
            elementos.addAll(traslados);
        }
        if (!retenciones.isEmpty()) {
            elementos.addAll(retenciones);
        }
        if (!nodoPadre.elementos.isEmpty()) {
            for (Cfdi elemento : elementos) {
                tmp = elemento.crearArbol(elemento);
                nodoPadre.rootElement.appendChild(tmp.getRaiz());
                tmp = nodoPadre;
            }
        }
        return tmp;
    }

    public void sellarCFDI(String xslt, String certificado, String llave, String pass) throws Exception {
        try {
            CrearXMLaTimbrar();
            String cadenaOriginal = creaCadena(xslt);
            //pruebas
            //pass = "12345678a";
            PrivateKey prKey = pkGetKey(new File(llave), pass);
            String sSello = genSelDig(prKey, cadenaOriginal);
            sSelloDigital=sSello;
            setAtributo("Sello", sSello);
        } catch (Exception ex) {
            throw new Exception("Error al sellar CFDI: " + ex.getMessage());
        }
    }
    
    public String getSello(String xslt, String certificado, String llave, String pass, String sRuta) throws Exception {
        rutaGeneracionXml = sRuta;
        String cadenaOriginal = creaCadena(xslt);
        
        PrivateKey prKey = pkGetKey(new File(llave), pass);
        String sSello = "";
        try {
            return sSello = genSelDig(prKey, cadenaOriginal);
        } catch (Exception ex) {
            throw new Exception("Error al obtener sello: " + ex.getMessage());
        }
    }

    private void CrearXMLaTimbrar() throws Exception {
        crearArbol(this);
        try {
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(rootElement);
            StreamResult result = new StreamResult(new File(rutaGeneracionXml));

            transformer.transform(source, result);
        } catch (TransformerException ex) {
            throw new Exception("Error al crear xml: " + ex.getMessage());
        }
    }

    private void CrearXMLTimbrado(String Ruta, String XMLTimbrado) {
        File flFil = new File(Ruta);
        try {
            flFil.createNewFile();
        } catch (IOException expnIO) {
            expnIO.getMessage();
        }
        try (FileWriter fw = new FileWriter(flFil.getAbsoluteFile()); BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write(XMLTimbrado);
        } catch (IOException expnIO) {
            expnIO.getMessage();
        }
    }

    private String creaCadena(String xslt) {
        TransformerFactory factory = TransformerFactory.newInstance();
        Source xsltS = new StreamSource(new File(xslt));
        ByteArrayOutputStream otp = new ByteArrayOutputStream();
        try {
            Transformer transformer = factory.newTransformer(xsltS);
            //Source text = new StreamSource(new File());
            byte[] encoded = Files.readAllBytes(Paths.get(rutaGeneracionXml));
            String content = new String(encoded, Charset.forName("UTF-8"));
            transformer.transform(new StreamSource(new StringReader(content)), new StreamResult(otp));
        } catch (IOException | TransformerException ex) {
            System.out.println(ex.getMessage());
        }
        return otp.toString();
    }

    private PrivateKey pkGetKey(final File rutaLlave, final String password) {
        try {
            FileInputStream in = new FileInputStream(rutaLlave);
            org.apache.commons.ssl.PKCS8Key pkcs8 = new org.apache.commons.ssl.PKCS8Key(in, password.toCharArray());
            byte[] decrypted = pkcs8.getDecryptedBytes();
            java.security.spec.PKCS8EncodedKeySpec spec = new java.security.spec.PKCS8EncodedKeySpec(decrypted);
            PrivateKey pk = null;
            if (pkcs8.isDSA()) {
                pk = KeyFactory.getInstance("DSA").generatePrivate(spec);
            } else if (pkcs8.isRSA()) {
                pk = KeyFactory.getInstance("RSA").generatePrivate(spec);
            }

            pk = pkcs8.getPrivateKey();
            return pk;
        } catch (GeneralSecurityException | IOException ex) {
            ex.getMessage();
        }
        return null;
    }

    private static String genSelDig(final PrivateKey key, final String cadOrigi) throws Exception {
        /*Genera el sello dígital*/
        try {
            Signature sign = Signature.getInstance("SHA256withRSA");
            sign.initSign(key, new SecureRandom());
            sign.update(cadOrigi.getBytes());
            byte[] signature = sign.sign();
            Base64 bEncoder = new Base64();
            return new String(bEncoder.encode(signature));
        } catch (NoSuchAlgorithmException | InvalidKeyException | SignatureException ex) {
            throw new Exception("Error al generar el sello digital: " + ex.getMessage());
        }
    }

    private String sCreaToken(String sRFC) {
        String sNewTok = "";
        
        if (esPrueba) {
            pruebaSeguridad.ObjectFactory fac = new pruebaSeguridad.ObjectFactory();
        
            pruebaSeguridad.SolicitudObtenerToken sol = fac.createSolicitudObtenerToken();
            sol.setRFC(fac.createSolicitudObtenerTokenRFC(sRFC));
            sol.setTransaccionID(System.currentTimeMillis());

            pruebaSeguridad.RespuestaObtenerToken resp= fac.createRespuestaObtenerToken();
            try {
                resp = obtenerToken(sol);
            } catch (pruebaSeguridad.SeguridadObtenerTokenFallaSesionFaultFaultMessage | pruebaSeguridad.SeguridadObtenerTokenFallaServicioFaultFaultMessage expnWSPAC) {
                System.out.println(expnWSPAC.getMessage());
            }
            
            /*Crea el token con el id integrador y el símbolo de tuberia*/
            sNewTok = toSHA((idEcodex + "|" + resp.getToken().getValue()).getBytes(),"SHA-1");
            sNewTok = sNewTok + "|" + sol.getTransaccionID();
        }else{
            Seguridad.ObjectFactory fac = new Seguridad.ObjectFactory();
        
            Seguridad.SolicitudObtenerToken sol = fac.createSolicitudObtenerToken();
            sol.setRFC(fac.createSolicitudObtenerTokenRFC(sRFC));
            sol.setTransaccionID(System.currentTimeMillis());

            Seguridad.RespuestaObtenerToken resp= fac.createRespuestaObtenerToken();
            try {
                resp = obtenerToken(sol);
            } catch (Seguridad.SeguridadObtenerTokenFallaSesionFaultFaultMessage | Seguridad.SeguridadObtenerTokenFallaServicioFaultFaultMessage expnWSPAC) {
                System.out.println(expnWSPAC.getMessage());
            }
            
            /*Crea el token con el id integrador y el símbolo de tuberia*/
            sNewTok = toSHA((idEcodex + "|" + resp.getToken().getValue()).getBytes(),"SHA-1");
            sNewTok = sNewTok + "|" + sol.getTransaccionID();
        }

        /*Devuelve el resultado*/
        return sNewTok;

    }/*Fin de public static String sCreTokEstaP()*/


    private void atributosPrivados() {
        
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + Objects.hashCode(this.doc);
        hash = 13 * hash + Objects.hashCode(this.rootElement);
        hash = 13 * hash + Objects.hashCode(this.nodoActual);
        hash = 13 * hash + Objects.hashCode(this.elementos);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cfdi other = (Cfdi) obj;
        if (!Objects.equals(this.doc, other.doc)) {
            return false;
        }
        if (!Objects.equals(this.rootElement, other.rootElement)) {
            return false;
        }
        if (!Objects.equals(this.nodoActual, other.nodoActual)) {
            return false;
        }
        if (!Objects.equals(this.elementos, other.elementos)) {
            return false;
        }
        return true;
    }

    public void timbradoPrueba(boolean esPrueba) {
        this.esPrueba = esPrueba;
        idEcodex = esPrueba == true ? "2b3a8764-d586-4543-9b7e-82834443f219" : "c2b7e31b-4e82-4a4a-82cf-8632969beb57";
    }

    private static pruebaSeguridad.RespuestaObtenerToken obtenerToken(pruebaSeguridad.SolicitudObtenerToken parameters) throws pruebaSeguridad.SeguridadObtenerTokenFallaSesionFaultFaultMessage, pruebaSeguridad.SeguridadObtenerTokenFallaServicioFaultFaultMessage {
        pruebaSeguridad.Seguridad_Service service = new pruebaSeguridad.Seguridad_Service();
        pruebaSeguridad.Seguridad port = service.getPuertoSeguridad();
        return port.obtenerToken(parameters);
    }
    
    private static Seguridad.RespuestaObtenerToken obtenerToken(Seguridad.SolicitudObtenerToken parameters) throws Seguridad.SeguridadObtenerTokenFallaSesionFaultFaultMessage, Seguridad.SeguridadObtenerTokenFallaServicioFaultFaultMessage {
        Seguridad.Seguridad_Service service = new Seguridad.Seguridad_Service();
        Seguridad.Seguridad port = service.getPuertoSeguridad();
        return port.obtenerToken(parameters);
    }

    public static String createToken(String rfc) {
        String token = "";
        Long transactionID = System.currentTimeMillis();

        token = getTokenServicio(transactionID, rfc);
        String integrador = idEcodex;
        String toHash = String.format("%s|%s", integrador, token);

        token = toSHA(toHash.getBytes(),"SHA-1");

        return token;
    }

    public static String getTokenServicio(Long transID, String RFC) {
        String token = "";

        pruebaSeguridad.ObjectFactory ofc = new pruebaSeguridad.ObjectFactory();
        pruebaSeguridad.SolicitudObtenerToken tokenSolicitud = ofc.createSolicitudObtenerToken();
        tokenSolicitud.setRFC(ofc.createSolicitudObtenerTokenRFC(RFC));
        tokenSolicitud.setTransaccionID(transID);

        pruebaSeguridad.Seguridad_Service servicio = new pruebaSeguridad.Seguridad_Service();
        pruebaSeguridad.Seguridad puerto = servicio.getPuertoSeguridad();

        pruebaSeguridad.RespuestaObtenerToken tokenServicio;

        try {
            tokenServicio = puerto.obtenerToken(tokenSolicitud);
            token = tokenServicio.getToken().getValue();
        } catch (pruebaSeguridad.SeguridadObtenerTokenFallaServicioFaultFaultMessage | pruebaSeguridad.SeguridadObtenerTokenFallaSesionFaultFaultMessage ex) {
            System.out.println(ex.getMessage());
        }
        return token;
    }

    private static String toSHA(byte[] convertme,String tipoSHA) {
        /*Intenta hacer el hash*/
        java.security.MessageDigest md = null;
        try {
            md = java.security.MessageDigest.getInstance(tipoSHA);
        } catch (NoSuchAlgorithmException ex) {
            return null;
        }
        return sByTOHex(md.digest(convertme));
    }

    private static String sByTOHex(byte[] b) {
        String result = "";
        for (int i = 0; i < b.length; i++) {
            result += Integer.toString((b[i] & 0xff) + 0x100, 16).substring(1);
        }
        return result;
    }

    private String sGetNumeroCertificado(String sFile) {
        FileInputStream fis = null;
        ByteArrayInputStream bais = null;
        try {
            fis = new FileInputStream(sFile);

            byte value[] = new byte[fis.available()];
            fis.read(value);
            bais = new ByteArrayInputStream(value);

            CertificateFactory certFactory = CertificateFactory.getInstance("X.509");

            X509Certificate xRes = (X509Certificate) certFactory.generateCertificate(bais);

            java.math.BigInteger biSer = xRes.getSerialNumber();

            byte bArr[] = biSer.toByteArray();

            StringBuffer sBuff = new StringBuffer();
            for (int x = 0; x < bArr.length; x++) {
                sBuff.append((char) bArr[x]);
            }

            return sBuff.toString();
        } catch (CertificateException | IOException ex) {
            ex.getMessage();
        } finally {
            try {
                fis.close();
            } catch (IOException ex) {
                Logger.getLogger(Cfdi.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                bais.close();
            } catch (IOException ex) {                
                Logger.getLogger(Cfdi.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }

    private String getCertificado(String sFile) {
        FileInputStream fis = null;
        ByteArrayInputStream bais = null;
        try {

            fis = new FileInputStream(sFile);

            byte value[] = new byte[fis.available()];
            fis.read(value);
            bais = new ByteArrayInputStream(value);

            CertificateFactory certFactory = CertificateFactory.getInstance("X.509");

            X509Certificate xRes = (X509Certificate) certFactory.generateCertificate(bais);
            Base64 b = new Base64();
            byte temp[] = xRes.getEncoded();
            return new String(b.encode(temp));
        } catch (CertificateException | IOException ex) {
            ex.getMessage();
        } finally {
            try {
                fis.close();
            } catch (IOException ex) {
                Logger.getLogger(Cfdi.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                bais.close();
            } catch (IOException ex) {
                Logger.getLogger(Cfdi.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }/*Fin de public static String sGetSer(String sFile)*/
    
    
}
