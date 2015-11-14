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
public class Paciente {

    int Id;
    int Expediente;
    String Nombre;
    String Apellido;
    String Direccion;
    String FechaEntrada;
    String Activo;

    public Paciente() {
    }

    public Paciente(int Id, int Expediente, String Nombre, String Apellido, String Direccion, String FechaEntrada, String Activo) {
        this.Id = Id;
        this.Expediente = Expediente;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Direccion = Direccion;
        this.FechaEntrada = FechaEntrada;
        this.Activo = Activo;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getExpediente() {
        return Expediente;
    }

    public void setExpediente(int Expediente) {
        this.Expediente = Expediente;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getFechaEntrada() {
        return FechaEntrada;
    }

    public void setFechaEntrada(String FechaEntrada) {
        this.FechaEntrada = FechaEntrada;
    }

    public String getActivo() {
        return Activo;
    }

    public void setActivo(String Activo) {
        this.Activo = Activo;
    }
    
    
}
