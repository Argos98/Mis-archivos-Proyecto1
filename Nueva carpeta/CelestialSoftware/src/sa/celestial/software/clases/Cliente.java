/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sa.celestial.software.clases;

import java.util.ArrayList;


/**
 *
 * @author Osvaldo Salazar
 */
public class Cliente {
 private   String razonSocial;
 private String  cedulaJuridica;
 private String ubicacion;
 private String direccion;
 private ArrayList <String> telefonos= new ArrayList<>();
 private String logo;
private ArrayList  <Contacto> miContacto=new ArrayList();
    public Cliente() {
    }

    public Cliente(String razonSocial, String cedulaJuridica, String ubicacion, String direccion, String logo) {
        this.razonSocial = razonSocial;
        this.cedulaJuridica = cedulaJuridica;
        this.ubicacion = ubicacion;
        this.direccion = direccion;
        this.logo = logo;
    }

   

 

       
    
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }



    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
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

    public ArrayList<String> getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(ArrayList<String> telefonos) {
        this.telefonos = telefonos;
    }

    public ArrayList<Contacto> getMiContacto() {
        return miContacto;
    }

    public void setMiContacto(ArrayList<Contacto> miContacto) {
        this.miContacto = miContacto;
    }

    @Override
    public String toString() {
        return "Cliente{" + "razonSocial=" + razonSocial + ", cedulaJuridica=" + cedulaJuridica + ", ubicacion=" + ubicacion + ", direccion=" + direccion + ", telefonos=" + telefonos + ", logo=" + logo + ", miContacto=" + miContacto + '}';
    }

   

 
 
}
