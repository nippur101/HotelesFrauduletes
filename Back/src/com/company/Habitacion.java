package com.company;

public class Habitacion {

    ///Atributos
    private int id;
    private int numeroHabitacion;
    private String tipoHabitacion;
    private String caracteristicas;
    private double precio;

    ///Costructor
    public Habitacion(int id, int numeroHabitacion, String tipoHabitacion, String caracteristicas, double precio) {
        this.id = id;
        this.numeroHabitacion = numeroHabitacion;
        this.tipoHabitacion = tipoHabitacion;
        this.caracteristicas = caracteristicas;
        this.precio = precio;
    }

}
