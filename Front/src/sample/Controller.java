package sample;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
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
import javafx.util.Callback;
import sample.back.*;


import java.io.File;
import java.net.URL;
import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.*;


public class Controller implements Initializable {
    //============CHECKOUT=======================
    @FXML private Button buttonElegirCheckoutPorHabitacion;
    @FXML private Label labelCheckoutCheckboxError;
    @FXML private TextField textCargoChekoutFinal;
    @FXML private TextField textAbonoChekoutFinal;
    @FXML private TextField textSldoFinalChekoutFinal;
    @FXML private TextField textAbonoFinalChekoutFinal;
    @FXML private TextField textVueltoChekoutFinal;
    @FXML private TextField textCargoChekoutHab;
    @FXML private TextField textAbonoChekoutHab;
    @FXML private TextField textSldoFinalChekoutHab;
    @FXML private TextField textVueltoChekoutHab;
    @FXML private TextField textAbonoFinalChekoutHab;
    @FXML private TextField textIdClienteCheckout;
    @FXML private Label lablelNombreClienteCheckout;
    @FXML private CheckBox checkoutCheckBoxHabi0;
    @FXML private CheckBox checkoutCheckBoxHabi1;
    @FXML private CheckBox checkoutCheckBoxHabi2;
    @FXML private CheckBox checkoutCheckBoxHabi3;
    @FXML private CheckBox checkoutCheckBoxHabi4;

    @FXML private DatePicker datePickerHabitacionesEstado;
    @FXML private TableView<TableViewHabEstado> tableHabitacionesEstado;
    @FXML private TableColumn<TableViewHabEstado,Integer > columnaHabitacion;
    @FXML private TableColumn<TableViewHabEstado,String > fechaAnt;
    @FXML private TableColumn<TableViewHabEstado,String > fecha00;
    @FXML private TableColumn<TableViewHabEstado,String > fecha01;
    @FXML private TableColumn<TableViewHabEstado,String > fecha02;
    @FXML private TableColumn<TableViewHabEstado,String > fecha03;
    @FXML private TableColumn<TableViewHabEstado,String > fecha04;
    @FXML private TableColumn<TableViewHabEstado,String > fecha05;
    @FXML private TableColumn<TableViewHabEstado,String > fecha06;
    @FXML private Label labelMantenimientoIngreseRangoFechas;
    @FXML private Label labelConsumo2;
    @FXML private TextField valor00Consumo2;
    @FXML private TextField valor01Consumo2;
    @FXML private TextField valor02Consumo2;
    @FXML private TextField valor03Consumo2;
    @FXML private TextField detalle00Consumo2;
    @FXML private TextField detalle01Consumo2;
    @FXML private TextField detalle02Consumo2;
    @FXML private TextField detalle03Consumo2;
    @FXML private TextField abono00Consumo2;
    @FXML private TextField abono01Consumo2;
    @FXML private TextField abono02Consumo2;
    @FXML private TextField abono03Consumo2;


    @FXML private TextField consumoHuesped;
    @FXML private ComboBox comboConsumoNroHabitacion;
    @FXML private ComboBox comboConsumoOperacion;
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

    @FXML private Button buttonConfirmarListaRegistro;
    @FXML private Button buttonRegistroElegirHabi;
    @FXML private Button buttonPagarAdelantoRegistro;
    @FXML private Label labelErrorRegistro;
    @FXML private Button registroButtonRegistrar;
    @FXML private Button registroFechasConfirmar;
    @FXML private Button buttonConfirmarRegistro;
    @FXML private Label labelRegistroGuardadoExitosamente;
    @FXML private Label labelRegistroHabitacionMuestra;
    @FXML private Label labelRegistroFechaEgresoMuestra;
    @FXML private Label labelRegistroFechaIngresoMuestra;
    @FXML private TextField registroAbonoAdelanto;
    @FXML private TextField registroPagoAdelanto;
    @FXML private TextField registroClienteNomebreyApellido;

    @FXML private Label labelReservaErrorFechas;
    @FXML private Button buttonSeleccionarReserva;
    @FXML private Button buttonBuscarFechaReserva;
    @FXML private Button buttonReservarReserva;
    @FXML private Button buttonPagarAdelantoReserva;
    @FXML private Button buttonConfirmarReserva;
    @FXML private Button buttonRegistrarManten;
    @FXML private Label labelReservaGuardadaExitosamente;
    @FXML private Label labelHabitacionMuestra;
    @FXML private Label labelFechaEgresoMuestra;
    @FXML private Label labelFechaIngresoMuestra;
    @FXML private TextField reservaAbonoAdelanto;
    @FXML private ComboBox reservaNroHabitacion;
    @FXML private ComboBox mantenNroHabitacion;
    @FXML private DatePicker reservaFechaIngreso;
    @FXML private DatePicker reservaFechaEgreso;
    @FXML private DatePicker mantenimientoFechaInicio;
    @FXML private DatePicker mantenimientoFechaFin;
    @FXML private TextField reservaBusquedaIdCliente;
    @FXML private TextField reservaClienteNomebreyApellido;
    @FXML private TextField textDetalleManten;


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
    @FXML private ImageView imagenMantenimiento;
    //====================IMAGENES FLECHAS DE MENU
    @FXML private ImageView arrowAdmin;
    @FXML private ImageView arrowClient;
    @FXML private ImageView arrowRecepcionista;
    @FXML private ImageView arrowRegistro;
    @FXML private ImageView arrowPago;
    @FXML private ImageView arrowHabitacion;
    @FXML private ImageView arrowReserva;
    @FXML private ImageView arrowMantenimiento;
    //====================PANELES
    @FXML private AnchorPane paneConsumoCheckout;
    @FXML private AnchorPane paneConsumo2;
    @FXML private AnchorPane paneListaHabitacionesEstado;
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
    @FXML private AnchorPane paneMantenimiento;
    //====================TABLA DE DETALLE DE CONSUMOS
    @FXML private TableView<Detalle> tableViewDetalle;
    //====================COLUMNAS DE TABLA DETALLE CONSUMO
    @FXML private TableColumn<Detalle,String > columFecha;
    @FXML private TableColumn<Detalle,Integer > columCuenta;
    @FXML private TableColumn<Detalle,Integer > columReferencia;
    @FXML private TableColumn<Detalle,String > columDescripcion;
    @FXML private TableColumn<Detalle,Double > columCargos;
    @FXML private TableColumn<Detalle,Double > columAbono;
    @FXML private TableColumn<Detalle,Boolean > columEstado;
    //====================TABLA DE DETALLE DE CLIENTES
    @FXML private TableView<TableViewCliente> tableViewListadoClientes;
    //====================COLUMNAS DE TABLA DETALLE CLIENTES
    @FXML private TableColumn<Cliente, String> listaClienteColumDni;
    @FXML private TableColumn<Cliente, String> listaClienteColumApellidoNombre;
    @FXML private TableColumn<Cliente, String> listaClienteColumPais;
    @FXML private TableColumn<Cliente, String> listaClienteColumProvincia;
    @FXML private TableColumn<Cliente, String> listaClienteColumLocalidad;
    @FXML private TableColumn<Cliente, String> listaClienteColumDomicilio;
    @FXML private TableColumn<Cliente, String> listaClienteColumCorreoElect;
    @FXML private TableColumn<Cliente, String> listaClienteColumTelefono;

    List<UsuarioHotel> listaUsuarioHotel=new ArrayList<>();
    List<Cliente> listaCliente=new ArrayList<>();

