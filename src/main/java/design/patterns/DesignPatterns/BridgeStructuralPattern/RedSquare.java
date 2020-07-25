package design.patterns.DesignPatterns.BridgeStructuralPattern;

public class RedSquare implements DrawAPI{
	public void drawSquare(int side, int x, int y) {
		System.out.println("Red Square with side: "+side+" , x: "+x+" ,y: "+y);
	}
}
