package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
public class TestBase {
	
	public WebDriver driver;
	@BeforeClass
	public void initialization(){
		System.setProperty("webdriver.chrome.driver","D:\\chrome\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.navigate().to("http://demo.tanmaysarkar.com/index.php");

		//title of the page
		String expectedTitle="Automation Testing Sample";
		String actualTitle=driver.getTitle();
		if(actualTitle.equals(expectedTitle))
		{
			System.out.println("we are on correct page");
		}
		else
		{
			System.out.println("Test case fail......");
		}
		 public void browser()
		 {
			 String browserName;
			if(browserName.contains("chrome"))
				{
					System.out.println("open chrome");
				}
				else if(browserName.contains("Internet"))
				{
					System.out.println("open Explorer");
				}
				else if(browserName.contains("mozilla"))
				{
					System.out.println("open Mozilla");
				}
				else
				{
					System.out.println("Invalid browser");
				}
		 }
		
		
		
		
		
		
		
		
		
		
	}
	private void browser() {
		// TODO Auto-generated method stub
		
	}
	@AfterClass
	public void CloseBrowser()
	{
		driver.close();
		driver.quit();
	}
}

