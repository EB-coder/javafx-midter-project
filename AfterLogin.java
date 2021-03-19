package sample;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class AfterLogin {
    @FXML
    private Button logout;
    @FXML
    private Button types;

    public void userLogOut(ActionEvent event)throws IOException{
        Main m = new Main();
        m.changeScene("sample.fxml");

    }
    public void userTypes(ActionEvent event) throws IOException{
        Main n = new Main();
        n.changeScene("types.fxml");
    }
}
