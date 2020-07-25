package design.patterns.DesignPatterns.DecoratorStructuralPattern;

public class DecoratorPatternDemo {
	public static void main(String []args) {
	Shape square = new Square();
	Shape blackSquare = new BlackShapeDecorator(new Square());
	Shape blackRectangle = new BlackShapeDecorator(new Rectangle());
	
	System.out.println("Standard Square");
	square.make();
	
	System.out.println("\nSquare with Black Border");
	blackSquare.make();
	
	System.out.println("\nRectangle with Black Border");
	blackRectangle.make();
	
	}
}
