package sample;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import sample.back.*;


import java.net.URL;
import java.time.LocalDate;
import java.util.*;
import java.util.concurrent.Callable;


public class Controller implements Initializable {

    @FXML private TextField identificadorUsuario;
    @FXML private PasswordField passIdentificadorUsuario;
    @FXML private Button botonAccesoUsuario;

   // String idCliente, int idHabitacion, LocalDate fechaIngreso, java.time.LocalDate fechaEgreso
    @FXML private TextField registroIDCliente;
    @FXML private ComboBox registroNroHabitacion;
    @FXML private DatePicker registroFechaIngreso;
    @FXML private DatePicker registroFechaEgreso;
    @FXML private TextField registroClienteGrupo;
    @FXML private TextArea registroObservaciones;
    @FXML private TextField registroPagoAdelanto;



//=====================PANEL CLIENTE
    @FXML private TextField clienteCorreoElectronico;
    @FXML private TextField clienteLocalidad;
    @FXML private TextField clienteProvincia;
    @FXML private TextField clientePais;
    @FXML private TextField clienteDNI;
    @FXML private TextField clienteTelefono;
    @FXML private TextField clienteDireccion;
    @FXML private TextField clienteNombreApellido;
//====================PANEL RECEPCIONISTA
    @FXML private TextField recepcionistaCorreoElectronico;
    @FXML private TextField recepcionistaPassword;
    @FXML private TextField recepcionistaDNI;
    @FXML private TextField recepcionistaTelefono;
    @FXML private TextField recepcionistaDireccion;
    @FXML private TextField recepcionistaNombreApellido;
    //====================IMAGENES DE MENU
    @FXML private ImageView imageAdmin;
    @FXML private ImageView imageRecepcionist;
    @FXML private ImageView imageClient;
    @FXML private ImageView imageReserv;
    @FXML private ImageView imageRegistro;
    @FXML private ImageView imagePago;
    @FXML private ImageView imageHabitacion;
    @FXML private ImageView imageExit;
    //====================IMAGENES FLECHAS DE MENU
    @FXML private ImageView arrowAdmin;
    @FXML private ImageView arrowClient;
    @FXML private ImageView arrowRecepcionista;
    @FXML private ImageView arrowRegistro;
    @FXML private ImageView arrowPago;
    @FXML private ImageView arrowHabitacion;
    @FXML private ImageView arrowReserva;
    //====================PANELES
    @FXML private AnchorPane paneErrorIngresoPassword;
    @FXML private AnchorPane paneAdminPass;
    @FXML private AnchorPane paneAccesoPermitido;
    @FXML private AnchorPane paneManejoRecepcionist;
    @FXML private AnchorPane paneAgregarRecepcionist;
    @FXML private AnchorPane paneModificarRecepcionist;
    @FXML private AnchorPane paneAgregarClient;
    @FXML private AnchorPane paneManejoClient;
    @FXML private AnchorPane paneRegistro;
    @FXML private AnchorPane paneReserva;
    @FXML private AnchorPane paneModificarClient;
    @FXML private AnchorPane panePago;
    @FXML private AnchorPane paneRecepcionistaCargado;
    @FXML private AnchorPane paneClienteCargado;
    //====================TABLA DE DETALLE DE CONSUMOS
    @FXML private TableView<Detalle> tableViewDetalle;
    //====================COLUMNAS DE TABLA DETALLE CONSUMO
    @FXML private TableColumn<Detalle,String > columFecha;
    @FXML private TableColumn<Detalle,Integer > columCuenta;
    @FXML private TableColumn<Detalle,String > columNombreDeCuenta;
    @FXML private TableColumn<Detalle,Integer > columReferencia;
    @FXML private TableColumn<Detalle,String > columDescripcion;
    @FXML private TableColumn<Detalle,Double > columCargos;
    @FXML private TableColumn<Detalle,Double > columAbono;
    @FXML private TableColumn<Detalle,Boolean > columEstado;

