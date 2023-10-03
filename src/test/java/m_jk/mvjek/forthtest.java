package m_jk.mvjek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class forthtest {
	@Test
	public void Testgoogle() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/"); // Define the URL of the target.
		//Click on element
		driver.findElement(By.id("cart-total")).click(); 
		System.out.println("Click operation performed");
		driver.quit();
}
}
