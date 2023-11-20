package com.whosvictorm.banksystem.Controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Border;
import javafx.scene.paint.Paint;

public class LoginController {
    @FXML
    private Label welcomeText;

    @FXML
    private Button createAccount;

    @FXML
    private ImageView createAccImage;


    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }


}