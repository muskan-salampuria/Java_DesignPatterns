package design.patterns.DesignPatterns.BridgeStructuralPattern;

public class Square extends Shape{
	private int x,y,side;
	
	public Square(int x, int y, int side, DrawAPI drawAPI) {
		super(drawAPI);
		this.x=x;
		this.y=y;
		this.side=side;
	}
	public void draw() {
		drawAPI.drawSquare(side,x,y);
	}
}
