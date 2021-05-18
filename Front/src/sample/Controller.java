package sample;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;


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
    @FXML private AnchorPane paneManejoRecepcionist;
    @FXML private AnchorPane paneAgregarRecepcionist;
    @FXML private AnchorPane paneModificarRecepcionist;
    @FXML private AnchorPane paneAgregarClient;
    @FXML private AnchorPane paneModificarClient;



    public void onExitButtonClicked(MouseEvent event){
            Platform.exit();
            System.exit(0);
    }

    public void onAdminButtonClicked(MouseEvent event){
        paneAdminPass.setVisible(true);
        paneAgregarClient.setVisible(false);
        paneModificarClient.setVisible(true);
        paneManejoRecepcionist.setVisible(false);
        paneAgregarRecepcionist.setVisible(false);
        paneModificarRecepcionist.setVisible(false);


    }
    public void onRecepcionistButtonCliked(MouseEvent event){

    }

    public void onClientButtonClicked(MouseEvent event){

    }

    public void onReservaButtonCliked(MouseEvent event){

    }

    public void onRegistroButtonClicked(MouseEvent event){

    }

    public void onPagoButtonClicked(MouseEvent event){

    }

    public void onHabitacionButtonClicked(MouseEvent event){

    }







}
