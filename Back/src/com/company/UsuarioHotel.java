package com.company;

import java.util.Date;

public abstract class UsuarioHotel extends Usuario {

    ///Atributos
    protected String clave;

    ///Contructor
    public UsuarioHotel(String id, String nombreYapellido, String direccion, String correoElectronico, String telefono, String clave) {
        super(id, nombreYapellido, direccion, correoElectronico, telefono);
        this.clave = clave;
    }
    ///Metodos
    public Reserva generaReserva(String idCliente, Date fechaIngreso, Date fechaEgreso, double pagoReserva){
        Reserva a = new Reserva( idCliente,  fechaIngreso,  fechaEgreso,  pagoReserva);
        return a;
    }
    public RegistroHuesped checkIn(String idCliente, int idHabitacion, Date fechaIngreso){
        RegistroHuesped a = new RegistroHuesped(idCliente, idHabitacion, fechaIngreso);
        return a;
    }

}
