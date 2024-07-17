package com.example.demo3;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class SceneController {
    private Stage stage;
    private  Scene scene;
    private  Parent root;

    public void switchToScene2(ActionEvent event) throws IOException {
        Parent root =FXMLLoader.load(getClass().getResource("main menu.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
}
