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
public class mainMenuController {

    private Stage stage;
    private  Scene scene;
    private  Parent root;
    public void switchToScene1(ActionEvent event) throws IOException {
        Parent root =FXMLLoader.load(getClass().getResource("beef.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
    public void switchToScene2(ActionEvent event) throws IOException {
        Parent root =FXMLLoader.load(getClass().getResource("bestest.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
    public void switchToScene3(ActionEvent event) throws IOException {
        Parent root =FXMLLoader.load(getClass().getResource("chicken.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
    public void switchToScene4(ActionEvent event) throws IOException {
        Parent root =FXMLLoader.load(getClass().getResource("combos.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
    public void switchToScene5(ActionEvent event) throws IOException {
        Parent root =FXMLLoader.load(getClass().getResource("FRIES.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();

    }


}
