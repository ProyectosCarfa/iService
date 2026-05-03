/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import java.util.Comparator;

/**
 *
 * @author Kendrick
 */
public class Reparaciones implements Comparable<Reparaciones> {

    private byte id;
    private byte idCelular;
    private String diagnostico;
    private String reparacion;
    private double costo;
    private String fechaInicio;
    private String fechaFin;
    private String descripcion;
    private byte tecnico;

    public Reparaciones() {
    }

    public Reparaciones(byte id, byte idCelular, String diagnostico, String reparacion, double costo, String fechaInicio, String fechaFin, String descripcion, byte tecnico) {
        this.id = id;
        this.idCelular = idCelular;
        this.diagnostico = diagnostico;
        this.reparacion = reparacion;
        this.costo = costo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.descripcion = descripcion;
        this.tecnico = tecnico;
    }

    public byte getId() {
        return id;
    }

    public void setId(byte id) {
        this.id = id;
    }

    public byte getIdCelular() {
        return idCelular;
    }

    public void setIdCelular(byte idCelular) {
        this.idCelular = idCelular;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getReparacion() {
        return reparacion;
    }

    public void setReparacion(String reparacion) {
        this.reparacion = reparacion;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public byte getTecnico() {
        return tecnico;
    }

    public void setTecnico(byte tecnico) {
        this.tecnico = tecnico;
    }

    @Override
    public String toString() {
        return "\n" + id + "        |        " + idCelular + "        |\t" + diagnostico + "\t|\t" + reparacion + "\t|\t" + costo + "\t|\t" + fechaInicio + "\t|\t" + fechaFin + "\t|\t" + descripcion + "\t|\t" + tecnico;
    }

    @Override
    public int compareTo(Reparaciones o) {
        return COMPARING.compare(this, o);
    }
    public static final Comparator<Reparaciones> COMPARING = Comparator.comparing(Reparaciones :: getId);

}
