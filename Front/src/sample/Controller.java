package sample;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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


public class Controller implements Initializable {

    @FXML private TextField consumoHuesped;
    @FXML private ComboBox consumoNroHabitacion;
    @FXML private ComboBox consumoOperacion;
    @FXML private TextField consumoCargo;
    @FXML private TextField consumoAbono;
    @FXML private TextField consumoSaldo;
    @FXML private TextField consumoNombreHuesped;

    @FXML private TableView<ReservaCliente> tableViewRegistroReservasCliente;
    @FXML private TableColumn<ReservaCliente,String > tableReservaColumFechaIngreso;
    @FXML private TableColumn<ReservaCliente,String > tableReservaColumFechaEngreso;
    @FXML private TableColumn<ReservaCliente,Integer > tablenReservaNroHabitacion;
    @FXML private TableColumn<ReservaCliente,Double > tableReservaAbono;

    @FXML private TextField registroIDCliente;

    @FXML private CheckBox registroCheckBoxHabi0;
    @FXML private CheckBox registroCheckBoxHabi1;
    @FXML private CheckBox registroCheckBoxHabi2;
    @FXML private CheckBox registroCheckBoxHabi3;
    @FXML private CheckBox registroCheckBoxHabi4;

    @FXML private TextField registroClienteGrupo;
    @FXML private TextArea registroObservaciones;
    @FXML private TextField registroPagoAdelanto;
    @FXML private TextField registroClienteNomebreyApellido;
    @FXML private Button registroButtonRegistrar;
    @FXML private Button registroFechasConfirmar;
    @FXML private Button buttonConfirmarRegistro;
    @FXML private Label labelRegistroGuardadoExitosamente;
    @FXML private Label labelRegistroHabitacionMuestra;
    @FXML private Label labelRegistroFechaEgresoMuestra;
    @FXML private Label labelRegistroFechaIngresoMuestra;
    @FXML private TextField registroAbonoAdelanto;

    @FXML private Button buttonConfirmarReserva;
    @FXML private Label labelReservaGuardadaExitosamente;
    @FXML private Label labelHabitacionMuestra;
    @FXML private Label labelFechaEgresoMuestra;
    @FXML private Label labelFechaIngresoMuestra;
    @FXML private TextField reservaAbonoAdelanto;
    @FXML private ComboBox reservaNroHabitacion;
    @FXML private DatePicker reservaFechaIngreso;
    @FXML private DatePicker reservaFechaEgreso;
    @FXML private TextField reservaBusquedaIdCliente;
    @FXML private TextField reservaClienteNomebreyApellido;


    @FXML private TextField busquedaIdCliente;
    @FXML private TextField mClienteNomebreyAppellido;
    @FXML private TextField mClienteDireccion;
    @FXML private TextField mClienteTelefono;
    @FXML private TextField mClienteDni;
    @FXML private TextField mClienteLocalidad;
    @FXML private TextField mClienteProvincia;
    @FXML private TextField mClientePais;

    @FXML private TextField busquedaIdRececionista;
    @FXML private TextField mRecepcionistaNomebreyAppellido;
    @FXML private TextField mRecepcionistaDireccion;
    @FXML private TextField mRecepcionistaTelefono;
    @FXML private TextField mRecepcionistaDni;
    @FXML private TextField mRecepcionistaPassword;

    @FXML private TextField identificadorUsuario;
    @FXML private PasswordField passIdentificadorUsuario;
    @FXML private Button botonAccesoUsuario;

    @FXML private TableView<TableViewCliente> tableViewListadoClientes;
    @FXML private TableColumn<Cliente, String> listaClienteColumDni;
    @FXML private TableColumn<Cliente, String> listaClienteColumApellidoNombre;
    @FXML private TableColumn<Cliente, String> listaClienteColumPais;
    @FXML private TableColumn<Cliente, String> listaClienteColumProvincia;
    @FXML private TableColumn<Cliente, String> listaClienteColumLocalidad;
    @FXML private TableColumn<Cliente, String> listaClienteColumDomicilio;
    @FXML private TableColumn<Cliente, String> listaClienteColumCorreoElect;
    @FXML private TableColumn<Cliente, String> listaClienteColumTelefono;





//=====================PANEL CLIENTE
    @FXML private Label labelPaneClienteCargadoExitosamente;
    @FXML private Label prueba;
    @FXML private TextField clienteCorreoElectronico;
    @FXML private TextField clienteLocalidad;
    @FXML private TextField clienteProvincia;
    @FXML private TextField clientePais;
    @FXML private TextField clienteDNI;
    @FXML private TextField clienteTelefono;
    @FXML private TextField clienteDireccion;
    @FXML private TextField clienteNombreApellido;
//====================PANEL RECEPCIONISTA
    @FXML private Label labelRecepcionitaCargadoExitosamente;
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
    @FXML private AnchorPane paneTopUsuario;
    @FXML private AnchorPane paneTopAdmin;
    @FXML private AnchorPane paneTopCliente;
    @FXML private AnchorPane paneRegistroCargado;
    @FXML private AnchorPane paneReservaCargada;
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

