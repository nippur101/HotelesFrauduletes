package sample;

import java.time.LocalDate;
import java.util.Date;

public class Detalle {
    private String fecha;
    private int cuenta;
    private String nombreCuenta;
    private  int referencia;
    private String descripcion;
    private double cargos;
    private double abono;
    private boolean estado;

    public Detalle() {

    }

    public Detalle(String fecha, int cuenta, String  nombreCuenta, int referencia, String descripcion, double cargos, double abono, boolean estado) {
        this.fecha = fecha;
        this.cuenta = cuenta;
        this.nombreCuenta = nombreCuenta;
        this.referencia = referencia;
        this.descripcion = descripcion;
        this.cargos = cargos;
        this.abono = abono;
        this.estado = estado;
    }

    public String  getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public String getNombreCuenta() {
        return nombreCuenta;
    }

    public void setNombreCuenta(String nombreCuenta) {
        this.nombreCuenta = nombreCuenta;
    }

    public int getReferencia() {
        return referencia;
    }

    public void setReferencia(int referencia) {
        this.referencia = referencia;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getCargos() {
        return cargos;
    }

    public void setCargos(double cargos) {
        this.cargos = cargos;
    }

    public double getAbono() {
        return abono;
    }

    public void setAbono(double abono) {
        this.abono = abono;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
