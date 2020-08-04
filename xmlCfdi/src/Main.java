
import mx.gob.sat.cfd._3.Comprobante;
import mx.gob.sat.cfd._3.ObjectFactory;
import mx.gob.sat.sitio_internet.cfd.catalogos.CEstado;
import mx.gob.sat.sitio_internet.cfd.catalogos.CMetodoPago;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author augus
 */
public class Main {
    
    public static void main(String[] args){
        ObjectFactory fac = new ObjectFactory();
        Comprobante cfdi = fac.createComprobante();
        Comprobante.Emisor emisor = fac.createComprobanteEmisor();
        emisor.setNombre("");
        emisor.setRfc("");
        cfdi.setMetodoPago(CMetodoPago.PPD);
        cfdi.setEmisor(value);
        
    }
    
}
