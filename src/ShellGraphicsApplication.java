import javafx.application.Application;
import javafx.scene.canvas.GraphicsContext;
import javafx.stage.Stage;


public class ShellGraphicsApplication extends Application
{
    @Override
    public void start( Stage stage)

    {
        GraphicsContext gc = JGraphics.setUpGraphics(stage, "Shell Graphics Application", 700, 400);
    }
    public static void main (String [] args)
    {
        launch(args);
    }
}
