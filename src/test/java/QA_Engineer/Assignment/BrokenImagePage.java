package QA_Engineer.Assignment;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class BrokenImagePage
{
	@FindBys(@FindBy(xpath="//img")) private List<WebElement> Images;

	public BrokenImagePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void ValidateBrokenImage()
	{
		 for (WebElement image : Images)
		 {
	            if (image.getAttribute("naturalWidth").equals("0")) 
	            {
	                System.out.println("Broken image found: " + image.getAttribute("src"));
	            }
	       }
	}

}
