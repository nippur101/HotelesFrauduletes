package com.company;

import java.util.Date;
import java.util.Objects;

public class RegistroHuesped implements Comparable<RegistroHuesped>{

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
    ///Metodos
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RegistroHuesped)) return false;
        RegistroHuesped that = (RegistroHuesped) o;
        return id == that.id && idHabitacion == that.idHabitacion && idCliente.equals(that.idCliente) && fechaIngreso.equals(that.fechaIngreso) && fechaEgreso.equals(that.fechaEgreso);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, idCliente, idHabitacion, fechaIngreso, fechaEgreso);
    }

    @Override
    public int compareTo(RegistroHuesped o) {
            int result = Integer.compare(id, o.id);
            return result;
    }
}
