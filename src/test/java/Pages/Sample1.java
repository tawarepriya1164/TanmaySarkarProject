package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Sample1 {
	WebDriver driver;
	public Sample1(WebDriver driver)
	{
		this.driver=driver;
	}
	public void AddInfoinSample1(String link,String Firstname,String lastname,String Address,String dropdown1,String Gender,String Submit1,String link1) throws InterruptedException
	{
		driver.findElement(By.linkText("Sample1")).click();
		driver.findElement(By.id("ts_first_name")).sendKeys(Firstname);
		driver.findElement(By.id("ts_last_name")).sendKeys(lastname);
		driver.findElement(By.id("ts_address")).sendKeys(Address);
		Select dropdown=new Select(driver.findElement(By.id("ts_country")));
		dropdown.selectByValue(dropdown1);
		WebElement ele=driver.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/p/label[2]/input"));
		ele.click();
		driver.findElement(By.id("ts_checkbox2")).click();
		Thread.sleep(500);
		driver.findElement(By.name("Submit1")).click();
		Thread.sleep(500);
		driver.findElement(By.linkText("Here")).click();
		Thread.sleep(500);
	}

}
