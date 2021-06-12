package sample.back;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Hotel implements Serializable {
    private List<UsuarioHotel> listaUsuarioHotel;
    private List<Cliente> listaCliente;
    private List<Habitacion> listaHabitacion;
    private List<Reserva> listaReserva;
    private List<RegistroHuesped> registroHuespedes;
    private List<Mantenimiento> listaMantenimiento;


    public Hotel() {
        this.listaUsuarioHotel = new ArrayList<UsuarioHotel>();
        this.listaCliente = new ArrayList<Cliente>();
        this.listaHabitacion = new ArrayList<Habitacion>();
        this.listaReserva = new ArrayList<Reserva>();
        this.registroHuespedes = new ArrayList<RegistroHuesped>();
        this.listaMantenimiento = new ArrayList<Mantenimiento>();
    }

    public Hotel(List<UsuarioHotel> listaUsuarioHotel, List<Cliente> listaCliente, List<Habitacion> listaHabitacion, List<Reserva> listaReserva, List<RegistroHuesped> registroHuespedes, List<Mantenimiento> listaMantenimiento) {
        this.listaUsuarioHotel = listaUsuarioHotel;
        this.listaCliente = listaCliente;
        this.listaHabitacion = listaHabitacion;
        this.listaReserva = listaReserva;
        this.registroHuespedes = registroHuespedes;
        this.listaMantenimiento = listaMantenimiento;
    }

    /// Metodos
    /// Getters and Setters
    public List<UsuarioHotel> getListaUsuarioHotel() {
        return listaUsuarioHotel;
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

    public List<Mantenimiento> getListaMantenimiento() {
        return listaMantenimiento;
    }
    public void setListaMantenimiento(List<Mantenimiento> listaMantenimiento) {
        this.listaMantenimiento = listaMantenimiento;
    }

    /// ---------------------- LOGIN ----------------------
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
    /// ---------------------- BUSUQEDAS ----------------------
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
    ///Busca una Reserva por Id Cliente


    /// retorna -1 si no se encontró.
    /*public int buscarReservaPorIdCliente(String id){
        boolean busqueda = false;
        int i=(this.listaReserva.size()-1);;
        while ((i>-1)&&(!busqueda)) {
            if (this.listaReserva.get(i).getIdCliente().equals(id)&&(this.listaReserva.get(i).getBorradoLogico())) {
                busqueda = true;
            }else{
                i--;
            }
        }
        return i;
    }

     */


    ///Arreglo de Reservas por Id de Cliente
    public ArrayList<Reserva> buscarReservaPorIdCliente (String id){
        List<Reserva> listaReservaPorCliente = new ArrayList<>();
        for (Reserva h: this.listaReserva){
            if ((h.getBorradoLogico())&&(h.getIdCliente().equals(id))){
                listaReservaPorCliente.add(h);
            }
        }
        return (ArrayList<Reserva>) listaReservaPorCliente;
    }
    ///Arreglo de Registros por Id de Cliente
    public ArrayList<RegistroHuesped> buscarRegistroPorIdCliente (String id){
        List<RegistroHuesped> listaRegistroPorCliente = new ArrayList<>();
        for (RegistroHuesped h: this.registroHuespedes){
            if ((h.getEstado().equals("Abierto"))&&(h.getIdCliente().equals(id))){
                listaRegistroPorCliente.add(h);
            }
        }
        return (ArrayList<RegistroHuesped>) listaRegistroPorCliente;
    }


    public void borrarReservaPorIdCliente (String id){

        for (Reserva h: this.listaReserva){
            if ((h.getBorradoLogico())&&(h.getIdCliente().equals(id))){
                h.setBorradoLogico(false);
            }
        }

    }
    ///Busca una Reserva por Id Reserva
    /// retorna -1 si no se encontró.
    public int buscarReservaPorId(int id){
        boolean busqueda = false;
        int i=(this.listaReserva.size()-1);;
        while ((i>-1)&&(!busqueda)) {
            if (this.listaReserva.get(i).getId()==(id)&&(this.listaReserva.get(i).getBorradoLogico())) {
                busqueda = true;
            }else{
                i--;
            }
        }
        return i;
    }


    //Busqueda de UNA habitacion libre en un espacio de tiempo solo en Reserva
    public boolean habitacionLibreReserva(LocalDate fechaIngreso,LocalDate fechaEgreso, Habitacion habitacion){
        boolean validacion=true;

        for(int i=0; (i<this.listaReserva.size()&&validacion);i++){
            if (this.listaReserva.get(i).getBorradoLogico()) {
                if (habitacion.getId() == this.listaReserva.get(i).getIdHabitacion()) {
                    if (((this.listaReserva.get(i).getFechaIngreso().compareTo(fechaIngreso) < 0) && (this.listaReserva.get(i).getFechaEgreso().compareTo(fechaEgreso) < 0)) ||
                            (((this.listaReserva.get(i).getFechaIngreso().compareTo(fechaIngreso) > 0) && (this.listaReserva.get(i).getFechaEgreso().compareTo(fechaEgreso) > 0)))) {
                        validacion = true;
                    } else {
                        validacion = false;
                    }
                }
            }
        }
        return validacion;
    }
    //Busqueda de UNA habitacion libre en un espacio de tiempo solo en RegistroHuesped
    public boolean habitacionLibreRegistro(LocalDate fechaIngreso,LocalDate fechaEgreso,Habitacion habitacion){
        boolean validacion=true;

        for(int i=0; (i<this.registroHuespedes.size()&&validacion);i++){
            if (this.registroHuespedes.get(i).getEstado()=="Abierto") {
                if (habitacion.getId() == this.registroHuespedes.get(i).getIdHabitacion()) {
                    if (((this.registroHuespedes.get(i).getFechaIngreso().compareTo(fechaIngreso) < 0) && (this.registroHuespedes.get(i).getFechaEgreso().compareTo(fechaEgreso) < 0)) ||
                            (((this.registroHuespedes.get(i).getFechaIngreso().compareTo(fechaIngreso) > 0) && (this.registroHuespedes.get(i).getFechaEgreso().compareTo(fechaEgreso) > 0)))) {
                        validacion = true;
                    } else {
                        validacion = false;
                    }
                }
            }
        }
        return validacion;
    }
    ///Dada una fecha,
    public boolean habitacionLibreMantenimiento (LocalDate fechaIngreso,LocalDate fechaEgreso, Habitacion habitacion){
        boolean validacion=true;

        for(int i=0; (i<this.listaMantenimiento.size()&&validacion);i++){

            if (habitacion.getId() == this.listaMantenimiento.get(i).getIdHabitacion()) {
                if (((this.listaMantenimiento.get(i).getFechaIngreso().compareTo(fechaIngreso) < 0) && (this.listaMantenimiento.get(i).getFechaEgreso().compareTo(fechaEgreso) < 0)) ||
                        (((this.listaMantenimiento.get(i).getFechaIngreso().compareTo(fechaIngreso) > 0) && (this.listaMantenimiento.get(i).getFechaEgreso().compareTo(fechaEgreso) > 0)))) {
                    validacion = true;
                } else {
                    validacion = false;
                }
            }

        }
        return validacion;

    }
    ///Busca mantenimiento por fecha y habitacion.
    public Mantenimiento buscarMantenimiento (LocalDate fecha, Habitacion habitacion){
        boolean validacion=true;
        Mantenimiento m = new Mantenimiento();
        for(int i=0; (i<this.listaMantenimiento.size()&&validacion);i++){
            if(habitacion.getId() == this.listaMantenimiento.get(i).getIdHabitacion()){
                if (((this.listaMantenimiento.get(i).getFechaIngreso().compareTo(fecha)>0)&&(this.listaMantenimiento.get(i).getFechaEgreso().compareTo(fecha)<0))) {
                    validacion=true;
                }else{
                    validacion=false;
                    m = this.listaMantenimiento.get(i);
                }
            }
        }
        return m;
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
    /// ---------------------- AGRUPAMIENTOS ----------------------
    //Agrupamiento de todas las habitaciones libres en un periodo de tiempo
    public ArrayList<Habitacion> habitacionesLibres(LocalDate fechaIngreso,LocalDate fechaEgreso){
        List<Habitacion> habitacionesLibres=new ArrayList<>();
        for(Habitacion h:this.listaHabitacion){
            if(habitacionLibreReserva(fechaIngreso,fechaEgreso,h) && habitacionLibreRegistro(fechaIngreso,fechaEgreso,h) && habitacionLibreMantenimiento(fechaIngreso,fechaEgreso,h)){
                habitacionesLibres.add(h);
            }
        }
        return (ArrayList<Habitacion>) habitacionesLibres;
    }
/*
    public Reserva buscarReservaDiaHabitacion(LocalDate fecha,int idHabitacion){
        boolean validacion=true;
        Reserva r = new Reserva();
        for(int i=0; (i<this.listaReserva.size()&&validacion);i++){
            if(idHabitacion == this.listaReserva.get(i).getIdHabitacion()){
                if (((this.listaReserva.get(i).getFechaIngreso().compareTo(fecha)>0)&&(this.listaReserva.get(i).getFechaEgreso().compareTo(fecha)<0))) {
                    validacion=true;
                }else{
                    validacion=false;
                    r = this.listaReserva.get(i);
                }
            }
        }
        return r;
    }

 */
public Reserva buscarReservaDiaHabitacion(LocalDate fecha,int idHabitacion){
    boolean validacion=true;
    Reserva r = new Reserva();
    for(int i=0; (i<this.listaReserva.size()&&validacion);i++){
        if(idHabitacion == this.listaReserva.get(i).getIdHabitacion()){
            if (((this.listaReserva.get(i).getFechaIngreso().compareTo(fecha)<=0)&&
                    (this.listaReserva.get(i).getFechaEgreso().compareTo(fecha)>=0))) {
                validacion=false;
                r = this.listaReserva.get(i);
            }else{

                validacion=true;

            }
        }
    }
    return r;
}
    public RegistroHuesped buscarRegistroDiaHabitacion(LocalDate fecha,int idHabitacion){
        boolean validacion=true;
        RegistroHuesped r = new RegistroHuesped();
        for(int i=0; (i<this.registroHuespedes.size()&&validacion);i++){
            if(idHabitacion == this.registroHuespedes.get(i).getIdHabitacion()){
                if (((this.registroHuespedes.get(i).getFechaIngreso().compareTo(fecha)>0)&&(this.registroHuespedes.get(i).getFechaEgreso().compareTo(fecha)<0))) {
                    validacion=true;
                }else{
                    validacion=false;
                    r = this.registroHuespedes.get(i);
                }
            }
        }
        return r;
    }

    ///Agrupamiento de las habitaciones en un arry según su estado
    public ArrayList<Habitacion> arryHabitacionesEstado(LocalDate fecha){
        List<Habitacion> habitacionesPorEstado= new ArrayList<>();
        for(Habitacion h:this.listaHabitacion){
            if(!habitacionLibreReserva(fecha, fecha,h)){
                Reserva r=buscarReservaDiaHabitacion(fecha,h.getId());
                h.setEstadoHabitacion(EstadoHabitacion.RESERVADA+ ' ' +'(' + buscarClientePorID(r.getIdCliente()).nombreYapellido + ')');
                habitacionesPorEstado.add(h);
            }else if (!habitacionLibreRegistro(fecha, fecha,h)) {
                RegistroHuesped reg=buscarRegistroDiaHabitacion(fecha,h.getId());
                h.setEstadoHabitacion(EstadoHabitacion.OCUPADA+ ' ' +'(' + buscarClientePorID(reg.getIdCliente()).nombreYapellido + ')');
                habitacionesPorEstado.add(h);
            }else if (!habitacionLibreMantenimiento(fecha, fecha,h)) {
                Mantenimiento a = buscarMantenimiento(fecha, h);
                h.setEstadoHabitacion(EstadoHabitacion.NODISPONIBLE + ' ' +'(' + (a.getDetalle()) + ')');
                habitacionesPorEstado.add(h);
            }else {
                h.setEstadoHabitacion(EstadoHabitacion.LIBRE);
                habitacionesPorEstado.add(h);
            }
        }
        return (ArrayList<Habitacion>) habitacionesPorEstado;
    }

    //Calcula de acuerdo la cantidad de dias de la estadia el total a pagar por la habitacion
    public double montoHabitacionEstadia(LocalDate fechaIngreso,LocalDate fechaEgreso,int nroHabitacion){
        double costo=1;
        int cont=0,idhabit=0;
        if(fechaIngreso.isBefore(fechaEgreso)){
            while(fechaIngreso.isBefore(fechaEgreso)){
                fechaIngreso=fechaIngreso.plusDays(1);
                cont++;
            }
        }else{
            costo=-1;
            return costo;
        }
        idhabit=buscarIdPorNumeroDeHabitacion(nroHabitacion);
        costo= (listaHabitacion.get(idhabit-1).getPrecio())*cont;

        return costo;
    }
    //busca el id del cliente que esta registrado en la habitacion
    public String idClientePorNroHabitacionRegistro(int nroHabitacion){
        //REVISAR ESTADO DE LA HABITACION!!!!!
        String  idCliente="";
        int idHabitacion=buscarIdPorNumeroDeHabitacion(nroHabitacion);
        for(int i=0;i<registroHuespedes.size();i++){
            if(idHabitacion==registroHuespedes.get(i).getIdHabitacion() && registroHuespedes.get(i).getEstado().equals(EstadoHabitacion.OCUPADA)){
                idCliente=registroHuespedes.get(i).getIdCliente();
            }
        }

        return idCliente;
    }
    //busca cliente por ID, retona cliente
    public Cliente buscarClientePorID(String idCliente){
        int indice=0;
        for(int i=0;i<listaCliente.size();i++){
            if(listaCliente.get(i).getId().equals(idCliente)){
                indice=i;
            }
        }

        Cliente cliente=listaCliente.get(indice);
        return cliente;

    }
    public int buscarNumeroHabitacionPorId(int idHabitacion){
        int nroHabitacion=-1;
        for(int i=0;i<listaHabitacion.size();i++){
            if(listaHabitacion.get(i).getId()==idHabitacion){
                nroHabitacion=listaHabitacion.get(i).getNumeroHabitacion();
            }
        }

        return  nroHabitacion;
    }
    public List<RegistroHuesped> buscarRgistroDeCliente(String idCliente){
        List<RegistroHuesped> listaRegistrosCliente=new ArrayList<>();
        for(int i=0;i<registroHuespedes.size();i++){
            if(registroHuespedes.get(i).getIdCliente().equals(idCliente) && registroHuespedes.get(i).getEstado().equals("Abierto")){
                listaRegistrosCliente.add(registroHuespedes.get(i));
            }
        }
        return listaRegistrosCliente;
    }

}
