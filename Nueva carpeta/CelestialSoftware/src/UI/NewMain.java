/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import CapaAccesoBD.Conector;
import static java.lang.System.out;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import javafx.util.converter.LocalDateTimeStringConverter;
import sa.celestial.software.clases.Cliente;
import sa.celestial.software.clases.Contacto;
import sa.celestial.software.multis.MultiCliente;

/**
 *
 * @author Osvaldo Salazar
 */
public class NewMain {

    
    
    
    public static void main(String[] args){
     
//        int dia= 1, mes=1 , anno =1;
//        
//     
            
//fechaReporte.withDayOfMonth(dia);
//fechaReporte.withMonth(mes);
//fechaReporte.withYear(anno);

//out.println(fechaReporte);
        
//        String sentencia ="SELECT * \n" +
//"  FROM [BD_proyecto].[dbo].[cliente] as c \n "
//               
//     ;
//        
//        try {
//ResultSet a =Conector.getConector().ejecutarSQL(sentencia, true);
//      
//while(a.next()){
//      ArrayList <Cliente> listas = new ArrayList<>();
//   //  Contacto  cContacto = new Contacto( a.getString ("identificacion"), a.getString ("nombreCompleto"), a.getString ("puestoDesempena"), a.getString ("informacionContacto"),a.getString ("telefono"), a.getString ("correoElectonico"), a.getString ("tipo"));
//Cliente miCiente= new Cliente(a.getString("razonSocial"), a.getString("cedulaJuridica"), a.getString("ubicacion"), a.getString("telefono"), a.getString("direccion"));
//
//      listas.add(miCiente);
//      
//      for(Cliente c: listas){
//      
//      out.println(c.toString());
//      }      
//}
//        }catch(Exception e) 
//                {
//               out.println(e.getMessage()); 
//                
//                }
      
        
//}

////   LocalDate fechaReporte = LocalDate.of(anno, mes, dia);
////
////        String sentencia = "   INSERT INTO version (formato, fechaDeCreacion)\n"
////                + "VALUES (' 2.2.2.2 ', ' " + fechaReporte + " ')\n"
////                + "\n"
////                + "INSERT INTO producto  (codigo, nombreProducto, logo, descripcion, vVersion, versionActual)\n"
////                + "Values ( 'c', 'a', 'a' , 'a', 'abc', 'abc')\n"
////                + "\n"
////                + "DECLARE @cod VARCHAR (50)= (SELECT codigo\n"
////                + "FROM producto \n"
////                + "WHERE codigo = 'c')\n"
////                + "\n"
////                + "DECLARE @a INT = (SELECT MAX (id_version)FROM version)\n"
////                + "\n"
////                + "INSERT INTO version_por_producto (codigo_producto, id_version )\n"
////                + "VALUES (@cod, @a)  "
////                ;

    //    Conector.getConector().ejecutarSQL(sentencia);
//     ArrayList<Cliente> listas = new ArrayList<>();
//       String lista= "Ha ocurrido un error";
//   
//    
//    out.print(listas.toString());
//Prueba 2
MultiCliente m = new MultiCliente();
//String a= " a ";
//String g= m.registrarCliente(a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a);
//out.println(g);
out.println(m.modificarCliente(1, "test", "23122321"));

    }

}
