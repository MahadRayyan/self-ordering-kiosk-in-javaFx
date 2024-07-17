package com.example.demo3;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
public class menuControllers  {


    @FXML
    private Label burgerName;

    @FXML
    private Label burgerName1;

    @FXML
    private Label burgerName2;

    @FXML
    private Label burgerName3;

    @FXML
    private Label burgerPrice;

    @FXML
    private Label burgerPrice1;

    @FXML
    private Label burgerPrice2;

    @FXML
    private Label burgerPrice3;

    @FXML
    private Spinner<Integer> quantitySpinner;

    @FXML
    private Spinner<Integer> quantitySpinner1;

    @FXML
    private Spinner<Integer> quantitySpinner2;

    @FXML
    private Spinner<Integer> quantitySpinner3;



    @FXML
    public void initialize() {
        // Initialize the spinner with values 1 to 10
        SpinnerValueFactory<Integer> valueFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 10, 1);
        quantitySpinner.setValueFactory(valueFactory);
        SpinnerValueFactory<Integer> valueFactory1 = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 10, 1);
        quantitySpinner1.setValueFactory(valueFactory1);
        SpinnerValueFactory<Integer> valueFactory2 = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 10, 1);
        quantitySpinner2.setValueFactory(valueFactory2);
        SpinnerValueFactory<Integer> valueFactory3 = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 10, 1);
        quantitySpinner3.setValueFactory(valueFactory3);
    }
    @FXML
    public void handleAddButton(ActionEvent event) {
        try {
            // Get the burger details
            String name = burgerName3.getText();
            int quantity = quantitySpinner3.getValue();
            double price = 999;
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
    @FXML
    public void handleAddButton1(ActionEvent event) {
        try {
            // Get the burger details
            String name = burgerName1.getText();
            int quantity = quantitySpinner1.getValue();
            double price = 799;
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
    @FXML
    public void handleAddButton2(ActionEvent event) {
        try {
            // Get the burger details
            String name = burgerName.getText();
            int quantity = quantitySpinner.getValue();
            double price = 399;
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
    @FXML
    public void handleAddButton3(ActionEvent event) {
        try {
            // Get the burger details
            String name = burgerName2.getText();
            int quantity = quantitySpinner2.getValue();
            double price = 699;
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
