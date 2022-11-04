package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjects {

 public WebDriver driver;  //This driver dont have scope
 
 
 //driver.findElement(By.xpath("//hshsju")).sendKeys("test");
 
 By username=By.xpath("//input[@id='username']");
 By password=By.xpath("//input[@id='password']");
 By logIn=By.xpath("//input[@id='Login']");
 
 By tryForFree=By.xpath("//a[@id='signup_link']");
 
 
 
 public LoginPageObjects(WebDriver driver2) {
  
  this.driver=driver2;
 }


 public WebElement enterUsername() {
  return driver.findElement(username);
 }
 
 
 public WebElement enterPssword() {
  return driver.findElement(password);
 }
 
 public WebElement clickOnLogin() {
  return driver.findElement(logIn);
 }
 
 
 public WebElement clickOnTryForFree() {
  return driver.findElement(tryForFree);
 
}


public WebElement errorMessage() {
	// TODO Auto-generated method stub
	return null;
}



}
 
 
 
 
 
 
 

 
 
 
 
 
 
