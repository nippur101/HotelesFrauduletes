package com.company;

import java.util.Date;

public class RegistroHuesped {

    ///Atributos
    private int id;
    private String idCliente;
    private int idHabitacion;
    private Date fechaIngreso;
    private Date fechaEgreso;
    private static int contadorRegHuesped = 0; ///Para generar el ID único

    ///Constructor
    ///Con el CheckIn se instancia con la fecha de ingreso, con el CheckOut se ingresarà la fecha de egreso.
    public RegistroHuesped(String idCliente, int idHabitacion, Date fechaIngreso) {
        contadorRegHuesped++;
        this.id = contadorRegHuesped;
        this.idCliente = idCliente;
        this.idHabitacion = idHabitacion;
        this.fechaIngreso = fechaIngreso;

    }
}
