package design.patterns.DesignPatterns.StateBehaviouralPattern;

public class StopState implements State{
	  public void doAction(Context context) {
	      System.out.println("Process is in stop state");
	      context.setState(this);	
	   }

	   public String toString(){
	      return "At Stop State";
	   }
}
