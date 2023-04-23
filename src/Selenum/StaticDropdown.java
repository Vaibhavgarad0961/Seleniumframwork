package Selenum;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\gardv\\eclipse-workspace\\Selenumref\\driver\\chromedriver_win32 (19)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	 WebElement dropdown=driver.findElement(By.xpath("//select[@id=\"searchDropdownBox\"]"));
	 List< WebElement>	dropdownvalues =driver.findElements(By.xpath("//select[@id=\"searchDropdownBox\"]/option"));
	 int countofdropdownvalues =dropdownvalues.size();
	// System.out.println(countofdropdownvalues);
	 dropdown.click();
	 //Method 1 by using click
//	 Thread.sleep(50000);
//	 
//	 for(int i=0;i<countofdropdownvalues;i++)
//	 {
//		 String value=dropdownvalues.get(i).getText();
//		 System.out.println(value);
//		 if(value.equals("Baby"))
//		 {
//			 dropdownvalues.get(i).click();
//			 break;
//		 }
//		 else
//		 {
//			 System.out.println("Required value not found in current irteration:" +i+"hence retrying");
//		 }
//	 }
//	 
	 
	 Select selectobject=new Select(dropdown);
	 //selectobject.selectByIndex(12);
	 //selectobject.deselectByValue("search-alias=baby");
	 //selectobject.deselectByVisibleText("Baby");
	 
	 for(int i=0;i<countofdropdownvalues;i++)
	 {
		 String value=dropdownvalues.get(i).getText();
		
		 if(value.equals("Baby"))
			 {
     			 selectobject.deselectByIndex(i);
 				 break;
			 }
		 else
			 {
				 System.out.println("Required value not found in current irteration:" +i+"hence retrying");
		 }
		 driver.quit();
	 }
	 
	}

}
