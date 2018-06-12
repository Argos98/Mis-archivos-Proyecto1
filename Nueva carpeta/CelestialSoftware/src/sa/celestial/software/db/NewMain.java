/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sa.celestial.software.db;

import  java.io.*;
import static java.lang.System.out;


public class NewMain {

    static BufferedReader in= new BufferedReader( new InputStreamReader( System.in));
    
 static Conexion co= new Conexion();
    public static void main(String[] args) throws IOException {
        out.println("Digite el nombre del producto");
        String nombreProducto= in.readLine();
        
        out.println("Digite el codigo del producto");
        String codigo= in.readLine();
        
        out.println("Digite la descripopcion del producto");
        String descripcion= in.readLine();
        co.registrarProducto(nombreProducto, codigo, descripcion);
        
        out.print(co.registrarProducto(nombreProducto, codigo, descripcion));
                
    }
    
}
