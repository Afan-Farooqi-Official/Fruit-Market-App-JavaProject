package sample.demo;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import sample.demo.data.User;
import sample.demo.data.UserDataManager;

import java.io.IOException;

public class SignupController {

    @FXML
    private TextField usernameTextField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private PasswordField confirmPasswordField;

    @FXML
    private Button signupButton;

    public void signupButtonClicked() {
        String username = usernameTextField.getText();
        String password = passwordField.getText();
        String confirmPassword = confirmPasswordField.getText();

        if (username.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
            showAlert("Please fill in all fields.");
            return;
        }

        if (!password.equals(confirmPassword)) {
            showAlert("Passwords do not match.");
            return;
        }

        if (!isValidPassword(password)) {
            return;
        }

        if (UserDataManager.isUserExists(username)) {
            showAlert("Username already exists.");
            return;
        }

        User newUser = new User(username, password);
        UserDataManager.addUser(newUser);

        showAlertcreated("Signup successful! Please login.");
        loadLoginScreen();
    }

    private void showAlertcreated(String s) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("account created");
        alert.setHeaderText(null);
        alert.setContentText(s);
        alert.showAndWait();
    }

    private boolean isValidPassword(String password) {
        if (password.length() < 8) {
            showAlert("Password must be at least 8 characters long.");
            return false;
        }

        boolean hasNumber = false;
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                hasNumber = true;
                break;
            }
        }

        if (!hasNumber) {
            showAlert("Password must contain at least one number.");
            return false;
        }

        return true;
    }

    private void showAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Signup Error");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    private void loadLoginScreen() {
        try {
            FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("login.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) signupButton.getScene().getWindow();
            stage.setScene(new Scene(root));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}