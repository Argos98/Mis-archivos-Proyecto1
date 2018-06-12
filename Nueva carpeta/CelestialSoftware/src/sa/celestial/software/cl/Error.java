/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sa.celestial.software.cl;


public class Error {
     private String descripcion;
      private String fechaReporte;

    public Error() {
    }

    public Error(String descripcion, String fechaReporte) {
        this.descripcion = descripcion;
        this.fechaReporte = fechaReporte;
    }

      
      
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFechaReporte() {
        return fechaReporte;
    }

    public void setFechaReporte(String fechaReporte) {
        this.fechaReporte = fechaReporte;
    }
    
      
    
}
