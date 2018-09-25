package Pages;
//import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Sample2 {
	WebDriver driver;
	public Sample2(WebDriver driver)
	{
		this.driver=driver;
	}
	public void frameHandling1() throws InterruptedException
	{
		driver.findElement(By.linkText("Sample2")).click();
		driver.switchTo().frame("ts_frame_01");
		driver.findElement(By.id("ts_first_name")).sendKeys("PQK");
		driver.findElement(By.id("ts_last_name")).sendKeys("STU");
		driver.findElement(By.id("ts_address")).sendKeys("Mumbai");
		Select dropdown=new Select(driver.findElement(By.id("ts_country")));
		dropdown.selectByValue("2");
		WebElement ele=driver.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/p/label[1]/input"));
		ele.click();
		driver.findElement(By.id("ts_checkbox1")).click();
		Thread.sleep(500);
		driver.findElement(By.name("Submit1")).click();
		Thread.sleep(500);
	}
	
	public void frameHandling2() throws InterruptedException
	{
		driver.switchTo().defaultContent();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");	
		System.out.println("#############");
		driver.switchTo().frame("ts_frame_02");
		driver.findElement(By.id("ts_first_name")).sendKeys("Rekha");
		driver.findElement(By.id("ts_last_name")).sendKeys("Mane");
		driver.findElement(By.id("ts_address")).sendKeys("Solapur");
		Select dropdown=new Select(driver.findElement(By.id("ts_country")));
		dropdown.selectByValue("3");
		WebElement ele=driver.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/p/label[2]/input"));
		ele.click();
		driver.findElement(By.id("ts_checkbox3")).click();
		Thread.sleep(500);
		driver.findElement(By.name("Submit1")).click();
		Thread.sleep(500);
		driver.switchTo().defaultContent();
		driver.findElement(By.name("ts_in_main")).sendKeys("Good luck PT");
		Thread.sleep(500);
		driver.findElement(By.linkText("Here")).click();
	}
}
