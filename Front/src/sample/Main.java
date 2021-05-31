package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import sample.back.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.initStyle(StageStyle.TRANSPARENT);
        primaryStage.setTitle("Hotel Frauduletes");
        Scene scene=new Scene(root);
        scene.setFill(Color.TRANSPARENT);
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {

        /// Prueba ordenamiento RegistroHuesped por id y por idCliente
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

        launch(args);// GUARDA CON ESTO!!!! NO BORRAR!!!
    }
}
