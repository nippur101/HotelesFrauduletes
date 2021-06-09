package sample.back;

import java.io.Serializable;
import java.time.LocalDate;

public class Consumo implements Serializable {

    ///Atributos
    private int id;
    private LocalDate fechaConsumo;
    private String detalleConsumo;
    private double monto;
    private double pagoConsumo;
    private static int contadorConsumos = 0; ///Para generar el ID único

    ///Constructor
    ///El recepcionista genera el Consumo, y luego registra su pago.
    public Consumo(LocalDate fechaConsumo, String detalleConsumo, double monto, double pagoConsumo) {
        contadorConsumos++;
        this.id = contadorConsumos;
        this.fechaConsumo = fechaConsumo;
        this.detalleConsumo = detalleConsumo;
        this.monto = monto;
        this.pagoConsumo = pagoConsumo;
    }

    ///Metodos
    /// Getters and Setters

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getFechaConsumo() {
        return fechaConsumo;
    }
    public void setFechaConsumo(LocalDate fechaConsumo) {
        this.fechaConsumo = fechaConsumo;
    }

    public String getDetalleConsumo() {
        return detalleConsumo;
    }
    public void setDetalleConsumo(String detalleConsumo) {
        this.detalleConsumo = detalleConsumo;
    }

    public double getMonto() {
        return monto;
    }
    public void setMonto(double monto) {
        this.monto = monto;
    }

    public double getPagoConsumo() {
        return pagoConsumo;
    }
    public void setPagoConsumo(double pagoConsumo) {
        this.pagoConsumo = pagoConsumo;
    }

    public static int getContadorConsumos() {
        return contadorConsumos;
    }
    public static void setContadorConsumos(int contadorConsumos) {
        Consumo.contadorConsumos = contadorConsumos;
    }

    @Override
    public String toString() {
        return "Consumo{" +
                "id=" + id +
                ", fechaConsumo=" + fechaConsumo +
                ", detalleConsumo='" + detalleConsumo + '\'' +
                ", monto=" + monto +
                ", pagoConsumo=" + pagoConsumo +
                '}';
    }
}
