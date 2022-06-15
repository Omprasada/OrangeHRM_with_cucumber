package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps {
	
	WebDriver driver;
	
	@Given("User is on Login Page")
	public void user_is_on_login_page() {
		System.out.println("Step1: User is on LoginPage");
	    WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@When("User enters username and password")
	public void user_enters_username_and_password() {
		System.out.println("Step2: Enter Username and Password");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	}

	@And("Click on Login button")
	public void click_on_login_button() {
		System.out.println("Step3: Click on LoginBtn");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
	}

	@Then("user should land into Homepage")
	public void user_should_land_into_homepage() {
	    System.out.println("Step4: User lands on HomePage");
	    driver.close();
	}

}
