package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Random;

public class Controller {
    @FXML
    public VBox vbox;
    Random random = new Random();
    public void onClickBtnHello(ActionEvent actionEvent) {
        int x = random.nextInt(20) + 1;
        Button button = new Button("Button" + x);
        vbox.getChildren().add(button);
        button.setOnAction(event -> {
            System.out.println(x);
            vbox.getChildren().remove(button);
        });
    }
}
