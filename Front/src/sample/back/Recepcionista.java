package sample.back;

import java.io.Serializable;

public class Recepcionista extends UsuarioHotel implements Serializable {

    public Recepcionista(String id, String nombreYapellido, String direccion, String correoElectronico, String telefono, String clave) {
        super(id, nombreYapellido, direccion, correoElectronico, telefono, clave);
    }

    ///Metodos
    @Override
    public String toString() {
        return "Recepcionista{" +
                "id='" + id + '\'' +
                ", nombreYapellido='" + nombreYapellido + '\'' +
                ", direccion='" + direccion + '\'' +
                ", correoElectronico='" + correoElectronico + '\'' +
                ", telefono='" + telefono + '\'' +
                ", clave='" + clave + '\'' +
                '}';
    }
}
