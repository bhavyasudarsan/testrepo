package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Study {
	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration .ofSeconds(5));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//to access webpage
		driver.get("https://www.saucedemo.com/");
		// to select textbox
		  WebElement userName=driver.findElement(By.id("user-name"));
		  WebElement password=driver.findElement(By.id("password"));
		  WebElement button=driver.findElement(By.id("login-button"));
		 //to set value to textbox
		  userName.sendKeys("standard_user");
		  password.sendKeys("secret_sauce");
		  button.click();
		  //to navigate
		  driver.navigate().to("https://www.saucedemo.com/cart.html");	
	}
}
