/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sa.celestial.software.cl;

import java.time.LocalDate;
import javafx.scene.image.Image;
import sa.celestial.software.db.Conexion;

/**
 *
 * @author Osvaldo Salazar
 */
public class CL {
  
    Conexion cone = new Conexion();
    public String registrarCliente(String razonSocial, String cedulaJuridica, String ubicacion, String telefono, Contacto cContacto, Image logo ){
    
        Cliente nuevoCliente = new Cliente(razonSocial, cedulaJuridica, ubicacion, telefono, logo, cContacto);
        
        String mensaje= "Cliente guardado";
        
        return mensaje;
            
    }

public String modificarCliente (int opcion, String datoModificado, String cedulaJuridica){
String modificar;
String mensaje= "";
    switch (opcion)
            {
        case 1: 
                modificar= "razonSocial";
         break;       
        case 2:
            modificar= "cedulaJuridica";
             break; 
        case 3: 
            modificar=  "ubicacion";
             break; 
        case 4: 
            modificar = "telefono";
             break; 
        case 5:  
            modificar = "identificacion";
             break; 
        case 6:
            modificar = "nombreCompleto";
             break; 
        case 7: 
            
            modificar = "puestodesempena";
             break; 
        case 8:
            
            modificar = "informacionContacto";
             break; 
        case 9: 
            
            modificar = "telefono";
             break;         
        case 10:
                        
                   modificar = "correo eletronico";
             break;        
        case 11: 
            
            modificar = "imagen";
             break; 
        case 12:
            
            modificar = "tipo";
         break; 
       default:
           mensaje = "Intente nuevamente";
           opcion =0;
            break; 
    }// Fin de switch
    int eleccion;
if(opcion==0){// Este if es: si el usuario ingresa un valor fuera del establecido, no haga conexion con la base de datos y retorne que fue un error
    if( opcion>= 1 && opcion <5){// Este if es para poder saber de quien se esta modificando el dato ( si es directamnete uno del Clienet o del Contacto)
eleccion= 1;
}else{
    eleccion= 2;    
}
}//fin de if
            
      
      return mensaje;    
    }


public String listarCliente(String cedula){


}


public String registrarProducto(String nombreProducto, Image logo, String codigo, String descripcionProducto,  int dia, int mes, int anno, LocalDate fechaReporte)
{

String mensaje=cone.registrarProducto(nombreProducto, codigo, descripcionProducto);
    return mensaje;
    
}
}


public String modificarProducto (){




}

            }



            


