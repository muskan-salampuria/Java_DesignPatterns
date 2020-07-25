package design.patterns.DesignPatterns.StateBehaviouralPattern;

public class StartState  implements State{
	   public void doAction(Context context) {
		      System.out.println("Process is in start state");
		      context.setState(this);	
		   }

		   public String toString(){
		      return "At Start State";
		   }
}
