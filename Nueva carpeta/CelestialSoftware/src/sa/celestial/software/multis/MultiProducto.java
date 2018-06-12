/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sa.celestial.software.multis;

import CapaAccesoBD.Conector;

import java.sql.ResultSet;

import java.time.LocalDate;

import java.util.ArrayList;
import sa.celestial.software.clases.*;



/**
 *
 * @author Osvaldo Salazar
 */
public class MultiProducto {

    public String registrarProducto(String nombreProducto, String logo, String codigo, String descripcionProducto, int dia, int mes, int anno, String formato) {
      String mensaje;
        
        LocalDate fechaReporte = LocalDate.of(anno, mes, dia);

        String sentencia = "   INSERT INTO version (formato, fechaDeCreacion)\n"
                + "VALUES (' " + formato + " ', ' " + fechaReporte + " ')\n"
                + "\n"
                + "INSERT INTO producto  (codigo, nombreProducto, logo, descripcion,  versionActual)\n"
                + "Values ( ' "+ codigo+" ', ' "+ nombreProducto+ " ', ' "+logo+" ', ' "+ descripcionProducto+" ' "+formato+" ' '')\n"
                + "\n"
                + "DECLARE @cod VARCHAR (50)= (SELECT codigo\n"
                + "FROM producto \n"
                + "WHERE codigo = '"+codigo+"')\n"
                + "\n"
                + "DECLARE @a INT = (SELECT MAX (id_version)FROM version)\n"
                + "\n"
                + "INSERT INTO version_por_producto (codigo_producto, id_version )\n"
                + "VALUES (@cod, @a)   ";
        try {
             Conector.getConector().ejecutarSQL(sentencia);
             mensaje=" Se inserto perfectamente";
        } catch (Exception e) {
            
            mensaje = "Ha ocurrido un error: "+ e.getMessage();
            
        }
       
        return mensaje;
        
        
    }

    public String modificarProducto(int opcion, String datoModificado, String codigo, String referencia){

        String modificar = "";
        String mensaje = "";
        String sentencia = "";
        switch (opcion) {
            case 1:
                modificar = "nombreProductol";
                break;
            case 2:
                modificar = "logo";
                break;
            case 3:
                modificar = "descripcion";
                break;
            case 4:
                modificar = "vVersion";
                break;
            case 5:
                modificar = "versionActual";
                break;
            case 6:
                modificar = "codigo";
                break;
            case 7:

                modificar = "formato";
                break;
            case 8:

                modificar = "fechaDeCreacion";
                break;
            case 9:

                modificar = "mMejora";
                break;
            case 10:

                modificar = "descripcion";
                break;
            case 11:

                modificar = "fechaDeReporte";
                break;
            default:
                mensaje = "Intente nuevamente";
                opcion = 0;
                break;
        }// Fin de switch

        if (opcion != 0) {// Este If es para evitar que el programa entre  a la base de datos si el dato esta erroneo, lo logra haciendo quie la opcion sea 0 si el usuario digita un numero incorrecto

            if (opcion >= 1 && opcion < 7) {// Este if es para poder saber de quien se esta modificando el dato ( si es directamnete uno del Clienet o del Contacto)

                sentencia = "UPDATE producto \n "
                        + "SET " + modificar + "= ' " + datoModificado + " '\n "
                        + "WHERE codigo = ' " + codigo + " ' ";
            } else {
                if (opcion >= 7 && opcion <= 8) {

                    sentencia = "   UPDATE version\n"
                            + "       SET formato = ' " + datoModificado + " '   \n"
                            + "  FROM version as v  \n"
                            + " \n"
                            + "  INNER JOIN version_por_producto as vp \n"
                            + " ON v.id_version = vp.id_version AND  formato = ' " + referencia + " '\n"
                            + "\n"
                            + " INNER JOIN producto as p\n"
                            + "\n"
                            + " ON vp.codigo_producto = ' " + codigo + " '   ";

                } else {
                    if (opcion == 9) {
                        sentencia = " UPDATE mejora\n"
                                + "  SET descripcion = ' " + datoModificado + " '\n"
                                + "  FROM mejora as m\n"
                                + "INNER JOIN mejora_por_version as mv\n"
                                + "ON m.id_mejora= mv.id_mejora\n"
                                + "  INNER JOIN version as v\n"
                                + "  ON v.id_version= mv.id_version AND v.formato = '"+referencia+"'\n"
                                + "  INNER JOIN version_por_producto as vp\n"
                                + "  ON vp.id_version_por_producto = v.id_version AND codigo_producto = ' "+codigo+" ' ";
                    }else{
                        if(opcion== 10){
                      sentencia=  " UPDATE error\n"
                                + "  SET descripcion = ' " + datoModificado + " '\n"
                                + "  FROM error as e\n"
                                + "INNER JOIN error_por_version as ev\n"
                                + "ON e.id_error= ev.id_error\n"
                                + "  INNER JOIN version as v\n"
                                + "  ON v.id_version= ev.id_error_version AND v.formato = '"+referencia+"'\n"
                                + "  INNER JOIN version_por_producto as vp\n"
                                + "  ON vp.id_version_por_producto = v.id_version AND codigo_producto = 'b'     ";
                        
                        
                    }else{
                            if (opcion==11){
                             sentencia=  " UPDATE error\n"
                                + "  SET fechaDeReporte = ' " + datoModificado + " '\n"
                                + "  FROM error as e\n"
                                + "INNER JOIN error_por_version as ev\n"
                                + "ON e.id_error= ev.id_error\n"
                                + "  INNER JOIN version as v\n"
                                + "  ON v.id_version= ev.id_error_version AND v.formato = ' "+referencia+" '\n"
                                + "  INNER JOIN version_por_producto as vp\n"
                                + "  ON vp.id_version_por_producto = v.id_version AND codigo_producto = 'b'     ";
                            
                            }
                                    
                            
                        }
                    
                    }
                }

            }

        }//fin de if
        else {

          
            mensaje = "Intente nuevamente";

        }
        try {
           Conector.getConector().ejecutarSQL(sentencia); 
        } catch (Exception e) {
            
            mensaje= "Ocurrio un error:"+e;
            
        }
         
return mensaje;
    }//Fin de modificar
    
