
package sa.celestial.software.multis;

import CapaAccesoBD.Conector;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import javafx.util.converter.LocalDateTimeStringConverter;
import sa.celestial.software.clases.Cliente;
import sa.celestial.software.clases.Contacto;
import sa.celestial.software.clases.Instalacion;
import sa.celestial.software.clases.Producto;
import sa.celestial.software.clases.Version;


public class MultiInstalacion {

    public void RegistrarInstalacion(int dia, int mes, int anno, int hora, int minutos, String cedulaJuridica, String codigo,String estado, String version) {
        LocalDateTime t = LocalDateTime.of(anno, mes, dia, hora, minutos);
       String mensaje;
        
        String secuencia = " INSERT INTO [dbo].[instalacion]\n" +
"           ([fecha]\n" +
"           ,[estado]\n" +
"           ,[version]\n" +
"           ,[tTarea])\n" +
"     VALUES\n" +
"           ( ' "+ t + " ' \n" +
"           ,"+estado+" '\n " +
"           ,"+ version+"\n" ;

        try {
            mensaje= "Se inserto correctamente";
            Conector.getConector().ejecutarSQL(secuencia);
        } catch (Exception e) {
            mensaje= "hubo un error"+ e;
        }
        
    }

    public void modificarInstalacion(int opcion, String datoModificado, String id, String referencia) 
    {
// La opcion la elige el usuario mediante un menu en la UI, datoModificado, el dato que ingresa dato por el usuario, id y referencia Son para identificar a quien se le hacen los cambio

        String modificar = "";
        String mensaje = "";
        String sentencia = "";
        switch (opcion) {
            case 1:
                modificar = "fecha";
                break;
            case 2:
                modificar = "estado";
                break;
            case 3:
                modificar = "id_cliente";
                break;
            case 4:
                modificar = "version";
                break;
            case 5:

                modificar = "id_producto";
                break;

            default:
                mensaje = "Intente nuevamente";
                opcion = 0;
                break;
        }// Fin de switch

        if (opcion != 0) 
        {
//                                                    Codigo sin utilizar, lo dejo en caso de que sea necesario luego
//int dia=0;
//int mes=0;
//int anno=0;
//            
//            String sentenciaR = "SELECT fecha FROM instalacion as i \n"
//                    + " INNER JOIN  instalacion_por_cliente as ic \n"
//                    + "ON ic.id_cliente = '" + id + " ' ";
//
//            ResultSet rs = Conector.getConector().ejecutarSQL(sentenciaR, true);
//
//            while (rs.next()) {
//                 dia = rs.getDate(modificar).getDay();
//                mes = rs.getDate(modificar).getMonth();
//                anno = rs.getDate(modificar).getYear();
//
//            }

            if (opcion == 1 || opcion == 2 || opcion == 4)
            {
                sentencia = "UPDATE instalacion\n"
                        + "SET " + modificar + " =' " + datoModificado + " '  \n"
                        + " INNER JOIN  instalacion_por_cliente as ic\n"
                        + " ON ic.id_cliente = '" + id + " ' \n"
                        + "INNER JOIN instalacion_por_producto as ipp\n"
                        + "ON ipp.id_producto= ' " + referencia + " ' ";

            } else 
            {
                if (opcion == 3) 
                {
                    sentencia = "UPDATE instalacion_por_cliente \n"
                            + "SET " + modificar + " = ' " + datoModificado + " ' \n"
                            + "WHERE id_cliente= ' " + id + " ' ";
                    //Falta meterle otro parametro para identificar mejor 
                } 
                else 
                {
                    if (opcion == 5) 
                    {
                        sentencia = "UPDATE instalacion_por_producto \n"
                                + "SET " + modificar + " = ' " + datoModificado + " ' \n"
                                + "WHERE id_producto= ' " + id + " ' ";
                        //Falta meterle otro parametro para identificar mejor 
                    }
                }

            }
        }

    }
    
    public ArrayList listar(String cedulaJuridica, String nombreProducto)
    {
    
        ArrayList<Instalacion> lista = new ArrayList<Instalacion>();
        
        String sentencia= " SELECT * FROM instalacion as i \n"
                + "INNER JOIN tareas as t ON i.id_instalacion = t.id_id_instalacion \n"
                + "INNER JOIN instalacion_por_cliente as ic ON ic.id_instalacion = i.id_instalacion \n"
                + "INNER JOIN cliente as c ON c.id_cliente = ic.cedulaJuridica \n"
                + "INNER JOIN instalacion_por_producto as ipp ON ipp.id_instalacion= i.id_instalacion\n"
                + "INNER JOIN producto as p ON p.codigo = ipp.id_producto";
      
        
        ResultSet rs;
     try{    
        rs= Conector.getConector().ejecutarSQL(sentencia, true);
     int dia= rs.getDate("fecha").getDay();
             int mes = rs.getDate("fecha").getMonth();
                     int anno= rs.getDate("fecha").getYear();
                             int minutos=  rs.getDate("fecha").getMinutes();
                                     int horas=  rs.getDate("fecha").getHours();
       LocalDateTime t = LocalDateTime.of(anno, mes, dia, horas, minutos);
       Contacto cContacto= new Contacto();
       
         Cliente c = new Cliente(rs.getString("razonSocial"), rs.getString("cedulaJuridica"), rs.getString("ubicacion"), rs.getString("direccion"), rs.getString("telefono"), rs.getString("logo"), cContacto);
         
         
         Version vversion= new Version(sentencia, LocalDate.MIN, eError, mMejora);
       Producto p= new Producto(rs.getString("nombreProducto"), rs.getString("logo"), rs.getString("descripcion"), vVersion, rs.getString("versionActual"), rs.getString("codigo"));
       
     Instalacion i= new Instalacion(t, cCliente, pProducto, 0, sentencia, tTarea);
        
     }
     catch(Exception e){
   String mensaje= e.getMessage();
     }   
        
        
        
    }

}

//Primary key
