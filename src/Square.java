import java.awt.Color;
import java.util.Random;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;
public class Square extends Shape {
	
	private int shapeWidth;
	Random rand = new Random();
	
	public Square(int shapeWidth){
		// TODO Constructor
		this.shapeWidth = shapeWidth;
		
	}
	
	@Override
	public Color getRandomColor() {		
		// TODO Java 'Color' class takes 3 floats, from 0 to 1.
		
		float r = rand.nextFloat();
		float g = rand.nextFloat();
		float b = rand.nextFloat();
		
		// TODO Return color produced by three rgb floats.
		return new Color(r, g, b);
	}
	
	@Override
	public int getShapeWidth(){
		// TODO Return Square width
		return shapeWidth;
	}
	
	@Override
	public int getShapeHeight(){
		// TODO Return Square width
		return shapeWidth;
	}


	@Override
	public int getCenterX(int mouseX) {
		// TODO Input mouse X position and return center X of square	
		return mouseX-shapeWidth/2;
	}


	@Override
	public int getCenterY(int mouseY) {
		// TODO Input mouse Y position and return center Y of square
		return mouseY-shapeWidth/2;
	}


}