    List<UsuarioHotel> listaUsuarioHotel=new ArrayList<>();
    List<Cliente> listaCliente=new ArrayList<>();
    List<Consumo> listaConsumo=new ArrayList<>();
    List<Habitacion> listaHabitacion=new ArrayList<>();
    List<Recepcionista> listaRececpcionista=new ArrayList<>();
    List<Reserva> listaReserva=new ArrayList<>();

    List<RegistroHuesped> listaRegistroHuespedes=new ArrayList<>();




    private Hotel hotel2=new Hotel(listaUsuarioHotel,listaCliente,listaHabitacion,listaReserva,listaRegistroHuespedes);
    /*public ArrayList<Integer> listaHabitacionesLibres(){
        ArrayList<Integer> i=new ArrayList<>();
        i.add(102);
        i.add(103);
        i.add(202);
        i.add(204);
        i.add(205);
        i.add(302);
        i.add(303);
        i.add(305);
        return i;

    }*/
    //100,101,102,103,104,105,106,200,201,202,203,204,205,206,300,301,302,303,304,305,306

    ObservableList<Integer> comboNroHabitaciones=FXCollections.observableArrayList(100,101,102,103,104,105,106,200,201,202,203,204,205,206,300,301,302,303,304,305,306);


    @Override
    public void initialize(URL location,ResourceBundle resource){
        registroNroHabitacion.setItems(comboNroHabitaciones);
        this.mostrarPaneX(PaneElegido.paneAdminPass);


    }

