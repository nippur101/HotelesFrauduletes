package sample;

public class TableViewCliente {
    protected String id;
    protected String nombreYapellido;
    protected String direccion;
    protected String correoElectronico;
    protected String telefono;
    private String pais;
    private String provincia;
    private String localidad;

    public TableViewCliente() {
    }

    public TableViewCliente(String id, String nombreYapellido, String direccion, String correoElectronico, String telefono, String pais, String provincia, String localidad) {
        this.id = id;
        this.nombreYapellido = nombreYapellido;
        this.direccion = direccion;
        this.correoElectronico = correoElectronico;
        this.telefono = telefono;
        this.pais = pais;
        this.provincia = provincia;
        this.localidad = localidad;
    }

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

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }
}
