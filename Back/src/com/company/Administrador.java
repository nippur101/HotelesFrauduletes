package com.company;

public class Administrador extends UsuarioHotel{

    ///Constructor
    public Administrador(String id, String nombreYapellido, String direccion, String correoElectronico, String telefono, String clave) {
        super(id, nombreYapellido, direccion, correoElectronico, telefono, clave);
    }

    ///Metodos
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


