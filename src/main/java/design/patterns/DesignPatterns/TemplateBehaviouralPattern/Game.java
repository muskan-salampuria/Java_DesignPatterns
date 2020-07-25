package design.patterns.DesignPatterns.TemplateBehaviouralPattern;

public abstract class Game {
	abstract void initialize();
	abstract void startPlay();
	abstract void endPlay();

	//tempelate method
	   public final void play(){

	      initialize();

	      startPlay();

	      endPlay();
	   }
}
