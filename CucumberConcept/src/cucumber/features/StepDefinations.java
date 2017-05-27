package cucumber.features;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class StepDefinations {

	public static  WebDriver driver = null; 
	
	@Given("^I navigate to the login page$")
	public void navigateToLogin() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		driver = new ChromeDriver(); 
		driver.navigate().to("localhost:3000");
		//sleep(1000);
		TimeUnit.SECONDS.sleep(1);
		//System.out.println("go to the login page");
		
	}

	@When("^I click to login$")
	public void fillLoginInfo(DataTable table) throws Throwable {
		System.out.println(table);
		List<List<String>> data = table.raw(); 
		System.out.println(data.get(1).get(1));
		driver.findElement(By.name("username")).sendKeys(data.get(1).get(1));
		TimeUnit.SECONDS.sleep(1);
		driver.findElement(By.name("password")).sendKeys(data.get(2).get(1));
		TimeUnit.SECONDS.sleep(1);
		driver.findElement(By.name("loginbutton")).click();
		TimeUnit.SECONDS.sleep(1);
		//System.out.println("click on the login to view the dashboard");

		
	}

	@SuppressWarnings("deprecation")
	@Then("^I click on an unattributed project$")
	public void clickOnUnAttributedProject() throws Throwable {
		driver.findElement(By.name("viewProjects")).click();
		TimeUnit.SECONDS.sleep(1);
		driver.findElement(By.name("project06")).click();
		Assert.assertTrue("Comp 4004 Project Registration",driver.getCurrentUrl().equals("http://localhost:3000/users/registerinproject"));
		//System.out.println("click on register for an unattributed project");
		
		
	}
	
	
	
	@Then("^I click on an attributed project$")
	public void clickonattributedprojectt() throws Throwable {

		driver.findElement(By.name("viewProjects")).click();
		TimeUnit.SECONDS.sleep(1);
		driver.findElement(By.name("project6")).click();
	    Assert.assertTrue("Comp 4004 Project Registration",driver.getCurrentUrl().equals("http://localhost:3000/users/getStudentProjects"));

	
	
	}
	
	



	@Then("^I fill up the required information$")
	public void i_fill_up_the_required_information(DataTable table) throws Throwable {
		System.out.println(table);
		List<List<String>> data = table.raw(); 
		System.out.println(data.get(1).get(1));
		driver.findElement(By.name("name")).sendKeys(data.get(1).get(1));
		TimeUnit.SECONDS.sleep(1);
		driver.findElement(By.name("username")).sendKeys(data.get(2).get(1));
		TimeUnit.SECONDS.sleep(1);
		driver.findElement(By.name("email")).sendKeys(data.get(3).get(1));
		TimeUnit.SECONDS.sleep(1);
		driver.findElement(By.name("password")).sendKeys(data.get(4).get(1));
		TimeUnit.SECONDS.sleep(1);
		driver.findElement(By.name("password2")).sendKeys(data.get(5).get(1));
		TimeUnit.SECONDS.sleep(1);
	
	}
	
	@Then("^I click on the register button$")
	public void i_click_on_the_register_button() throws Throwable {
		driver.findElement(By.name("registrationbutton")).click();
		
		
	}
	
	
	@Then("^I fill up the required information for second student$")
	public void i_fill_up_the_required_information_for_second_student(DataTable table) throws Throwable {
		System.out.println(table);
		List<List<String>> data = table.raw(); 
		System.out.println(data.get(1).get(1));
		driver.findElement(By.name("name")).sendKeys(data.get(1).get(2));
		TimeUnit.SECONDS.sleep(1);
		driver.findElement(By.name("username")).sendKeys(data.get(2).get(2));
		TimeUnit.SECONDS.sleep(1);
		driver.findElement(By.name("email")).sendKeys(data.get(3).get(2));
		TimeUnit.SECONDS.sleep(1);
		driver.findElement(By.name("password")).sendKeys(data.get(4).get(2));
		TimeUnit.SECONDS.sleep(1);
		driver.findElement(By.name("password2")).sendKeys(data.get(5).get(2));
		TimeUnit.SECONDS.sleep(1);
	}
	
	

	@Given("^I click on the registration page$")
	public void i_click_on_the_registration_page() throws Throwable {
	
		driver.findElement(By.name("registration")).click();


	}
	
	
	
	@Given("^I navigate back to the login page$")
	public void i_navigate_back_to_the_login_page() throws Throwable {
		
		driver.findElement(By.name("logout")).click();

		
	}

	
	
	@When("^I login to the admin dashboard$")
	public void i_login_to_the_admin_dashboard() throws Throwable {
		driver.findElement(By.name("adminname")).sendKeys("admin");
		driver.findElement(By.name("adminpassword")).sendKeys("admin");
		driver.findElement(By.name("adminlogin")).click(); 
		TimeUnit.SECONDS.sleep(1);
	    
	}

	
	
	@Then("^I fill project name$")
	public void i_fill_project_name() throws Throwable {
	  
		
		driver.findElement(By.name("projectname")).sendKeys("project01");
		driver.findElement(By.name("registerproject")).click(); 
		driver.findElement(By.name("projectname")).sendKeys("project02");
		driver.findElement(By.name("registerproject")).click(); 
		driver.findElement(By.name("projectname")).sendKeys("project03");
		driver.findElement(By.name("registerproject")).click(); 
		driver.findElement(By.name("projectname")).sendKeys("project04");
		driver.findElement(By.name("registerproject")).click(); 
		driver.findElement(By.name("projectname")).sendKeys("project05");
		driver.findElement(By.name("registerproject")).click(); 
		driver.findElement(By.name("projectname")).sendKeys("project06");
		driver.findElement(By.name("registerproject")).click(); 
	}



	
	
}
