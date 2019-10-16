import javafx.application.Application;
import javafx.scene.paint.*;
import java.util.*;
import javafx.stage.Stage;
import javafx.scene.canvas.*;
public class DrawTruck extends Application
{
    @Override
    public void start (Stage myStage) throws Exception {
        GraphicsContext gc = JGraphics.setUpGraphics(myStage, "Drawing Shapes", 700, 600);

        gc.setFill(Color.BLACK);
        gc.fillRect(50,100,300,150);

        gc.setFill(Color.AQUA);
        gc.fillRect(270,130,80,50);

        gc.setFill(Color.RED);
        gc.fillOval(80,215,65,65);

        gc.setFill(Color.RED);
        gc.fillOval(255,215,65,65);

    }
}
