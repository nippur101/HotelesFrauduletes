package com.company;

public class Habitacion {

    ///Atributos
    private int id;
    private int numeroHabitacion;
    private String tipoHabitacion;
    private String caracteristicas;
    private double precio;
    private static int contadorHabitaciones = 0; ///Para generar el ID único


    ///Constructor
    public Habitacion(int numeroHabitacion, String tipoHabitacion, String caracteristicas, double precio) {
        contadorHabitaciones++;
        this.id = contadorHabitaciones;
        this.numeroHabitacion = numeroHabitacion;
        this.tipoHabitacion = tipoHabitacion;
        this.caracteristicas = caracteristicas;
        this.precio = precio;
    }

}
