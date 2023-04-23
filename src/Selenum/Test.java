package Selenum;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class Test {

	public static void main(String[] args) throws IOException {
		
		
		
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\gardv\\eclipse-workspace\\Selenumref\\driver\\chromedriver_win32 (19)\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.sgvu.edu.in/");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.manage().window().maximize();
	  
	  
	   Actions act=new Actions(driver);
	   
	  WebElement  ele=driver.findElement(By.xpath("//a[text()=\"Admission\"]"));
	  
	  act.moveToElement(ele).click().build().perform();
	  WebElement elem1=driver.findElement(By.xpath("//a[@href=\"https://www.sgvu.edu.in/apply-online?\"]"));
	  act.moveToElement(elem1).click().build().perform();
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	  //js.executeScript("window.scrollBy(0,1000)", "");
	 WebDriverWait mywait=new WebDriverWait(driver, Duration.ofSeconds(10));
	    mywait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//select[@id=\"state\"]")));
	 driver.findElement(By.xpath("//select[@id=\"state\"]")).click();
	  js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//b[text()=\"Fee Payment\"]")));
	  
	  File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  File scrlocation=new File("C:\\Users\\gardv\\OneDrive\\Desktop\\ScreenShort\\sgvu.png");
	  Files.copy(scr, scrlocation);
	  
	  
	 
	 
	}

}
