package sample;

public class TableViewHabEstado {
    private Integer nroHabitacion;
    private String fechaAnt;
    private String fecha00;
    private String fecha01;
    private String fecha02;
    private String fecha03;
    private String fecha04;
    private String fecha05;
    private String fecha06;


    public TableViewHabEstado() {

    }

    public TableViewHabEstado(Integer nroHabitacion, String fechaAnt, String fecha00, String fecha01, String fecha02, String fecha03, String fecha04, String fecha05, String fecha06) {
        this.nroHabitacion = nroHabitacion;
        this.fechaAnt = fechaAnt;
        this.fecha00 = fecha00;
        this.fecha01 = fecha01;
        this.fecha02 = fecha02;
        this.fecha03 = fecha03;
        this.fecha04 = fecha04;
        this.fecha05 = fecha05;
        this.fecha06 = fecha06;
    }

    public Integer getNroHabitacion() {
        return nroHabitacion;
    }

    public void setNroHabitacion(Integer nroHabitacion) {
        this.nroHabitacion = nroHabitacion;
    }

    public String getFechaAnt() {
        return fechaAnt;
    }

    public void setFechaAnt(String fechaAnt) {
        this.fechaAnt = fechaAnt;
    }

    public String getFecha00() {
        return fecha00;
    }

    public void setFecha00(String fecha00) {
        this.fecha00 = fecha00;
    }

    public String getFecha01() {
        return fecha01;
    }

    public void setFecha01(String fecha01) {
        this.fecha01 = fecha01;
    }

    public String getFecha02() {
        return fecha02;
    }

    public void setFecha02(String fecha02) {
        this.fecha02 = fecha02;
    }

    public String getFecha03() {
        return fecha03;
    }

    public void setFecha03(String fecha03) {
        this.fecha03 = fecha03;
    }

    public String getFecha04() {
        return fecha04;
    }

    public void setFecha04(String fecha04) {
        this.fecha04 = fecha04;
    }

    public String getFecha05() {
        return fecha05;
    }

    public void setFecha05(String fecha05) {
        this.fecha05 = fecha05;
    }

    public String getFecha06() {
        return fecha06;
    }

    public void setFecha06(String fecha06) {
        this.fecha06 = fecha06;
    }

    @Override
    public String toString() {
        return "TableViewHabEstado{" +
                "nroHabitacion=" + nroHabitacion +
                ", fechaAnt='" + fechaAnt + '\'' +
                ", fecha00='" + fecha00 + '\'' +
                ", fecha01='" + fecha01 + '\'' +
                ", fecha02='" + fecha02 + '\'' +
                ", fecha03='" + fecha03 + '\'' +
                ", fecha04='" + fecha04 + '\'' +
                ", fecha05='" + fecha05 + '\'' +
                ", fecha06='" + fecha06 + '\'' +
                '}';
    }
}