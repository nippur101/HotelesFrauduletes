package sample;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.Date;
import java.util.Properties;
import java.util.ResourceBundle;


public class Controller {
    @FXML private ImageView imageAdmin;
    @FXML private ImageView imageRecepcionist;
    @FXML private ImageView imageReserv;
    @FXML private ImageView imageRegistro;
    @FXML private ImageView imagePago;
    @FXML private ImageView imageExit;

    @FXML private ImageView arrowAdmin;
    @FXML private ImageView arrowClient;
    @FXML private ImageView arrowRecepcionista;
    @FXML private ImageView arrowRegistro;
    @FXML private ImageView arrowPago;
    @FXML private ImageView arrowHabitacion;
    @FXML private ImageView arrowReserva;

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

    @FXML private TableView<Detalle> tableViewDetalle;

    @FXML private TableColumn<Detalle,String > columFecha;
    @FXML private TableColumn<Detalle,Integer > columCuenta;
    @FXML private TableColumn<Detalle,String > columNombreDeCuenta;
    @FXML private TableColumn<Detalle,Integer > columReferencia;
    @FXML private TableColumn<Detalle,String > columDescripcion;
    @FXML private TableColumn<Detalle,Double > columCargos;
    @FXML private TableColumn<Detalle,Double > columAbono;
    @FXML private TableColumn<Detalle,Boolean > columEstado;

