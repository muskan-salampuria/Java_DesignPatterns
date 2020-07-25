package design.patterns.DesignPatterns.FactoryCreationalPattern;

public class FactoryPatternDemo {
	public static void main(String []args) {
	ShapeFactory shapeFactory = new ShapeFactory();
	
	Shape shape1 = shapeFactory.getShape("Rectangle");
	shape1.make();
	Shape shape2 = shapeFactory.getShape("Square");
	shape2.make();
	Shape shape3 = shapeFactory.getShape("Circle");
	shape3.make();
	}
}
