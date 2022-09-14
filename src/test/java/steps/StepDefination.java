package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import basePage.util;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import page.TestThirdPage;

public class StepDefination extends util{
	
	TestThirdPage variousMethod;
	
	@Before
	public void beforeRun() {
		init();
	 variousMethod = PageFactory.initElements(driver, TestThirdPage.class);
	}
	
	
	@Given("^Set SkyBlue Background button exists$")
	public void set_SkyBlue_Background_button_exists() {
		variousMethod.getTextForSkyBlueBackground();
	}
	
	@Given("^Set White Background button exists$")
	public void set_White_Background_button_exists() {
	    variousMethod.getTextForWhiteBackground();
	}

	@When("^I click on the button for Sky Blue$")
	public void i_click_on_the_button_for_Sky_Blue() {
	    variousMethod.clickForSkyBlueBackground();
	}

	@When("^I click on the button for White$")
	public void i_click_on_the_button_for_White() {
		variousMethod.clickForWhiteBackground();
	}
	
	
	@Then("^the background color will change to sky blue$")
	public void the_background_color_will_change_to_sky_blue() {
		String colorBackGround = variousMethod.checkBackGroundColor();
				System.out.println(colorBackGround);
				Assert.assertEquals(colorBackGround, "#87ceeb");
	}

	@Then("^the background color will change to White$")
	public void the_background_color_will_change_to_White()  {
		String colorBackGround = variousMethod.checkBackGroundColor();
		System.out.println(colorBackGround);
		Assert.assertEquals(colorBackGround, "#ffffff");
	}

}