    List<Habitacion> listaHabitacion=new ArrayList<>();
    List<Recepcionista> listaRececpcionista=new ArrayList<>();
    List<Reserva> listaReserva=new ArrayList<>();

    List<RegistroHuesped> listaRegistroHuespedes=new ArrayList<>();
    List<CheckBox> comboRegistroHabitacion = new ArrayList<>();
    List<CheckBox> checkBoxCheckoutHabit = new ArrayList<>();
    Hotel hotel=new Hotel();


    File fileCliente = new File("Clientes.json");
    File fileHabitaciones = new File("Habitaciones.json");
    File fileUsuarioHotel = new File("UsuariosHotel.json");
    File fileReservas = new File("Reservas.json");
    File fileRegistroHuesped = new File("RegistroHuesped.json");
    File fileMantenimiento = new File("Mantenimiento.json");



    @Override
    public void initialize(URL location,ResourceBundle resource){
       // registroNroHabitacion.setItems(comboNroHabitaciones);
        this.mostrarPaneX(PaneElegido.paneAdminPass);
        this.mostrarPaneTopX(PaneElegido.paneTopAdmin);
        bloquearAccesoImegenesSup();
        mostrarFlechaX(FlechaElegida.arrowNinguna);

        //cargarDatos();
        /*
        ///-----GENERACION DE ARCHIVOS---
        Archivo.escribirArchivoClientes(fileCliente,(ArrayList<Cliente>) hotel.getListaCliente() );
        Archivo.escribirArchivoHabitacion(fileHabitaciones,(ArrayList<Habitacion>) hotel.getListaHabitacion());
        Archivo.escribirArchivoUsuarioHotel(fileUsuarioHotel,(ArrayList<UsuarioHotel>) hotel.getListaUsuarioHotel());
        Archivo.escribirArchivoReservas(fileReservas,(ArrayList<Reserva>) hotel.getListaReserva());
        Archivo.escribirArchivoRegistroHuesped(fileRegistroHuesped,(ArrayList<RegistroHuesped>) hotel.getRegistroHuespedes());
        Archivo.escribirArchivoMantenimiento(fileMantenimiento,(ArrayList<Mantenimiento>) hotel.getListaMantenimiento());
       */
        ///-----CARGA DE ARCHIVOS---
        hotel.setListaCliente(Archivo.leerArchivoClientes(fileCliente));
        hotel.setListaHabitacion(Archivo.leerArchivoHabitacion(fileHabitaciones));
        hotel.setRegistroHuespedes(Archivo.leerArchivoRegistroHuesped(fileRegistroHuesped));
        hotel.setListaReserva(Archivo.leerArchivoReservas(fileReservas));
        hotel.setListaUsuarioHotel(Archivo.leerArchivoUsuarioHotel(fileUsuarioHotel));
        hotel.setListaMantenimiento(Archivo.leerArchivoMantenimiento(fileMantenimiento));

        initializeTextFieldOnlyText();
        initializeTextFieldOnlyNumber();
        initializeTextFieldOnlyDouble();
        initializeDatePickerAfter();
    }
    public void initializeDatePickerAfter(){
        reservaFechaIngreso.setDayCellFactory(callB);
        reservaFechaEgreso.setDayCellFactory(callB);
        mantenimientoFechaInicio.setDayCellFactory(callB);
        mantenimientoFechaFin.setDayCellFactory(callB);


        mantenimientoFechaInicio.setValue(LocalDate.now());
        mantenimientoFechaFin.setValue(LocalDate.now());
    }
    public void initializeTextFieldOnlyDouble(){
        valor00Consumo2.addEventFilter(KeyEvent.ANY,handelerdouble(12));
        valor01Consumo2.addEventFilter(KeyEvent.ANY,handelerdouble(12));
        valor02Consumo2.addEventFilter(KeyEvent.ANY,handelerdouble(12));
        valor03Consumo2.addEventFilter(KeyEvent.ANY,handelerdouble(12));
        abono00Consumo2.addEventFilter(KeyEvent.ANY,handelerdouble(12));
        abono01Consumo2.addEventFilter(KeyEvent.ANY,handelerdouble(12));
        abono02Consumo2.addEventFilter(KeyEvent.ANY,handelerdouble(12));
        abono03Consumo2.addEventFilter(KeyEvent.ANY,handelerdouble(12));

        consumoCargo.addEventFilter(KeyEvent.ANY,handelerdouble(12));
        consumoAbono.addEventFilter(KeyEvent.ANY,handelerdouble(12));
        consumoSaldo.addEventFilter(KeyEvent.ANY,handelerdouble(12));
        consumoNombreHuesped.addEventFilter(KeyEvent.ANY,handelerdouble(12));
        registroPagoAdelanto.addEventFilter(KeyEvent.ANY,handelerdouble(12));
        reservaAbonoAdelanto.addEventFilter(KeyEvent.ANY,handelerdouble(12));
    }
    public void initializeTextFieldOnlyNumber() {
        consumoHuesped.addEventFilter(KeyEvent.ANY,handelernumber);
        registroIDCliente.addEventFilter(KeyEvent.ANY,handelernumber);
        reservaBusquedaIdCliente.addEventFilter(KeyEvent.ANY,handelernumber);
        busquedaIdCliente.addEventFilter(KeyEvent.ANY,handelernumber);
        mRecepcionistaDni.addEventFilter(KeyEvent.ANY,handelernumber);
        busquedaIdRececionista.addEventFilter(KeyEvent.ANY,handelernumber);
        mClienteDni.addEventFilter(KeyEvent.ANY,handelernumber);
        recepcionistaDNI.addEventFilter(KeyEvent.ANY,handelernumber);
        clienteDNI.addEventFilter(KeyEvent.ANY,handelernumber);
        identificadorUsuario.addEventFilter(KeyEvent.ANY,handelernumber);

        comboConsumoNroHabitacion.addEventFilter(KeyEvent.ANY,handelernumber);
        comboConsumoOperacion.addEventFilter(KeyEvent.ANY,handelernumber);



    }


