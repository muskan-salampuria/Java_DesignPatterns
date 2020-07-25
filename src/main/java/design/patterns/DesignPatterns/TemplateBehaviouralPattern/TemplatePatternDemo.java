package design.patterns.DesignPatterns.TemplateBehaviouralPattern;

public class TemplatePatternDemo {
	public static void main(String[] args) {

	      Game game = new Cricket();
	      game.play();
	      System.out.println();
	      game = new Hockey();
	      game.play();		
	   }
}
