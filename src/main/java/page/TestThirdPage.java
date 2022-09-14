package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TestThirdPage {
	
	WebDriver driver;
	
	public TestThirdPage (WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH , using = "//button[@onclick=\"myFunctionSky()\"]")
	WebElement SKY_BLUE_BACKGROUD;
	@FindBy(how = How.XPATH , using = "//button[@onclick=\"myFunctionWhite()\"]")
	WebElement WHITE_BACKGROUD;
	
	public void getTextForSkyBlueBackground() {
		System.out.println(SKY_BLUE_BACKGROUD.getText());
	}
	
	public void getTextForWhiteBackground() {
		System.out.println(WHITE_BACKGROUD.getText());
	}
	
	public void clickForSkyBlueBackground() {
		SKY_BLUE_BACKGROUD.click();
	}
	public void clickForWhiteBackground() {
		WHITE_BACKGROUD.click();
	}
	
	public String checkBackGroundColor() {
		String backgroundColor = driver.findElement(By.tagName("body")) .getCssValue("background-color");
		String colorHex = Color.fromString(backgroundColor).asHex();
		return colorHex;
	}
}
