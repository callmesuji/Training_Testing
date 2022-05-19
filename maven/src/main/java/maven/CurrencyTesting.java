package maven;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CurrencyTesting {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.ncalculators.com");

		System.out.println("Title of the page visited " + driver.getTitle());
		Thread.sleep(3000);

//		WebElement input_box = driver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div[8]/div/span/a"));

		driver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div[8]")).click();
		
		driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/div/div[1]/div[3]/form/div[3]/div/div[1]/div[2]/input")).clear();
		
		driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/div/div[1]/div[3]/form/div[3]/div/div[1]/div[2]/input")).sendKeys("55");
		
		driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/div/div[1]/div[3]/form/div[3]/div/div[1]/div[2]/input")).click();

		//driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/div/div[1]/div[3]/div[1]/div/div")).click();
		
		

// 		

	}

}
