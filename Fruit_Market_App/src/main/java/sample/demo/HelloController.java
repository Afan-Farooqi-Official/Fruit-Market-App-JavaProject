package sample.demo;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private VBox chosenFruitCard;

    @FXML
    private Label fruitNameLabel;

    @FXML
    private Label fruitPriceLabel;

    @FXML
    private ImageView fruitImg;

    @FXML
    private GridPane grid;

    @FXML
    private ScrollPane scroll;

    @FXML
    private Button logoutButton;

    @FXML
    public void logoutButtonClicked() {

        try {
            FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("login.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) logoutButton.getScene().getWindow();
            stage.setScene(new Scene(root));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private List<Fruit> fruits = new ArrayList<>();

    private List<Fruit> getData() {
        List<Fruit> fruits = new ArrayList<>();
        Fruit fruit;

        fruit = new Fruit();
        fruit.setName("Kiwi");
        fruit.setPrice(0.99);
        fruit.setImgSrc("sample/demo/img/kiwi.jpg");
        fruit.setColor("E6F2DA");
        fruits.add(fruit);

        fruit = new Fruit();
        fruit.setName("Apple");
        fruit.setPrice(0.56);
        fruit.setImgSrc("sample/demo/img/apple.jpg");
        fruit.setColor("F3E3EA");
        fruits.add(fruit);

        fruit = new Fruit();
        fruit.setName("Banana");
        fruit.setPrice(0.45);
        fruit.setImgSrc("sample/demo/img/banana.jpg");
        fruit.setColor("FFF9D5");
        fruits.add(fruit);

        fruit = new Fruit();
        fruit.setName("Orange");
        fruit.setPrice(0.89);
        fruit.setImgSrc("sample/demo/img/orange.jpg");
        fruit.setColor("FFE8D5");
        fruits.add(fruit);

        fruit = new Fruit();
        fruit.setName("Cherry");
        fruit.setPrice(0.59);
        fruit.setImgSrc("sample/demo/img/cherry.jpg");
        fruit.setColor("FFE3E2");
        fruits.add(fruit);

        fruit = new Fruit();
        fruit.setName("Blueberry");
        fruit.setPrice(0.42);
        fruit.setImgSrc("sample/demo/img/blueberry.jpg");
        fruit.setColor("E2ECF5");
        fruits.add(fruit);

        fruit = new Fruit();
        fruit.setName("Pineapple");
        fruit.setPrice(0.99);
        fruit.setImgSrc("sample/demo/img/images (1).jpg");
        fruit.setColor("FFF0D5");
        fruits.add(fruit);

        fruit = new Fruit();
        fruit.setName("Avocado");
        fruit.setPrice(0.56);
        fruit.setImgSrc("sample/demo/img/images (1).jpg");
        fruit.setColor("E6F2DA");
        fruits.add(fruit);

        fruit = new Fruit();
        fruit.setName("Mango");
        fruit.setPrice(0.45);
        fruit.setImgSrc("sample/demo/img/images (1).jpg");
        fruit.setColor("FFE8D5");
        fruits.add(fruit);

        fruit = new Fruit();
        fruit.setName("Grape");
        fruit.setPrice(0.99);
        fruit.setImgSrc("sample/demo/img/images (1).jpg");
        fruit.setColor("EAD5F5");
        fruits.add(fruit);

        fruit = new Fruit();
        fruit.setName("Strawberry");
        fruit.setPrice(0.56);
        fruit.setImgSrc("sample/demo/img/images (1).jpg");
        fruit.setColor("F5D5D9");
        fruits.add(fruit);

        fruit = new Fruit();
        fruit.setName("Raspberry");
        fruit.setPrice(0.89);
        fruit.setImgSrc("sample/demo/img/images (1).jpg");
        fruit.setColor("FFE3E2");
        fruits.add(fruit);

        fruit = new Fruit();
        fruit.setName("Watermelon");
        fruit.setPrice(0.59);
        fruit.setImgSrc("sample/demo/img/images (1).jpg");
        fruit.setColor("E1F5E2");
        fruits.add(fruit);

        fruit = new Fruit();
        fruit.setName("Pear");
        fruit.setPrice(0.42);
        fruit.setImgSrc("sample/demo/img/images (1).jpg");
        fruit.setColor("E6F2DA");
        fruits.add(fruit);

        fruit = new Fruit();
        fruit.setName("Lemon");
        fruit.setPrice(0.99);
        fruit.setImgSrc("sample/demo/img/images (1).jpg");
        fruit.setColor("FDFCDA");
        fruits.add(fruit);

        fruit = new Fruit();
        fruit.setName("Lime");
        fruit.setPrice(0.56);
        fruit.setImgSrc("sample/demo/img/images (1).jpg");
        fruit.setColor("E6F2DA");
        fruits.add(fruit);

        fruit = new Fruit();
        fruit.setName("Date");
        fruit.setPrice(0.45);
        fruit.setImgSrc("sample/demo/img/images (1).jpg");
        fruit.setColor("FFF9D5");
        fruits.add(fruit);

        fruit = new Fruit();
        fruit.setName("Coconut");
        fruit.setPrice(0.99);
        fruit.setImgSrc("sample/demo/img/images (1).jpg");
        fruit.setColor("F5F5F5");
        fruits.add(fruit);

        fruit = new Fruit();
        fruit.setName("Lychee");
        fruit.setPrice(0.56);
        fruit.setImgSrc("sample/demo/img/images (1).jpg");
        fruit.setColor("F5D5D9");
        fruits.add(fruit);

        fruit = new Fruit();
        fruit.setName("Dragon Fruit");
        fruit.setPrice(0.45);
        fruit.setImgSrc("sample/demo/img/images (1).jpg");
        fruit.setColor("FFE3E2");
        fruits.add(fruit);

        return fruits;
    }

//    private void setChosenFruitCard(Fruit fruit){
//        fruitNameLabel.setText(fruit.getName());
//        fruitPriceLabel.setText(HelloApplication.CURRENCY + fruit.getPrice());
//        image = new Image(getClass().getResourceAsStream(fruit.getImgSrc()));
//        chosenFruitCard.setStyle("-fx-background-color: #" + fruit.getColor() + ";\n" +
//                "    -fx-background-radius: 30;");
//    }

        @Override
        public void initialize (URL location, ResourceBundle resources){
            fruits.addAll(getData());
            int column = 0;
            int row = 1;
            try {
                for (int i = 0; i < fruits.size(); i++) {
                    FXMLLoader fxmlLoader = new FXMLLoader();
                    fxmlLoader.setLocation(getClass().getResource("item.fxml"));
                    AnchorPane anchorPane = fxmlLoader.load();

                    itemController itemController = fxmlLoader.getController();
                    // Check for null before accessing fruits.get(i)
                    if (fruits != null && i < fruits.size()) {
                        itemController.setData(fruits.get(i));
                    }

                    if (column == 4) {
                        column = 0;
                        row++;
                    }
                    grid.add(anchorPane, column++, row);

                    grid.setMinWidth(Region.USE_COMPUTED_SIZE);
                    grid.setPrefWidth(Region.USE_COMPUTED_SIZE);
                    grid.setMaxWidth(Region.USE_COMPUTED_SIZE);

                    grid.setMinHeight(Region.USE_COMPUTED_SIZE);
                    grid.setPrefHeight(Region.USE_COMPUTED_SIZE);
                    grid.setMaxHeight(Region.USE_COMPUTED_SIZE);

                    GridPane.setMargin(anchorPane, new Insets(10));
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
