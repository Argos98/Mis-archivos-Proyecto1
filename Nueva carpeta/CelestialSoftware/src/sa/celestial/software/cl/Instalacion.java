/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sa.celestial.software.cl;

import java.time.LocalDateTime;

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
    private Tarea tTarea;
     private String codigo;

    public Instalacion() {
    }

    public Instalacion(LocalDateTime fecha, Cliente cCliente, Producto pProducto, int estado, String version, Tarea tTarea, String codigo) {
        this.fecha = fecha;
        this.cCliente = cCliente;
        this.pProducto = pProducto;
        this.estado = estado;
        this.version = version;
        this.tTarea = tTarea;
        this.codigo = codigo;
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

    public Tarea gettTarea() {
        return tTarea;
    }

    public void settTarea(Tarea tTarea) {
        this.tTarea = tTarea;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
     
    
     
     
     
}
