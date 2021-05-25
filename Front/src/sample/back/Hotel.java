package sample.back;

import java.util.List;

public class Hotel {
    private List<Administrador> listaAdmin;
    private List<Recepcionista> listaRecepcionista;
    private List<Cliente> listaCliente;
    private List<Habitacion> listaHabitacion;
    private List<Reserva> listaReserva;
    private List<RegistroHuesped> registroHuespedes;

    public Hotel() {
    }

    public Hotel(List<Administrador> listaAdmin, List<Recepcionista> listaRecepcionista, List<Cliente> listaCliente, List<Habitacion> listaHabitacion, List<Reserva> listaReserva, List<RegistroHuesped> registroHuespedes) {
        this.listaAdmin = listaAdmin;
        this.listaRecepcionista = listaRecepcionista;
        this.listaCliente = listaCliente;
        this.listaHabitacion = listaHabitacion;
        this.listaReserva = listaReserva;
        this.registroHuespedes = registroHuespedes;
    }

    public List<Administrador> getListaAdmin() {
        return listaAdmin;
    }

    public void setListaAdmin(List<Administrador> listaAdmin) {
        this.listaAdmin = listaAdmin;
    }



    public List<Cliente> getListaCliente() {
        return listaCliente;
    }

    public void setListaCliente(List<Cliente> listaCliente) {
        this.listaCliente = listaCliente;
    }

    public List<Habitacion> getListaHabitacion() {
        return listaHabitacion;
    }

    public void setListaHabitacion(List<Habitacion> listaHabitacion) {
        this.listaHabitacion = listaHabitacion;
    }

    public List<Reserva> getListaReserva() {
        return listaReserva;
    }

    public void setListaReserva(List<Reserva> listaReserva) {
        this.listaReserva = listaReserva;
    }

    public List<RegistroHuesped> getRegistroHuespedes() {
        return registroHuespedes;
    }

    public void setRegistroHuespedes(List<RegistroHuesped> registroHuespedes) {
        this.registroHuespedes = registroHuespedes;
    }
}