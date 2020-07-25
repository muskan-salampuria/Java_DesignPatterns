package design.patterns.DesignPatterns.BridgeStructuralPattern;

public class BridgePatternDemo {
	public static void main(String []args) {
		Shape blacksquare = new Square(100,100,5,new BlackSquare());
		blacksquare.draw();
		Shape bluesquare = new Square(100,100,10,new BlueSquare());
		bluesquare.draw();
		Shape redsquare = new Square(100,100,15,new RedSquare());
		redsquare.draw();
	}
}
