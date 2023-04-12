package com.example.comp1008st200524201assignment2;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class VideoGameController implements Initializable {

    @FXML
    private Label authorLabel;

    @FXML
    private Label gameAuthor;

    @FXML
    private Label gamePrice;

    @FXML
    private Label gameTitle;

    @FXML
    private ListView<VideoGame> listView;

    @FXML
    private ImageView gameImages;

    @FXML
    private Label priceLabel;
    @FXML
    private TextField developerAdd;
    @FXML
    private TextField titleAdd;
    @FXML
    private TextField priceAdd;

    @FXML
    private Label titleLabel;

    @FXML
    void addGame(MouseEvent event) {
        String title = titleAdd.getText();
        String developer = developerAdd.getText();
        String price = priceAdd.getText();
        String imagePath = "images/gameno.png";

        VideoGame newGame = new VideoGame("Title: " + title, "Devs: " + developer, "Price: " + price, imagePath);
        listView.getItems().add(newGame);
    }

    @FXML
    void removeGame(MouseEvent event) {
        int removingGame = listView.getSelectionModel().getSelectedIndex();
        listView.getItems().remove(removingGame);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ArrayList<VideoGame> games = new ArrayList<>();
        VideoGame Cod = new VideoGame("Title: Call Of Duty 4", "Devs: Treyarch","Price: 79.99","images/call_of_duty.png");
        VideoGame Bo2 = new VideoGame("Title: Black Ops 2","Devs: Activision", "Price: 89.99","images/duty_of_call.png");
        VideoGame Mw2 = new VideoGame("Title: Modern Warfare 2", "Devs: Treyarch", "Price: 99.99","images/call_of_game.png");
        games.add(Cod);
        games.add(Bo2);
        games.add(Mw2);

        listView.getItems().addAll(games);

        listView.getSelectionModel().selectedItemProperty().addListener((observableValue, oldValue, videoGameSelected) -> {
            titleLabel.setText(videoGameSelected.getTitle());
            authorLabel.setText(videoGameSelected.getDevelopers());
            priceLabel.setText(videoGameSelected.getPrice());
            String imagePath = videoGameSelected.getPathImage();
            gameImages.setImage(new Image(VideoGame.class.getResourceAsStream(imagePath)));
        });
    }
}






