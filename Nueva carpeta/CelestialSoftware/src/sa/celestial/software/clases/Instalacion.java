/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sa.celestial.software.clases;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author Osvaldo Salazar
 */
public class Instalacion {
   private LocalDateTime fecha;
   private Cliente cCliente;
   private Producto pProducto;
   private int estado;
    private String version;
    private ArrayList <Tarea> miTarea= new ArrayList<>();


    public Instalacion() {
    }

    public Instalacion(LocalDateTime fecha, Cliente cCliente, Producto pProducto, int estado, String version) {
        this.fecha = fecha;
        this.cCliente = cCliente;
        this.pProducto = pProducto;
        this.estado = estado;
        this.version = version;
    }



    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public Cliente getcCliente() {
        return cCliente;
    }

    public void setcCliente(Cliente cCliente) {
        this.cCliente = cCliente;
    }

    public Producto getpProducto() {
        return pProducto;
    }

    public void setpProducto(Producto pProducto) {
        this.pProducto = pProducto;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public ArrayList<Tarea> getMiTarea() {
        return miTarea;
    }

    public void setMiTarea(ArrayList<Tarea> miTarea) {
        this.miTarea = miTarea;
    }

    

  
    
     
     
     
}
