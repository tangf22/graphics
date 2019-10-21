import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.paint.*;
import java.util.*;
import javafx.stage.Stage;
import javafx.scene.canvas.*;
 import javafx.animation.AnimationTimer.*;
public class DrawTruck extends Application
{


    @Override
    public void start (Stage myStage) throws Exception {
        GraphicsContext gc = JGraphics.setUpGraphics(myStage, "Truck", 700, 600);
        //to make animation

        AnimationTimer timer = new AnimationTimer() {
            double x = 0;

            @Override
            public void handle(long now) {
                gc.setFill(Color.BLUE);
                gc.fillRect(0, 0, 700, 600);

                gc.setFill(Color.BLACK);
                gc.fillRect(50+x, 300, 300, 150);

                gc.setFill(Color.AQUA);
                gc.fillRect(270+x, 340, 80, 65);

                gc.setFill(Color.RED);
                gc.fillOval(80+x, 425, 65, 65);

                gc.setFill(Color.RED);
                gc.fillOval(255+x, 425, 65, 65);

                gc.setFill(Color.BLUE);
                gc.fillOval(380+x, 200, 50, 50);
                gc.setStroke(Color.WHITE);
                gc.strokeOval(380+x, 200, 50, 50);

                x+=5;

            }
        };
        timer.start();
    }

    public static void main(String [] args) {launch(args);}
}