     public String eliminar(String codigo)
        {
            String mensaje;
          String  sentencia= " DELETE producto"
                    + "FROM producto as p"
                    + "WHERE p.codigo = '"+codigo+" ' " ;
       
            try {
                Conector.getConector().ejecutarSQL(sentencia);  
                mensaje= "Se elimino con exito";
            } catch (Exception e) {
                mensaje= "Ha ocurrido un error: "+e;
            }
        
            return mensaje;
        }
    
    
    public ArrayList listar () {
    
   String sentencia=  "   SELECT *\n" +
"      FROM producto as p \n" +
"            INNER JOIN version_por_producto as vp \n" +
"            ON vp.codigo_producto= p.codigo \n" +
"           INNER JOIN version as v \n" +
"            ON v.id_version= vp.id_version \n" +
"           INNER JOIN mejora_por_version as mv\n" +
"          ON mv.id_version = v.id_version \n" +
"           INNER JOIN mejora as m\n" +
"            ON m.id_mejora= mv.id_mejora \n" +
"            INNER JOIN error_de_version as ev\n" +
"            ON v.id_version =  ev.id_version\n" +
"          INNER JOIN error as e\n" +
"           ON ev.id_error = e.id_error ";
     
    ArrayList <Producto> lista = new ArrayList<Producto>();
   try{
   ResultSet rs = Conector.getConector().ejecutarSQL(sentencia, true);
     while (rs.next()){
       int dia= rs.getDate("fechaReporte").getDay();
         int mes= rs.getDate("fechaReporte").getMonth();
           int anno= rs.getDate("fechaReporte").getYear();
  LocalDate f= LocalDate.of(anno, mes, dia);
  Error eError = new Error(rs.getString("descripcion"), f);

       int diaF= rs.getDate("fechaDeCreacion").getDay();
         int mesF= rs.getDate("fechaDeCreacion").getMonth();
           int annoF= rs.getDate("fechaDeCreacione").getYear();
  LocalDate fC= LocalDate.of(annoF, mesF, diaF);    
          
   Mejora mMejora= new Mejora(rs.getString("mejora"));
       Version v= new Version(rs.getString("formato"),  fC, eError, mMejora);
       Producto p= new Producto(rs.getString("nombreProducto"), rs.getString("logo"), rs.getString( "descripcion"), v, v, rs.getString("codigo"));
      lista.add(p);
   }
   
   }catch(Exception e){
   String mensaje= e.getMessage();
      
   }

        return lista ;
    
    
    }
    
    
}