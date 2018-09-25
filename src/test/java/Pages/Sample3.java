package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Sample3 {
	WebDriver driver;
	public Sample3(WebDriver driver)
	{
		this.driver=driver;
	}
  public void handlingPopUp() throws InterruptedException
  {
	  driver.findElement(By.linkText("Sample3")).click();
		driver.findElement(By.id("ts_first_name")).sendKeys("Kiran");
		driver.findElement(By.id("ts_last_name")).sendKeys("Shinde");
		driver.findElement(By.id("ts_address")).sendKeys("Bangladesh");
		Select dropdown=new Select(driver.findElement(By.id("ts_country")));
		dropdown.selectByValue("0");
		driver.findElement(By.id("ts_terms")).sendKeys("I agree and accepted the terms and conditions");
		WebElement ele=driver.findElement(By.xpath("/html/body/form/table/tbody/tr[6]/td[2]/p/label[2]/input"));
		ele.click();
		driver.findElement(By.id("ts_checkbox2")).click();
		driver.findElement(By.id("ts_checkbox1")).click();
		driver.findElement(By.id("ts_checkbox3")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[8]/td[2]/input")).click();;
		Thread.sleep(5000);
		driver.findElement(By.linkText("Here")).click();
		Thread.sleep(5000);
  }
}
