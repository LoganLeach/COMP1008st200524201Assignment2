package com.example.comp1008st200524201assignment2;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

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
    private Label titleLabel;

    public VideoGameController() {
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ArrayList<VideoGame> games = new ArrayList<>();
        VideoGame Cod = new VideoGame("Title: Call Of Duty 4", "Devs: Treyarch","Price: 79.99","images/callofduty4.jpg");
        VideoGame Bo2 = new VideoGame("Title: Black Ops 2","Devs: Activision", "Price: 89.99","images/gameselect.png");
        VideoGame Mw2 = new VideoGame("Title: Modern Warfare 2", "Devs: Treyarch", "Price: 99.99","images/callofduty4.jpg");
        games.add(Cod);
        games.add(Bo2);
        games.add(Mw2);

        listView.getItems().addAll(games);

        listView.getSelectionModel().selectedItemProperty().addListener((observableValue, oldValue, videoGameSelected) -> {
            titleLabel.setText(videoGameSelected.getTitle());
            authorLabel.setText(videoGameSelected.getDevelopers());
            priceLabel.setText(videoGameSelected.getPrice());
            gameImages.setImage(new Image(VideoGame.class.getResourceAsStream("images/callofduty4.png")));
        });
    }
}






