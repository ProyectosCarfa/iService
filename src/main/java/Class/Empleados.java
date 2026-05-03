/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import java.util.ArrayList;

/**
 *
 * @author Kendrick
 */
public class Empleados {
    
    
    private byte idEmpleado;
    private String nombres; 
    private String rol; 

    public Empleados() {
    }

    public Empleados(byte idEmpleado, String nombres, String rol) {
        this.idEmpleado = idEmpleado;
        this.nombres = nombres;
        this.rol = rol;
    }

    public byte getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(byte idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        return "UsersEmpleados{" + "idEmpleado=" + idEmpleado + ", nombres=" + nombres + ", rol=" + rol + '}';
    }
    
}