    @FXML private AnchorPane paneListarClientes;

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

    List<Habitacion> listaHabitacion=new ArrayList<>();
    List<Recepcionista> listaRececpcionista=new ArrayList<>();
    List<Reserva> listaReserva=new ArrayList<>();

    List<RegistroHuesped> listaRegistroHuespedes=new ArrayList<>();
    Hotel hotel=new Hotel();






    //private Hotel hotel2=new Hotel(listaUsuarioHotel,listaCliente,listaHabitacion,listaReserva,listaRegistroHuespedes);
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

  //  ObservableList<Integer> comboNroHabitaciones=FXCollections.observableArrayList();


    @Override
    public void initialize(URL location,ResourceBundle resource){
       // registroNroHabitacion.setItems(comboNroHabitaciones);
        this.mostrarPaneX(PaneElegido.paneAdminPass);
        this.mostrarPaneTopX(PaneElegido.paneTopAdmin);
        bloquearAccesoImegenesSup();
        mostrarFlechaX(FlechaElegida.arrowNinguna);
        cargarDatos();


    }

    public void cargarDatos(){
        RegistroHuesped h1 = new RegistroHuesped("35140802", 201, LocalDate.of(2021, 05, 25),LocalDate.of(2021, 06, 10));
        RegistroHuesped h2 = new RegistroHuesped("34185634", 203, LocalDate.of(2021, 05, 20),LocalDate.of(2021, 06, 01));
        RegistroHuesped h3 = new RegistroHuesped("38140802", 205, LocalDate.of(2021, 05, 23),LocalDate.of(2021, 06, 15));
        RegistroHuesped h4 = new RegistroHuesped("37415963", 301, LocalDate.of(2021, 05, 24),LocalDate.of(2021, 06, 20));



        Reserva r1=new Reserva(2,"25546465",LocalDate.of(2021, 06, 25),LocalDate.of(2021, 06, 29),0.0);
        Reserva r2=new Reserva(3,"46432210",LocalDate.of(2021, 07, 01),LocalDate.of(2021, 07, 12),0.0);
        Reserva r3=new Reserva(3,"5345656",LocalDate.of(2021, 07, 15),LocalDate.of(2021, 07, 22),0.0);
        Reserva r4=new Reserva(4,"32222963",LocalDate.of(2021, 07, 05),LocalDate.of(2021, 07, 15),1000.0);
        Reserva r5=new Reserva(5,"11111111",LocalDate.of(2021, 06, 06),LocalDate.of(2021, 05, 16),1000.0);
        Reserva r6=new Reserva(7,"11111111",LocalDate.of(2021, 06, 06),LocalDate.of(2021, 05, 16),1000.0);

        Cliente c1=new Cliente("35140802","Norberto Alonzo","Corriente 3421","alonzo@gmail.com","011-5897587","Argentina","Buenos Aires","Capial Federal");
        Cliente c2=new Cliente("34185634","Osvaldo Ardiles","General Paz 3221","ardiles@gmail.com","011-3244587","Argentina","Buenos Aires","Capial Federal");
        Cliente c3=new Cliente("38140802","Hector Baley","Yrigoyen 1231","Baley@gmail.com","011-3653433","Argentina","Buenos Aires","Capial Federal");
        Cliente c4=new Cliente("37415963","Daniel Bertoni","Cordoba 4323","bertoni@gmail.com","011-6586856","Argentina","Buenos Aires","La Plata");
        Cliente c5=new Cliente("25546465","Ubaldo Filiol","Acha 623","filiol@gmail.com","011-3286856","Argentina","Buenos Aires","Necochea");
        Cliente c6=new Cliente("46432210","Americo Gallego","Chile 323","gallego@gmail.com","011-345856","Argentina","Cordoba","Cordoba");
        Cliente c7=new Cliente("5345656","Luis Galvan","Ilia 3223","galvan@gmail.com","011-653546","Argentina","Buenos Aires","Balcarce");
        Cliente c8=new Cliente("32222963","rene Houseman","Libertad 387","rene@gmail.com","011-64545856","Argentina","Buenos Aires","La Plata");
        Cliente c9=new Cliente("11111111","Nippur de Lagash","Libertad 387","rene@gmail.com","011-64545856","Argentina","Buenos Aires","La Plata");
        Consumo cc1=new Consumo(LocalDate.of(2021,6,5),"Renta Habitacion",1500,0.0);
        Consumo cc2=new Consumo(LocalDate.of(2021,6,5),"Renta CunaBebe",500,500);


        c9.setConsumos(cc1);
        c9.setConsumos(cc2);

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
        //List<RegistroHuesped> registros=new ArrayList<>();

        listaRegistroHuespedes.add(h1);
        listaRegistroHuespedes.add(h2);
        listaRegistroHuespedes.add(h3);
        listaRegistroHuespedes.add(h4);
        //List<Habitacion> habitaciones=new ArrayList<>();
        listaHabitacion.add(habita1);
        listaHabitacion.add(habita2);
        listaHabitacion.add(habita3);
        listaHabitacion.add(habita4);
        listaHabitacion.add(habita5);
        listaHabitacion.add(habita6);
        listaHabitacion.add(habita7);
        listaHabitacion.add(habita8);
        listaHabitacion.add(habita9);
        listaHabitacion.add(habita10);
        listaHabitacion.add(habita11);
        listaHabitacion.add(habita12);
        listaHabitacion.add(habita13);
        listaHabitacion.add(habita14);
        listaHabitacion.add(habita15);
        listaHabitacion.add(habita16);
        listaHabitacion.add(habita17);
        listaHabitacion.add(habita18);

        //List<Reserva> reservas=new ArrayList<>();
        listaReserva.add(r1);
        listaReserva.add(r2);
        listaReserva.add(r3);
        listaReserva.add(r4);
        listaReserva.add(r5);
        listaReserva.add(r6);
        //List<Cliente> clientes=new ArrayList<>();
        listaCliente.add(c1);
        listaCliente.add(c2);
        listaCliente.add(c3);
        listaCliente.add(c4);
        listaCliente.add(c5);
        listaCliente.add(c6);
        listaCliente.add(c7);
        listaCliente.add(c8);
        listaCliente.add(c9);
        //List<UsuarioHotel> usuariosHotel=new ArrayList<>();
        listaUsuarioHotel.add(admin);
        listaUsuarioHotel.add(admin2);

        listaUsuarioHotel.add(recep1);
        listaUsuarioHotel.add(recep2);
        listaUsuarioHotel.add(recep3);
        hotel.setListaCliente(listaCliente);
        hotel.setListaHabitacion(listaHabitacion);
        hotel.setListaReserva(listaReserva);
        hotel.setListaUsuarioHotel(listaUsuarioHotel);
        hotel.setRegistroHuespedes(listaRegistroHuespedes);


    }
    public void onAdminPassButtonCliked(MouseEvent event){
        // SE DEBE PONER EL PASSWORD CORRECTO!!!!!!!!!!!!!!!


        boolean validacion=false;

        int indiceCliente=hotel.buscarIdCliente(identificadorUsuario.getText());
        int indiceUsuarioHotel=hotel.buscarIdUsuarioHotel(identificadorUsuario.getText());
        if(indiceCliente!=-1 || indiceUsuarioHotel !=-1) {
            if (indiceCliente != -1) {
                mostrarPaneTopX(PaneElegido.paneTopCliente);
            } else {
                if (indiceUsuarioHotel != -1 && listaUsuarioHotel.get(indiceUsuarioHotel).getClave().equals(passIdentificadorUsuario.getText())) {

                    if (listaUsuarioHotel.get(indiceUsuarioHotel) instanceof Administrador) {

                        this.mostrarPaneX(PaneElegido.paneAccesoPermitido);

                        this.mostrarFlechaX(FlechaElegida.arrowAdmin);
                        habilitarAccesoImegenesSup();
                    } else {

                        this.mostrarPaneX(PaneElegido.paneAccesoPermitido);
                        this.mostrarPaneTopX(PaneElegido.paneTopUsuario);
                        this.mostrarFlechaX(FlechaElegida.arrowAdmin);

                    }

                }
            }
        }else{
            bloquearAccesoImegenesSup();
            mostrarPaneX(PaneElegido.paneErrorIngresoPassword);
            this.mostrarFlechaX(FlechaElegida.arrowAdmin);
        }

    }
    public void onPasswordErrorButtonClicked(MouseEvent event){
        this.mostrarPaneX(PaneElegido.paneAdminPass);
    }
   /* public void onPasswordEntrarButtonClicked(MouseEvent event){
        // SE DEBE PONER EL PASSWORD CORRECTO!!!!!!!!!!!!!!!
        boolean validacion=false;
        if (hotel.buscarIdUsuarioHotel(identificadorUsuario.getText())!=-1 && listaUsuarioHotel.get(hotel.buscarIdUsuarioHotel(identificadorUsuario.getText())).getClave().equals(passIdentificadorUsuario.getText())){
            this.mostrarPaneX(PaneElegido.paneAccesoPermitido);

            this.mostrarFlechaX(FlechaElegida.arrowAdmin);

        }else {
            mostrarPaneX(PaneElegido.paneErrorIngresoPassword);
            this.mostrarFlechaX(FlechaElegida.arrowAdmin);
        };

    }

    */
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
    public void onPagoButtonClicked(MouseEvent event) {

        this.mostrarPaneX(PaneElegido.panePago);

        this.mostrarFlechaX(FlechaElegida.arrowPago);

    }
    public ObservableList<Detalle>getDetalle(Cliente cliente){
        List<Consumo> listaConsumo=cliente.getConsumos();
        ObservableList<Detalle> detalles= FXCollections.observableArrayList();
        for (Consumo co:listaConsumo) {
            detalles.add(new Detalle(co.getFechaConsumo().toString(), 10, co.getDetalleConsumo(), 104, co.getDetalleConsumo(), co.getMonto(), co.getPagoConsumo(), true));
        }
        return detalles;
    }
    public void onConsumoSeleccionarClienteButtonClicked(MouseEvent event){
        Cliente cliente=listaCliente.get(hotel.buscarIdCliente(consumoHuesped.getText()));
        columFecha.setCellValueFactory(new PropertyValueFactory<Detalle,String>("Fecha"));
        columCuenta.setCellValueFactory(new PropertyValueFactory<Detalle,Integer>("Cuenta"));
        columNombreDeCuenta.setCellValueFactory(new PropertyValueFactory<Detalle,String>("Cuenta"));
        columReferencia.setCellValueFactory(new PropertyValueFactory<Detalle,Integer>("Referencia"));
        columDescripcion.setCellValueFactory(new PropertyValueFactory<Detalle,String>("Descripcion"));
        columCargos.setCellValueFactory(new PropertyValueFactory<Detalle,Double>("Cargos"));
        columAbono.setCellValueFactory(new PropertyValueFactory<Detalle,Double>("Abono"));
        columEstado.setCellValueFactory(new PropertyValueFactory<Detalle,Boolean>("Estado"));

        tableViewDetalle.setItems(getDetalle(cliente));
        consumoCargo.setText(String.valueOf(cliente.calculoSaldo()));
        consumoAbono.setText(String.valueOf(cliente.sumatoriaPagos()));
        consumoSaldo.setText(String.valueOf(cliente.calculoSaldo()));


    }

