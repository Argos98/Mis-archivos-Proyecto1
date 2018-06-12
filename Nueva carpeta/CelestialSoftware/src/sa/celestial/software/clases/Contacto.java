/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sa.celestial.software.clases;

import javafx.scene.image.Image;

 


/**
 *
 * @author Osvaldo Salazar
 */
public class Contacto {
    String identificacion;
    String nombreCompleto;
    String nombreDesempena;
    String informacionContacto;
    String telefono;
    String correoElectronico;
    String tipo;

    public Contacto() {
    }

    public Contacto(String identificacion, String nombreCompleto, String nombreDesempena, String informacionContacto, String telefono, String correoElectronico, String tipo) {
        this.identificacion = identificacion;
        this.nombreCompleto = nombreCompleto;
        this.nombreDesempena = nombreDesempena;
        this.informacionContacto = informacionContacto;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
        this.tipo = tipo;
    }

    
    
  

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getNombreDesempena() {
        return nombreDesempena;
    }

    public void setNombreDesempena(String nombreDesempena) {
        this.nombreDesempena = nombreDesempena;
    }

    public String getInformacionContacto() {
        return informacionContacto;
    }

    public void setInformacionContacto(String informacionContacto) {
        this.informacionContacto = informacionContacto;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

   
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Contacto{" + "identificacion=" + identificacion + ", nombreCompleto=" + nombreCompleto + ", nombreDesempena=" + nombreDesempena + ", informacionContacto=" + informacionContacto + ", telefono=" + telefono + ", correoElectronico=" + correoElectronico + ", tipo=" + tipo + '}';
    }
    
    
}
