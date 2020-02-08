package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class main extends Application {
    Stage window ;
    Scene scene;



    @Override
    public void start(Stage primaryStage) {
        window=primaryStage;
        window.setTitle("Gestion d'un cabinet Medical");
        HBox topMenu = new HBox();



        Button btnSceneDoc = new Button("Doctor Panel");
        Button btnSceneClients = new Button("Client Panel");
        btnSceneClients.setOnAction(e->clientScene());
        topMenu.getChildren().addAll(btnSceneDoc,btnSceneClients);
        topMenu.setPadding(new Insets(20,20,20,20));
        topMenu.setAlignment(Pos.CENTER);
        topMenu.setSpacing(10);


        HBox boottomBox = new HBox();
        Label copyright = new Label("Developed By Jaiti Mohammed");
        copyright.setTextFill(Color.web("#007684"));
        boottomBox.getChildren().add(copyright);
        boottomBox.setAlignment(Pos.CENTER);
        BorderPane root = new BorderPane();
        root.setCenter(topMenu);
        root.setBottom(boottomBox);



        scene = new Scene(root,800,500);
        scene.getStylesheets().add("style.css");
        window.setScene(scene);
        window.show();
    }

    private void clientScene() {
        window.setScene(sceneClient.dispaly());
    }

    public static void main(String[] args) {
        launch(args);
    }
}
