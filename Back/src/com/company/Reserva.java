package com.company;

import java.util.Date;

public class Reserva {

    ///Atributos
    private int id;
    private String idCliente;
    private Date fechaIngreso;
    private Date fechaEgreso;
    private double pagoReserva;
    private static int contadorReservas = 0; ///Para generar el ID único

    ///Constructor
    public Reserva(String idCliente, Date fechaIngreso, Date fechaEgreso, double pagoReserva) {
        contadorReservas++;
        this.id = contadorReservas;
        this.idCliente = idCliente;
        this.fechaIngreso = fechaIngreso;
        this.fechaEgreso = fechaEgreso;
        this.pagoReserva = pagoReserva;
    }
}
