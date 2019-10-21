import javafx.application.Application;
import javafx.scene.paint.*;
import java.util.*;
import javafx.stage.Stage;
import javafx.scene.canvas.*;
public class DrawTruck extends Application
{
    @Override
    public void start (Stage myStage) throws Exception {
        GraphicsContext gc = JGraphics.setUpGraphics(myStage, "Truck", 700, 600);

        gc.setFill(Color.BLUE);
        gc.fillRect(0,0,700,600);

        gc.setFill(Color.BLACK);
        gc.fillRect(50,300,300,150);

        gc.setFill(Color.AQUA);
        gc.fillRect(270,340,80,65);

        gc.setFill(Color.RED);
        gc.fillOval(80,425,65,65);

        gc.setFill(Color.RED);
        gc.fillOval(255,425,65,65);

        gc.setFill(Color.BLUE);
        gc.fillOval(380,200,50,50);
        gc.setStroke(Color.WHITE);
        gc.strokeOval(380,200,50,50);

    }
}
