package com.example.demo3;



import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

class CartManager {
    private static CartManager instance = new CartManager();
    private ObservableList<String> cartItems;

    private CartManager() {
        cartItems = FXCollections.observableArrayList();
    }

    public static CartManager getInstance() {
        return instance;
    }

    public ObservableList<String> getCartItems() {
        return cartItems;
    }

    public void addItem(String item) {
        cartItems.add(item);
    }
}
