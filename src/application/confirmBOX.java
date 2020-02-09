package application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

class ConfirmBox{
    static boolean answer ;

    public static boolean display(String title , String message) throws FileNotFoundException {

        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinWidth(400);

        Label label = new Label(message);
        label.setTextFill(Color.web("#F2F5A9"));

        // button
        Button yesButton = new Button("yes");
        Button noButton = new Button("No");
        yesButton.setOnAction(e-> {
            answer = true;
            window.close();
        });
        noButton.setOnAction(e->{
            answer=false;
            window.close();
        });

        VBox layout = new VBox(10);
        layout.setStyle("-fx-background-color: #1e1e1e");
        layout.getChildren().addAll(label,yesButton,noButton);
        layout.setAlignment(Pos.CENTER);


        FileInputStream input = new FileInputStream("src/logo.png");
        Image image = new Image(input);
        window.getIcons().add(image);
        Scene scene = new Scene(layout,300,200);
        window.setScene(scene);
        window.showAndWait();


        return  answer;
    }

    public static void ok() throws FileNotFoundException {
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle("Message Success");
        window.setMinWidth(400);
        Label label = new Label("Bien ajouté !");
        label.setTextFill(Color.web("#F2F5A9"));
        label.setAlignment(Pos.CENTER);
        VBox layout = new VBox(10);
        layout.setStyle("-fx-background-color: #1e1e1e");
        layout.getChildren().addAll(label);
        //layout.setAlignment(Pos.CENTER);
        Button cancel = new Button("Cancel");
        cancel.setOnAction(e-> {
            window.close();
        });

        FileInputStream input = new FileInputStream("src/logo.png");
        Image image = new Image(input);
        window.getIcons().add(image);
        Scene scene = new Scene(layout,300,200);
        window.setScene(scene);
        window.showAndWait();

    }
}