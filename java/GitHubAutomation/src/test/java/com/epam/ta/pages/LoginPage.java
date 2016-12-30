package com.epam.ta.pages;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends AbstractPage
{
	private final Logger logger = LogManager.getRootLogger();
    private final String BASE_URL = "https://rambler.ru/";

	@FindBy(xpath = "/html/body/div[2]/div[1]/div[1]/div[1]/div[2]/form/div[1]/div[1]/input")
	public WebElement inputLogin;

	@FindBy(xpath = "/html/body/div[2]/div[1]/div[1]/div[1]/div[2]/form/div[2]/div[1]/input")
	public WebElement inputPassword;

	@FindBy(xpath = "/html/body/div[2]/div[1]/div[1]/div[1]/div[2]/form/div[3]/div[1]/input")
	public WebElement buttonSubmit;

	@FindBy(xpath = "/html/body/div[2]/div[6]/div/div[1]/div[3]/div[4]")
	public WebElement linkLoggedInUser;


    @FindBy(xpath = "/html/body/nav/div[1]/div[1]/div[1]/div[1]/a[3]")
    public WebElement buttonNews;

    @FindBy(xpath = "/html/body/nav/div[1]/div[1]/div[1]/div[1]/a[4]")
    public WebElement buttonGames;

    @FindBy(xpath = "/html/body/nav/div[1]/div[1]/div[1]/div[1]/a[5]")
    public WebElement buttonHoroscopes;

    @FindBy(xpath = "/html/body/nav/div[1]/div[1]/div[1]/div[1]/a[6]")
    public WebElement buttonDating;

	public LoginPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(this.driver, this);
	}

	@Override
	public void openPage()
	{
		driver.navigate().to(BASE_URL);
		logger.info("Login page opened");
	}

	public void login(String username, String password)
	{
		inputLogin.sendKeys(username);
		inputPassword.sendKeys(password);
		buttonSubmit.click();
		logger.info("Login performed");
	}

    public void news()
    {
        buttonNews.click();
        logger.info("News!");
    }

    public void games()
    {
        buttonNews.click();
        logger.info("Games!");
    }
    public void horoscopes()
    {
        buttonHoroscopes.click();
        logger.info("Horoscopes!");
    }
    public void dating()
    {
        buttonDating.click();
        logger.info("dating!");
    }


	public String getLoggedInUserName()
	{
		return linkLoggedInUser.getText();
	}

}
