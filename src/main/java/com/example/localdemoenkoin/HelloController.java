package com.example.localdemoenkoin;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Border;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;

import java.util.ResourceBundle;

public class HelloController {
    @FXML
    private Label welcomeText;

    public Button button1;
    public Button button2;
    public Button button3;


    public void initialize(){
//        ResourceBundle r = ResourceBundle.getBundle("bundle1");
//        button1.setText(r.getString("button1.text"));
//        button2.setText(r.getString("button2.text"));
//        button3.setText(r.getString("button3.text"));

    }

    @FXML

    protected void onHelloButtonClick() {
        welcomeText.setTextFill(Color.rgb(255,0,0));
        welcomeText.setFont(Font.font(14));
        welcomeText.setText("Use of ResourceBundle");

//        ResourceBundle r = ResourceBundle.getBundle("bundle1");
//        button1.setText(r.getString("button1.text"));
//        button2.setText(r.getString("button2.text"));
//        button3.setText(r.getString("button3.text"));
    }
    @FXML
    protected void btnHi() {
        welcomeText.setTextFill(Color.rgb(0,255,0));
        welcomeText.setFont(Font.font(16));
        welcomeText.setText("Hi,  Welcome to JavaFX ResourceBundle!");
    }
    @FXML
    protected void btnTerv() {
        welcomeText.setTextFill(Color.rgb(0,0,255));
        welcomeText.setFont(Font.font(18));
        welcomeText.setText("Hej, Välkommen till JavaFX ResourceBundle!!");

    }
    @FXML
    protected void btnVel() {
        welcomeText.setTextFill(Color.rgb(200,120,120));
        welcomeText.setFont(Font.font(14));
        welcomeText.setText("Moi, Tervetuloa JavaFX ResourceBundleen!!");
    }

    public void btnJp(ActionEvent actionEvent) {
        welcomeText.setTextFill(Color.rgb(200,120,120));
        welcomeText.setFont(Font.font(14));
        welcomeText.setText("こんにちは、JavaFX ResourceBundle へようこそ!!");
    }
}

