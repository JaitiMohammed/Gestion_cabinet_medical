package application;

import dao.IMetier;
import dao.IMetierImpl;
import entities.clients;
import entities.medecins;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;

import java.sql.SQLException;

public class tableMedecin {

    private static TableView<medecins> table;


    public static StackPane addTable() throws SQLException {


        TableColumn<medecins,Integer> idColumn = new TableColumn<medecins, Integer>("Id");
        idColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        idColumn.setMinWidth(200);

        TableColumn<medecins,String> nameColumn = new TableColumn<>("Name");
        nameColumn.setMinWidth(200);
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("nom"));



        TableColumn<medecins,String> prenomColumn = new TableColumn<>("Prenom");
        prenomColumn.setMinWidth(100);
        prenomColumn.setCellValueFactory(new PropertyValueFactory<>("prenom"));

        TableColumn<medecins,String> titreColumn = new TableColumn<>("Titre");
        titreColumn.setMinWidth(100);
        titreColumn.setCellValueFactory(new PropertyValueFactory<>("titre"));

        table = new TableView<>();
        table.setItems(getMedecins());
        table.getColumns().addAll(idColumn,nameColumn,prenomColumn,titreColumn);


        StackPane layout = new StackPane();


        layout.setPadding(new Insets(20,20,20,20));
        layout.getChildren().addAll(table);
        //Scene scene1 = new Scene(hbox, 600, 500);
        return layout;

    }




    public static ObservableList<medecins> getMedecins() throws SQLException {
        IMetier metier = new IMetierImpl();
        return FXCollections.observableArrayList(metier.getAllMedecins());
    }

}
