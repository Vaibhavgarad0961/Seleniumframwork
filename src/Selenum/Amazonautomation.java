package Selenum;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Amazonautomation {

	public static void main(String[] args) throws IOException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gardv\\eclipse-workspace\\Selenumref\\driver\\chromedriver_win32 (19)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.cricbuzz.com/");
		driver.manage().window().maximize();
		
		   JavascriptExecutor js=(JavascriptExecutor)driver;
		   
		  //js.executeScript("window.scrollBy(0,1000)", "");
		  js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("//span[text()=\"SOUTH AFRICA CRICKET\"]")));
		  
		 File scr =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 File scrl=new File("C:\\Users\\gardv\\OneDrive\\Desktop\\ScreenShort\\cri.png");
		 Files.copy(scr, scrl);
		
		
		
		
		
		
	}

}
