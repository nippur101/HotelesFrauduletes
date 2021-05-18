package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
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
    @FXML private AnchorPane paneAccesoPermitido;
    @FXML private AnchorPane paneManejoRecepcionist;
    @FXML private AnchorPane paneAgregarRecepcionist;
    @FXML private AnchorPane paneModificarRecepcionist;
    @FXML private AnchorPane paneAgregarClient;
    @FXML private AnchorPane paneManejoClient;

    @FXML private AnchorPane paneModificarClient;



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

        arrowAdmin.setVisible(false);
        arrowClient.setVisible(true);
        arrowHabitacion.setVisible(false);
        arrowPago.setVisible(false);
        arrowRecepcionista.setVisible(false);
        arrowRegistro.setVisible(false);
        arrowReserva.setVisible(false);

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
