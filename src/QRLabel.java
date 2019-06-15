import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.shape.*;
import java.util.ArrayList;
import java.util.Random;
import javafx.scene.layout.GridPane;

public class QRLabel extends Application {
	//Generates and presents a QR label
	public void start(Stage primaryStage)
	{
		 int SIZE = 512;
         int length = SIZE;
         int width = SIZE;

         GridPane rects = new GridPane();    

         for(int y = 0; y < length; y+=8){
             for(int x = 0; x < width; x+=8){
                 Random random = new Random();
                 int rand1 = random.nextInt(2);
                
                 Rectangle rect = new Rectangle(x ,y ,8 ,8);
                 if (rand1 == 1)
                 {
                	 rect.setFill(Color.BLACK);
                 }
                 else 
                 {
                	 rect.setFill(Color.WHITE);
                 }
                 rects.add(rect, x, y);
             }
         }
                
		
                 
        final int XMAX = 385;
		final int YMAX = 385;
		Random rand = new Random();
		
		int X = 0;
		int Y = 0;
		
		
		
		
		// initial values OUTER = 0, MID = 16, INNER = 32
		int X1= rand.nextInt(XMAX);
		int Y1 = rand.nextInt(YMAX);
		int X2= rand.nextInt(XMAX);
		int Y2 = rand.nextInt(YMAX);
		int X3= rand.nextInt(XMAX);
		int Y3 = rand.nextInt(YMAX);
		
		
		
		
		
		Rectangle outerRectangle = new Rectangle(X1, Y1, 128, 128);
		outerRectangle.setFill(Color.BLACK);
		
		Rectangle midRectangle = new Rectangle(X1+16 , Y1 +16, 96, 96);
		midRectangle.setFill(Color.WHITE);
		
		Rectangle innerRectangle = new Rectangle(X1+32, Y1+32, 64, 64);
		innerRectangle.setFill(Color.BLACK);
		
		Rectangle outerRectangle2 = new Rectangle(X2, Y2, 128, 128);
		outerRectangle2.setFill(Color.BLACK);
		
		Rectangle midRectangle2 = new Rectangle(X2+16 , Y2 +16, 96, 96);
		midRectangle2.setFill(Color.WHITE);
		
		Rectangle innerRectangle2 = new Rectangle(X2+32, Y2+32, 64, 64);
		innerRectangle2.setFill(Color.BLACK);
		
		Rectangle outerRectangle3 = new Rectangle(X3, Y3, 128, 128);
		outerRectangle3.setFill(Color.BLACK);
		
		Rectangle midRectangle3 = new Rectangle(X3+16 , Y3 +16, 96, 96);
		midRectangle3.setFill(Color.WHITE);
		
		Rectangle innerRectangle3 = new Rectangle(X3+32, Y3+32, 64, 64);
		innerRectangle3.setFill(Color.BLACK);
		
		Group LSQ1 = new Group(outerRectangle, midRectangle, innerRectangle);
		Group LSQ2 = new Group(outerRectangle2, midRectangle2, innerRectangle2);
		Group LSQ3 = new Group(outerRectangle3, midRectangle3, innerRectangle3);
		
		Group Squares = new Group(rects,LSQ1, LSQ2, LSQ3);
		Scene scene = new Scene(Squares, 512, 512, Color.WHITE);
		
		primaryStage.setTitle("QRLabel");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
launch(args);

	}

}
