package org.newproj;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NewClass {

	public static WebDriver driver;

	public static Select s;

	@Test
	public static void initiate() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\mokz\\eclipse-workspace\\Selenium7Pm\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://blazedemo.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement city1 = driver.findElement(By.xpath("//select[@name='fromPort']"));
		city1.click();
		s = new Select(city1);
		s.selectByVisibleText("Paris");

		WebElement city2 = driver.findElement(By.xpath("(//select[@class='form-inline'])[2]"));
		city2.click();
		s = new Select(city2);
		s.selectByVisibleText("Cairo");
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();

		driver.findElement(By.xpath("(//input[@class='btn btn-small'])[3]")).click();
		
	}

	@Test
	@Parameters({ "myName", "address", "city", "state", "zipCode", "creditCardNumber","creditCardMonth","creditCardYear","nameOnCard"})
	public static void txtDetails(String myName, String address, String city, String state, String zipCode,
			String creditCardNumber,String creditCardMonth,String creditCardYear ,String nameOnCard) {

		driver.findElement(By.id("inputName")).sendKeys(myName);
		driver.findElement(By.id("address")).sendKeys(address);
		driver.findElement(By.id("city")).sendKeys(city);
		driver.findElement(By.id("state")).sendKeys(state);
		driver.findElement(By.id("zipCode")).sendKeys(zipCode);
		WebElement card = driver.findElement(By.id("cardType"));
		s = new Select(card);
		s.selectByVisibleText("Visa");
		driver.findElement(By.id("creditCardNumber")).sendKeys(creditCardNumber);
		driver.findElement(By.id("creditCardMonth")).sendKeys(creditCardMonth);
		driver.findElement(By.id("creditCardYear")).sendKeys(creditCardYear);
		driver.findElement(By.id("nameOnCard")).sendKeys(nameOnCard);
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
		List<WebElement> table = driver.findElements(By.xpath("/html/body/div[2]/div/table"));
		for (WebElement allCells : table) {
			List<WebElement> cells = allCells.findElements(By.tagName("td"));
			for (WebElement eachCell : cells) {
				System.out.println(eachCell.getText());
				
			}
	
}
	}
}