    public void onPagoButtonClicked(MouseEvent event){

        paneAdminPass.setVisible(false);
        paneAgregarClient.setVisible(false);
        paneModificarClient.setVisible(false);
        paneManejoRecepcionist.setVisible(false);
        paneAgregarRecepcionist.setVisible(false);
        paneManejoClient.setVisible(false);
        paneModificarRecepcionist.setVisible(false);
        paneAccesoPermitido.setVisible(false);
        paneReserva.setVisible(false);
        paneRegistro.setVisible(false);
        panePago.setVisible(true);

        arrowAdmin.setVisible(false);
        arrowClient.setVisible(false);
        arrowHabitacion.setVisible(false);
        arrowPago.setVisible(true);
        arrowRecepcionista.setVisible(false);
        arrowRegistro.setVisible(false);
        arrowReserva.setVisible(false);

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

    public void onAdminButtonClicked(MouseEvent event){
        paneAdminPass.setVisible(true);
        paneAgregarClient.setVisible(false);
        paneModificarClient.setVisible(false);
        paneManejoRecepcionist.setVisible(false);
        paneAgregarRecepcionist.setVisible(false);
        paneManejoClient.setVisible(false);
        paneModificarRecepcionist.setVisible(false);
        paneAccesoPermitido.setVisible(false);
        paneReserva.setVisible(false);
        paneRegistro.setVisible(false);
        panePago.setVisible(false);
        arrowAdmin.setVisible(true);
        arrowClient.setVisible(false);
        arrowHabitacion.setVisible(false);
        arrowPago.setVisible(false);
        arrowRecepcionista.setVisible(false);
        arrowRegistro.setVisible(false);
        arrowReserva.setVisible(false);


    }
    public void onAgregarClientButtonCliked(MouseEvent event){
        paneAdminPass.setVisible(false);
        paneAgregarClient.setVisible(true);
        paneModificarClient.setVisible(false);
        paneManejoRecepcionist.setVisible(false);
        paneAgregarRecepcionist.setVisible(false);
        paneManejoClient.setVisible(false);
        paneModificarRecepcionist.setVisible(false);
        paneAccesoPermitido.setVisible(false);
        paneReserva.setVisible(false);
        paneRegistro.setVisible(false);
        panePago.setVisible(false);

        arrowAdmin.setVisible(false);
        arrowClient.setVisible(true);
        arrowHabitacion.setVisible(false);
        arrowPago.setVisible(false);
        arrowRecepcionista.setVisible(false);
        arrowRegistro.setVisible(false);
        arrowReserva.setVisible(false);
    }

    public void onModificarClientButtonCliked(MouseEvent event){
        paneAdminPass.setVisible(false);
        paneAgregarClient.setVisible(false);
        paneModificarClient.setVisible(true);
        paneManejoRecepcionist.setVisible(false);
        paneAgregarRecepcionist.setVisible(false);
        paneManejoClient.setVisible(false);
        paneModificarRecepcionist.setVisible(false);
        paneAccesoPermitido.setVisible(false);
        paneReserva.setVisible(false);
        paneRegistro.setVisible(false);
        panePago.setVisible(false);

        arrowAdmin.setVisible(false);
        arrowClient.setVisible(true);
        arrowHabitacion.setVisible(false);
        arrowPago.setVisible(false);
        arrowRecepcionista.setVisible(false);
        arrowRegistro.setVisible(false);
        arrowReserva.setVisible(false);
    }
    public void onAgregarRecepcionistButtonCliked(MouseEvent event){
        paneAdminPass.setVisible(false);
        paneAgregarClient.setVisible(false);
        paneModificarClient.setVisible(false);
        paneManejoRecepcionist.setVisible(false);
        paneAgregarRecepcionist.setVisible(true);
        paneManejoClient.setVisible(false);
        paneModificarRecepcionist.setVisible(false);
        paneAccesoPermitido.setVisible(false);
        paneReserva.setVisible(false);
        paneRegistro.setVisible(false);
        panePago.setVisible(false);

        arrowAdmin.setVisible(false);
        arrowClient.setVisible(false);
        arrowHabitacion.setVisible(false);
        arrowPago.setVisible(false);
        arrowRecepcionista.setVisible(true);
        arrowRegistro.setVisible(false);
        arrowReserva.setVisible(false);
    }

    public void onModificarRecepcionistuttonCliked(MouseEvent event){
        paneAdminPass.setVisible(false);
        paneAgregarClient.setVisible(false);
        paneModificarClient.setVisible(false);
        paneManejoRecepcionist.setVisible(false);
        paneAgregarRecepcionist.setVisible(false);
        paneManejoClient.setVisible(false);
        paneModificarRecepcionist.setVisible(true);
        paneAccesoPermitido.setVisible(false);
        paneReserva.setVisible(false);
        paneRegistro.setVisible(false);
        panePago.setVisible(false);

        arrowAdmin.setVisible(false);
        arrowClient.setVisible(false);
        arrowHabitacion.setVisible(false);
        arrowPago.setVisible(false);
        arrowRecepcionista.setVisible(true);
        arrowRegistro.setVisible(false);
        arrowReserva.setVisible(false);
    }

    public void onAdminPassButtonCliked(MouseEvent event){
        // SE DEBE PONER EL PASSWORD CORRECTO!!!!!!!!!!!!!!!
        paneAdminPass.setVisible(false);
        paneAgregarClient.setVisible(false);
        paneModificarClient.setVisible(false);
        paneManejoRecepcionist.setVisible(false);
        paneAgregarRecepcionist.setVisible(false);
        paneManejoClient.setVisible(false);
        paneModificarRecepcionist.setVisible(false);
        paneAccesoPermitido.setVisible(true);
        paneReserva.setVisible(false);
        paneRegistro.setVisible(false);
        panePago.setVisible(false);

        arrowAdmin.setVisible(true);
        arrowClient.setVisible(false);
        arrowHabitacion.setVisible(false);
        arrowPago.setVisible(false);
        arrowRecepcionista.setVisible(false);
        arrowRegistro.setVisible(false);
        arrowReserva.setVisible(false);
    }

    public void onRecepcionistButtonCliked(MouseEvent event){
        paneAdminPass.setVisible(false);
        paneAgregarClient.setVisible(false);
        paneModificarClient.setVisible(false);
        paneManejoRecepcionist.setVisible(true);
        paneAgregarRecepcionist.setVisible(false);
        paneManejoClient.setVisible(false);
        paneModificarRecepcionist.setVisible(false);
        paneAccesoPermitido.setVisible(false);
        paneReserva.setVisible(false);
        paneRegistro.setVisible(false);
        panePago.setVisible(false);

        arrowAdmin.setVisible(false);
        arrowClient.setVisible(false);
        arrowHabitacion.setVisible(false);
        arrowPago.setVisible(false);
        arrowRecepcionista.setVisible(true);
        arrowRegistro.setVisible(false);
        arrowReserva.setVisible(false);

    }

    public void onClientButtonClicked(MouseEvent event){
        paneAdminPass.setVisible(false);
        paneAgregarClient.setVisible(false);
        paneModificarClient.setVisible(false);
        paneManejoRecepcionist.setVisible(false);
        paneAgregarRecepcionist.setVisible(false);
        paneManejoClient.setVisible(true);
        paneModificarRecepcionist.setVisible(false);
        paneAccesoPermitido.setVisible(false);
        paneReserva.setVisible(false);
        paneRegistro.setVisible(false);
        panePago.setVisible(false);

        arrowAdmin.setVisible(false);
        arrowClient.setVisible(true);
        arrowHabitacion.setVisible(false);
        arrowPago.setVisible(false);
        arrowRecepcionista.setVisible(false);
        arrowRegistro.setVisible(false);
        arrowReserva.setVisible(false);

    }

    public void onReservaButtonCliked(MouseEvent event){
        paneAdminPass.setVisible(false);
        paneAgregarClient.setVisible(false);
        paneModificarClient.setVisible(false);
        paneManejoRecepcionist.setVisible(false);
        paneAgregarRecepcionist.setVisible(false);
        paneManejoClient.setVisible(true);
        paneModificarRecepcionist.setVisible(false);
        paneAccesoPermitido.setVisible(false);
        paneReserva.setVisible(true);
        paneRegistro.setVisible(false);
        panePago.setVisible(false);

        arrowAdmin.setVisible(false);
        arrowClient.setVisible(false);
        arrowHabitacion.setVisible(false);
        arrowPago.setVisible(false);
        arrowRecepcionista.setVisible(false);
        arrowRegistro.setVisible(false);
        arrowReserva.setVisible(true);
    }

    public void onRegistroButtonClicked(MouseEvent event){
        paneAdminPass.setVisible(false);
        paneAgregarClient.setVisible(false);
        paneModificarClient.setVisible(false);
        paneManejoRecepcionist.setVisible(false);
        paneAgregarRecepcionist.setVisible(false);
        paneManejoClient.setVisible(true);
        paneModificarRecepcionist.setVisible(false);
        paneAccesoPermitido.setVisible(false);
        paneReserva.setVisible(false);
        paneRegistro.setVisible(true);
        panePago.setVisible(false);

        arrowAdmin.setVisible(false);
        arrowClient.setVisible(false);
        arrowHabitacion.setVisible(false);
        arrowPago.setVisible(false);
        arrowRecepcionista.setVisible(false);
        arrowRegistro.setVisible(true);
        arrowReserva.setVisible(false);

    }



    public void onHabitacionButtonClicked(MouseEvent event){

    }







}
