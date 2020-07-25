package design.patterns.DesignPatterns.SingletonCreationalPattern;

public class Singleton_Implementation {
	private static Singleton_Implementation instance;
	
	private Singleton_Implementation() {}
	synchronized public static Singleton_Implementation getInstance()
	{
		if(instance==null)
		{
			instance = new Singleton_Implementation();
		}
		return instance;
	}
}
