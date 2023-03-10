package QA_Engineer.Assignment;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass extends BaseClass
{
	BrokenImagePage bImg;
	MainPage mPage;
	fileUploadPage f;
	@BeforeMethod
	public void Configure()
	{
		configureBrowser();
		mPage=new MainPage(driver);
		bImg =new BrokenImagePage(driver);
		f=new fileUploadPage(driver);
	}
	
	@Test
	public void m1() throws InterruptedException
	{
		mPage.openImagePage();
		bImg.ValidateBrokenImage();
		driver.navigate().back();
		mPage.openUploadPage();
		f.fileUpload();
	}
	
	@AfterMethod
	public void BrowserClose()
	{
		driver.close();
		
	}
}
