package sample;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

import java.io.IOException;
import java.util.Random;

public class AfterLogin {
    @FXML
    private Button logout;
    @FXML
    private Button types;
    @FXML
    private Button buttonCircle;
    @FXML
    private Canvas drawCanvas;
    @FXML
    private Button buttonRectangle;

    @FXML
    void drawRandomCircle(ActionEvent event){
        GraphicsContext gc = drawCanvas.getGraphicsContext2D();
        gc.setStroke(Color.BLACK);
        Random r = new Random();
        int x = r.nextInt(300);
        int y = r.nextInt(300);
        int cr = r.nextInt(255);
        int cg = r.nextInt(255);
        int cb = r.nextInt(255);
        gc.setFill(Color.rgb(cr, cg, cb));
        gc.fillOval(x, y, 50, 50);
    }
    @FXML
    void drawRandomRectangle(ActionEvent event){
        GraphicsContext gc =drawCanvas.getGraphicsContext2D();
        gc.setStroke(Color.BLACK);
        Random r = new Random();
        int x = r.nextInt(250);
        int y = r.nextInt(250);
        int cr =r.nextInt(255);
        int cg = r.nextInt(255);
        int cb = r.nextInt(255);
        gc.setFill(Color.rgb(cr, cg, cb));
        gc.fillRect(x, y, 50, 50);
    }

    public void userLogOut(ActionEvent event)throws IOException{
        Main m = new Main();
        m.changeScene("sample.fxml");

    }
    public void userTypes(ActionEvent event) throws IOException{
        Main n = new Main();
        n.changeScene("types.fxml");
    }
}
