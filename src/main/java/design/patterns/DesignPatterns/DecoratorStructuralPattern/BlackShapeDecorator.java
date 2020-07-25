package design.patterns.DesignPatterns.DecoratorStructuralPattern;

public class BlackShapeDecorator extends ShapeDecorator{
	
	public BlackShapeDecorator(Shape decoratedShape) {
		super(decoratedShape);
	}
	public void make() {
		decoratedShape.make();
		setBlackBorder(decoratedShape);
	}
	public void setBlackBorder(Shape decoratedShape) {
		System.out.println("Border color :- Black");
	}
}
