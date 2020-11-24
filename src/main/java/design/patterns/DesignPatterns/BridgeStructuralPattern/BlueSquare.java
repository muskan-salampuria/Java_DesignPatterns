package design.patterns.DesignPatterns.BridgeStructuralPattern;

public class BlueSquare implements DrawAPI
{
	public void drawSquare(int side, int x, int y) {
		System.out.println("Blue Square with side: "+side+" , x: "+x+" ,y: "+y);
	}
}
