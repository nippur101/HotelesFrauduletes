package sample.back;

import java.time.LocalDate;

public class Habitacion {

    ///Atributos
    private int id;
    private int numeroHabitacion;
    private String tipoHabitacion;
    private String caracteristicas;
    private double precio;
    private static int contadorHabitaciones = 0; ///Para generar el ID único
    private String estadoHabitacion=EstadoHabitacion.LIBRE;



    ///Constructor

    public Habitacion() {
    }

    public Habitacion(int numeroHabitacion, String tipoHabitacion, String caracteristicas, double precio) {
        contadorHabitaciones++;
        this.id = contadorHabitaciones;
        this.numeroHabitacion = numeroHabitacion;
        this.tipoHabitacion = tipoHabitacion;
        this.caracteristicas = caracteristicas;
        this.precio = precio;


    }

    ///Metodos
    ///Getter and Setters

    public int getId() {
        return id;
    }

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }
    public void setNumeroHabitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public String getTipoHabitacion() {
        return tipoHabitacion;
    }
    public void setTipoHabitacion(String tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }
    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public static int getContadorHabitaciones() {
        return contadorHabitaciones;
    }

    public String getEstadoHabitacion() {
        return estadoHabitacion;
    }

    public void setEstadoHabitacion(String estadoHabitacion) {
        this.estadoHabitacion = estadoHabitacion;
    }


    @Override
    public String toString() {
        return "Habitacion{" +
                "id=" + id +
                ", numeroHabitacion=" + numeroHabitacion +
                ", tipoHabitacion='" + tipoHabitacion + '\'' +
                ", caracteristicas='" + caracteristicas + '\'' +
                ", precio=" + precio +
                ", estadoHabitacion='" + estadoHabitacion + '\'' +
                '}';
    }
}
