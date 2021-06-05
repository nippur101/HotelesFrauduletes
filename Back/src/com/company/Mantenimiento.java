package com.company;

import java.time.LocalDate;

public class Mantenimiento {

    ///Atributos
    private int id;
    private int idHabitacion;
    private LocalDate fechaIngreso;
    private LocalDate fechaEgreso;
    private String detalle;
    private static int contadorMantenimiento = 0; ///Para generar el ID único

    ///Cosntructor

    public Mantenimiento() {
    }

    public Mantenimiento(int idHabitacion, LocalDate fechaIngreso, LocalDate fechaEgreso, String detalle) {
        contadorMantenimiento++;
        this.id = contadorMantenimiento;
        this.idHabitacion = idHabitacion;
        this.fechaIngreso = fechaIngreso;
        this.fechaEgreso = fechaEgreso;
        this.detalle = detalle;
    }

    ///Metodos
    ///Getters and Setters

    public int getId() {
        return id;
    }

    public int getIdHabitacion() {
        return idHabitacion;
    }
    public void setIdHabitacion(int idHabitacion) {
        this.idHabitacion = idHabitacion;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }
    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public LocalDate getFechaEgreso() {
        return fechaEgreso;
    }
    public void setFechaEgreso(LocalDate fechaEgreso) {
        this.fechaEgreso = fechaEgreso;
    }

    public String getDetalle() {
        return detalle;
    }
    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public static int getContadorMantenimiento() {
        return contadorMantenimiento;
    }

    @Override
    public String toString() {
        return "Mantenimiento{" +
                "id=" + id +
                ", idHabitacion=" + idHabitacion +
                ", fechaIngreso=" + fechaIngreso +
                ", fechaEgreso=" + fechaEgreso +
                ", detalle='" + detalle + '\'' +
                '}';
    }
}
