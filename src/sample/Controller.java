package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Random;

public class Controller {

    @FXML
    TextField textfieldsms;
    @FXML
    TextArea textareasms;
    @FXML
    TextField nameuser;
    @FXML
    Label editMess;



    public void sendMassageClick(ActionEvent actionEvent) {

        textareasms.appendText("Пользователь " + nameuser.getText() + ": " + textfieldsms.getText() + "\n");
        nameuser.requestFocus();

    }

    public void clearChat(ActionEvent actionEvent) {
        textareasms.clear();
    }

    public void buttonClose(ActionEvent actionEvent) {
        Node node = (Node) actionEvent.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        stage.close();

    }
}
