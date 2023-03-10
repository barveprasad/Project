package QA_Engineer.Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage 
{
	@FindBy(linkText="Broken Images") private WebElement brokenImages;
	@FindBy(linkText="File Upload") private WebElement fileUpload;
	
	public MainPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void openImagePage()
	{
		brokenImages.click();
	}
	
	public void openUploadPage()
	{
		fileUpload.click();
	}

}
