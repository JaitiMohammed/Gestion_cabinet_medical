package application;

import dao.IMetier;
import dao.IMetierImpl;
import entities.clients;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;

public class table {

    private static TableView<clients> table;
    private static  HBox hbox;

    public static StackPane addTable() {

        TableColumn<clients,Integer> idColumn = new TableColumn<clients, Integer>("Id");
        idColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        idColumn.setMinWidth(200);

        TableColumn<clients,String> nameColumn = new TableColumn<>("Name");
        nameColumn.setMinWidth(200);
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("nom"));



        TableColumn<clients,String> prenomColumn = new TableColumn<>("Prenom");
        prenomColumn.setMinWidth(100);
        prenomColumn.setCellValueFactory(new PropertyValueFactory<>("prenom"));

        TableColumn<clients,String> titreColumn = new TableColumn<>("Titre");
        titreColumn.setMinWidth(100);
        titreColumn.setCellValueFactory(new PropertyValueFactory<>("titre"));

        table = new TableView<>();
        table.setItems(getClients());
        table.getColumns().addAll(idColumn,nameColumn,prenomColumn,titreColumn);


        StackPane layout = new StackPane();

        layout.setPadding(new Insets(20,20,20,20));
        layout.getChildren().addAll(table);
        //Scene scene1 = new Scene(hbox, 600, 500);
        return layout;

    }




    public static ObservableList<clients> getClients(){
        IMetier metier = new IMetierImpl();

        return FXCollections.observableArrayList(metier.getAllClients());
    }


}
