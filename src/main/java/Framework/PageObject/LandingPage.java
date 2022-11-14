package Framework.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	
	WebDriver driver;
	public LandingPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	//WebElement userMail = driver.findElement(By.id("userEmail")).sendKeys("hackingnuts10@gmail.com");
	@FindBy(id="userEmail")
	WebElement userMail;
	
	@FindBy(id="userPassword")
	WebElement password;
	
	@FindBy(id="login")
	WebElement submit;
	
	//driver.findElement(By.id("userPassword")).sendKeys("Payal@93");
	//driver.findElement(By.id("login")).click();

}
