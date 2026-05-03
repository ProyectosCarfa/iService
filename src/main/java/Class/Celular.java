/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author Kendrick
 */
public class Celular implements Comparable<Celular>{
    private byte id;
    private String tipo;
    private String marca;
    private String modelo;
    private String imei;
    private byte idCliente;
    private String fechaIngreso;
    private String estado;

    public Celular() {
    }
    
    public Celular(byte id, String tipo, String marca, String modelo, String imei, byte idCliente, String fechaIngreso, String estado) {
        this.id = id;
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
        this.imei = imei;
        this.idCliente = idCliente;
        this.fechaIngreso = fechaIngreso;
        this.estado = estado;
    }

    
    
    
    public byte getId() {
        return id;
    }

    public void setId(byte id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public byte getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(byte idCliente) {
        this.idCliente = idCliente;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "\n"+id + "    |   " + tipo + "    |   " + marca + "    |   " + modelo + "    |   " + imei + "    |   " + idCliente + "    |   " + fechaIngreso + "    |   " + estado;
    }

    @Override
    public int compareTo(Celular o) {

        return Byte.compare(this.id, o.id);
    }
    
    
    
}
