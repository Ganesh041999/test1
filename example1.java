package Automation;

import java.time.Duration;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class example1 {


	public static void main(String[] args) {
		
	
		System.setProperty("webdriver.chrome.driver", "C:\\\\Downloads\\\\chromedriver.exe");
		
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.nobroker.in");
		driver.manage().window().maximize();
		String signupStr = "Sign Up";
        String mobNum = "9154411533";
        String signupName = "htrfg";
        String signupEmail = "meesevaskd.57@gmail.com";


        By bySignup = By.xpath("//div[@class='nb__19hcF']");
        List<WebElement> signUpList = driver.findElements(bySignup);
        for (WebElement w : signUpList) {
            if (w.getText().equalsIgnoreCase(signupStr)) {
                w.click();
            }
        }
        
        By bySignupMob = By.xpath("//input[@id='signUp-phoneNumber']");
        WebElement signupMobElement = driver.findElement(bySignupMob);
        
        By bySignupName = By.xpath("//input[@id='login-signup-form__name-input']");
        WebElement signupNameElement = driver.findElement(bySignupName);

        By bySignupEmail = By.xpath("//input[@id='login-signup-form__email-input']");
        WebElement signupEmailElement = driver.findElement(bySignupEmail);
    
        By byContBtn = By.xpath("//button[@id='signUpSubmit']");
        WebElement contBtn = driver.findElement(byContBtn);
        
        signupMobElement.sendKeys(mobNum);
        signupNameElement.sendKeys(signupName);
        signupEmailElement.sendKeys(signupEmail);
        
        contBtn.click();
        
        WebElement usernameCheck = driver.findElement(By.xpath("//span[@class='nb__3-MNF']"));
        
        String  signupUsername = usernameCheck.getText();
        if (signupUsername.equals(signupName)) {
        	System.out.println("Login Successfull");
        }else {
        	System.out.println("Login Failed");
        }
	        		
	        	
	        	
	        
	        
		}
		
		

	
		
		
		
		
				
				
		
			  

	  }  
	
	
	
		
		
	        	    
	  
	   
		
	


