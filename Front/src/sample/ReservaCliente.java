package sample;

import java.time.LocalDate;

public class ReservaCliente {
    private Integer nroHabitacion;
    private String fechaIngreso;
    private String fechaEgreso;
    private Double abono;

    public ReservaCliente() {
    }

    public ReservaCliente(Integer nroHabitacion, String fechaIngreso, String fechaEgreso, Double abono) {
        this.nroHabitacion = nroHabitacion;
        this.fechaIngreso = fechaIngreso;
        this.fechaEgreso = fechaEgreso;
        this.abono = abono;
    }

    public Integer getNroHabitacion() {
        return nroHabitacion;
    }

    public void setNroHabitacion(Integer nroHabitacion) {
        this.nroHabitacion = nroHabitacion;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getFechaEgreso() {
        return fechaEgreso;
    }

    public void setFechaEgreso(String fechaEgreso) {
        this.fechaEgreso = fechaEgreso;
    }

    public Double getAbono() {
        return abono;
    }

    public void setAbono(Double abono) {
        this.abono = abono;
    }

    @Override
    public String toString() {
        return "ReservaCliente{" +
                "nroHabitacion=" + nroHabitacion +
                ", fechaIngreso='" + fechaIngreso + '\'' +
                ", fechaEgreso='" + fechaEgreso + '\'' +
                ", abono=" + abono +
                '}';
    }
}
