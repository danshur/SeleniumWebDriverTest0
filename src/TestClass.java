import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestClass {

	public static WebDriverWait wait;
	public static WebDriver driver;

	@BeforeClass
	public static void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\code\\SeleniumWebDriver0\\webdriver\\chromedriver.exe");
		//C:\\code\\SeleniumWebDriver0\\webdriver\\
		//C:\\Users\\Dan\\AppData\\Local\\Google\\Chrome\\Application\\chromedriver.exe

		driver = new ChromeDriver();
	}

	@AfterClass
	public static void tearDown() {
		driver.quit();
	}

	@Test
	public void testMethod() throws InterruptedException {

		driver.get("http://www.google.com");

		WebElement element;

		//element = driver.findElement(By.xpath("//input[@id='fkbx-text']"));
		element = driver.findElement(By.id("q"));
		assertTrue(element.isDisplayed() == true);
		//driver.wait(5000);
		System.out.println(driver.getTitle());
	}

}
