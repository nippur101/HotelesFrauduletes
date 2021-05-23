package com.company;

import java.time.LocalDate;

public class Consumo {

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
}
