package edu.mipt.javafx_test;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private TextField textField;


    public void initialize() {
        textField.textProperty().addListener((observable, oldValue, newValue) -> {
            textField.setText("pishov ti");
        });
    }

    public void onOneButtonClick(ActionEvent event) {
        appendText("1");
    }

    private void appendText(String value) {
        String text = textField.getText();
        textField.setText(text + value);
    }

    public void onTwoButtonClick(ActionEvent event) {
        appendText("2");
    }

    public void onTextFieldChanged(ActionEvent event) {
        textField.setText("idi na huj");
    }

    public void onEqualButtonClick(ActionEvent event) {
        System.exit(0);
    }
}
