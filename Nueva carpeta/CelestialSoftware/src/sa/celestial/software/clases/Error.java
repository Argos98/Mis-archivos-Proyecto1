/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sa.celestial.software.clases;

import java.time.LocalDate;


public class Error {
     private String descripcion;
      private LocalDate fechaReporte;

    public Error() {
    }

    public Error(String descripcion, LocalDate fechaReporte) {
        this.descripcion = descripcion;
        this.fechaReporte = fechaReporte;
    }

   
      
      
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFechaReporte() {
        return fechaReporte;
    }

    public void setFechaReporte(LocalDate fechaReporte) {
        this.fechaReporte = fechaReporte;
    }

  
    
      
    
}
