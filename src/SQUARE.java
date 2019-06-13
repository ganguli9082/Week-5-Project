import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class SQUARE {
	private final int MAX = 385;
	
	
	private int X = 0;
	private int Y = 0;
	
	private final int XMID = X + 16;
	private final int YMID = Y + 16;
	private final int XINNER = XMID + 16;
	private final int YINNER = YMID +16;
	
	// initial values OUTER = 0, MID = 16, INNER = 32
	public SQUARE()
	{
		Rectangle outerRectangle = new Rectangle(X, Y, 128, 128);
		outerRectangle.setFill(Color.BLACK);
		
		Rectangle midRectangle = new Rectangle(XMID , YMID, 96, 96);
		midRectangle.setFill(Color.WHITE);
		
		Rectangle innerRectangle = new Rectangle(XINNER, YINNER, 64, 64);
		innerRectangle.setFill(Color.BLACK);
	}
	//generates random x coordinate 0<=X<385
	public int XRand()
	{
	X = (int)(Math.random())*MAX;
	
	return X;
	
	}
	//generates random y coordinate 0<=Y<385
	public int YRand()
	{
	Y = (int)(Math.random())*MAX;
	
	return Y;
	}
	public void GetSQUARE()
	{
		Rectangle outerRectangle = new Rectangle(X, Y, 128, 128);
		outerRectangle.setFill(Color.BLACK);
		
		Rectangle midRectangle = new Rectangle(XMID , YMID, 96, 96);
		midRectangle.setFill(Color.WHITE);
		
		Rectangle innerRectangle = new Rectangle(XINNER, YINNER, 64, 64);
		innerRectangle.setFill(Color.BLACK);
	}
}
