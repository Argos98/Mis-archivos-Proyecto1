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
public class Cliente {
    String razonSocial;
  String  cedulaJuridica;
 String ubicacion;
 String telefono;
  Image logo;
Contacto cContacto;
    public Cliente() {
    }

    public Cliente(String razonSocial, String cedulaJuridica, String ubicacion, String telefono, Image logo, Contacto cContacto) {
        this.razonSocial = razonSocial;
        this.cedulaJuridica = cedulaJuridica;
        this.ubicacion = ubicacion;
        this.telefono = telefono;
        this.logo = logo;
        this.cContacto = cContacto;
    }

    

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getCedulaJuridica() {
        return cedulaJuridica;
    }

    public void setCedulaJuridica(String cedulaJuridica) {
        this.cedulaJuridica = cedulaJuridica;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
 
 
}
