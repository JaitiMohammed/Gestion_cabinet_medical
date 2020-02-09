package application;

import com.sun.javafx.util.TempState;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.awt.*;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import javafx.scene.control.TextField;

public class window extends Application {
    Stage window ;
    private static add ajouter;
    private  static  table table;


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {
        window = primaryStage;
        window.setTitle("Application e gestion de cabinet");
        window.setOnCloseRequest(e-> {
            e.consume();
            try {
                closeProgram();
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            }
        });
        Button button1 = new Button("Click Me");
        button1.setOnAction(
                e-> {
                    try {
                        closeProgram();
                    } catch (FileNotFoundException ex) {
                        ex.printStackTrace();
                    }
                }
        );

        BorderPane root = new BorderPane();
        HBox hbox = new HBox();
        Label label = new Label("Gestion de cabinet Medical");
        label.setStyle("-fx-font-size: 20px");
        label.setTextFill(Color.web("#ffff"));
        label.setAlignment(Pos.CENTER);



        hbox.getChildren().addAll(label);
        hbox.setAlignment(Pos.CENTER);
        hbox.setPadding(new Insets(12,10,20,10));
        hbox.setStyle("-fx-background-color: #1e1e1e");


        //
        VBox vbox = new VBox();
        vbox.setStyle("-fx-background-color: gray");
        Button btn1 = new Button("Afficher Clients");
        btn1.setTextFill(Color.web("#F2F5A9"));
        btn1.setStyle("-fx-background-color: #B43104");
        btn1.setMaxSize(400, 300);
        Button btn2 = new Button("Ajouter Client");
        btn2.setTextFill(Color.web("#F2F5A9"));
        btn2.setMaxSize(400, 300);
        btn2.setStyle("-fx-background-color: #B43104");

        Button btn3 = new Button("Ajouter Medecin");
        btn3.setTextFill(Color.web("#F2F5A9"));
        btn3.setMaxSize(400, 300);
        btn3.setStyle("-fx-background-color: #B43104");
        Button btn4 = new Button("Afficher Medecins");
        btn4.setTextFill(Color.web("#F2F5A9"));
        btn4.setMaxSize(400, 300);
        btn4.setStyle("-fx-background-color: #B43104");
        Button btn5= new Button("Ajouter Rendez-Vous");
        btn5.setTextFill(Color.web("#F2F5A9"));
        btn5.setMaxSize(400, 300);
        btn5.setStyle("-fx-background-color: #B43104");
        btn5.setDisable(true);

        //

        Label label1 = new Label("Dashboard");



        label1.setStyle("-fx-font-weight: bold;-fx-font-size: 16px");
        label1.setAlignment(Pos.TOP_CENTER);
        label1.setPadding(new Insets(6,20,5,10));
        vbox.getChildren().addAll(label1,btn1,btn2,btn3,btn4,btn5);

        vbox.setAlignment(Pos.CENTER);
        vbox.setPadding(new Insets(0,20,10,20));
        vbox.setSpacing(20);





        VBox body = new VBox();
        body.setAlignment(Pos.CENTER);
        body.setStyle("-fx-background-color: #424242");



        btn1.setOnAction(e->{
            body.getChildren().clear();
            body.getChildren().add(table.addTable());
        });
        btn2.setOnAction(

                e->{
                    body.getChildren().clear();
                    body.getChildren().add(ajouter.addClient());
                    //window.setScene(new Scene(body));
                    //btn2.setDisable(true);
                }

        );
        //btn2.setDisable(false);
        body.getChildren().clear();
        btn3.setOnAction(

                e->{
                    body.getChildren().clear();
                    body.getChildren().add(ajouter.addMedecin());
                    //window.setScene(new Scene(body));
                }

        );




        HBox hbox2 = new HBox();
        hbox2.setStyle("-fx-background-color: #1e1e1e");
        hbox2.setAlignment(Pos.CENTER);
        hbox2.setPadding(new Insets(10,10,10,10));
        Label copyright = new Label("Developed By Jaiti Mohammed");
        copyright.setTextFill(Color.web("#F2F5A9"));
        copyright.setAlignment(Pos.CENTER);
        hbox2.getChildren().add(copyright);
        // Body









        root.setTop(hbox);
        root.setCenter(body);
        root.setLeft(vbox);
        root.setBottom(hbox2);
        root.getChildren().add(button1);
        FileInputStream input = new FileInputStream("src/logo.png");
        Image image = new Image(input);
        window.getIcons().add(image);
        Scene scene = new Scene(root,1200,600);
        window.setScene(scene);
        //window.setFullScreen(true);
        window.show();

    }

    private void closeProgram() throws FileNotFoundException {
        Boolean answer = ConfirmBox.display("EXIT" , "Are you Sure to exit");
        if(answer) {
            window.close();
        }
    }


}
