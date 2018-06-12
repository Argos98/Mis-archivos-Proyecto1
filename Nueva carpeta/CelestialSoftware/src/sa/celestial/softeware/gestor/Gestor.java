/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sa.celestial.softeware.gestor;

import sa.celestial.software.multis.*;

public class Gestor {
MultiCliente cliente= new MultiCliente();
MultiInstalacion insta= new MultiInstalacion();
MultiProducto pro= new MultiProducto();
    public String registrarCliente(String razonSocial, String cedulaJuridica, String ubicacion, String telefono, String direccion, String identificacion, String nombreCompleto, String puestoDesempena, String informacionContacto, String telefonoContacto, String correoElectronico, String logo, String tipo, String identificacion2, String nombreCompleto2, String puestoDesempena2, String informacionContacto2, String telefonoContacto2, String correoElectronico2, String logo2, String tipo2)
    {
 
        String mensaje= cliente.registrarCliente(razonSocial, cedulaJuridica, ubicacion, telefono, direccion, identificacion, nombreCompleto, puestoDesempena, informacionContacto, telefonoContacto, correoElectronico, logo,tipo, identificacion, nombreCompleto, puestoDesempena, informacionContacto, telefonoContacto, correoElectronico, logo, tipo);
        
        return mensaje;
    }
    
     public void RegistrarInstalacion(int dia, int mes, int anno, int hora, int minutos, String cedulaJuridica, String codigo,String estado, String version) 
     {
     
     
     
     }
    
    
    }
    
    
}
