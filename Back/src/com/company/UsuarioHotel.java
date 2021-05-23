package com.company;

import java.time.LocalDate;
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

    /// ---------------------- RESERVA ----------------------
    /// Toma 4 datos , genera instancia de reservay la devuelve.
    public Reserva generaReserva(int idHabitacion, String idCliente, LocalDate fechaIngreso, LocalDate fechaEgreso, double pagoReserva){
        Reserva a = new Reserva( idHabitacion, idCliente, fechaIngreso,  fechaEgreso,  pagoReserva);
        return a;
    }

    /// ---------------------- CHECK IN ----------------------
    /// Genera la apertura del Registro de Huesped, baja logica de Reserva, agrega el consumo al cliente.
    public RegistroHuesped checkIn(Reserva r, Cliente c, Habitacion h){
        ///Apertura del Registro de Huesped y lo agrega a la coleccion del Registro
        RegistroHuesped registro = new RegistroHuesped(r.getIdCliente(),r.getIdHabitacion(),r.getFechaIngreso(),r.getFechaEgreso());

        ///Genera el consumo y lo agrega a la coleccion del cliente.
        int j= (int)r.getFechaEgreso().getDayOfYear()-(int)r.getFechaIngreso().getDayOfYear();
        double montoEstadia = j * h.getPrecio();
        c.setConsumos(generaConsumo(LocalDate.now(),"Alojamiento", montoEstadia, r.getPagoReserva()));

        ///baja logica de la Reserva
        r.setBorradoLogico(false);

        return registro;
    }
    /*
    /// Genera una instancia de Registro Huesped y lo retorna.
    public RegistroHuesped aperturaRegistroHuesped(String idCliente, int idHabitacion, Date fechaIngreso, Date fechaEgreso){
        RegistroHuesped a = new RegistroHuesped(idCliente, idHabitacion, fechaIngreso, fechaEgreso);
        return a;
    }
    */
    /// Genera una instancia de Consumo y lo retorna.
    public Consumo generaConsumo(LocalDate fechaConsumo, String detalleConsumo, double monto, double pago){
        Consumo a = new Consumo (fechaConsumo, detalleConsumo, monto, pago);
        return a;
    }

    /// ---------------------- CHECK OUT ----------------------
    public void checkOut (RegistroHuesped r){
        
    }

}
