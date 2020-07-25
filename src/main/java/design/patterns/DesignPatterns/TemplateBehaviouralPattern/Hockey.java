package design.patterns.DesignPatterns.TemplateBehaviouralPattern;

public class Hockey  extends Game{

	   void endPlay() {
	      System.out.println("Hockey Game is Finished!");
	   }

	   void initialize() {
	      System.out.println("Hockey Game is Initialized! Start playing.");
	   }

	   void startPlay() {
	      System.out.println("Hockey Game is Started. Enjoy the game!");
	   }
}
