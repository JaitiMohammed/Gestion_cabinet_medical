package application;

import dao.IMetier;
import dao.IMetierImpl;
import entities.clients;
import entities.medecins;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class add {

    private static HBox grid;
    private static Button submit;
    private  static  TextField titreInput;
    private  static TextField prenomInput;
    private  static TextField nameInput;
    private static ConfirmBox confirmBox;

    public static HBox addClient(){

        grid = new HBox();
        grid.setPadding(new Insets(10,10,10,10));



        Label titre = new Label("Titre") ;
        titre.setStyle("-fx-font-size: 16px");;
        titre.setTextFill(Color.LINEN);

        titreInput = new TextField();
        titreInput.setMinWidth(200);
        titreInput.setPromptText("titre");
        titreInput.setMinHeight(30);

        Label Name = new Label("Name");
        Name.setStyle("-fx-font-size: 16px");
        Name.setTextFill(Color.LINEN);
        Name.setMinHeight(30);

        nameInput = new TextField();
        nameInput.setMinWidth(200);
        nameInput.setMinHeight(30);
        nameInput.setPromptText("nom");

        Label Prenom = new Label("Prenom");
        Prenom.setTextFill(Color.LINEN);
        Prenom.setStyle("-fx-font-size: 16px");


        prenomInput = new TextField();
        prenomInput.setMinWidth(200);
        prenomInput.setPromptText("prenom");
        prenomInput.setMinHeight(30);


        submit = new Button("validé ");
        submit.setTextFill(Color.web("#F2F5A9"));
        submit.setMaxSize(400, 300);
        submit.setStyle("-fx-background-color: green");
        submit.setOnAction(e-> {
            try {
                EventAddClient(e);
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            }
        });

        grid.getChildren().addAll(titre,titreInput,Name,nameInput,Prenom,prenomInput,submit);

        grid.setAlignment(Pos.CENTER);
        grid.setSpacing(10);



        //



       ;
        ;

        return grid;
    }


    static HBox addMedecin(){

        grid = new HBox();
        grid.setPadding(new Insets(10,10,10,10));



        Label titre = new Label("Titre") ;
        titre.setStyle("-fx-font-size: 16px");;
        titre.setTextFill(Color.LINEN);

        titreInput = new TextField();
        titreInput.setMinWidth(200);
        titreInput.setPromptText("titre");
        titreInput.setMinHeight(30);

        Label Name = new Label("Name");
        Name.setStyle("-fx-font-size: 16px");
        Name.setTextFill(Color.LINEN);
        Name.setMinHeight(30);

        nameInput = new TextField();
        nameInput.setMinWidth(200);
        nameInput.setMinHeight(30);
        nameInput.setPromptText("nom");

        Label Prenom = new Label("Prenom");
        Prenom.setTextFill(Color.LINEN);
        Prenom.setStyle("-fx-font-size: 16px");


        prenomInput = new TextField();
        prenomInput.setMinWidth(200);
        prenomInput.setPromptText("prenom");
        prenomInput.setMinHeight(30);


        submit = new Button("validé ");
        submit.setTextFill(Color.web("#F2F5A9"));
        submit.setMaxSize(400, 300);
        submit.setStyle("-fx-background-color: green");
        submit.setOnAction(e-> {
            try {
                EventAddClient(e);
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            }
        });

        grid.getChildren().addAll(titre,titreInput,Name,nameInput,Prenom,prenomInput,submit);

        grid.setAlignment(Pos.CENTER);
        grid.setSpacing(10);



        //



        ;
        ;

        return grid;

    }

    private static void EventAddClient(javafx.event.ActionEvent e) throws FileNotFoundException {
        if(e.getSource()== submit){
            IMetier metier = new IMetierImpl();
            clients c = new clients(nameInput.getText(),prenomInput.getText(),titreInput.getText());
            metier.addClient(c);
            ConfirmBox.ok();
            nameInput.clear();
            prenomInput.clear();
            titreInput.clear();
        }
    }

    private static void EventAddMedcin(javafx.event.ActionEvent e) throws FileNotFoundException, SQLException {
        if(e.getSource()== submit){
            IMetier metier = new IMetierImpl();
            medecins m = new medecins(nameInput.getText(),prenomInput.getText(),titreInput.getText());
            metier.addMedecin(m);
            ConfirmBox.ok();
            nameInput.clear();
            prenomInput.clear();
            titreInput.clear();
        }
    }



}
