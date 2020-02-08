package application;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;



public class sceneClient {



    public static Scene dispaly(){
        Stage window  = new Stage();
        BorderPane root = new BorderPane();
        HBox topMenu = new HBox();
        Button btn = new Button("close the window");
        btn.setOnAction(e->window.close());
        topMenu.getChildren().add(btn);
        topMenu.setSpacing(15);

        root.getChildren().add(topMenu);
        Scene scene = new Scene(root, 800, 500);
        scene.getStylesheets().add("client.css");
        window.setScene(scene);
        return scene;
    }

}
