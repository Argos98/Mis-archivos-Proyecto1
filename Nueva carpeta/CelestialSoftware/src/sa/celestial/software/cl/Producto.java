/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sa.celestial.software.cl;

import javafx.scene.image.Image;

/**
 *
 * @author Osvaldo Salazar
 */
public class Producto {
    private String nombreProducto;
    private Image logo;
      private String descripcion;
      private  Version vVersion;
       private String codigo;

    public Producto() {
    }

    public Producto(String nombreProducto, Image logo, String descripcion, Version vVersion, String codigo) {
        this.nombreProducto = nombreProducto;
        this.logo = logo;
        this.descripcion = descripcion;
        this.vVersion = vVersion;
        this.codigo = codigo;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public Image getLogo() {
        return logo;
    }

    public void setLogo(Image logo) {
        this.logo = logo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Version getvVersion() {
        return vVersion;
    }

    public void setvVersion(Version vVersion) {
        this.vVersion = vVersion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
       
       
      
}
