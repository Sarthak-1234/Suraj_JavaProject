package LearningInterface;

public interface WebDriver {
	
	public String getTitle();
	public void findElement();
	
	public default void testing() {
		System.out.println("I am testing interface");
	}
	
	public static void testing1() {
		System.out.println("testing");
	}
	
	//Functions

}
