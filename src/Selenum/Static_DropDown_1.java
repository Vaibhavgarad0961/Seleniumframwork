package Selenum;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Static_DropDown_1 {

	public static void main(String[] args) throws IOException{

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gardv\\eclipse-workspace\\Selenumref\\driver\\chromedriver_win32 (19)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	   
		File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File scrlocation=new File("C:\\Users\\gardv\\OneDrive\\Desktop\\ScreenShort\\google.png");
		Files.copy(scr, scrlocation);
		 
		
		
		
	
	}

}
