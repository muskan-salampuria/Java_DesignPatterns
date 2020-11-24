package design.patterns.DesignPatterns.BridgeStructuralPattern;

public class BlackSquare implements DrawAP
  {
	public void drawSquare(int side, int x, int y) {
		System.out.println("Black Square with side: "+side+" , x: "+x+" ,y: "+y);
	}
  }
