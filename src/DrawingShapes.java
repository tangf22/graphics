import javafx.application.Application;
import javafx.scene.paint.*;
import java.util.*;
import javafx.stage.Stage;
import javafx.scene.canvas.*;
public class DrawingShapes extends Application
    {
        @Override
        public void start (Stage myStage) throws Exception {
            GraphicsContext gc = JGraphics.setUpGraphics(myStage, "Drawing Shapes",700,600);
            gc.setStroke(Color.CORAL);
            gc.strokeText("Maria", 15, 27);
            gc.setStroke(Color.BLUEVIOLET);
            gc.strokeLine(35,78,200, 300);

            Random randy = new Random();
            int red = randy.nextInt(0xFF);
            int blue = randy.nextInt(0xFF);
            int green = randy.nextInt(0xFF);
            Color randyColor = Color.rgb(red, green, blue);
            gc.setStroke(randyColor);
            gc.setLineWidth(10);
            gc.strokeLine(50, 50, 500, 500);

            gc.setFill(Color.ORANGE);
            gc.fillRect(60,50,100,80);
            gc.setStroke(Color.BLACK);
            gc.strokeRect(60,50,100,80);

            gc.setFill(Color.PINK);
            gc.fillOval(500, 90, 100,200);
            gc.setStroke(Color.RED);
            gc.strokeOval(500,90,100,200);
    }

}
