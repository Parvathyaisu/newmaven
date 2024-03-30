package pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

public class SaucedemoLoginPagePrgrm {
	WebDriver driver;
	   
	@FindBy(xpath="//*[@id=\"user-name\"]")
	WebElement uname;
	@FindBy(xpath="//*[@id=\"password\"]")
	WebElement pass;	
	@FindBy(xpath="//*[@id=\"login-button\"]")
	WebElement button;
	@FindBy(xpath="//*[@id=\"add-to-cart-sauce-labs-backpack\"]")
	WebElement p1;
	@FindBy(xpath="//*[@id=\"add-to-cart-sauce-labs-bike-light\"]")
	WebElement p2;
	@FindBy(xpath="//*[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]")
	WebElement p3;
	@FindBy(xpath="//*[@id=\"add-to-cart-sauce-labs-fleece-jacket\"]")
	WebElement p4;
	@FindBy(xpath="//*[@id=\"add-to-cart-sauce-labs-onesie\"]")
	WebElement p5;
	@FindBy(xpath="//*[@id=\"add-to-cart-test.allthethings()-t-shirt-(red)\"]")
	WebElement p6;
	@FindBy(xpath="//*[@id=\"shopping_cart_container\"]/a")
	WebElement cart;
	@FindBy(xpath="//*[@id=\"checkout\"]")
	WebElement checkout;
	@FindBy(xpath="//*[@id=\"first-name\"]")
	WebElement fname;
	@FindBy(xpath="//*[@id=\"last-name\"]")
	WebElement lname;
	@FindBy(xpath="//*[@id=\"postal-code\"]")
	WebElement zip;
	@FindBy(xpath="//*[@id=\"continue\"]")
	WebElement cntinue;
	@FindBy(xpath="//*[@id=\"finish\"]")
	WebElement finish;
	@FindBy(xpath="//*[@id=\"back-to-products\"]")
	WebElement backhome;
	@FindBy(xpath="//*[@id=\"react-burger-menu-btn\"]")
	WebElement hamburger;
	@FindBy(xpath="//*[@id=\"logout_sidebar_link\"]")
	WebElement logout;
	
	public SaucedemoLoginPagePrgrm(WebDriver driver)
	{
			this.driver=driver; 
	     PageFactory.initElements(driver, this);////to redirects to this page
	}
	
	public void test1(String email,String pswd)
	{
		uname.click();
		uname.sendKeys(email);
		pass.click();
		pass.sendKeys(pswd);
		button.click();
		driver.navigate().refresh();
	}
	public void test2()
	{
		//button.click();
		p1.click();
		p2.click();
		p3.click();
		p4.click();
		p5.click();
		p6.click();
		cart.click();
		checkout.click();
	}
	public void test3(String firstn,String lastn,String zipcode)
	{
		fname.sendKeys(firstn);
		lname.sendKeys(lastn);
		zip.sendKeys(zipcode);
		cntinue.click();
		finish.click();
		backhome.click();
	}
	public void test4()
	{
		hamburger.click();
		logout.click();
	}
	
	
	
	/*    @FindBy(xpath="//*[@id=\"user-name\"]")
	WebElement usernametype;

	@FindBy(xpath="//*[@id=\"password\"]")
	WebElement password;	
	
	@FindBy(xpath="//*[@id=\"login-button\"]")
	WebElement login;
	
	@FindBy(xpath = "//*[@id=\"add-to-cart-sauce-labs-backpack\"]")
	WebElement addtocart1;
	
	@FindBy(xpath = "//*[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]")
	WebElement addtocart2;
	
	@FindBy(xpath = "//*[@id=\"add-to-cart-sauce-labs-onesie\"]")
	WebElement addtocart3;
	
	@FindBy(xpath = "//*[@id=\"add-to-cart-sauce-labs-bike-light\"]")
	WebElement addtocart4;
	
	@FindBy(xpath = "//*[@id=\"add-to-cart-sauce-labs-fleece-jacket\"]")
	WebElement addtocart5;
	
	@FindBy(xpath = "//*[@id=\"add-to-cart-test.allthethings()-t-shirt-(red)\"]")
	WebElement addtocart6;
	
	@FindBy(xpath="//*[@id=\"shopping_cart_container\"]/a")
	WebElement cartbutton;
	
	@FindBy(xpath="//*[@id=\"checkout\"]")
	WebElement checkout;
	
	@FindBy(xpath="//*[@id=\"first-name\"]")
	WebElement firstname;
	
	@FindBy(xpath="//*[@id=\"last-name\"]")
	WebElement lastname;
	
	@FindBy(xpath="//*[@id=\"postal-code\"]")
	WebElement postalcode;
	
	@FindBy(xpath="//*[@id=\"continue\"]")
	WebElement continuebutton;
	
	@FindBy(xpath="//*[@id=\"finish\"]")
	WebElement finishbutton;
	
	@FindBy(xpath="//*[@id=\"react-burger-menu-btn\"]")
	WebElement hamburger;
	
	@FindBy(xpath="//*[@id=\"logout_sidebar_link\"]")
	WebElement logout;
	
	public SaucedemoLoginPagePrgrm(WebDriver driver)
     {
		    this.driver=driver;
            PageFactory.initElements(driver,this);
     }
	public void setvalues(String username, String pswd) 
	 {
		    usernametype.clear();
		    usernametype.sendKeys(username);
		    password.clear();
		    password.sendKeys(pswd);
	 }
	public void clickLoginBtn() 
	{
		    login.click();
	}
	
   public void addProductToCart() 
    {
	       addtocart1.click();
	       addtocart2.click();
	       addtocart3.click();
	       addtocart4.click();
	       addtocart5.click();
	       addtocart6.click();
	}
	public void cart()
	 {
		    cartbutton.click();
		    JavascriptExecutor js = (JavascriptExecutor) driver;
		    js.executeScript("window.scrollBy(0,500)", "");
		    checkout.click();
	 }
	public void setvalues2(String fname, String lname)
     {
    	    firstname.sendKeys(fname);
    	    lastname.sendKeys(lname);
     }
	public void passvalue(String code)
	{
		    postalcode.sendKeys(code);
	}
	
	public void testclick()
	 {
		    continuebutton.click();
	 }
    public void back()
	 {
		    driver.navigate().to("https://www.saucedemo.com/inventory.html");
	 }
    public void logout()
     {
	        hamburger.click();
	        logout.click();
     }
	
*/

	


	
}





	
	
	
	
	
	