    public void onConsumoBuscarClienteClicked(MouseEvent event){
        int indiceCliente=hotel.buscarIdCliente(consumoHuesped.getText());
        if(indiceCliente!=-1) {
           consumoNombreHuesped.setText(listaCliente.get(indiceCliente).getNombreYapellido());
        }else{
            consumoNombreHuesped.setText("Cliente no registrado");
        }
    }






    public void onExitButtonClicked(MouseEvent event){
            Platform.exit();
            System.exit(0);
    }
    //====================SELECTOR DE PANELES
    public void mostrarPaneTopX(String paneTop){
        if(paneTop.equals(PaneElegido.paneTopCliente)){
            paneTopCliente.setVisible(true);
        }else{
            paneTopCliente.setVisible(false);
        }
        if(paneTop.equals(PaneElegido.paneTopAdmin)){
            paneTopAdmin.setVisible(true);
        }else{
            paneTopAdmin.setVisible(false);
        }
        if(paneTop.equals(PaneElegido.paneTopUsuario)){
            paneTopUsuario.setVisible(true);
        }else{
            paneTopUsuario.setVisible(false);
        }

    }
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
        if(pane.equals(PaneElegido.paneReservaCargada)){
            paneReservaCargada.setVisible(true);
        }else{
            paneReservaCargada.setVisible(false);
        }
        if(pane.equals(PaneElegido.paneRegistroCargado)){
            paneRegistroCargado.setVisible(true);
        }else{
            paneRegistroCargado.setVisible(false);
        }