    public void initializeTextFieldOnlyText() {

        detalle00Consumo2.addEventFilter(KeyEvent.ANY,handelerletters);
        detalle01Consumo2.addEventFilter(KeyEvent.ANY,handelerletters);
        detalle02Consumo2.addEventFilter(KeyEvent.ANY,handelerletters);
        detalle03Consumo2.addEventFilter(KeyEvent.ANY,handelerletters);
        registroClienteNomebreyApellido.addEventFilter(KeyEvent.ANY,handelerletters);
        mClienteNomebreyAppellido.addEventFilter(KeyEvent.ANY,handelerletters);
        mClienteLocalidad.addEventFilter(KeyEvent.ANY,handelerletters);
        mClienteProvincia.addEventFilter(KeyEvent.ANY,handelerletters);
        mClientePais.addEventFilter(KeyEvent.ANY,handelerletters);
        mRecepcionistaNomebreyAppellido.addEventFilter(KeyEvent.ANY,handelerletters);
        clienteLocalidad.addEventFilter(KeyEvent.ANY,handelerletters);
        clienteProvincia.addEventFilter(KeyEvent.ANY,handelerletters);
        clientePais.addEventFilter(KeyEvent.ANY,handelerletters);
        clienteNombreApellido.addEventFilter(KeyEvent.ANY,handelerletters);



        recepcionistaDireccion.addEventFilter(KeyEvent.ANY,handelerletters);
        recepcionistaNombreApellido.addEventFilter(KeyEvent.ANY,handelerletters);

    }
    public Double doubleEnTexto(TextField textField){
        Double numero=0.0;
        if(!textField.getText().equals("")){
            numero=Double.parseDouble(textField.getText());
        }
        return numero;
    }
/*
    public void cargarDatos(){
        RegistroHuesped h1 = new RegistroHuesped("35140802", 1, LocalDate.of(2021, 05, 25),LocalDate.of(2021, 07, 10));
        RegistroHuesped h2 = new RegistroHuesped("34185634", 6, LocalDate.of(2021, 05, 20),LocalDate.of(2021, 07, 01));
        RegistroHuesped h3 = new RegistroHuesped("38140802", 8, LocalDate.of(2021, 05, 23),LocalDate.of(2021, 06, 15));
        RegistroHuesped h4 = new RegistroHuesped("37415963", 9, LocalDate.of(2021, 05, 24),LocalDate.of(2021, 06, 20));



        Reserva r1=new Reserva(2,"25546465",LocalDate.of(2021, 06, 25),LocalDate.of(2021, 06, 29),0.0);
        Reserva r2=new Reserva(3,"46432210",LocalDate.of(2021, 07, 01),LocalDate.of(2021, 07, 12),0.0);
        Reserva r3=new Reserva(3,"5345656",LocalDate.of(2021, 07, 15),LocalDate.of(2021, 07, 22),0.0);
        Reserva r4=new Reserva(4,"32222963",LocalDate.of(2021, 07, 05),LocalDate.of(2021, 07, 15),1000.0);
        Reserva r5=new Reserva(5,"11111111",LocalDate.of(2021, 06, 06),LocalDate.of(2021, 07, 16),1000.0);
        Reserva r6=new Reserva(7,"11111111",LocalDate.of(2021, 06, 06),LocalDate.of(2021, 07, 16),1000.0);

        Cliente c1=new Cliente("35140802","Norberto Alonzo","Corriente 3421","alonzo@gmail.com","011-5897587","Argentina","Buenos Aires","Capial Federal");
        Cliente c2=new Cliente("34185634","Osvaldo Ardiles","General Paz 3221","ardiles@gmail.com","011-3244587","Argentina","Buenos Aires","Capial Federal");
        Cliente c3=new Cliente("38140802","Hector Baley","Yrigoyen 1231","Baley@gmail.com","011-3653433","Argentina","Buenos Aires","Capial Federal");
        Cliente c4=new Cliente("37415963","Daniel Bertoni","Cordoba 4323","bertoni@gmail.com","011-6586856","Argentina","Buenos Aires","La Plata");
        Cliente c5=new Cliente("25546465","Ubaldo Filiol","Acha 623","filiol@gmail.com","011-3286856","Argentina","Buenos Aires","Necochea");
        Cliente c6=new Cliente("46432210","Americo Gallego","Chile 323","gallego@gmail.com","011-345856","Argentina","Cordoba","Cordoba");
        Cliente c7=new Cliente("5345656","Luis Galvan","Ilia 3223","galvan@gmail.com","011-653546","Argentina","Buenos Aires","Balcarce");
        Cliente c8=new Cliente("32222963","rene Houseman","Libertad 387","rene@gmail.com","011-64545856","Argentina","Buenos Aires","La Plata");
        Cliente c9=new Cliente("11111111","Nippur de Lagash","Libertad 387","rene@gmail.com","011-64545856","Argentina","Buenos Aires","La Plata");
        //Consumo cc1=new Consumo(LocalDate.of(2021,6,5),"Renta Habitacion",1500,0.0);
        //Consumo cc2=new Consumo(LocalDate.of(2021,6,5),"Renta CunaBebe",500,500);


        //c9.setConsumos(cc1);
        //c9.setConsumos(cc2);

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

 */
    public void onAdminPassButtonCliked(MouseEvent event){

        boolean validacion=false;

        int indiceCliente=hotel.buscarIdCliente(identificadorUsuario.getText());
        int indiceUsuarioHotel=hotel.buscarIdUsuarioHotel(identificadorUsuario.getText());
        if(indiceCliente!=-1 || indiceUsuarioHotel !=-1) {
            if (indiceCliente != -1) {
                mostrarPaneTopX(PaneElegido.paneTopCliente);
            } else {
                if (indiceUsuarioHotel != -1 && hotel.getListaUsuarioHotel().get(indiceUsuarioHotel).getClave().equals(passIdentificadorUsuario.getText())) {

                    if (hotel.getListaUsuarioHotel().get(indiceUsuarioHotel) instanceof Administrador) {

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

    public void bloquearAccesoImegenesSup(){
        imageAdmin.setDisable(true);
        imageClient.setDisable(true);
        imageRecepcionist.setDisable(true);
        imageReserv.setDisable(true);
        imageRegistro.setDisable(true);
        imagePago.setDisable(true);
        imageHabitacion.setDisable(true);
        imagenMantenimiento.setDisable(true);

    }
    public void habilitarAccesoImegenesSup(){
        imageAdmin.setDisable(false);
        imageClient.setDisable(false);
        imageRecepcionist.setDisable(false);
        imageReserv.setDisable(false);
        imageRegistro.setDisable(false);
        imagePago.setDisable(false);
        imageHabitacion.setDisable(false);
        imagenMantenimiento.setDisable(false);

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
        if(pane.equals(PaneElegido.paneListaHabitacionesEstado)){
            paneListaHabitacionesEstado.setVisible(true);
        }else{
            paneListaHabitacionesEstado.setVisible(false);
        }
        if(pane.equals(PaneElegido.paneConsumo2)){
            paneConsumo2.setVisible(true);
        }else{
            paneConsumo2.setVisible(false);
        }
        if(pane.equals(PaneElegido.paneListarCliente)){
            paneListarClientes.setVisible(true);
        }else{
            paneListarClientes.setVisible(false);
        }
        if(pane.equals(PaneElegido.paneMantenimiento)){
            paneMantenimiento.setVisible(true);
        }else{
            paneMantenimiento.setVisible(false);
        }
        if(pane.equals(PaneElegido.paneConsumoCheckout)){
            paneConsumoCheckout.setVisible(true);
        }else{
            paneConsumoCheckout.setVisible(false);
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
        if(flecha.equals(FlechaElegida.arrowMantenimiento)){
            arrowMantenimiento.setVisible(true);
        }else{
            arrowMantenimiento.setVisible(false);
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
    public void onHabitacionButtonClicked(MouseEvent event){
        this.mostrarPaneX(PaneElegido.paneListaHabitacionesEstado);

        this.mostrarFlechaX(FlechaElegida.arrowHabitacion);
        tableHabitacionesEstado.getItems().clear();
        //datePickerHabitacionesEstado.setValue(LocalDate.now());
    }

    public ObservableList<TableViewHabEstado>getEstadosHabitFecha(LocalDate fecha){
        LocalDate fechaAnt=fecha.plusDays(-1);
        ObservableList<TableViewHabEstado> estadoHabitaciones= FXCollections.observableArrayList();


        for (int j=0;j<hotel.getListaHabitacion().size();j++) {
            TableViewHabEstado tvhe=new TableViewHabEstado();
            tvhe.setNroHabitacion(hotel.arryHabitacionesEstado(fechaAnt).get(j).getNumeroHabitacion());
            tvhe.setFechaAnt(hotel.arryHabitacionesEstado(fechaAnt).get(j).getEstadoHabitacion());
            tvhe.setFecha00(hotel.arryHabitacionesEstado(fechaAnt.plusDays(1)).get(j).getEstadoHabitacion());
            tvhe.setFecha01(hotel.arryHabitacionesEstado(fechaAnt.plusDays(2)).get(j).getEstadoHabitacion());
            tvhe.setFecha02(hotel.arryHabitacionesEstado(fechaAnt.plusDays(3)).get(j).getEstadoHabitacion());
            tvhe.setFecha03(hotel.arryHabitacionesEstado(fechaAnt.plusDays(4)).get(j).getEstadoHabitacion());
            tvhe.setFecha04(hotel.arryHabitacionesEstado(fechaAnt.plusDays(5)).get(j).getEstadoHabitacion());
            tvhe.setFecha05(hotel.arryHabitacionesEstado(fechaAnt.plusDays(6)).get(j).getEstadoHabitacion());
            tvhe.setFecha06(hotel.arryHabitacionesEstado(fechaAnt.plusDays(7)).get(j).getEstadoHabitacion());
            estadoHabitaciones.add(tvhe);

        }

        return  estadoHabitaciones;
    }

    public void onSeleccionarFechaHabitacionesEstado(ActionEvent event){


        columnaHabitacion.setCellValueFactory(new PropertyValueFactory<TableViewHabEstado,Integer>("nroHabitacion"));
        fechaAnt.setCellValueFactory(new PropertyValueFactory<TableViewHabEstado,String>("fechaAnt"));
        fecha00.setCellValueFactory(new PropertyValueFactory<TableViewHabEstado,String>("fecha00"));
        fecha01.setCellValueFactory(new PropertyValueFactory<TableViewHabEstado,String>("fecha01"));
        fecha02.setCellValueFactory(new PropertyValueFactory<TableViewHabEstado,String>("fecha02"));
        fecha03.setCellValueFactory(new PropertyValueFactory<TableViewHabEstado,String>("fecha03"));
        fecha04.setCellValueFactory(new PropertyValueFactory<TableViewHabEstado,String>("fecha04"));
        fecha05.setCellValueFactory(new PropertyValueFactory<TableViewHabEstado,String>("fecha05"));
        fecha06.setCellValueFactory(new PropertyValueFactory<TableViewHabEstado,String>("fecha06"));
        fechaAnt.setText(datePickerHabitacionesEstado.getValue().plusDays(-1).toString());
        fecha00.setText(datePickerHabitacionesEstado.getValue().plusDays(0).toString());
        fecha01.setText(datePickerHabitacionesEstado.getValue().plusDays(1).toString());
        fecha02.setText(datePickerHabitacionesEstado.getValue().plusDays(2).toString());
        fecha03.setText(datePickerHabitacionesEstado.getValue().plusDays(3).toString());
        fecha04.setText(datePickerHabitacionesEstado.getValue().plusDays(4).toString());
        fecha05.setText(datePickerHabitacionesEstado.getValue().plusDays(5).toString());
        fecha06.setText(datePickerHabitacionesEstado.getValue().plusDays(6).toString());

        tableHabitacionesEstado.setItems(getEstadosHabitFecha(datePickerHabitacionesEstado.getValue()));

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
            hotel.getListaCliente().add(clienteNuevo);
            mostrarPaneX(PaneElegido.paneClienteCargado);
            hotel.getListaCliente().add(clienteNuevo);
            labelPaneClienteCargadoExitosamente.setText("CLIENTE CARGADO EXITOSAMENTE");


        }else{
            labelPaneClienteCargadoExitosamente.setText("EL USUARIO YA SE ENCUENTRA REGISTRADO");
            mostrarPaneX(PaneElegido.paneClienteCargado);
        }

    }



    public void onRegistroButtonClicked(MouseEvent event){
        registroIDCliente.clear();
        registroClienteNomebreyApellido.clear();
        registroPagoAdelanto.setDisable(false);
        registroButtonRegistrar.setDisable(true);
        registroCheckBoxHabi0.setVisible(false);
        registroCheckBoxHabi1.setVisible(false);
        registroCheckBoxHabi2.setVisible(false);
        registroCheckBoxHabi3.setVisible(false);
        registroCheckBoxHabi4.setVisible(false);
        buttonConfirmarListaRegistro.setDisable(true);
        buttonRegistroElegirHabi.setDisable(true);
        buttonPagarAdelantoRegistro.setDisable(true);
        tableViewRegistroReservasCliente.getItems().clear();



        this.mostrarPaneX(PaneElegido.paneRegistro);

        this.mostrarFlechaX(FlechaElegida.arrowRegistro);

    }
    public void onBuscarRegistrarClienteButtonClicked(MouseEvent event){
        int indiceCliente=hotel.buscarIdCliente(registroIDCliente.getText());
        if(indiceCliente!=-1) {
            registroClienteNomebreyApellido.setText(hotel.getListaCliente().get(indiceCliente).getNombreYapellido());


        }else{
            registroClienteNomebreyApellido.setText("Cliente no registrado");
        }
    }
    public void onRegistrarConfirmarButtonClicked(MouseEvent event) {
        Cliente cliente = hotel.buscarClientePorID(registroIDCliente.getText());

        buttonRegistroElegirHabi.setDisable(false);
        comboRegistroHabitacion.add(registroCheckBoxHabi0);
        comboRegistroHabitacion.add(registroCheckBoxHabi1);
        comboRegistroHabitacion.add(registroCheckBoxHabi2);
        comboRegistroHabitacion.add(registroCheckBoxHabi3);
        comboRegistroHabitacion.add(registroCheckBoxHabi4);
        ObservableList<ReservaCliente> listReservasCliente = getReservaCliente(cliente);
        for (int i = 0; i < listReservasCliente.size(); i++) {
            comboRegistroHabitacion.get(i).setText(listReservasCliente.get(i).getNroHabitacion().toString());
            comboRegistroHabitacion.get(i).setVisible(true);

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
        buttonConfirmarListaRegistro.setDisable(false);
        tableViewRegistroReservasCliente.setItems(getReservaCliente(cliente));

    }

    public void onSeleccionarPaneListarClienteButtonClicked(MouseEvent event) {
        this.mostrarPaneX(PaneElegido.paneListarCliente);
        tableViewListadoClientes.getItems().clear();
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

    public void onRegistrarElegirHabiButtonClicked(MouseEvent event){
        boolean val=false;
        for(CheckBox ch:comboRegistroHabitacion){
            if(ch.isSelected())
                val=true;

        }
        if(val==true){
            registroButtonRegistrar.setDisable(false);
            labelErrorRegistro.setText("");
            buttonPagarAdelantoRegistro.setDisable(false);
        }else{
            labelErrorRegistro.setText("INGRESE AL MENOS UNA HABITACION");
        }

    }





    public void guardarRegistro(MouseEvent event){
        String labelTexto="";
        buttonConfirmarRegistro.setDisable(false);
        labelRegistroGuardadoExitosamente.setText("VERIFICAR FECHAS Y HABITACION");
        mostrarPaneX(PaneElegido.paneRegistroCargado);
        Cliente cliente = hotel.buscarClientePorID(registroIDCliente.getText());
        List<Reserva> listaReservaCliente = hotel.buscarReservaPorIdCliente(cliente.getId());
        ObservableList<ReservaCliente> listReservasCliente = getReservaCliente(cliente);

        for (int i=0;i<listReservasCliente.size();i++){

            if(comboRegistroHabitacion.get(i).isSelected()){

                labelTexto=labelTexto+"Nro Habitacion: "+listReservasCliente.get(i).getNroHabitacion()+"   Fecha de Ingreso: "+listaReservaCliente.get(i).getFechaIngreso()+"   Fecha de Engreso: "+listaReservaCliente.get(i).getFechaEgreso()+"\n" ;

            }
        }



        labelRegistroHabitacionMuestra.setText(labelTexto);
        //labelRegistroFechaEgresoMuestra.setText(registroFechaEgreso.getValue().toString());
        //labelRegistroFechaIngresoMuestra.setText(registroFechaIngreso.getValue().toString());

    }
    public void onConfirmarRegistroButtonClicked(MouseEvent event){
        Cliente cliente = hotel.buscarClientePorID(registroIDCliente.getText());
        List<Reserva> listaReservaCliente = hotel.buscarReservaPorIdCliente(cliente.getId());
        ObservableList<ReservaCliente> listReservasCliente = getReservaCliente(cliente);
        double adelanto = Double.parseDouble(registroPagoAdelanto.getText());
        int posCliente=hotel.buscarIdCliente(cliente.getId());
        for (int i=0;i<listReservasCliente.size();i++){
            if(comboRegistroHabitacion.get(i).isSelected()){

                RegistroHuesped nuevoRegistro=new RegistroHuesped(cliente.getId(),hotel.buscarIdPorNumeroDeHabitacion(listReservasCliente.get(i).getNroHabitacion()),listaReservaCliente.get(i).getFechaIngreso(),listaReservaCliente.get(i).getFechaEgreso() );
                hotel.getRegistroHuespedes().add(nuevoRegistro);

                hotel.getListaCliente().get(posCliente).setConsumos(new Consumo(nuevoRegistro.getFechaIngreso(),"Renta Habitacion",hotel.montoHabitacionEstadia(listaReservaCliente.get(i).getFechaIngreso(),listaReservaCliente.get(i).getFechaEgreso(),listReservasCliente.get(i).getNroHabitacion()),0.0));

            }
            adelanto=adelanto+listaReservaCliente.get(i).getPagoReserva();
        }
        cliente.getConsumos().get(cliente.getConsumos().size()-1).setPagoConsumo(adelanto);
        labelRegistroGuardadoExitosamente.setText("EL REGISTRO FUE CARGADO EXITOSAMENTE");
        buttonConfirmarRegistro.setDisable(true);
        hotel.borrarReservaPorIdCliente(cliente.getId());

    }
    public void onPagoAdelantoRegistroButtonClicked(MouseEvent event){
        registroPagoAdelanto.setDisable(true);

    }


    public void onBuscarModificarRecepcionistaButtonClicked(MouseEvent event){
        int indiceUsuarioHotel=hotel.buscarIdUsuarioHotel(busquedaIdRececionista.getText());
        if(indiceUsuarioHotel!=-1){
            busquedaIdRececionista.setText(hotel.getListaUsuarioHotel().get(indiceUsuarioHotel).getId());
            mRecepcionistaNomebreyAppellido.setText(hotel.getListaUsuarioHotel().get(indiceUsuarioHotel).getNombreYapellido());
            mRecepcionistaDireccion.setText(hotel.getListaUsuarioHotel().get(indiceUsuarioHotel).getDireccion());
            mRecepcionistaTelefono.setText(hotel.getListaUsuarioHotel().get(indiceUsuarioHotel).getTelefono());
            mRecepcionistaDni.setText(hotel.getListaUsuarioHotel().get(indiceUsuarioHotel).getId());
            mRecepcionistaPassword.setText(hotel.getListaUsuarioHotel().get(indiceUsuarioHotel).getClave());

        }

    }
    public void onGuardarModificarRecepcionistaButtonClicked(MouseEvent event){


        int indiceUsuarioHotel=hotel.buscarIdUsuarioHotel(busquedaIdRececionista.getText());
        if(indiceUsuarioHotel!=-1) {
            hotel.getListaUsuarioHotel().get(indiceUsuarioHotel).setId(mRecepcionistaDni.getText());
            hotel.getListaUsuarioHotel().get(indiceUsuarioHotel).setNombreYapellido(mRecepcionistaNomebreyAppellido.getText());
            hotel.getListaUsuarioHotel().get(indiceUsuarioHotel).setDireccion(mRecepcionistaDireccion.getText());
            hotel.getListaUsuarioHotel().get(indiceUsuarioHotel).setTelefono(mRecepcionistaTelefono.getText());
            hotel.getListaUsuarioHotel().get(indiceUsuarioHotel).setClave(mRecepcionistaPassword.getText());
            mostrarPaneX(PaneElegido.paneRecepcionistaCargado);
        }

    }

    public void onBuscarModificarClienteButtonClicked(MouseEvent event){
        int indiceCliente=hotel.buscarIdCliente(busquedaIdCliente.getText());
        if(indiceCliente!=-1){
            busquedaIdCliente.setText(hotel.getListaCliente().get(indiceCliente).getId());
            mClienteNomebreyAppellido.setText(hotel.getListaCliente().get(indiceCliente).getNombreYapellido());
            mClienteDireccion.setText(hotel.getListaCliente().get(indiceCliente).getDireccion());
            mClienteTelefono.setText(hotel.getListaCliente().get(indiceCliente).getTelefono());
            mClienteDni.setText(hotel.getListaCliente().get(indiceCliente).getId());
            mClienteLocalidad.setText(hotel.getListaCliente().get(indiceCliente).getLocalidad());
            mClienteProvincia.setText(hotel.getListaCliente().get(indiceCliente).getProvincia());
            mClientePais.setText(hotel.getListaCliente().get(indiceCliente).getPais());

        }

    }
    public void onGuardarModificarClienteButtonClicked(MouseEvent event){

        int indiceCliente=hotel.buscarIdCliente(busquedaIdCliente.getText());
        if(indiceCliente!=-1) {
            hotel.getListaCliente().get(indiceCliente).setId(mClienteDni.getText());
            hotel.getListaCliente().get(indiceCliente).setNombreYapellido(mClienteNomebreyAppellido.getText());
            hotel.getListaCliente().get(indiceCliente).setDireccion(mClienteDireccion.getText());
            hotel.getListaCliente().get(indiceCliente).setTelefono(mClienteTelefono.getText());
            hotel.getListaCliente().get(indiceCliente).setLocalidad(mClienteLocalidad.getText());
            hotel.getListaCliente().get(indiceCliente).setProvincia(mClienteProvincia.getText());
            hotel.getListaCliente().get(indiceCliente).setPais(mClientePais.getText());
            mostrarPaneX(PaneElegido.paneClienteCargado);
        }

    }


    public void onMantenimientoButtonCliked(MouseEvent event){

        this.mostrarPaneX(PaneElegido.paneMantenimiento);
        this.mostrarFlechaX(FlechaElegida.arrowMantenimiento);
        mantenNroHabitacion.setDisable(true);
        buttonRegistrarManten.setDisable(true);

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
        buttonSeleccionarReserva.setDisable(true);
        buttonBuscarFechaReserva.setDisable(true);
        buttonReservarReserva.setDisable(true);
        buttonPagarAdelantoReserva.setDisable(true);

        this.mostrarPaneX(PaneElegido.paneReserva);

        this.mostrarFlechaX(FlechaElegida.arrowReserva);

    }
    public void onBuscarReservaClienteButtonClicked(MouseEvent event){
        int indiceCliente=hotel.buscarIdCliente(reservaBusquedaIdCliente.getText());
        if(indiceCliente!=-1) {
           reservaClienteNomebreyApellido.setText(hotel.getListaCliente().get(indiceCliente).getNombreYapellido());
            buttonSeleccionarReserva.setDisable(false);
        }else{
            reservaClienteNomebreyApellido.setText("Cliente no registrado");
        }
    }

    public void onSeleccionarReservaClienteButtonClicked(MouseEvent event){
        reservaClienteNomebreyApellido.setDisable(true);
        reservaFechaIngreso.setDisable(false);
        reservaFechaEgreso.setDisable(false);
        reservaFechaIngreso.setValue(LocalDate.now());
        reservaFechaEgreso.setValue(LocalDate.now());
        buttonBuscarFechaReserva.setDisable(false);
    }

    public void onBuscarFechasReservaButtonClicked(MouseEvent event){
        try {
            List<Habitacion> habitacionesLibres=hotel.habitacionesLibres(reservaFechaIngreso.getValue(),reservaFechaEgreso.getValue());
            ObservableList<Integer> comboSoloHabitacionesLibres=FXCollections.observableArrayList();
            for(int i=0;i<habitacionesLibres.size();i++){

                comboSoloHabitacionesLibres.add(habitacionesLibres.get(i).getNumeroHabitacion());

            }
            reservaNroHabitacion.setItems(comboSoloHabitacionesLibres);
            reservaNroHabitacion.setDisable(false);
            buttonReservarReserva.setDisable(false);
            labelReservaErrorFechas.setText("");
            buttonPagarAdelantoReserva.setDisable(false);
        }catch (NullPointerException e){
            labelReservaErrorFechas.setText("INGRESE UN RANGO DE FECHAS");
        }




    }

    public void onReservarClienteButtonClicked(MouseEvent event){
        try{
            buttonConfirmarReserva.setDisable(false);
            buttonPagarAdelantoReserva.setDisable(false);
            labelReservaGuardadaExitosamente.setText("VERIFICAR FECHAS Y HABITACION");

            labelHabitacionMuestra.setText(reservaNroHabitacion.getValue().toString());
            labelFechaEgresoMuestra.setText(reservaFechaEgreso.getValue().toString());
            labelFechaIngresoMuestra.setText(reservaFechaIngreso.getValue().toString());
            labelReservaErrorFechas.setText("");
            mostrarPaneX(PaneElegido.paneReservaCargada);
        }catch (NullPointerException e){
            labelReservaErrorFechas.setText("SELECCIONE UNA HABITACION");
        }


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

    public void onBuscarFechasMantenimientoButtonClicked(MouseEvent event){
        try {
        List<Habitacion> habitacionesLibres=hotel.habitacionesLibres(mantenimientoFechaInicio.getValue(),mantenimientoFechaFin.getValue());
        ObservableList<Integer> comboSoloHabitacionesLibres=FXCollections.observableArrayList();
        for(int i=0;i<habitacionesLibres.size();i++){

            comboSoloHabitacionesLibres.add(habitacionesLibres.get(i).getNumeroHabitacion());

        }
        mantenNroHabitacion.setItems(comboSoloHabitacionesLibres);
        mantenNroHabitacion.setDisable(false);
        labelMantenimientoIngreseRangoFechas.setText("");
        buttonRegistrarManten.setDisable(false);


        }catch (NullPointerException e){
            labelMantenimientoIngreseRangoFechas.setText("INGRESE UN RANGO DE FECHAS");
        }
    }

    public void onRegistrarMantenimientoButtonClicked(MouseEvent event) {
        try {

            Mantenimiento aux = new Mantenimiento(hotel.buscarIdPorNumeroDeHabitacion((int)mantenNroHabitacion.getValue()),
                    mantenimientoFechaInicio.getValue(),mantenimientoFechaFin.getValue(),textDetalleManten.getText());

            hotel.getListaMantenimiento().add(aux);
            buttonRegistrarManten.setDisable(true);
            labelMantenimientoIngreseRangoFechas.setText("MANTENIMIENTO REGISTRADO DESDE "+mantenimientoFechaInicio.getValue().toString()+" hasta "+mantenimientoFechaFin.getValue().toString());
          }catch (NullPointerException e){
                labelMantenimientoIngreseRangoFechas.setText("INGRESE UNA HABITACION PARA MANTENIMIENTO");
        }
    }

    public void onPagoButtonClicked(MouseEvent event) {

        this.mostrarPaneX(PaneElegido.panePago);

        this.mostrarFlechaX(FlechaElegida.arrowPago);

    }

    public ObservableList<Detalle>getDetalle(Cliente cliente){
        List<Consumo> listaConsumo=cliente.getConsumos();
        ObservableList<Detalle> detalles= FXCollections.observableArrayList();
        int idClient=Integer.parseInt(cliente.getId());
        for (Consumo co:listaConsumo) {
            detalles.add(new Detalle(co.getFechaConsumo().toString(),co.getId() , co.getDetalleConsumo(),idClient, co.getDetalleConsumo(), co.getMonto(), co.getPagoConsumo(), true));
        }
        return detalles;
    }

    public void actualizarConsumoCliente(){
        Cliente cliente=hotel.getListaCliente().get(hotel.buscarIdCliente(consumoHuesped.getText()));
        columFecha.setCellValueFactory(new PropertyValueFactory<Detalle,String>("Fecha"));
        columCuenta.setCellValueFactory(new PropertyValueFactory<Detalle,Integer>("Cuenta"));

        columReferencia.setCellValueFactory(new PropertyValueFactory<Detalle,Integer>("Referencia"));
        columDescripcion.setCellValueFactory(new PropertyValueFactory<Detalle,String>("Descripcion"));
        columCargos.setCellValueFactory(new PropertyValueFactory<Detalle,Double>("Cargos"));
        columAbono.setCellValueFactory(new PropertyValueFactory<Detalle,Double>("Abono"));
        columEstado.setCellValueFactory(new PropertyValueFactory<Detalle,Boolean>("Estado"));

        tableViewDetalle.setItems(getDetalle(cliente));
        consumoCargo.setText(String.valueOf(cliente.sumatoriaCargos()));
        consumoAbono.setText(String.valueOf(cliente.sumatoriaPagos()));
        consumoSaldo.setText(String.valueOf(cliente.calculoSaldo()));

        ObservableList<String> comboOpcionesPago=FXCollections.observableArrayList();
        comboOpcionesPago.add("CheckOut");
        comboOpcionesPago.add("Consumo");

        comboConsumoOperacion.setItems(comboOpcionesPago);

    }
    public void onConsumoSeleccionarClienteButtonClicked(MouseEvent event){

        actualizarConsumoCliente();

    }

    public void onConsumoBuscarClienteClicked(MouseEvent event){
        int indiceCliente=hotel.buscarIdCliente(consumoHuesped.getText());
        if(indiceCliente!=-1) {
            consumoNombreHuesped.setText(hotel.getListaCliente().get(indiceCliente).getNombreYapellido());
        }else{
            consumoNombreHuesped.setText("Cliente no registrado");
        }
    }


    public void onRealizarConsumoButtonClicked(MouseEvent event){
        valor00Consumo2.clear();
        valor01Consumo2.clear();
        valor02Consumo2.clear();
        valor03Consumo2.clear();
        detalle00Consumo2.clear();
        detalle01Consumo2.clear();
        detalle02Consumo2.clear();
        detalle03Consumo2.clear();
        abono00Consumo2.clear();
        abono01Consumo2.clear();
        abono02Consumo2.clear();
        abono03Consumo2.clear();
        try {
            if (comboConsumoOperacion.getValue().equals("Consumo")) {
                mostrarPaneX(PaneElegido.paneConsumo2);
                mostrarFlechaX(FlechaElegida.arrowPago);
                labelConsumo2.setText("CONSUMO CLIENTE: " + consumoNombreHuesped.getText());
            } else if (comboConsumoOperacion.getValue().equals("CheckOut")) {
                checkoutCheckBoxHabi0.setVisible(false);
                checkoutCheckBoxHabi1.setVisible(false);
                checkoutCheckBoxHabi2.setVisible(false);
                checkoutCheckBoxHabi3.setVisible(false);
                checkoutCheckBoxHabi4.setVisible(false);
                textCargoChekoutHab.setDisable(true);
                textAbonoChekoutHab.setDisable(true);
                textSldoFinalChekoutHab.setDisable(true);
                textAbonoFinalChekoutHab.setDisable(true);
                textVueltoChekoutHab.setDisable(true);
                buttonElegirCheckoutPorHabitacion.setDisable(true);
                mostrarPaneX(PaneElegido.paneConsumoCheckout);
                mostrarFlechaX(FlechaElegida.arrowPago);

            }
        }catch (Throwable e){
            System.out.println(e);
        }
    }

    public void onEjecutarConsumo2ButtonClicked(MouseEvent event){


        if(!detalle00Consumo2.getText().equals("")) {
            Consumo c0 = new Consumo(LocalDate.now(), detalle00Consumo2.getText(), doubleEnTexto(valor00Consumo2), doubleEnTexto(abono00Consumo2));
            hotel.getListaCliente().get(hotel.buscarIdCliente(consumoHuesped.getText())).setConsumos(c0);
        }
        if(!detalle01Consumo2.getText().equals("")) {
            Consumo c1 = new Consumo(LocalDate.now(), detalle01Consumo2.getText(), doubleEnTexto(valor01Consumo2), doubleEnTexto(abono01Consumo2));
            hotel.getListaCliente().get(hotel.buscarIdCliente(consumoHuesped.getText())).setConsumos(c1);
        }
        if(!detalle02Consumo2.getText().equals("")) {
            Consumo c2 = new Consumo(LocalDate.now(), detalle02Consumo2.getText(), doubleEnTexto(valor02Consumo2), doubleEnTexto(abono02Consumo2));
            hotel.getListaCliente().get(hotel.buscarIdCliente(consumoHuesped.getText())).setConsumos(c2);
        }
        if(!detalle03Consumo2.getText().equals("")) {
            Consumo c3 = new Consumo(LocalDate.now(), detalle03Consumo2.getText(), doubleEnTexto(valor03Consumo2), doubleEnTexto(abono03Consumo2));
            hotel.getListaCliente().get(hotel.buscarIdCliente(consumoHuesped.getText())).setConsumos(c3);
        }
        this.mostrarPaneX(PaneElegido.panePago);
        actualizarConsumoCliente();

    }


    public void onBuscarClienteCheckoutButtonClicked(MouseEvent event){
        int indiceCliente=hotel.buscarIdCliente(textIdClienteCheckout.getText());

        if(indiceCliente!=-1) {

            lablelNombreClienteCheckout.setText("Cliente: "+hotel.getListaCliente().get(indiceCliente).getNombreYapellido());
            textCargoChekoutFinal.setText(String.valueOf(hotel.getListaCliente().get(indiceCliente).sumatoriaCargos()));
            textAbonoChekoutFinal.setText(String.valueOf(hotel.getListaCliente().get(indiceCliente).sumatoriaPagos()));
            textSldoFinalChekoutFinal.setText(String.valueOf(hotel.getListaCliente().get(indiceCliente).calculoSaldo()));
        }else{
            lablelNombreClienteCheckout.setText("Cliente no registrado");
        }


    }


    public void onHabilitarCheckoutButtonPorHabitacionClicked(MouseEvent event){
        textCargoChekoutHab.setDisable(false);
        textAbonoChekoutHab.setDisable(false);
        textSldoFinalChekoutHab.setDisable(false);
        textAbonoFinalChekoutHab.setDisable(false);
        textVueltoChekoutHab.setDisable(false);
        buttonElegirCheckoutPorHabitacion.setDisable(false);
        textAbonoFinalChekoutFinal.setDisable(true);
        textCargoChekoutHab.clear();
        textAbonoChekoutHab.clear();
        textSldoFinalChekoutHab.clear();
        textAbonoFinalChekoutHab.clear();
        textVueltoChekoutHab.clear();
        textAbonoFinalChekoutFinal.clear();
        int indiceCliente=hotel.buscarIdCliente(textIdClienteCheckout.getText());
        Cliente cliente= hotel.getListaCliente().get(indiceCliente);
        for(int i=0;i< hotel.getListaCliente().get(indiceCliente).getConsumos().size();i++) {
            List<Consumo> consumoHabitacionCliente=new ArrayList<>();
            if(cliente.getConsumos().get(i).getDetalleConsumo().equals("Renta Habitacion")){

                consumoHabitacionCliente.add(cliente.getConsumos().get(i));
            }
        }


        //buttonRegistroElegirHabi.setDisable(false);
        checkBoxCheckoutHabit.add(checkoutCheckBoxHabi0);
        checkBoxCheckoutHabit.add(checkoutCheckBoxHabi1);
        checkBoxCheckoutHabit.add(checkoutCheckBoxHabi2);
        checkBoxCheckoutHabit.add(checkoutCheckBoxHabi3);
        checkBoxCheckoutHabit.add(checkoutCheckBoxHabi4);
        List<RegistroHuesped> listRegistroCliente = hotel.buscarRegistroPorIdCliente(cliente.getId());
        for (int i = 0; i < listRegistroCliente.size(); i++) {
            checkBoxCheckoutHabit.get(i).setText(Integer.toString(hotel.buscarNumeroHabitacionPorId(listRegistroCliente.get(i).getIdHabitacion())));
            checkBoxCheckoutHabit.get(i).setVisible(true);
        }


    }


    public void onCheckoutElegirHabiButtonClicked(MouseEvent event){

        int indiceCliente=hotel.buscarIdCliente(textIdClienteCheckout.getText());
        Double valorHabitaciones=0.0,cargos=0.0;
        boolean val=false;
        for(CheckBox ch:checkBoxCheckoutHabit){
            if(ch.isSelected())
                val=true;

        }
        if(val==true){
            List<RegistroHuesped>listaRegistrocliente=hotel.buscarRegistroPorIdCliente(textIdClienteCheckout.getText());

            for(int j=0;j<checkBoxCheckoutHabit.size();j++) {
                for (int i = 0; i < listaRegistrocliente.size(); i++) {

                    if (checkBoxCheckoutHabit.get(j).isSelected() && Integer.valueOf(checkBoxCheckoutHabit.get(j).getText())==hotel.buscarNumeroHabitacionPorId(listaRegistrocliente.get(i).getIdHabitacion())) {

                        valorHabitaciones=valorHabitaciones+hotel.montoHabitacionEstadia(listaRegistrocliente.get(i).getFechaIngreso(),listaRegistrocliente.get(i).getFechaEgreso(),Integer.valueOf(checkBoxCheckoutHabit.get(j).getText()));

                    }
                }
            }

            textCargoChekoutHab.setText(valorHabitaciones.toString());
            textAbonoChekoutHab.setText(String.valueOf(hotel.getListaCliente().get(indiceCliente).sumatoriaPagos()));
            Double saldo=valorHabitaciones-hotel.getListaCliente().get(indiceCliente).sumatoriaPagos();
            textSldoFinalChekoutHab.setText(String.valueOf(saldo));

        }else{
            labelCheckoutCheckboxError.setText("INGRESE AL MENOS UNA HABITACION");

        }


    }
    public void onCheckoutRealizarButtonClicked(MouseEvent event){

        Double vuelto=Double.parseDouble(textAbonoFinalChekoutHab.getText())-Double.parseDouble(textSldoFinalChekoutHab.getText());
        System.out.println(vuelto);
        if(vuelto>=0.0) {

            List<RegistroHuesped> listaRegistrocliente = hotel.buscarRegistroPorIdCliente(textIdClienteCheckout.getText());
            System.out.println(hotel.getRegistroHuespedes());
            System.out.println(listaRegistrocliente);
            for (int j = 0; j < checkBoxCheckoutHabit.size(); j++) {
                for (int i = 0; i < listaRegistrocliente.size(); i++) {
                    if (checkBoxCheckoutHabit.get(j).isSelected() && Integer.valueOf(checkBoxCheckoutHabit.get(j).getText()) == hotel.buscarNumeroHabitacionPorId(listaRegistrocliente.get(i).getIdHabitacion())) {
                        for (int k = 0; k < hotel.getRegistroHuespedes().size(); k++) {

                            if (hotel.getRegistroHuespedes().get(k).getFechaIngreso().equals(listaRegistrocliente.get(i).getFechaIngreso())  &&
                                    hotel.getRegistroHuespedes().get(k).getFechaEgreso().equals(listaRegistrocliente.get(i).getFechaEgreso())) {
                                hotel.getRegistroHuespedes().get(i).setEstado("Cerrado");
                                labelCheckoutCheckboxError.setText("EL CHECKOUT SE REALIZO CORRECTAMENTE");
                                textVueltoChekoutHab.setText(vuelto.toString());
                            }
                        }

                    }
                }
            }
        }else{
            labelCheckoutCheckboxError.setText("EL CHECKOUT SE NO SE PUEDE RALIZAR, FALTA COMPLETAR SALDO");
        }
    }
    public void onCheckoutRealizarCompletoButtonClicked(MouseEvent event) {
        int indiceCliente=hotel.buscarIdCliente(textIdClienteCheckout.getText());
        Cliente cliente=hotel.getListaCliente().get(indiceCliente);
        Double vuelto = Double.parseDouble(textAbonoFinalChekoutFinal.getText()) - Double.parseDouble(textSldoFinalChekoutFinal.getText());

        if (vuelto >= 0.0) {
            List<RegistroHuesped> listaRegistrocliente = hotel.buscarRegistroPorIdCliente(textIdClienteCheckout.getText());
            for (int i = 0; i < listaRegistrocliente.size(); i++) {
                for (int k = 0; k < hotel.getRegistroHuespedes().size(); k++) {

                    if (hotel.getRegistroHuespedes().get(k).getFechaIngreso().equals(listaRegistrocliente.get(i).getFechaIngreso()) &&
                            hotel.getRegistroHuespedes().get(k).getFechaEgreso().equals(listaRegistrocliente.get(i).getFechaEgreso())) {
                       hotel.getListaCliente().get(indiceCliente).getConsumos().get(hotel.getListaCliente().get(indiceCliente).getConsumos().size()-1).setPagoConsumo(hotel.getListaCliente().get(indiceCliente).calculoSaldo());
                        System.out.println(cliente.calculoSaldo());
                        hotel.getListaUsuarioHotel().get(0).checkOut(hotel.getRegistroHuespedes().get(k),cliente);

                        //hotel.getRegistroHuespedes().get(i).setEstado("Cerrado");
                        System.out.println(hotel.getRegistroHuespedes().get(i).getEstado());
                        labelCheckoutCheckboxError.setText("EL CHECKOUT SE REALIZO CORRECTAMENTE");
                        textVueltoChekoutHab.setText(vuelto.toString());
                    }
                }
            }
        } else {
            labelCheckoutCheckboxError.setText("EL CHECKOUT SE NO SE PUEDE RALIZAR, FALTA COMPLETAR SALDO");
        }
    }


















    //=====================================================================================================
    Callback<DatePicker, DateCell> callB = new Callback<DatePicker, DateCell>() {
        @Override
        public DateCell call(final DatePicker param) {
            return new DateCell() {
                @Override
                public void updateItem(LocalDate item, boolean empty) {
                    super.updateItem(item, empty); //To change body of generated methods, choose Tools | Templates.
                    LocalDate today = LocalDate.now();
                    setDisable(empty || item.compareTo(today) < 0);
                }

            };
        }

    };


    EventHandler<KeyEvent> handelerletters = new EventHandler<KeyEvent>(){

        private boolean willConsume = false;

        @Override
        public void handle(KeyEvent event){
            Object tempO = event.getSource();
            if (willConsume){
                event.consume();
            }
            String temp = event.getCode().toString();
            if ((!event.getCode().toString().matches("[a-zA-Z]")) &&
                    (event.getCode() != KeyCode.BACK_SPACE) &&
                    (event.getCode() != KeyCode.SHIFT)){
                if(event.getEventType() == KeyEvent.KEY_PRESSED){
                    willConsume = true;
                }else if (event.getEventType() == KeyEvent.KEY_RELEASED){
                    willConsume=false;
                }
            }
        }
    };

    public static EventHandler<KeyEvent> handelernumber() {

        EventHandler<KeyEvent> aux = new EventHandler<KeyEvent>() {
            public void handle(KeyEvent keyEvent) {
                if (!"0123456789".contains(keyEvent.getCharacter())) {
                    keyEvent.consume();

                }
            }
        };
        return aux;
    }

    EventHandler<KeyEvent> handelernumber = new EventHandler<KeyEvent>(){

        private boolean willConsume = false;
        private int maxLength = 10;

        @Override
        public void handle(KeyEvent event){
            TextField temp = (TextField) event.getSource();

            if (willConsume){
                event.consume();
            }

            if ((!event.getText().matches("[0-9]")) &&
                    (event.getCode() != KeyCode.BACK_SPACE) ){
                if(event.getEventType() == KeyEvent.KEY_PRESSED){
                    willConsume = true;
                }else if (event.getEventType() == KeyEvent.KEY_RELEASED){
                    willConsume=false;
                }
                if(temp.getText().length() > maxLength -1){
                    if (event.getEventType() == KeyEvent.KEY_PRESSED){
                        willConsume = true;
                    }else if (event.getEventType() == KeyEvent.KEY_RELEASED){
                        willConsume = false;
                    }
                }
            }
        }
    };
    public EventHandler<KeyEvent> handelerdouble(final Integer max_Lengh) {
        return new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent e) {
                TextField txt_TextField = (TextField) e.getSource();
                if (txt_TextField.getText().length() >= max_Lengh) {
                    e.consume();
                }
                if(e.getCharacter().matches("[0-9.]")){
                    if(txt_TextField.getText().contains(".") && e.getCharacter().matches("[.]")){
                        e.consume();
                    }else if(txt_TextField.getText().length() == 0 && e.getCharacter().matches("[.]")){
                        e.consume();
                    }
                }else{
                    e.consume();
                }
            }
        };
    }
    //=====================================================================================================


}
