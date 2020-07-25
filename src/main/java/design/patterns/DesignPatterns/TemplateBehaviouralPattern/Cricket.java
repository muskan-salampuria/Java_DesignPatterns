package design.patterns.DesignPatterns.TemplateBehaviouralPattern;

public class Cricket extends Game{
	
	   void endPlay() {
	      System.out.println("Cricket Game is Finished!");
	   }

	   void initialize() {
	      System.out.println("Cricket Game is Initialized! Start playing.");
	   }

	   void startPlay() {
	      System.out.println("Cricket Game is Started. Enjoy the game!");
	   }
}
