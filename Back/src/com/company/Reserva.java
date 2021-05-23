package com.company;

import java.time.LocalDate;

public class Reserva {

    ///Atributos
    private int id;
    private int idHabitacion;
    private String idCliente;
    private LocalDate fechaIngreso;
    private LocalDate fechaEgreso;
    private double pagoReserva;
    private boolean borradoLogico;
    private static int contadorReservas = 0; ///Para generar el ID único

    ///Constructor
    public Reserva(int idHabitacion, String idCliente, LocalDate fechaIngreso, LocalDate fechaEgreso, double pagoReserva) {
        contadorReservas++;
        this.id = contadorReservas;
        this.idHabitacion = idHabitacion;
        this.idCliente = idCliente;
        this.fechaIngreso = fechaIngreso;
        this.fechaEgreso = fechaEgreso;
        this.pagoReserva = pagoReserva;
        this.borradoLogico=true;
    }

    ///Metodos
    ///Getters and Setters

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public int getIdHabitacion() {
        return idHabitacion;
    }
    public void setIdHabitacion(int idHabitacion) {
        this.idHabitacion = idHabitacion;
    }

    public String getIdCliente() {
        return idCliente;
    }
    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
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

    public double getPagoReserva() {
        return pagoReserva;
    }
    public void setPagoReserva(double pagoReserva) {
        this.pagoReserva = pagoReserva;
    }

    public boolean getBorradoLogico() {
        return borradoLogico;
    }
    public void setBorradoLogico(boolean borradoLogico) {
        this.borradoLogico = borradoLogico;
    }

    public static int getContadorReservas() {
        return contadorReservas;
    }
    public static void setContadorReservas(int contadorReservas) {
        Reserva.contadorReservas = contadorReservas;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "id=" + id +
                ", idHabitacion=" + idHabitacion +
                ", idCliente='" + idCliente + '\'' +
                ", fechaIngreso=" + fechaIngreso +
                ", fechaEgreso=" + fechaEgreso +
                ", pagoReserva=" + pagoReserva +
                ", borradoLogico=" + borradoLogico +
                '}';
    }
}
