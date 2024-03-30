package testpkg;

//import java.io.FileInputStream;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import basepkg.Baseclass;

import pagepkg.SaucedemoLoginPagePrgrm;
import utilities.ExcelUtils;

public class SaucedemoLoginTestPrgrm extends Baseclass{
	
	@Test(priority = 0)
	public void verify() throws InterruptedException
	{
   SaucedemoLoginPagePrgrm lp=new SaucedemoLoginPagePrgrm(driver);
	String xl="C:\\Users\\parva\\OneDrive\\Documents\\Book2.xlsx";
	String Sheet="Sheet1";
	int  rowcount=ExcelUtils.getRowCount(xl, Sheet);

	for(int i=1;i<=rowcount;i++)
	{
		String email=ExcelUtils.getCellValue(xl, Sheet, i, 0);
		System.out.println("username----"+email);
		String pswd=ExcelUtils.getCellValue(xl, Sheet, i, 1);
		System.out.println("password---"+pswd);
		Thread.sleep(1000);
		lp.test1(email, pswd);
		
		Thread.sleep(1000);
	}
}

	@Test(priority = 1)
	public void home() throws InterruptedException
	{
		SaucedemoLoginPagePrgrm lp1=new SaucedemoLoginPagePrgrm(driver);
		Thread.sleep(3000);
		lp1.test2();
		Thread.sleep(3000);
		lp1.test3("Amritha","R","695301");
		Thread.sleep(3000);
		lp1.test4();
		Thread.sleep(3000);

		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}





















/*	
	@Test(priority=0)
	public void verifyLoginWithValidCred () throws InterruptedException
	{
		
		SaucedemoLoginPagePrgrm sd=new SaucedemoLoginPagePrgrm (driver);
		
	//Reading  the data from excel file by the specified path	
		
		String xl="C:\\Users\\parva\\OneDrive\\Documents\\Book2.xlsx";
		String Sheet="Sheet1";
		int rowcount=ExcelUtils.getRowCount(xl, Sheet);
		for(int i=1;i<=rowcount;i++)
		{
		      String username=ExcelUtils.getCellValue(xl, Sheet, i, 0);
		      System.out.println("username----"+username);
		      String pswd=ExcelUtils.getCellValue(xl, Sheet, i, 1);
		      System.out.println("password----"+pswd);
		//passing username and password as parameters
		      driver.findElement(By.name("user-name")).clear();
  	          driver.findElement(By.name("user-name")).sendKeys(username);
  	          driver.findElement(By.name("password")).sendKeys(pswd);  
  	          driver.findElement(By.name("login-button")).click();  
              Thread.sleep(2000);
  	          driver.navigate().refresh();
		//submitting the data by clicking on login button
		
	        sd.setvalues(username,pswd);
		    sd.clickLoginBtn();
		}
	}
@Test(priority=1)
	public void addtocart()	
	  {
	SaucedemoLoginPagePrgrm sd=new SaucedemoLoginPagePrgrm (driver);
	        sd.addProductToCart();
		    sd.cart();
			sd.setvalues2("Amritha","R");
			sd.passvalue("695301");
			sd.testclick();	
			sd.back();
			sd.logout();	
	
	}*/
	
	
	
	
	
	
	
	
	
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

