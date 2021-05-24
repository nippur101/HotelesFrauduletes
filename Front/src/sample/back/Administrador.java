package sample.back;

public class Administrador extends UsuarioHotel{

    public Administrador(String id, String nombreYapellido, String direccion, String correoElectronico, String telefono, String clave) {
        super(id, nombreYapellido, direccion, correoElectronico, telefono, clave);
    }


    ///Metodos

    /// ---------------------- CREA USUARIO ----------------------
    public Recepcionista creaRecepcionista (String id, String nombreYapellido, String direccion, String correoElectronico, String telefono, String clave){
        Recepcionista a = new Recepcionista(id, nombreYapellido, direccion, correoElectronico,telefono,clave);
        return a;
    }

    /// ---------------------- CREA HABITACION ----------------------
    public Habitacion Habitacion (int numeroHabitacion, String tipoHabitacion, String caracteristicas, double precio){
        Habitacion h = new Habitacion(numeroHabitacion, tipoHabitacion, caracteristicas, precio);
        return h;
    }


    @Override
    public String toString() {
        return "Administrador{" +
                "id='" + id + '\'' +
                ", nombreYapellido='" + nombreYapellido + '\'' +
                ", direccion='" + direccion + '\'' +
                ", correoElectronico='" + correoElectronico + '\'' +
                ", telefono='" + telefono + '\'' +
                ", clave='" + clave + '\'' +
                '}';
    }
}


