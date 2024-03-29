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
    private double xoffset;
    private double yoffset;
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        root.setOnMousePressed(event -> {
            xoffset= event.getSceneX();
            yoffset=event.getSceneY();
        });
        root.setOnMouseDragged(event -> {
            primaryStage.setX(event.getScreenX()-xoffset);
            primaryStage.setY(event.getScreenY()-yoffset);
        });

        primaryStage.initStyle(StageStyle.TRANSPARENT);
        primaryStage.setTitle("Hotel Frauduletes");
        Scene scene=new Scene(root);
        scene.setFill(Color.TRANSPARENT);
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {

        launch(args);// GUARDA CON ESTO!!!! NO BORRAR!!!
    }
}