    public Hotel cargarDatos(){
        RegistroHuesped h1 = new RegistroHuesped("35140802", 201, LocalDate.of(2021, 05, 25),LocalDate.of(2021, 06, 10));
        RegistroHuesped h2 = new RegistroHuesped("34185634", 203, LocalDate.of(2021, 05, 20),LocalDate.of(2021, 06, 01));
        RegistroHuesped h3 = new RegistroHuesped("38140802", 205, LocalDate.of(2021, 05, 23),LocalDate.of(2021, 06, 15));
        RegistroHuesped h4 = new RegistroHuesped("37415963", 301, LocalDate.of(2021, 05, 24),LocalDate.of(2021, 06, 20));



        Reserva r1=new Reserva(2,"25546465",LocalDate.of(2021, 06, 25),LocalDate.of(2021, 06, 29),0.0);
        Reserva r2=new Reserva(3,"46432210",LocalDate.of(2021, 07, 01),LocalDate.of(2021, 07, 12),0.0);
        Reserva r3=new Reserva(3,"5345656",LocalDate.of(2021, 07, 15),LocalDate.of(2021, 07, 22),0.0);
        Reserva r4=new Reserva(4,"32222963",LocalDate.of(2021, 07, 05),LocalDate.of(2021, 07, 15),1000.0);

        Cliente c1=new Cliente("35140802","Norberto Alonzo","Corriente 3421","alonzo@gmail.com","011-5897587","Argentina","Buenos Aires","Capial Federal");
        Cliente c2=new Cliente("34185634","Osvaldo Ardiles","General Paz 3221","ardiles@gmail.com","011-3244587","Argentina","Buenos Aires","Capial Federal");
        Cliente c3=new Cliente("38140802","Hector Baley","Yrigoyen 1231","Baley@gmail.com","011-3653433","Argentina","Buenos Aires","Capial Federal");
        Cliente c4=new Cliente("37415963","Daniel Bertoni","Cordoba 4323","bertoni@gmail.com","011-6586856","Argentina","Buenos Aires","La Plata");
        Cliente c5=new Cliente("25546465","Ubaldo Filiol","Acha 623","filiol@gmail.com","011-3286856","Argentina","Buenos Aires","Necochea");
        Cliente c6=new Cliente("46432210","Americo Gallego","Chile 323","gallego@gmail.com","011-345856","Argentina","Cordoba","Cordoba");
        Cliente c7=new Cliente("5345656","Luis Galvan","Ilia 3223","galvan@gmail.com","011-653546","Argentina","Buenos Aires","Balcarce");
        Cliente c8=new Cliente("32222963","rene Houseman","Libertad 387","rene@gmail.com","011-64545856","Argentina","Buenos Aires","La Plata");

        Administrador admin = new Administrador("35140802", "Mariano Lopez", "3 de Febrero 4070","mariano@gmail.com", "2235-166113","1234");
        Administrador admin2=new Administrador("1111","admin","adminDir","admin@gmail.com","0800-admin","1234");

        Recepcionista recep1 = new Recepcionista("34159762", "Matias Moreno", "Catelli 4561","matias@gmail.com", "2235-154689","1234");
        Recepcionista recep2 = new Recepcionista("16465112", "Wanda nara", "San Martin 61","wnada@gmail.com", "011-696969","1234");
        Recepcionista recep3 = new Recepcionista("45676845", "Carorl G", "Santiago del estero 361","karol@gmail.com", "011-77777","1234");

        Habitacion habita1=new Habitacion(101,"Simple","Dos personas",1500);
        Habitacion habita2=new Habitacion(102,"Simple","Dos personas",1500);
        Habitacion habita3=new Habitacion(103,"Simple","Dos personas",1500);
        Habitacion habita4=new Habitacion(104,"Simple","Dos personas",1500);
        Habitacion habita5=new Habitacion(105,"Simple","Dos personas",1500);
        Habitacion habita6=new Habitacion(106,"Simple","Dos personas",1500);
        Habitacion habita7=new Habitacion(201,"Doble","Tres personas",2500);
        Habitacion habita8=new Habitacion(202,"Doble","Tres personas",2500);
        Habitacion habita9=new Habitacion(203,"Doble","Tres personas",2500);
        Habitacion habita10=new Habitacion(204,"Doble","Tres personas",2500);
        Habitacion habita11=new Habitacion(205,"Doble","Tres personas",2500);
        Habitacion habita12=new Habitacion(206,"Doble","Tres personas",2500);
        Habitacion habita13=new Habitacion(301,"Triple","Cuatro personas",3500);
        Habitacion habita14=new Habitacion(302,"Triple","Cuatro personas",3500);
        Habitacion habita15=new Habitacion(303,"Triple","Cuatro personas",3500);
        Habitacion habita16=new Habitacion(304,"Triple","Cuatro personas",3500);
        Habitacion habita17=new Habitacion(305,"Triple","Cuatro personas",3500);
        Habitacion habita18=new Habitacion(306,"Triple","Cuatro personas",3500);
        List<RegistroHuesped> registros=new ArrayList<>();
        registros.add(h1);
        registros.add(h2);
        registros.add(h3);
        registros.add(h4);
        List<Habitacion> habitaciones=new ArrayList<>();
        habitaciones.add(habita1);
        habitaciones.add(habita2);
        habitaciones.add(habita3);
        habitaciones.add(habita4);
        habitaciones.add(habita5);
        habitaciones.add(habita6);
        habitaciones.add(habita7);
        habitaciones.add(habita8);
        habitaciones.add(habita9);
        habitaciones.add(habita10);
        habitaciones.add(habita11);
        habitaciones.add(habita12);
        habitaciones.add(habita13);
        habitaciones.add(habita14);
        habitaciones.add(habita15);
        habitaciones.add(habita16);
        habitaciones.add(habita17);
        habitaciones.add(habita18);

        List<Reserva> reservas=new ArrayList<>();
        reservas.add(r1);
        reservas.add(r2);
        reservas.add(r3);
        reservas.add(r4);
        List<Cliente> clientes=new ArrayList<>();
        clientes.add(c1);
        clientes.add(c2);
        clientes.add(c3);
        clientes.add(c4);
        clientes.add(c5);
        clientes.add(c6);
        clientes.add(c7);
        clientes.add(c8);
        List<UsuarioHotel> usuariosHotel=new ArrayList<>();
        usuariosHotel.add(admin);
        usuariosHotel.add(admin2);

        usuariosHotel.add(recep1);
        usuariosHotel.add(recep2);
        usuariosHotel.add(recep3);
        Hotel hotel=new Hotel(usuariosHotel,clientes,habitaciones,reservas,registros);
        return hotel;
    }
    public void onPasswordErrorButtonClicked(MouseEvent event){
        this.mostrarPaneX(PaneElegido.paneAdminPass);
    }
    public void onPasswordEntrarButtonClicked(MouseEvent event){
        // SE DEBE PONER EL PASSWORD CORRECTO!!!!!!!!!!!!!!!
        boolean validacion=false;
        if (cargarDatos().buscarIdUsuarioHotel(identificadorUsuario.getText())!=-1 && listaUsuarioHotel.get(cargarDatos().buscarIdUsuarioHotel(identificadorUsuario.getText())).getClave().equals(passIdentificadorUsuario.getText())){
            this.mostrarPaneX(PaneElegido.paneAccesoPermitido);

            this.mostrarFlechaX(FlechaElegida.arrowAdmin);

        }else {
            mostrarPaneX(PaneElegido.paneErrorIngresoPassword);
            this.mostrarFlechaX(FlechaElegida.arrowAdmin);
        };

    }
    public void bloquearAccesoImegenesSup(){
        imageAdmin.setDisable(true);
        imageClient.setDisable(true);
        imageRecepcionist.setDisable(true);
        imageReserv.setDisable(true);
        imageRegistro.setDisable(true);
        imagePago.setDisable(true);
        imageHabitacion.setDisable(true);

    }
    public void habilitarAccesoImegenesSup(){
        imageAdmin.setDisable(false);
        imageClient.setDisable(false);
        imageRecepcionist.setDisable(false);
        imageReserv.setDisable(false);
        imageRegistro.setDisable(false);
        imagePago.setDisable(false);
        imageHabitacion.setDisable(false);

    }
    public void onPagoButtonClicked(MouseEvent event){
        this.mostrarPaneX(PaneElegido.panePago);

        this.mostrarFlechaX(FlechaElegida.arrowPago);


        columFecha.setCellValueFactory(new PropertyValueFactory<Detalle,String>("Fecha"));
        columCuenta.setCellValueFactory(new PropertyValueFactory<Detalle,Integer>("Cuenta"));
        columNombreDeCuenta.setCellValueFactory(new PropertyValueFactory<Detalle,String>("Cuenta"));
        columReferencia.setCellValueFactory(new PropertyValueFactory<Detalle,Integer>("Referencia"));
        columDescripcion.setCellValueFactory(new PropertyValueFactory<Detalle,String>("Descripcion"));
        columCargos.setCellValueFactory(new PropertyValueFactory<Detalle,Double>("Cargos"));
        columAbono.setCellValueFactory(new PropertyValueFactory<Detalle,Double>("Abono"));
        columEstado.setCellValueFactory(new PropertyValueFactory<Detalle,Boolean>("Estado"));

        tableViewDetalle.setItems(getDetalle());


    }



