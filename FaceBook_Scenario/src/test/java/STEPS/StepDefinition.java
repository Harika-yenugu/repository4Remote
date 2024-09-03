package STEPS;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
	
	WebDriver driver;
	
	
	
	

        @Given("I launch chrome browser")
        public void i_launch_chrome_browser() {
        	
        	driver =new ChromeDriver(); //Chrome Browse window launched
    		driver.manage().window().maximize(); 
    
 }
        @When("I open FaceBook home page")
        public void i_open_face_book_home_page(String TestURL) {
        	driver.get(TestURL);
    		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    		

   
}
        @Then("I verify that the logo present on page")
        public void i_verify_that_the_logo_present_on_page() {
        	driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[1]/div[1]/img")).click();
        			

    
}
       @Then("close browser")
        public void close_browser() {
    }


}
