package com.company;

public class Cliente extends Usuario{

    ///Atributos
    private String pais;
    private String provincia;
    private String localidad;

    ///Constructor
    public Cliente(String id, String nombreYapellido, String direccion, String correoElectronico, String telefono, String pais, String provincia, String localidad) {
        super(id, nombreYapellido, direccion, correoElectronico, telefono);
        this.pais = pais;
        this.provincia = provincia;
        this.localidad = localidad;
    }
}
