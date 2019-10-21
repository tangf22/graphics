import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.paint.*;
import java.util.*;
import javafx.stage.Stage;
import javafx.scene.canvas.*;
import javafx.animation.AnimationTimer.*;
public class Town extends Application {
    @Override
    public void start(Stage myStage) throws Exception {
        GraphicsContext gc = JGraphics.setUpGraphics(myStage, "My Little Town", 700, 600);
        AnimationTimer timer = new AnimationTimer() {
            double x = 0;

            @Override
            public void handle(long now) {


                gc.setFill(Color.LIGHTSKYBLUE);
                gc.fillRect(0, 0, 700, 700);



                //this is the road
                gc.setFill(Color.LIGHTGRAY);
                gc.fillRect(0, 500, 700, 100);

                //this is the clouds

                gc.setFill(Color.WHITESMOKE);
                gc.fillOval(20 + x, 40, 100, 30);

                gc.setFill(Color.WHITESMOKE);
                gc.fillOval(150 + x, 70, 160, 50);

                gc.setFill(Color.WHITESMOKE);
                gc.fillOval(350 + x, 50, 80, 20);

                //this is the sun
                gc.setFill(Color.YELLOW);
                gc.fillOval(0,0,80,80);

                //the little dashes on the road
                gc.setFill(Color.WHITE);
                gc.fillRect(50, 540, 50, 20);
                gc.setFill(Color.WHITE);
                gc.fillRect(150, 540, 50, 20);
                gc.setFill(Color.WHITE);
                gc.fillRect(250, 540, 50, 20);
                gc.setFill(Color.WHITE);
                gc.fillRect(350, 540, 50, 20);
                gc.setFill(Color.WHITE);
                gc.fillRect(450, 540, 50, 20);
                gc.setFill(Color.WHITE);
                gc.fillRect(550, 540, 50, 20);
                gc.setFill(Color.WHITE);
                gc.fillRect(650, 540, 50, 20);



                //this is the grass
                gc.setFill(Color.LIGHTGREEN);
                gc.fillRect(0, 300, 700, 200);
                gc.setStroke(Color.GREEN);
                gc.strokeRect(0, 300, 700, 200);

                //this is a building
                gc.setFill(Color.PALEVIOLETRED);
                gc.fillRect(60, 200, 155, 180);
                gc.setStroke(Color.BLACK);
                gc.strokeRect(60, 200, 155, 180);


                gc.setFill(Color.WHITE);
                gc.fillRect(85, 240, 35, 46);
                gc.strokeRect(85, 240, 35, 46);
                gc.strokeLine(85, 263, 120, 263);

                gc.setFill(Color.WHITE);
                gc.fillRect(152, 240, 35, 45);
                gc.strokeRect(152, 240, 35, 45);
                gc.strokeLine(152, 263, 187, 263);

                gc.setFill(Color.WHITE);
                gc.fillRect(85, 300, 35, 46);
                gc.strokeRect(85, 300, 35, 46);
                gc.strokeLine(85, 323, 120, 323);

                gc.setFill(Color.WHITE);
                gc.fillRect(152, 300, 35, 45);
                gc.strokeRect(152, 300, 35, 45);
                gc.strokeLine(152, 323, 187, 323);

                //this is a tree
                gc.setFill(Color.BROWN);
                gc.fillRect(255, 280, 10, 100);

                gc.setFill(Color.DARKGREEN);
                gc.fillOval(235, 250, 50, 80);

                //this is another tree
                gc.setFill(Color.SADDLEBROWN);
                gc.fillRect(315, 300, 5, 80);
                gc.setFill(Color.GREENYELLOW);
                gc.fillOval(298, 290, 40, 40);
                gc.strokeOval(298, 290, 40, 40);

                //another building
                gc.setFill(Color.LIGHTPINK);
                gc.fillRect(380, 270, 140, 110);
                gc.strokeRect(380, 270, 140, 110);

                gc.setFill(Color.WHITE);
                gc.fillRect(405, 300, 35, 25);
                gc.strokeRect(405, 300, 35, 25);
                gc.strokeLine(405, 300, 440, 325);
                gc.strokeLine(440, 300, 405, 325);

                gc.setFill(Color.WHITE);
                gc.fillRect(460, 300, 35, 25);
                gc.strokeRect(460, 300, 35, 25);
                gc.strokeLine(460, 300, 495, 325);
                gc.strokeLine(460, 325, 495, 300);

                gc.setFill(Color.LIGHTYELLOW);
                gc.fillRoundRect(435, 340, 30, 40, 10, 10);
                gc.strokeRoundRect(435, 340, 30, 40, 10, 10);
                gc.strokeLine(445, 340, 445, 380);
                gc.strokeLine(455, 340, 455, 380);

                //another building
                gc.setFill(Color.DARKSALMON);
                gc.fillRoundRect(570, 230, 70, 150, 10, 10);
                gc.strokeRoundRect(570, 230, 70, 150, 10, 10);

                gc.setFill(Color.FLORALWHITE);
                gc.fillOval(585, 250, 39, 39);
                gc.strokeOval(585, 250, 39, 39);
                gc.strokeLine(585, 270, 624, 270);
                gc.strokeLine(605, 250, 605, 290);

                gc.setFill(Color.BROWN);
                gc.fillRect(590, 320, 30, 60);
                gc.strokeRect(590, 320, 30, 60);

                //this is a chicken
                gc.setFill(Color.LIGHTYELLOW);
                gc.fillOval(50, 520,50,40 );
                gc.setFill(Color.LIGHTYELLOW);
                gc.fillOval(75,495,30,30);

                gc.setFill(Color.DARKORANGE);
                gc.fillRect(60,555,5,20);



                x+=3;
            }
        };
        timer.start();
    }
    public static void main(String [] args) {launch(args);}
}