    public ObservableList<Detalle>getDetalle(){
       ObservableList<Detalle> detalles= FXCollections.observableArrayList();
        detalles.add(new Detalle("02/04/2021",10,"hospedaje",104,"Renta Habitacion",5000.0,0,true));
        detalles.add(new Detalle("03/04/2021",12,"telefono",104,"Servicio Telefono",400.0,0,true));
        return detalles;
    }




    public void onExitButtonClicked(MouseEvent event){
            Platform.exit();
            System.exit(0);
    }
    //====================SELECTOR DE PANELES
    public void mostrarPaneX(String pane){
        if(pane.equals(PaneElegido.paneAdminPass)){
            paneAdminPass.setVisible(true);
        }else{
            paneAdminPass.setVisible(false);
        }

        if(pane.equals(PaneElegido.paneAgregarClient)){
            paneAgregarClient.setVisible(true);
        }else{
            paneAgregarClient.setVisible(false);
        }

        if(pane.equals(PaneElegido. paneModificarClient)){
            paneModificarClient.setVisible(true);
        }else{
            paneModificarClient.setVisible(false);
        }

        if(pane.equals(PaneElegido.paneManejoRecepcionist)){
            paneManejoRecepcionist.setVisible(true);
        }else{
            paneManejoRecepcionist.setVisible(false);
        }

        if(pane.equals(PaneElegido.paneAgregarRecepcionist)){
            paneAgregarRecepcionist.setVisible(true);
        }else{
            paneAgregarRecepcionist.setVisible(false);
        }

        if(pane.equals(PaneElegido.paneManejoClient)){
            paneManejoClient.setVisible(true);
        }else{
            paneManejoClient.setVisible(false);
        }

        if(pane.equals(PaneElegido.paneModificarRecepcionist)){
            paneModificarRecepcionist.setVisible(true);
        }else{
            paneModificarRecepcionist.setVisible(false);
        }
        if(pane.equals(PaneElegido.paneAccesoPermitido)){
            paneAccesoPermitido.setVisible(true);
        }else{
            paneAccesoPermitido.setVisible(false);
        }
        if(pane.equals(PaneElegido.paneReserva)){
            paneReserva.setVisible(true);
        }else{
            paneReserva.setVisible(false);
        }
        if(pane.equals(PaneElegido.paneRegistro)){
            paneRegistro.setVisible(true);
        }else{
            paneRegistro.setVisible(false);
        }
        if(pane.equals(PaneElegido.panePago)){
            panePago.setVisible(true);
        }else{
            panePago.setVisible(false);
        }
        if(pane.equals(PaneElegido.paneRecepcionistaCargado)){
            paneRecepcionistaCargado.setVisible(true);
        }else{
            paneRecepcionistaCargado.setVisible(false);
        }
        if(pane.equals(PaneElegido.paneClienteCargado)){
            paneClienteCargado.setVisible(true);
        }else{
            paneClienteCargado.setVisible(false);
        }
        if(pane.equals(PaneElegido.paneErrorIngresoPassword)){
            paneErrorIngresoPassword.setVisible(true);
        }else{
            paneErrorIngresoPassword.setVisible(false);
        }


    }
    //====================SELECTOR DE FLECHAS
    public void mostrarFlechaX(String flecha){
        if(flecha.equals(FlechaElegida.arrowAdmin)){
            arrowAdmin.setVisible(true);
        }else{
            arrowAdmin.setVisible(false);
        }

        if(flecha.equals(FlechaElegida.arrowClient)){
            arrowClient.setVisible(true);
        }else{
            arrowClient.setVisible(false);
        }
        if(flecha.equals(FlechaElegida.arrowHabitacion)){
            arrowHabitacion.setVisible(true);
        }else{
            arrowHabitacion.setVisible(false);
        }
        if(flecha.equals(FlechaElegida.arrowPago)){
            arrowPago.setVisible(true);
        }else{
            arrowPago.setVisible(false);
        }
        if(flecha.equals(FlechaElegida.arrowRecepcionista)){
            arrowRecepcionista.setVisible(true);
        }else{
            arrowRecepcionista.setVisible(false);
        }
        if(flecha.equals(FlechaElegida.arrowRegistro)){
            arrowRegistro.setVisible(true);
        }else{
            arrowRegistro.setVisible(false);
        }
        if(flecha.equals(FlechaElegida.arrowReserva)){
            arrowReserva.setVisible(true);
        }else{
            arrowReserva.setVisible(false);
        }



    }


