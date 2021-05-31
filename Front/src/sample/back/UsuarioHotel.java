package sample.back;

import java.time.LocalDate;

public abstract class UsuarioHotel extends Usuario {

    ///Atributos
    protected String clave;

    ///Contructor
    public UsuarioHotel(String id, String nombreYapellido, String direccion, String correoElectronico, String telefono, String clave) {
        super(id, nombreYapellido, direccion, correoElectronico, telefono);
        this.clave = clave;
    }


    ///Metodos
    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

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
    /// Genera una instancia de Consumo y lo retorna.
    public Consumo generaConsumo(LocalDate fechaConsumo, String detalleConsumo, double monto, double pago){
        Consumo a = new Consumo (fechaConsumo, detalleConsumo, monto, pago);
        return a;
    }

    /// ---------------------- CHECK OUT ----------------------
    public void checkOut (RegistroHuesped r, Cliente c){

        if (c.calculoSaldo()>0){
            System.out.println("El Cliente tiene saldos pendientes de abono.");
        }else{
            if(r.getFechaEgreso().equals(LocalDate.now())) {
                r.setFechaEgreso(LocalDate.now());
            }
            r.setEstado("Cerrado");
        }
    }

    /// ---------------------- CLIENTE ----------------------
    public Cliente generaCliente (String id, String nombreYapellido, String direccion, String correoElectronico, String telefono, String pais, String provincia, String localidad) {
        Cliente a = new Cliente(id,nombreYapellido,direccion,correoElectronico,telefono,pais,provincia,localidad);
        return a;
    }





}

