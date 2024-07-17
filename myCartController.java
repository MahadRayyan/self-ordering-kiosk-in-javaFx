package com.example.demo3;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class myCartController {
    @FXML
    private Label menuTotal;
    @FXML
    private TextField menuAmount;
    @FXML
    private Label menuChange;
    @FXML
    private ListView<String> cartListView;
    @FXML
    private Button menuRemove;
    @FXML
    private Button payButton;


    @FXML
    public void initialize() {
        // Set the cart items from CartManager to the ListView
        cartListView.setItems(CartManager.getInstance().getCartItems());
        calculateTotal();

    }
    @FXML
    private void handlePayButtonAction(ActionEvent event)  {
        try {
            double total = parseCurrency(menuTotal.getText());
            double amount = parseCurrency(menuAmount.getText());

            if (amount == total) {
                double change = amount - total;

                cartListView.getItems().clear();
                menuTotal.setText("RS 0.0");

                Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
                stage=(Stage)((Node)event.getSource()).getScene().getWindow();
                scene=new Scene(root);
                stage.setScene(scene);
                stage.show();


            } else if (amount>total) {
                double change = amount - total;

                    menuChange.setText(" Your change is PKR " + change);



            } else {
                menuChange.setText("Insufficient amount paid!");
            }
        } catch (NumberFormatException e) {
            menuChange.setText("Invalid amount entered!");
        } catch (Exception e) {
            e.printStackTrace();
            menuChange.setText("Error processing payment");
        }
    }

    private double parseCurrency(String text) throws NumberFormatException {
        // Remove any currency symbols and parse the number
        text = text.replaceAll("[^\\d.]", "");
        return Double.parseDouble(text);
    }



    @FXML
    private void handleRemoveButtonAction() {
        cartListView.getItems().clear();
        //CartManager.getInstance().clearCart(); // Optionally clear the cart in the CartManager as well
        menuTotal.setText("RS 0.0"); // Optionally reset the total label
    }

    public void calculateTotal() {
        double total = 0.0;
        for (String item : cartListView.getItems()) {
            // Assuming each item is stored in the format "name x quantity = Rs total"
            String[] parts = item.split(" - Rs ");
            if (parts.length == 2) {
                total += Double.parseDouble(parts[1]);
            }
        }
        menuTotal.setText("RS " + total);
    }

    public void addBurgerToList(String name, int quantity, double total) {
        // This method is no longer necessary as items are added directly in Scene1Controller
    }












    private Stage stage;
    private  Scene scene;
    private  Parent root;
    public void switchToScene2(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("main menu.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
}
