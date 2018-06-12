/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sa.celestial.software.cl;

import java.time.LocalDate;


public class Version {
     private String formato;
  private  LocalDate fechaDeCreacion;
     private Error eError;
     private Mejora mMejora;

    public Version() {
    }

    public Version(String formato, LocalDate fechaDeCreacion, Error eError, Mejora mMejora) {
        this.formato = formato;
        this.fechaDeCreacion = fechaDeCreacion;
        this.eError = eError;
        this.mMejora = mMejora;
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

    public Error geteError() {
        return eError;
    }

    public void seteError(Error eError) {
        this.eError = eError;
    }

    public Mejora getmMejora() {
        return mMejora;
    }

    public void setmMejora(Mejora mMejora) {
        this.mMejora = mMejora;
    }
     
     
     
}
