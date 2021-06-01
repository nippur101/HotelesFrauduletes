package sample.back;

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

    public void setListaUsuarioHotel(List<UsuarioHotel> listaUsuarioHotel) {
        this.listaUsuarioHotel = listaUsuarioHotel;
    }

    public List<Cliente> getListaCliente() {
        return listaCliente;
    }

    public void setListaCliente(List<Cliente> listaCliente) {
        this.listaCliente = listaCliente;
    }

    public void setListaHabitacion(List<Habitacion> listaHabitacion) {
        this.listaHabitacion = listaHabitacion;
    }

    public void setListaReserva(List<Reserva> listaReserva) {
        this.listaReserva = listaReserva;
    }

    public void setRegistroHuespedes(List<RegistroHuesped> registroHuespedes) {
        this.registroHuespedes = registroHuespedes;
    }

    public List<UsuarioHotel> getListaUsuarioHotel() {
        return listaUsuarioHotel;
    }
    public void agregarUsuarioHotel(UsuarioHotel a){
        this.listaUsuarioHotel.add(a);
    }

    public List<Habitacion> getListaHabitacion() {
        return listaHabitacion;
    }

    public List<Reserva> getListaReserva() {
        return listaReserva;
    }

    public List<RegistroHuesped> getRegistroHuespedes() {
        return registroHuespedes;
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
    /*
        //Busqueda de UNA habitacion libre en un espacio de tiempo solo en Reserva
        public boolean habitacionLibreReserva(LocalDate fechaIngreso,LocalDate fechaEgreso,ArrayList<Reserva> reservas,Habitacion habitacion){
            boolean validacion=false;
            for(Reserva r:reservas){
                if(habitacion.getId() == r.getIdHabitacion() && (r.getFechaEgreso().isBefore(fechaIngreso) || r.getFechaIngreso().isAfter(fechaEgreso))){
                    validacion=true;
                }else{
                    validacion=false;
                    return validacion;
                }
            }
            return validacion;
        }
        //Busqueda de UNA habitacion libre en un espacio de tiempo solo en RegistroHuesped
        public boolean habitacionLibreRegistro(LocalDate fechaIngreso,LocalDate fechaEgreso,ArrayList<RegistroHuesped> registros,Habitacion habitacion){
            boolean validacion=false;
            for(RegistroHuesped r:registros){
                if(habitacion.getId() == r.getIdHabitacion() && (r.getFechaEgreso().isBefore(fechaIngreso) || r.getFechaIngreso().isAfter(fechaEgreso))){
                    validacion=true;
                }else{
                    validacion=false;
                    return validacion;
                }
            }
            return validacion;
        }
        //Agrupamiento de todas las habitaciones libres en un periodo de tiempo
        public ArrayList<Habitacion> habitacionesLibres(LocalDate fechaIngreso,LocalDate fechaEgreso,ArrayList<Reserva> reservas,ArrayList<RegistroHuesped> registros,ArrayList<Habitacion> habitaciones){
            List<Habitacion> habitacionesLibres=new ArrayList<>();
            for(Habitacion h:habitaciones){
                if(habitacionLibreReserva(fechaIngreso,fechaEgreso,reservas,h) && habitacionLibreRegistro(fechaIngreso,fechaEgreso,registros,h)){
                    habitacionesLibres.add(h);
                }
            }
            return (ArrayList<Habitacion>) habitacionesLibres;
        }
        */
    //Busqueda de UNA habitacion libre en un espacio de tiempo solo en Reserva
    public boolean habitacionLibreReserva(LocalDate fechaIngreso,LocalDate fechaEgreso, Habitacion habitacion){
        boolean validacion=true;

        for(int i=0; (i<this.listaReserva.size()&&validacion);i++){
            if(habitacion.getId() == this.listaReserva.get(i).getIdHabitacion()){
                if (((this.listaReserva.get(i).getFechaIngreso().compareTo(fechaIngreso)<0)&&(this.listaReserva.get(i).getFechaEgreso().compareTo(fechaEgreso)<0)) ||
                        (((this.listaReserva.get(i).getFechaIngreso().compareTo(fechaIngreso)>0)&&(this.listaReserva.get(i).getFechaEgreso().compareTo(fechaEgreso)>0)))) {
                    validacion=true;
                }else{
                    validacion=false;

                }
            }
        }
        return validacion;
    }
    //Busqueda de UNA habitacion libre en un espacio de tiempo solo en RegistroHuesped
    public boolean habitacionLibreRegistro(LocalDate fechaIngreso,LocalDate fechaEgreso,Habitacion habitacion){
        boolean validacion=true;

        for(int i=0; (i<this.registroHuespedes.size()&&validacion);i++){
            if(habitacion.getId() == this.registroHuespedes.get(i).getIdHabitacion()){
                if (((this.registroHuespedes.get(i).getFechaIngreso().compareTo(fechaIngreso)<0)&&(this.registroHuespedes.get(i).getFechaEgreso().compareTo(fechaEgreso)<0)) ||
                        (((this.registroHuespedes.get(i).getFechaIngreso().compareTo(fechaIngreso)>0)&&(this.registroHuespedes.get(i).getFechaEgreso().compareTo(fechaEgreso)>0)))) {
                    validacion=true;
                }else{
                    validacion=false;
                }
            }
        }
        return validacion;
    }
    //Agrupamiento de todas las habitaciones libres en un periodo de tiempo
    public ArrayList<Habitacion> habitacionesLibres(LocalDate fechaIngreso,LocalDate fechaEgreso){
        List<Habitacion> habitacionesLibres=new ArrayList<>();
        for(Habitacion h:this.listaHabitacion){
            if(habitacionLibreReserva(fechaIngreso,fechaEgreso,h) && habitacionLibreRegistro(fechaIngreso,fechaEgreso,h)){
                habitacionesLibres.add(h);
            }
        }
        return (ArrayList<Habitacion>) habitacionesLibres;
    }
//busca y retona Id de habitacion ingresando el numero de la habitacion
    public int buscarIdPorNumeroDeHabitacion(int nroHabitacion){
        int idHabitacion=-1;
        for(int i=0;i<listaHabitacion.size();i++){
            if(listaHabitacion.get(i).getNumeroHabitacion()==nroHabitacion){
                idHabitacion=listaHabitacion.get(i).getId();
            }
        }
        return  idHabitacion;
    }
}
