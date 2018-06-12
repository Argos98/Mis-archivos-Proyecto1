/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sa.celestial.software.clases;

/**
 *
 * @author Osvaldo Salazar
 */
public class Tarea {

    private String tipo;
    private String codigo;
    private String descripcion;
    private String estado;
    private String responsable;

    public Tarea() {
    }

    public Tarea(String tipo, String codigo, String descripcion, String estado, String responsable) {
        this.tipo = tipo;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.estado = estado;
        this.responsable = responsable;
    }

    
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }
}