        if(pane.equals(PaneElegido.paneListarCliente)){
            paneListarClientes.setVisible(true);
        }else{
            paneListarClientes.setVisible(false);
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


    public void onModificarClientButtonCliked(MouseEvent event){
        busquedaIdCliente.clear();
        mClienteDni.clear();
        mClienteNomebreyAppellido.clear();
        mClienteDireccion.clear();
        mClienteTelefono.clear();
        mClienteLocalidad.clear();
        mClienteProvincia.clear();
        mClientePais.clear();
        this.mostrarPaneX(PaneElegido.paneModificarClient);

        this.mostrarFlechaX(FlechaElegida.arrowClient);


    }
    public void onAgregarRecepcionistButtonCliked(MouseEvent event){

        recepcionistaCorreoElectronico.clear();
        recepcionistaPassword.clear();
        recepcionistaDNI.clear();
        recepcionistaTelefono.clear();
        recepcionistaDireccion.clear();
        recepcionistaNombreApellido.clear();
        this.mostrarPaneX(PaneElegido.paneAgregarRecepcionist);

        this.mostrarFlechaX(FlechaElegida.arrowRecepcionista);

    }
    public void guardarRecepcionista(MouseEvent event){
        int idRecepcionista=hotel.buscarIdUsuarioHotel(recepcionistaDNI.getText());
        if(idRecepcionista==-1) {
            Recepcionista recepcionistaNuevo = new Recepcionista(recepcionistaDNI.getText(), recepcionistaNombreApellido.getText(), recepcionistaDireccion.getText(), recepcionistaCorreoElectronico.getText(), recepcionistaTelefono.getText(), recepcionistaPassword.getText());
            listaRececpcionista.add(recepcionistaNuevo);
            labelRecepcionitaCargadoExitosamente.setText("RECEPCIONISTA CARGADO EXITOSAMENTE");
            mostrarPaneX(PaneElegido.paneRecepcionistaCargado);
            hotel.getListaUsuarioHotel().add(recepcionistaNuevo);
        }else{
            mostrarPaneX(PaneElegido.paneRecepcionistaCargado);
            labelRecepcionitaCargadoExitosamente.setText("EL RECEPCIONISTA YA SE ENCUENTRA REGISTRADO");
        }


    }

    public void onModificarRecepcionistuttonCliked(MouseEvent event){
        busquedaIdRececionista.clear();
        mRecepcionistaDni.clear();
        mRecepcionistaNomebreyAppellido.clear();
        mRecepcionistaDireccion.clear();
        mRecepcionistaTelefono.clear();
        mRecepcionistaPassword.clear();
        this.mostrarPaneX(PaneElegido.paneModificarRecepcionist);

        this.mostrarFlechaX(FlechaElegida.arrowRecepcionista);


    }





    public void onClientButtonClicked(MouseEvent event){

        this.mostrarPaneX(PaneElegido.paneManejoClient);

        this.mostrarFlechaX(FlechaElegida.arrowClient);


    }




    public void onRecepcionistButtonCliked(MouseEvent event){

        this.mostrarPaneX(PaneElegido.paneManejoRecepcionist);

        this.mostrarFlechaX(FlechaElegida.arrowRecepcionista);


    }



    public void onAgregarClientButtonCliked(MouseEvent event){
        clienteCorreoElectronico.clear();
        clienteLocalidad.clear();
        clienteProvincia.clear();
        clientePais.clear();
        clienteDNI.clear();
        clienteTelefono.clear();
        clienteDireccion.clear();
        clienteNombreApellido.clear();
        this.mostrarPaneX(PaneElegido.paneAgregarClient);
        this.mostrarFlechaX(FlechaElegida.arrowClient);


    }
    public void guardarCliente(MouseEvent event){
        int idCliente= hotel.buscarIdCliente(clienteDNI.getText());
        if(idCliente==-1) {
            Cliente clienteNuevo = new Cliente(clienteDNI.getText(), clienteNombreApellido.getText(), clienteDireccion.getText(), clienteCorreoElectronico.getText(), clienteTelefono.getText(), clientePais.getText(), clienteProvincia.getText(), clienteLocalidad.getText());
            listaCliente.add(clienteNuevo);
            mostrarPaneX(PaneElegido.paneClienteCargado);
            hotel.getListaCliente().add(clienteNuevo);
            labelPaneClienteCargadoExitosamente.setText("CLIENTE CARGADO EXITOSAMENTE");


        }else{
            labelPaneClienteCargadoExitosamente.setText("EL USUARIO YA SE ENCUENTRA REGISTRADO");
            mostrarPaneX(PaneElegido.paneClienteCargado);
        }

    }




    public void onBuscarRegistrarClienteButtonClicked(MouseEvent event){
        int indiceCliente=hotel.buscarIdCliente(registroIDCliente.getText());
        if(indiceCliente!=-1) {
            registroClienteNomebreyApellido.setText(listaCliente.get(indiceCliente).getNombreYapellido());

        }else{
            registroClienteNomebreyApellido.setText("Cliente no registrado");
        }
    }

    public ObservableList<ReservaCliente>getReservaCliente(Cliente cliente){
        List<Reserva> listaReservaCliente=hotel.buscarReservaPorIdCliente(cliente.getId());

        ObservableList<ReservaCliente> reservaClientes= FXCollections.observableArrayList();
        for (Reserva rc:listaReservaCliente) {
            Integer nroHabitac=hotel.buscarNumeroHabitacionPorId(rc.getIdHabitacion());

            reservaClientes.add(new ReservaCliente(nroHabitac,rc.getFechaIngreso().toString(), rc.getFechaEgreso().toString(), rc.getPagoReserva()));
        }

        return reservaClientes;
    }





    public void onSeleccionarRegistrarClienteButtonClicked(MouseEvent event){
        tablenReservaNroHabitacion.setCellValueFactory(new PropertyValueFactory<ReservaCliente,Integer>("NroHabitacion"));
        tableReservaColumFechaIngreso.setCellValueFactory(new PropertyValueFactory<ReservaCliente,String>("FechaIngreso"));
        tableReservaColumFechaEngreso.setCellValueFactory(new PropertyValueFactory<ReservaCliente,String>("FechaEgreso"));
        tableReservaAbono.setCellValueFactory(new PropertyValueFactory<ReservaCliente,Double>("Abono"));
        Cliente cliente=hotel.buscarClientePorID(registroIDCliente.getText());

        tableViewRegistroReservasCliente.setItems(getReservaCliente(cliente));

    }

    public void onSeleccionarPaneListarClienteButtonClicked(MouseEvent event) {
        this.mostrarPaneX(PaneElegido.paneListarCliente);
    }
    public ObservableList<TableViewCliente> getListaClienteTabla(){
        ObservableList<TableViewCliente> listaClientesTabla = FXCollections.observableArrayList();
        for(Cliente cl:hotel.getListaCliente()){
            //String id, String nombreYapellido, String direccion, String correoElectronico, String telefono, String pais, String provincia, String localidad
            listaClientesTabla.add(new TableViewCliente(cl.getId(),cl.getNombreYapellido(),cl.getDireccion(),cl.getCorreoElectronico(),cl.getTelefono(),cl.getPais(),cl.getProvincia(),cl.getLocalidad()));
        }
        return listaClientesTabla;
    }
    public void onSeleccionarListarClienteButtonClicked(MouseEvent event) {

        listaClienteColumDni.setCellValueFactory(new PropertyValueFactory<Cliente,String>("id"));
        listaClienteColumApellidoNombre.setCellValueFactory(new PropertyValueFactory<Cliente,String>("nombreYapellido"));
        listaClienteColumPais.setCellValueFactory(new PropertyValueFactory<Cliente,String>("pais"));
        listaClienteColumProvincia.setCellValueFactory(new PropertyValueFactory<Cliente,String>("provincia"));
        listaClienteColumLocalidad.setCellValueFactory(new PropertyValueFactory<Cliente,String>("localidad"));
        listaClienteColumDomicilio.setCellValueFactory(new PropertyValueFactory<Cliente,String>("direccion"));
        listaClienteColumCorreoElect.setCellValueFactory(new PropertyValueFactory<Cliente,String>("correoElectronico"));
        listaClienteColumTelefono.setCellValueFactory(new PropertyValueFactory<Cliente,String>("telefono"));

        tableViewListadoClientes.setItems(getListaClienteTabla());

    }


    public void onRegistrarConfirmarButtonClicked(MouseEvent event){
        Cliente cliente=hotel.buscarClientePorID(registroIDCliente.getText());

        List<CheckBox> comboHabita=new ArrayList<>();
        comboHabita.add(registroCheckBoxHabi0);
        comboHabita.add(registroCheckBoxHabi1);
        comboHabita.add(registroCheckBoxHabi2);
        comboHabita.add(registroCheckBoxHabi3);
        comboHabita.add(registroCheckBoxHabi4);
        ObservableList<ReservaCliente> listReservasCliente=getReservaCliente(cliente);
        for(int i=0;i<listReservasCliente.size();i++){
            comboHabita.get(i).setText(listReservasCliente.get(i).getNroHabitacion().toString());
            comboHabita.get(i).setVisible(true);

        }
        /*

        List<Habitacion> habitacionesLibres=hotel.habitacionesLibres(registroFechaIngreso.getValue(),registroFechaEgreso.getValue());
        ObservableList<Integer> comboSoloHabitacionesLibres=FXCollections.observableArrayList();
        registroNroHabitacion.setDisable(false);
        for(int i=0;i<habitacionesLibres.size();i++){

            comboSoloHabitacionesLibres.add(habitacionesLibres.get(i).getNumeroHabitacion());

        }
        registroNroHabitacion.setItems(comboSoloHabitacionesLibres);

        registroButtonRegistrar.setDisable(false);

         */
    }


    public void onRegistroButtonClicked(MouseEvent event){
        registroIDCliente.clear();
        registroClienteNomebreyApellido.clear();

        registroButtonRegistrar.setDisable(true);
        registroCheckBoxHabi0.setVisible(false);
        registroCheckBoxHabi1.setVisible(false);
        registroCheckBoxHabi2.setVisible(false);
        registroCheckBoxHabi3.setVisible(false);
        registroCheckBoxHabi4.setVisible(false);


        this.mostrarPaneX(PaneElegido.paneRegistro);

        this.mostrarFlechaX(FlechaElegida.arrowRegistro);

    }
    public void guardarRegistro(MouseEvent event){

        buttonConfirmarRegistro.setDisable(false);
        labelRegistroGuardadoExitosamente.setText("VERIFICAR FECHAS Y HABITACION");
        mostrarPaneX(PaneElegido.paneRegistroCargado);
        //labelRegistroHabitacionMuestra.setText(registroNroHabitacion.getValue().toString());
        //labelRegistroFechaEgresoMuestra.setText(registroFechaEgreso.getValue().toString());
        //labelRegistroFechaIngresoMuestra.setText(registroFechaIngreso.getValue().toString());

    }
    public void onConfirmarRegistroButtonClicked(MouseEvent event){

        labelRegistroGuardadoExitosamente.setText("EL REGISTRO FUE CARGADO EXITOSAMENTE");
        //int nroHabitacion=Integer.valueOf(registroNroHabitacion.getValue().toString());

        //int idHabitacion=hotel.buscarIdPorNumeroDeHabitacion(nroHabitacion);
        double pagoAdelanto=Double.parseDouble(registroPagoAdelanto.getText());
        /*
        //cambiar : sacar fechas y que tome de reserva, las reservas activas
        RegistroHuesped registroNuevo=new RegistroHuesped(registroIDCliente.getText(),idHabitacion,registroFechaIngreso.getValue(),registroFechaEgreso.getValue());
        listaRegistroHuespedes.add(registroNuevo);
        hotel.getRegistroHuespedes().add(registroNuevo);
        buttonConfirmarRegistro.setDisable(true);

        System.out.println("hasta aca llega");
        System.out.println(nroHabitacion);
        System.out.println(registroFechaIngreso.getValue().toString()+"   "+registroFechaEgreso.getValue().toString());
        System.out.println(hotel.buscarIdPorNumeroDeHabitacion(nroHabitacion));
        double monto=hotel.montoHabitacionEstadia(LocalDate.of(2021,5,10),LocalDate.of(2021,5,20),nroHabitacion);

       // String montoString=String.valueOf(monto);
        //System.out.println(montoString);
        System.out.println(monto);


        //
        //Consumo nuevoConsumo=new Consumo(registroFechaIngreso.getValue(),"Alquiler Habitacion",hotel.montoHabitacionEstadia(registroFechaIngreso.getValue(),registroFechaEgreso.getValue(),nroHabitacion),pagoAdelanto);
       // hotel.getListaCliente().get(hotel.buscarIdUsuarioHotel(registroIDCliente.getText())).setConsumos(nuevoConsumo);
       // System.out.println(nuevoConsumo.toString());
       // System.out.println(hotel.getListaCliente().get(hotel.buscarIdUsuarioHotel(registroIDCliente.getText())).getConsumos().toString());


         */
    }

    public void onBuscarModificarRecepcionistaButtonClicked(MouseEvent event){
        int indiceUsuarioHotel=hotel.buscarIdUsuarioHotel(busquedaIdRececionista.getText());
        if(indiceUsuarioHotel!=-1){
            busquedaIdRececionista.setText(listaUsuarioHotel.get(indiceUsuarioHotel).getId());
            mRecepcionistaNomebreyAppellido.setText(listaUsuarioHotel.get(indiceUsuarioHotel).getNombreYapellido());
            mRecepcionistaDireccion.setText(listaUsuarioHotel.get(indiceUsuarioHotel).getDireccion());
            mRecepcionistaTelefono.setText(listaUsuarioHotel.get(indiceUsuarioHotel).getTelefono());
            mRecepcionistaDni.setText(listaUsuarioHotel.get(indiceUsuarioHotel).getId());
            mRecepcionistaPassword.setText(listaUsuarioHotel.get(indiceUsuarioHotel).getClave());

        }

    }
    public void onGuardarModificarRecepcionistaButtonClicked(MouseEvent event){


        int indiceUsuarioHotel=hotel.buscarIdUsuarioHotel(busquedaIdRececionista.getText());
        if(indiceUsuarioHotel!=-1) {
            listaUsuarioHotel.get(indiceUsuarioHotel).setId(mRecepcionistaDni.getText());
            listaUsuarioHotel.get(indiceUsuarioHotel).setNombreYapellido(mRecepcionistaNomebreyAppellido.getText());
            listaUsuarioHotel.get(indiceUsuarioHotel).setDireccion(mRecepcionistaDireccion.getText());
            listaUsuarioHotel.get(indiceUsuarioHotel).setTelefono(mRecepcionistaTelefono.getText());
            listaUsuarioHotel.get(indiceUsuarioHotel).setClave(mRecepcionistaPassword.getText());
            mostrarPaneX(PaneElegido.paneRecepcionistaCargado);
        }

    }

    public void onBuscarModificarClienteButtonClicked(MouseEvent event){
        int indiceCliente=hotel.buscarIdCliente(busquedaIdCliente.getText());
        if(indiceCliente!=-1){
            busquedaIdCliente.setText(listaCliente.get(indiceCliente).getId());
            mClienteNomebreyAppellido.setText(listaCliente.get(indiceCliente).getNombreYapellido());
            mClienteDireccion.setText(listaCliente.get(indiceCliente).getDireccion());
            mClienteTelefono.setText(listaCliente.get(indiceCliente).getTelefono());
            mClienteDni.setText(listaCliente.get(indiceCliente).getId());
            mClienteLocalidad.setText(listaCliente.get(indiceCliente).getLocalidad());
            mClienteProvincia.setText(listaCliente.get(indiceCliente).getProvincia());
            mClientePais.setText(listaCliente.get(indiceCliente).getPais());

        }

    }
    public void onGuardarModificarClienteButtonClicked(MouseEvent event){

        int indiceCliente=hotel.buscarIdCliente(busquedaIdCliente.getText());
        if(indiceCliente!=-1) {
            listaCliente.get(indiceCliente).setId(mClienteDni.getText());
            listaCliente.get(indiceCliente).setNombreYapellido(mClienteNomebreyAppellido.getText());
            listaCliente.get(indiceCliente).setDireccion(mClienteDireccion.getText());
            listaCliente.get(indiceCliente).setTelefono(mClienteTelefono.getText());
            listaCliente.get(indiceCliente).setLocalidad(mClienteLocalidad.getText());
            listaCliente.get(indiceCliente).setProvincia(mClienteProvincia.getText());
            listaCliente.get(indiceCliente).setPais(mClientePais.getText());
            mostrarPaneX(PaneElegido.paneClienteCargado);
        }

    }

    public void onReservaButtonCliked(MouseEvent event){
        reservaClienteNomebreyApellido.setDisable(false);
        reservaAbonoAdelanto.setDisable(false);
        reservaBusquedaIdCliente.clear();
        reservaClienteNomebreyApellido.clear();
        reservaNroHabitacion.setDisable(true);
        reservaFechaIngreso.setDisable(true);
        reservaFechaEgreso.setDisable(true);
        reservaFechaIngreso.setValue(null);
        reservaFechaEgreso.setValue(null);
        this.mostrarPaneX(PaneElegido.paneReserva);

        this.mostrarFlechaX(FlechaElegida.arrowReserva);


    }

    public void onBuscarReservaClienteButtonClicked(MouseEvent event){
        int indiceCliente=hotel.buscarIdCliente(reservaBusquedaIdCliente.getText());
        if(indiceCliente!=-1) {
           reservaClienteNomebreyApellido.setText(listaCliente.get(indiceCliente).getNombreYapellido());
        }else{
            reservaClienteNomebreyApellido.setText("Cliente no registrado");
        }
    }

    public void onSeleccionarReservaClienteButtonClicked(MouseEvent event){
        reservaClienteNomebreyApellido.setDisable(true);
        reservaFechaIngreso.setDisable(false);
        reservaFechaEgreso.setDisable(false);
    }

    public void onBuscarFechasReservaButtonClicked(MouseEvent event){
        List<Habitacion> habitacionesLibres=hotel.habitacionesLibres(reservaFechaIngreso.getValue(),reservaFechaEgreso.getValue());
        ObservableList<Integer> comboSoloHabitacionesLibres=FXCollections.observableArrayList();

        for(int i=0;i<habitacionesLibres.size();i++){

            comboSoloHabitacionesLibres.add(habitacionesLibres.get(i).getNumeroHabitacion());

        }
        reservaNroHabitacion.setItems(comboSoloHabitacionesLibres);
        reservaNroHabitacion.setDisable(false);

    }

    public void onReservarClienteButtonClicked(MouseEvent event){
        buttonConfirmarReserva.setDisable(false);
        labelReservaGuardadaExitosamente.setText("VERIFICAR FECHAS Y HABITACION");
        mostrarPaneX(PaneElegido.paneReservaCargada);
        labelHabitacionMuestra.setText(reservaNroHabitacion.getValue().toString());
        labelFechaEgresoMuestra.setText(reservaFechaEgreso.getValue().toString());
        labelFechaIngresoMuestra.setText(reservaFechaIngreso.getValue().toString());

    }
    public void onConfirmarReservaButtonClicked(MouseEvent event){
        labelReservaGuardadaExitosamente.setText("RESERVA CARGADA EXITOSAMENTE");
        double adelanto=Double.parseDouble(reservaAbonoAdelanto.getText());
        Reserva reservaNueva=new Reserva(hotel.buscarIdPorNumeroDeHabitacion((int)reservaNroHabitacion.getValue()),reservaBusquedaIdCliente.getText(),reservaFechaIngreso.getValue(),reservaFechaEgreso.getValue(),adelanto);
        hotel.getListaReserva().add(reservaNueva);
        buttonConfirmarReserva.setDisable(true);
    }

    public void pagarAdelantoReservaButtonClicked(MouseEvent event){
        reservaAbonoAdelanto.setDisable(true);
    }
}
