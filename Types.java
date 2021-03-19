package sample;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class Types {
    @FXML
    private Button back;

    public void userBack(ActionEvent event)throws IOException{
        Main n = new Main();
        n.changeScene("afterLogin.fxml");

    }
}
