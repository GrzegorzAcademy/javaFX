package pl.javastart.mp3player.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Slider;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;

public class MainController {

    @FXML
    private MenuItem fileMenuItem;

    @FXML
    private MenuItem dirMenuItem;

    @FXML
    private MenuItem closeMenuItem;

    @FXML
    private MenuItem aboutMenuItem;

    @FXML
    private TableView<?> contentTable;

    @FXML
    private Button previousButton;

    @FXML
    private Button playButton;

    @FXML
    private Button nextButton;

    @FXML
    private Slider volumeSlider;

    @FXML
    private Slider progressSlider;

    public void initialize() {
        configureButtons();
        configureVolume();

    }

    private void configureButtons() {
        previousButton.setOnAction(actionEvent -> System.out.println("previous song"));
        nextButton.setOnAction(actionEvent -> System.out.println("next song"));
        playButton.setOnAction(actionEvent -> {
            if (playButton.isSelected()) {
                System.out.println("play");
            } else {
                System.out.println("Stop");
            }
        });

    }

    private void configureVolume() {
        volumeSlider.addEventFilter(MouseEvent.MOUSE_PRESSED, mouseEvent -> System.out.println("you pressed a button on the volume slider "));

    }

}
