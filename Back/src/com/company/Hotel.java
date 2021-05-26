package com.company;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private List<UsuarioHotel> listaUsuarioHotel;
    private List<Cliente> listaCliente;
    private List<Habitacion> listaHabitacion;
    private List<Reserva> listaReserva;
    private List<RegistroHuesped> registroHuespedes;

    public Hotel() {
        this.listaUsuarioHotel = new ArrayList<UsuarioHotel>();
        this.listaCliente = new ArrayList<Cliente>();
        this.listaHabitacion = new ArrayList<Habitacion>();
        this.listaReserva = new ArrayList<Reserva>();
        this.registroHuespedes = new ArrayList<RegistroHuesped>();
    }

    public Hotel(List<UsuarioHotel> listaUsuarioHotel, List<Cliente> listaCliente, List<Habitacion> listaHabitacion, List<Reserva> listaReserva, List<RegistroHuesped> registroHuespedes) {
        this.listaUsuarioHotel = listaUsuarioHotel;
        this.listaCliente = listaCliente;
        this.listaHabitacion = listaHabitacion;
        this.listaReserva = listaReserva;
        this.registroHuespedes = registroHuespedes;
    }

    public List<UsuarioHotel> getListaUsuarioHotel() {
        return listaUsuarioHotel;
    }

    public void agregarUsuarioHotel(UsuarioHotel a){
        this.listaUsuarioHotel.add(a);
    }

    /// Corrobora si un Usuario Hotel existe y coincide con la clave registrada.
    /// Si Existe y la clave es correcta devuelve el indice de la lista.
    /// Si No existe  o existe pero la clave es incorrecta, devuelve -1.
    public int logIn(String id, String clave){
        int respuesta = buscarIdUsuarioHotel(id);
        if (respuesta<0){
            System.out.println("Usuario no Registrado.");
        }else{
            if(listaUsuarioHotel.get(respuesta).getClave().equals(clave)){
                System.out.println("Usuario ingresado.");
            }else{
                System.out.println("Clave Incorrecta.");
                respuesta = -1;
            }
        }
        return respuesta;
    }
    ///Busca un Usuario por ID (String) retorna el indice de donde se encuentra
    /// retorna -1 si no se encontró.
    public int buscarIdUsuarioHotel(String id){
        boolean busqueda = false;
        int i=(this.listaUsuarioHotel.size()-1);
        while ((i>-1)&&(busqueda==false)) {
            if (this.listaUsuarioHotel.get(i).getId().equals(id)) {
                busqueda = true;
            }else{
                i--;
            }
        }
        return i;
    }


    ///Busca un Cliente por ID (String) retorna el indice de donde se encuentra
    /// retorna -1 si no se encontró.
    public int buscarIdCliente(String id){
        boolean busqueda = false;
        int i=(this.listaCliente.size()-1);;
        while ((i>-1)&&(!busqueda)) {
            if (this.listaCliente.get(i).getId().equals(id)) {
                busqueda = true;
            }else{
             i--;
            }

        }
        return i;
    }

    //Busqueda de UNA habitacion libre en un espacio de tiempo solo en Reserva
    public boolean habitacionLibreReserva(LocalDate fechaIngreso, LocalDate fechaEgreso, ArrayList<Reserva> reservas, Habitacion habitacion){
        boolean validacion=false;
        for(Reserva r:reservas){
            if(habitacion.getId() == r.getIdHabitacion() && r.getFechaEgreso().isBefore(fechaIngreso) && r.getFechaIngreso().isAfter(fechaEgreso)){
                validacion=true;
            }
        }
        return validacion;
    }
    //Busqueda de UNA habitacion libre en un espacio de tiempo solo en RegistroHuesped
    public boolean habitacionLibreRegistro(LocalDate fechaIngreso,LocalDate fechaEgreso,ArrayList<RegistroHuesped> registros,Habitacion habitacion){
        boolean validacion=false;
        for(RegistroHuesped r:registros){
            if(habitacion.getId() == r.getIdHabitacion() && r.getFechaEgreso().isBefore(fechaIngreso) && r.getFechaIngreso().isAfter(fechaEgreso)){
                validacion=true;
            }
        }
        return validacion;
    }
    //Agrupamiento de todas las habitaciones libres en un periodo de toempo
    public ArrayList<Habitacion> habitacionesLibres(LocalDate fechaIngreso,LocalDate fechaEgreso,ArrayList<Reserva> reservas,ArrayList<RegistroHuesped> registros,ArrayList<Habitacion> habitaciones){
        List<Habitacion> habitacionesLibres=new ArrayList<>();
        for(Habitacion h:habitaciones){
            if(habitacionLibreReserva(fechaIngreso,fechaEgreso,reservas,h) && habitacionLibreRegistro(fechaIngreso,fechaEgreso,registros,h)){
                habitacionesLibres.add(h);
            }
        }
        return (ArrayList<Habitacion>) habitacionesLibres;
    }

}
