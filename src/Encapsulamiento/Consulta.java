/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encapsulamiento;

/**
 *
 * @author jmcito
 */
public class Consulta {
    
    int Id;
    String Titulo;
    String Descripcion;
    String Fecha;
    Paciente nombre;
    Medico Mnombre;

    public Consulta(int Id, String Titulo, String Descripcion, String Fecha, Paciente nombre, Medico Mnombre) {
        this.Id = Id;
        this.Titulo = Titulo;
        this.Descripcion = Descripcion;
        this.Fecha = Fecha;
        this.nombre = nombre;
        this.Mnombre = Mnombre;
    }

    public Consulta() {
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public Paciente getNombre() {
        return nombre;
    }

    public void setNombre(Paciente nombre) {
        this.nombre = nombre;
    }

    public Medico getMnombre() {
        return Mnombre;
    }

    public void setMnombre(Medico Mnombre) {
        this.Mnombre = Mnombre;
    }
    
    
    
}
