package maven;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GeometryTesting {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.ncalculators.com");
		Thread.sleep(3000);

		driver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div[3]/div/span/a")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/div[2]/div/div[1]/form/input")).click();

		driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/div[2]/div/div[1]/form/input")).sendKeys("55");
		driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/div[2]/div/div[1]/form/input")).sendKeys(Keys.ENTER);

//		

//		/html/body/div[2]/div[4]/div/div[2]/div/div[1]/form/input

	}

}
