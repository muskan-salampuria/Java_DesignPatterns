package design.patterns.DesignPatterns.SingletonCreationalPattern;

public class SingletonExample {
	public static void main(String[] args)
	{
	Singleton_Implementation instance1 = Singleton_Implementation.getInstance();
	System.out.println(instance1);
	Singleton_Implementation instance2 = Singleton_Implementation.getInstance();
	System.out.println(instance2);
	
	}
}
