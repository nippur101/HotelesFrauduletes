package com.company;

import java.util.Date;

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

    ///Getter and Setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getIdCliente() {
        return idCliente;
    }
    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdHabitacion() {
        return idHabitacion;
    }
    public void setIdHabitacion(int idHabitacion) {
        this.idHabitacion = idHabitacion;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }
    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Date getFechaEgreso() {
        return fechaEgreso;
    }
    public void setFechaEgreso(Date fechaEgreso) {
        this.fechaEgreso = fechaEgreso;
    }

    public static int getContadorRegHuesped() {
        return contadorRegHuesped;
    }
    public static void setContadorRegHuesped(int contadorRegHuesped) {
        RegistroHuesped.contadorRegHuesped = contadorRegHuesped;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RegistroHuesped)) return false;
        RegistroHuesped that = (RegistroHuesped) o;
        return (id == that.id);
    }
    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }
    /*
    @Override
    /// compareTo por ID cliente para probar
    public int compareTo(RegistroHuesped o) {
            int resultado;

            if (o.getIdCliente().compareToIgnoreCase(this.idCliente)>0){
                resultado = -1;
            }else if (o.getIdCliente().compareToIgnoreCase(this.idCliente)<0){
                resultado = 1;
            }else{
                resultado = 0;
            }

            return resultado;
    }
    */
    @Override
    /// compareTo por ID
    public int compareTo(RegistroHuesped o) {
            int resultado;

            if (Integer.compare(this.id,o.getId())<0){
                resultado = -1;
            }else if (Integer.compare(this.id,o.getId())>0){
                resultado = 1;
            }else{
                resultado = 0;
            }

            return resultado;
    }

    @Override
    public String toString() {
        return "RegistroHuesped{" +
                "id=" + id +
                ", idCliente='" + idCliente + '\'' +
                ", idHabitacion=" + idHabitacion +
                ", fechaIngreso=" + fechaIngreso +
                ", fechaEgreso=" + fechaEgreso +
                '}';
    }
}
