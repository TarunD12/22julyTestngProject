package PageObjectModel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class signUpPageObjects {

 public WebDriver driver;
 
 By firstname=By.xpath("//input[@name='UserFirstName']");
 By lastname=By.xpath("//input[@name='UserLastName']");
 By workmail=By.xpath("//input[@name='UserEmail']");
 By jobtitle =By.xpath("//input[@name='UserTitle']");
 By company=By.xpath("//input[@name='CompanyName']");
 By employee=By.xpath("//select[@name='CompanyEmployees'][1]");
 By phone=By.xpath("//input[@name='UserPhone']");
 By country= By.xpath("//select[@name='CompanyCountry']");
 By checkbox=By.xpath("//div[@class='checkbox-ui']");
 
 public signUpPageObjects(WebDriver driver2) {
  
  this.driver=driver2;
 }


 
 public WebElement enterFirstname() {
 
  return driver.findElement(firstname);
 }
 
 
 public WebElement enterLastname() {
  
  return driver.findElement(lastname);
 }
 public WebElement enterworkmail() {
	  
	  return driver.findElement(workmail);
	 }
 public WebElement enterjobtitle() {
	  
	  return driver.findElement(jobtitle);
	 }
 public WebElement entercompany() {
	  
	  return driver.findElement(company);
	 }
 
      public WebElement selectEmpolyee() {
  
  return driver.findElement(employee);
 }
      public WebElement enterphone() {
    	  
    	  return driver.findElement(phone);
      }
 
    	  public WebElement entercountry() {
        	  
        	  return driver.findElement(country);
    	  }
public WebElement clickcOncheckbox() {
        	  
        	  return driver.findElement(checkbox);
    	  
}
     
 
 
 
 
 
 
 
}
