package QA_Engineer.Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class fileUploadPage
{
	@FindBy(id="file-upload") private WebElement fileInput;
	@FindBy(id="file-submit") private WebElement fileSubmit;
	@FindBy(xpath="//h3") private WebElement uploadMsg;
	
	public fileUploadPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void fileUpload() 
	{
		String filePath = "C:\\Users\\User\\eclipse-workspace\\Assignment\\ExcelData\\Demo.xlsx";
		fileInput.sendKeys(filePath);
		fileSubmit.click();
//		 try 
//		 {
//	         Thread.sleep(5000);
//	     } catch (InterruptedException e)
//		 {
//	         e.printStackTrace();
//	     }
		 
		 if(uploadMsg.getText().equalsIgnoreCase("File Uploaded!"))
		 {
			 System.out.println("File Uploaded Succesfully");
		 }
		 else
		 {
			 System.out.println("File not Uploaded");
		 }
	}

}
