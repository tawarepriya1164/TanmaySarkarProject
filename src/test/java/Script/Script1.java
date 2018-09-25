package Script;
import org.testng.annotations.Test;

import Pages.Sample1;
import Pages.Sample2;
import Pages.Sample3;
import Pages.TestBase;

public class Script1 extends TestBase {
	@Test(priority=1,description="Add basic Information")
	public void TC_01() throws InterruptedException
	{
		Sample1 sam1=new Sample1(driver);
		sam1.AddInfoinSample1("Link", "ABC", "XYZ", "Pune", "1", "Female", "submit", "link1");
	}
	@Test(priority=2,description="perform operations on First frame")
	public void TC_02() throws InterruptedException
	{
		Sample2 sam2=new Sample2(driver);
		sam2.frameHandling1();
	}
	@Test(priority=3,description="perform operation on second frame")
	public void TC_03() throws InterruptedException
	{
		Sample2 sam2=new Sample2(driver);
		sam2.frameHandling2();
	}
	@Test(priority=3,description="Handling pop up")
	public void TC_04() throws InterruptedException
	{
		Sample3 sam3=new Sample3(driver);
		sam3.handlingPopUp();
		
	}
}
