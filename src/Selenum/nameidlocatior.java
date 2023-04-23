package Selenum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class nameidlocatior {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gardv\\eclipse-workspace\\Selenumref\\driver\\chromedriver_win32 (19)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		//System.out.println(driver.findElement(By.xpath("//label[text()=\"Female\"]")).isSelected());
		System.out.println(driver.findElement(By.xpath("//label[text()=\"Male\"]")).isSelected());

	}

}