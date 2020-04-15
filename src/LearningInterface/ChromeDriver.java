package LearningInterface;

public class ChromeDriver implements WebDriver{

	

	@Override
	public void findElement() {
		System.out.println("Returning findElment");
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return "title";
	}
	
	
	
	
	

}
