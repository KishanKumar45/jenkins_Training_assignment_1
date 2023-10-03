package m_jk.mvjek;



import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class thirdtest {
	
	@Test
	public void Testgoogle() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/"); // Define the URL of the target.
		
		String actualText = driver.findElement(By.id("logo")).getText();
		
		Assert.assertEquals("Qafox.com",actualText);

		driver.quit();
	}

}

