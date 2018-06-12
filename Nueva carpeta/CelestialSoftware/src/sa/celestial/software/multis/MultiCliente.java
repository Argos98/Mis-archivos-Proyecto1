/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sa.celestial.software.multis;

import CapaAccesoBD.Conector;
import java.sql.ResultSet;
import java.util.ArrayList;
import sa.celestial.software.clases.Cliente;
import sa.celestial.software.clases.Contacto;

/**
 *
 * @author Osvaldo Salazar
 */
public class MultiCliente {
    // El cliente se registra , modifica y se lista 

    public String registrarCliente(String razonSocial, String cedulaJuridica, String ubicacion, String telefono, String direccion, String identificacion, String nombreCompleto, String puestoDesempena, String informacionContacto, String telefonoContacto, String correoElectronico, String logo, String tipo, String identificacion2, String nombreCompleto2, String puestoDesempena2, String informacionContacto2, String telefonoContacto2, String correoElectronico2, String logo2, String tipo2) {

        String mensaje = "";
        try {
            String sentencia =
                     "    INSERT INTO contacto (identificacion, nombreCompleto, puestoDesempena, informacionContacto, telefono, correoElectonico, logo, cedulaJuridica)\n"
                    + "    VALUES (' " + identificacion + " ',  ' " + nombreCompleto + " ', ' " + puestoDesempena + " ', ' " + informacionContacto + " ', ' " + telefonoContacto + " ', ' " + correoElectronico + "  ', ' " + logo + " ' , ' " + cedulaJuridica + " ')\n"
                    + "\n"
                         + "    INSERT INTO contacto (identificacion, nombreCompleto, puestoDesempena, informacionContacto, telefono, correoElectonico, logo, cedulaJuridica)\n"
                    + "    VALUES (' " + identificacion2 + " ',  ' " + nombreCompleto2 + " ', ' " + puestoDesempena2 + " ', ' " + informacionContacto + " ', ' " + telefonoContacto + " ', ' " + correoElectronico + "  ', ' " + logo + " ' , ' " + cedulaJuridica + " ')\n"
                    + "\n"
                    + "	\n"
                    + "	INSERT INTO cliente ( razonSocial, cedulaJuridica, ubicacion, telefono, direccion)\n"
                    + "	VALUES (' " + razonSocial + "   ', ' " + cedulaJuridica + " ', '  " + ubicacion + " ', ' " + telefono + " ', ' " + direccion+ " '  )\n "
                    
                  ;
            Conector.getConector().ejecutarSQL(sentencia);
mensaje="Se registro con exito";
        } catch (Exception e) {
            mensaje = e.getMessage();

        }

        return mensaje;

    }

    public String modificarCliente(int opcion, String datoModificado, String cedulaJuridica) {

        String modificar = "";
        String mensaje = "";
        String sentencia = "";

        switch (opcion) {
            case 1:
                modificar = "razonSocial";
                break;
            case 2:
                modificar = "cedulaJuridica";
                break;
            case 3:
                modificar = "ubicacion";
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

                modificar = "correoeletronico";
                break;
            case 11:

                modificar = "imagen";
                break;
            case 12:

                modificar = "tipo";
                break;
            default:
                mensaje = "Intente nuevamente";
                opcion = 0;
                break;
        }// Fin de switch
        int eleccion;

        if (opcion != 0) {// Este If es para evitar que el programa entre  a la base de datos si el dato esta erroneo, lo logra haciendo quie la opcion sea 0 si el usuario digita un numero incorrecto

            if (opcion >= 1 && opcion < 5) {// Este if es para poder saber de quien se esta modificando el dato ( si es directamnete uno del Clienet o del Contacto)

                sentencia = "UPDATE Cliente \n "
                        + "SET " + modificar + "= '" + datoModificado + "'\n "
                        + "WHERE cedulaJuridica = '" + cedulaJuridica + "' \n" ;
            } else {
                if (opcion > 5 && opcion <= 12) {
                    eleccion = 2;

                    sentencia = "UPDATE contacto \n "
                            + "SET " + modificar + "= ' " + datoModificado + " '\n "
                            + "WHERE identificacion = ' " + cedulaJuridica + " ' ";

                } else {
                    sentencia = "UPDATE contacto \n "
                            + "SET " + modificar + "= ' " + datoModificado + " '\n "
                            + "WHERE identificacion = ' " + cedulaJuridica + " ' "
                            + "UPDATE cliente \n"
                            + "SET id_contacto = ' " + datoModificado + " ' \n "
                            + "WHERE identificacion = ' " + cedulaJuridica + " ' ";

                }//Fin else

            }

        }//fin de if
        else {

            mensaje = "Intente nuevamente";

        }
        
        
        
try {
        Conector.getConector().ejecutarSQL(sentencia);
        mensaje= "Se realizo cambio con exito";
}
 catch(Exception e){
 
     mensaje=" Ha ocurrido un error: "+ e.getMessage()+"";
     
 }       
        
        
        
        return mensaje;
    }//Fin de metodo modificar

    public ArrayList listar(){
        ArrayList<Cliente> listas = new ArrayList<>();
        String sentencia = "SELECT * \n"
                + "  FROM [BD_proyecto].[dbo].[cliente] as c \n "
                + " INNER JOIN contactos as co \n"
                + "ON c.cedulaJuridica = co.cedulaJuridica ";
     try{
        ResultSet a = Conector.getConector().ejecutarSQL(sentencia, true);

        while (a.next()) {

          //  Contacto cContacto = new Contacto(a.getString(" identificacion  "), a.getString("nombreCompleto "), a.getString("puestoDesempena"), a.getString("informacionContacto"), a.getString("telefono"), a.getString("correoEletronico"), a.getString("tipo"));
            Cliente miCliente = new Cliente(a.getString("razonSocial"), a.getString("cedulaJuridica"), a.getString("ubicacion"), a.getString("telefono"), a.getString("logo"), a.getString("direccion"));

            listas.add(miCliente);

        }
                
     }
     catch(Exception e){
     
        String lista= "Ha ocurrido un error"+ e+"";
  
     }
     
     
     
        return listas;

    }

}
