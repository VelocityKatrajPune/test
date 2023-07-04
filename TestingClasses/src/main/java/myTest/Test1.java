package myTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test1
{
	@Test
	public void flipkart() throws InterruptedException
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.quit();
		Thread.sleep(1000);
	}

}
