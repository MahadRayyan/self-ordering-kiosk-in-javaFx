package com.example.demo3;
import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.EventObject;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class menuController1 {
    @FXML
    private ImageView burgerImage;

    @FXML
    private Label burgerName;

    @FXML
    private Label burgerPrice;

    @FXML
    private Spinner<Integer> quantitySpinner;



    @FXML
    public void initialize() {
        // Initialize the spinner with values 1 to 10
        SpinnerValueFactory<Integer> valueFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 10, 1);
        quantitySpinner.setValueFactory(valueFactory);

    }

    @FXML
    public void handleAddButton(ActionEvent event) {
        try {
            // Get the burger details
            String name = burgerName.getText();
            int quantity = quantitySpinner.getValue();
            double price = 999; // Assuming price is fixed as RS 999
            double total = price * quantity;

            // Add the burger details to the CartManager
            String cartItem = name + " x" + quantity + " - Rs " + total;
            CartManager.getInstance().addItem(cartItem);

            FXMLLoader loader = new FXMLLoader(getClass().getResource("myCart.fxml"));
            root = loader.load();
            myCartController scene2Controller = loader.getController();

            // Load the new scene
            stage = (Stage) ((Button) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        catch (Exception e) {
            e.printStackTrace();

        }
    }










    private Stage stage;
    private  Scene scene;
    private  Parent root;

    public void switchToScene1(ActionEvent event) throws IOException {
        Parent root =FXMLLoader.load(getClass().getResource("myCart.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
    public void switchToScene2(ActionEvent event) throws IOException {
        Parent root =FXMLLoader.load(getClass().getResource("main menu.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();

    }


}
