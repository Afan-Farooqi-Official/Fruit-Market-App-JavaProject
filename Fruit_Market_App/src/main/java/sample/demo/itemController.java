package sample.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import javafx.scene.layout.GridPane;

public class itemController{

    @FXML
    private Label nameLabel;

    @FXML
    private Label priceLabel;

    @FXML
    private ImageView img;

    private Fruit fruit;

    public void setData(Fruit fruit) {
        if (fruit != null) {
            nameLabel.setText(fruit.getName());
            priceLabel.setText(HelloApplication.CURRENCY + fruit.getPrice());

            if (fruit.getImgSrc() != null) {
                System.out.println("Loading image: " + fruit.getImgSrc());
                try {
                    Image image = new Image(getClass().getClassLoader().getResource(fruit.getImgSrc()).toExternalForm());
                    img.setImage(image);
                } catch (Exception e) {
                    System.err.println("Error loading image: " + fruit.getImgSrc() + " - " + e.getMessage());
                    // Set a default image
//                    img.setImage(new Image(getClass().getClassLoader().getResource("images/default_fruit.png").toExternalForm()));
                }
            }
        }
    }
}
