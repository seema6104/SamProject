package stepdefinitions;
import org.junit.Assert;
import com.pages.LaunchContentPlayer;
import com.pages.LoginPage;
import com.qa.facory.DriverFactory;
import io.cucumber.java.en.*;
public class SamSteps extends BaseClass{
	
	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() {
	System.out.println("Sam Login Steps class");
	
	}

	@When("User Launch SAM URL {string}")
	public void user_launch_sam_url(String url) {
		
		
	}

	@When("User enters Email as {string} and Password as {string}")
	public void user_enters_email_as_and_password_as(String uName, String pwd) {
		login.enterUsername(uName);
		login.enterPassword(pwd);
	}

	@When("Clicks on login")
	public void clicks_on_login() {
		  
	}

	@Then("Student user can see Dashboard")
	public void student_user_can_see_dashboard() throws InterruptedException {
		login.clickOnLogin();
		System.out.println("Now Clicking on New session link");
    	login.newSessionOKBTN();
    	System.out.println("Clicking on Enter key later");
    	login.enterKeyLaterButton();
    	Thread.sleep(4000);
		String actualTitle= driver.getTitle();
    	System.out.println("actualTitle after Login: " +actualTitle);
		Assert.assertEquals(actualTitle, "SAM - Activity Calendar");
		//login.samLogoPage();
	}

   // Launch content player

	@Then("Student user Navigates to Activity List")
	public void student_user_navigates_to_activity_list() {
		cpPage= new LaunchContentPlayer(driver); 
		cpPage.clickOnActivityListTab();
		cpPage.selectCourseTab();
	}

	@Then("Student user clicks on SAM assignment and dialog box opens")
	public void student_user_clicks_on_sam_assignment_and_dialog_box_opens() {
		cpPage.selectSamExam();
		cpPage.examDialBox();

	}

	@Then("Retake of the assignment should not get reduced")
	public void retake_of_the_assignment_should_not_get_reduced() {
		
	}

}
