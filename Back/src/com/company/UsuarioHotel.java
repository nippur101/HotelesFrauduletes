package com.company;

public abstract class UsuarioHotel extends Usuario {

    ///Atributos
    protected String clave;

    ///Contructor
    public UsuarioHotel(String id, String nombreYapellido, String direccion, String correoElectronico, String telefono, String clave) {
        super(id, nombreYapellido, direccion, correoElectronico, telefono);
        this.clave = clave;
    }
}
