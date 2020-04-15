package LearningInterface;

public class TestMethod {
	
	public static void main(String args[]) {
		WebDriver driver = new ChromeDriver();
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement();
		
	}

}
