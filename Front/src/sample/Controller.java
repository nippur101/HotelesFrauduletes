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


    }
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

        this.mostrarPaneX(PaneElegido.paneAccesoPermitido);

        this.mostrarFlechaX(FlechaElegida.arrowAdmin);


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







}
