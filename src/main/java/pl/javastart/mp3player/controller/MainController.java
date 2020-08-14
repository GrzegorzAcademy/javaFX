package pl.javastart.mp3player.controller;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Slider;
import javafx.scene.control.TableView;

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
public void initialize(){
    System.out.println("Main controller Created");
    }

}
