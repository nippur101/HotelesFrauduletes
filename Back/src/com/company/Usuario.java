package com.company;

import java.io.Serializable;

public abstract class Usuario implements Serializable {

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

    ///Metodos
    /// Getter and Setter
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getNombreYapellido() {
        return nombreYapellido;
    }
    public void setNombreYapellido(String nombreYapellido) {
        this.nombreYapellido = nombreYapellido;
    }

    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }
    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }


}
