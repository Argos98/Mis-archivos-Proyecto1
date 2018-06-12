/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sa.celestial.software.clases;

import java.time.LocalDate;
import java.util.ArrayList;


public class Version {
     private String formato;
  private  LocalDate fechaDeCreacion;
     private ArrayList <Error> miError = new ArrayList<>();
     private ArrayList <Mejora> miMejora= new ArrayList<>();

    public Version() {
    }

    public Version(String formato, LocalDate fechaDeCreacion) {
        this.formato = formato;
        this.fechaDeCreacion = fechaDeCreacion;
    }

   

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public LocalDate getFechaDeCreacion() {
        return fechaDeCreacion;
    }

    public void setFechaDeCreacion(LocalDate fechaDeCreacion) {
        this.fechaDeCreacion = fechaDeCreacion;
    }

    public ArrayList<Error> getMiError() {
        return miError;
    }

    public void setMiError(ArrayList<Error> miError) {
        this.miError = miError;
    }

    public ArrayList<Mejora> getMiMejora() {
        return miMejora;
    }

    public void setMiMejora(ArrayList<Mejora> miMejora) {
        this.miMejora = miMejora;
    }

    

     
}
