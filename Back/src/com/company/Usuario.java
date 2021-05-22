package com.company;

public abstract class Usuario {

    ///Atributos
    protected String id;
    protected String nombreYapellido;
    protected String direccion;
    protected String correoElectronico;
    protected String telefono;

    ///Constructor
    public Usuario(String id, String nombreYapellido, String direccion, String correoElectronico, String telefono) {
        this.id = id;
        this.nombreYapellido = nombreYapellido;
        this.direccion = direccion;
        this.correoElectronico = correoElectronico;
        this.telefono = telefono;
    }
}
