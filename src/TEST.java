import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.shape.*;

public class TEST extends Application{
	public void start(Stage primaryStage)
	{
	SQUARE Square1, Square2, Square3;
	
	Square1 = new SQUARE();
	Square2 = new SQUARE();
	Square3 = new SQUARE();
	
	
	Square1.XRand();
	Square1.YRand();
	Square2.XRand();
	Square2.YRand();
	Square3.XRand();
	Square3.YRand();
	
	Group LargeSquares = new Group(Square1, Square2, Square3);
	Scene scene = new Scene(Square1, 512, 512, Color.WHITE);
	
	primaryStage.setTitle("QRLabel");
	primaryStage.setScene(scene);
	primaryStage.show();
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
launch(args);

	}

}
