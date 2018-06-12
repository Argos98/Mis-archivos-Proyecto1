/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sa.celestial.software.clases;

import java.util.ArrayList;
import javafx.scene.image.Image;

/**
 *
 * @author Osvaldo Salazar
 */
public class Producto {
    private String nombreProducto;
    private String logo;
      private String descripcion;
      private  ArrayList <Version> version= new ArrayList <>();
      private String vActual;
   

    public Producto() {
    }

    public Producto(String nombreProducto, String logo, String descripcion, String vActual) {
        this.nombreProducto = nombreProducto;
        this.logo = logo;
        this.descripcion = descripcion;
        this.vActual = vActual;
    }

   

    

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public ArrayList<Version> getVersion() {
        return version;
    }

    public void setVersion(ArrayList<Version> version) {
        this.version = version;
    }

    public String getvActual() {
        return vActual;
    }

    public void setvActual(String vActual) {
        this.vActual = vActual;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombreProducto=" + nombreProducto + ", logo=" + logo + ", descripcion=" + descripcion + ", version=" + version + ", vActual=" + vActual + '}';
    }

      
}
