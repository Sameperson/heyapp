package com.sameperson.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class MainController {
    @FXML private TextField firstName;
    @FXML private Text heyText;

    public void handleHey(ActionEvent actionEvent) {
        heyText.setText(String.format("Hey, %s!", firstName.getText()));
    }
}