    public void onAdminButtonClicked(MouseEvent event){
        this.mostrarPaneX(PaneElegido.paneAdminPass);

        this.mostrarFlechaX(FlechaElegida.arrowAdmin);

    }
    public void onAgregarClientButtonCliked(MouseEvent event){

        this.mostrarPaneX(PaneElegido.paneAgregarClient);
        this.mostrarFlechaX(FlechaElegida.arrowClient);


    }

    public void onModificarClientButtonCliked(MouseEvent event){

        this.mostrarPaneX(PaneElegido.paneModificarClient);

        this.mostrarFlechaX(FlechaElegida.arrowClient);


    }
    public void onAgregarRecepcionistButtonCliked(MouseEvent event){

        this.mostrarPaneX(PaneElegido.paneAgregarRecepcionist);

        this.mostrarFlechaX(FlechaElegida.arrowRecepcionista);

    }

    public void onModificarRecepcionistuttonCliked(MouseEvent event){

        this.mostrarPaneX(PaneElegido.paneModificarRecepcionist);

        this.mostrarFlechaX(FlechaElegida.arrowRecepcionista);


    }

    public void onAdminPassButtonCliked(MouseEvent event){
        // SE DEBE PONER EL PASSWORD CORRECTO!!!!!!!!!!!!!!!
        listaUsuarioHotel= hotel2.getListaUsuarioHotel();
        boolean validacion=false;
        System.out.println("Encontro : "+cargarDatos().buscarIdUsuarioHotel(identificadorUsuario.getText()));
        System.out.println();
        //&& listaUsuarioHotel.get(hotel.buscarIdUsuarioHotel(identificadorUsuario.getText())).getClave().equals(passIdentificadorUsuario.getText())
        System.out.println(listaUsuarioHotel.size());
        if (cargarDatos().buscarIdUsuarioHotel(identificadorUsuario.getText())!=-1 ){
            this.mostrarPaneX(PaneElegido.paneAccesoPermitido);

            this.mostrarFlechaX(FlechaElegida.arrowAdmin);
            habilitarAccesoImegenesSup();

        }else {
            bloquearAccesoImegenesSup();
            mostrarPaneX(PaneElegido.paneErrorIngresoPassword);
            this.mostrarFlechaX(FlechaElegida.arrowAdmin);
        };

    }

