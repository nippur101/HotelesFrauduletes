package sample.back;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Usuario{

    ///Atributos
    private String pais;
    private String provincia;
    private String localidad;
    private List<Consumo> consumos;

    ///Constructor
    public Cliente(String id, String nombreYapellido, String direccion, String correoElectronico, String telefono, String pais, String provincia, String localidad) {
        super(id, nombreYapellido, direccion, correoElectronico, telefono);
        this.pais = pais;
        this.provincia = provincia;
        this.localidad = localidad;
        this.consumos = new ArrayList<Consumo>();
    }

    ///Metodos

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

    public List<Consumo> getConsumos() {
        return consumos;
    }
    public void setConsumos(Consumo a) {
        this.consumos.add(a);
    }



    /// ---------------------- SALDO ----------------------
    public double sumatoriaCargos (){
        double resultado=0;
        for (Consumo a : this.consumos) {
            resultado = resultado + a.getMonto();
        }
        return resultado;
    }
    public double sumatoriaPagos (){
        double resultado=0;
        for (Consumo a : this.consumos) {
            resultado = resultado + a.getPagoConsumo();
        }
        return resultado;
    }
    public double calculoSaldo(){
        double resultado = sumatoriaCargos() - sumatoriaPagos();
        return resultado;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id='" + id + '\'' +
                ", pais='" + pais + '\'' +
                ", nombreYapellido='" + nombreYapellido + '\'' +
                ", provincia='" + provincia + '\'' +
                ", localidad='" + localidad + '\'' +
                ", direccion='" + direccion + '\'' +
                ", correoElectronico='" + correoElectronico + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}
