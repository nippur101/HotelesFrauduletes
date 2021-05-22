package com.company;

import java.util.Date;

public class Consumo {

    ///Atributos
    private int id;
    private int idReserva;
    private Date fechaConsumo;
    private String detalleConsumo;
    private double monto;
    private double pagoConsumo;
    private static int contadorConsumos = 0; ///Para generar el ID único

    ///Constructor
    ///El recepcionista genera el Consumo, y luego registra su pago.
    public Consumo(int idReserva, Date fechaConsumo, String detalleConsumo, double monto) {
        contadorConsumos++;
        this.id = contadorConsumos;
        this.idReserva = idReserva;
        this.fechaConsumo = fechaConsumo;
        this.detalleConsumo = detalleConsumo;
        this.monto = monto;
    }
}