    public void onRecepcionistButtonCliked(MouseEvent event){

        this.mostrarPaneX(PaneElegido.paneManejoRecepcionist);

        this.mostrarFlechaX(FlechaElegida.arrowRecepcionista);


    }

    public void onClientButtonClicked(MouseEvent event){

        this.mostrarPaneX(PaneElegido.paneManejoClient);

        this.mostrarFlechaX(FlechaElegida.arrowClient);


    }

    public void onReservaButtonCliked(MouseEvent event){

        this.mostrarPaneX(PaneElegido.paneReserva);

        this.mostrarFlechaX(FlechaElegida.arrowReserva);


    }

    public void onRegistroButtonClicked(MouseEvent event){

        this.mostrarPaneX(PaneElegido.paneRegistro);

        this.mostrarFlechaX(FlechaElegida.arrowRegistro);


    }


    public void onHabitacionButtonClicked(MouseEvent event){

    }

    public void guardarRecepcionista(MouseEvent event){
        Recepcionista recepcionistaNuevo=new Recepcionista(recepcionistaDNI.getText(), recepcionistaNombreApellido.getText(),recepcionistaDireccion.getText(),recepcionistaCorreoElectronico.getText(),recepcionistaTelefono.getText(),recepcionistaPassword.getText());
        listaRececpcionista.add(recepcionistaNuevo);
        mostrarPaneX(PaneElegido.paneRecepcionistaCargado);


    }
    public void guardarCliente(MouseEvent event){
        Cliente clienteNuevo=new Cliente(clienteDNI.getText(), clienteNombreApellido.getText(),clienteDireccion.getText(),clienteCorreoElectronico.getText(),clienteTelefono.getText(),clientePais.getText(),clienteProvincia.getText(),clienteLocalidad.getText());
        listaCliente.add(clienteNuevo);
        mostrarPaneX(PaneElegido.paneClienteCargado);


    }
    public void guardarRegistro(MouseEvent event){
        RegistroHuesped regitroNuevo=new RegistroHuesped(registroIDCliente.getText(),(int)registroNroHabitacion.getValue(),registroFechaIngreso.getValue(),registroFechaEgreso.getValue());
        listaRegistroHuespedes.add(regitroNuevo);


    }





}
