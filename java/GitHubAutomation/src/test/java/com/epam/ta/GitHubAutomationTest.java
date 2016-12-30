package com.epam.ta;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.epam.ta.steps.Steps;

public class GitHubAutomationTest
{
	private Steps steps;
	private final String USERNAME = "automationtest";
	private final String PASSWORD = "automationtest";

	@BeforeMethod(description = "Init browser")
	public void setUp()
	{
		steps = new Steps();
		steps.initBrowser();
	}

//	@Test
//	public void oneCanCreateProject()
//	{
//		steps.loginRambler(USERNAME, PASSWORD);
//		Assert.assertTrue(steps.createNewRepository("testRepo", "auto-generated test repo"));
//		Assert.assertTrue(steps.currentRepositoryIsEmpty());
//		// do not use lots of asserts
//	}
//
//	@Test(description = "Login to Github")
//	public void oneCanLoginGithub()
//	{
//		steps.loginRambler(USERNAME, PASSWORD);
//		Assert.assertTrue(steps.isLoggedIn(USERNAME));
//	}


	 @Test
	 public void loginTest() throws InterruptedException {
	 	steps.loginRambler(USERNAME, PASSWORD);
		 Assert.assertTrue(steps.checkLoggedIn(USERNAME));
 }
	@Test
	public void newsTest() throws InterruptedException {
		steps.loginRambler(USERNAME, PASSWORD);
		Assert.assertTrue(steps.checkLoggedIn(USERNAME));
		steps.newsRambler();
	}
	@Test
	public void gamesTest() throws InterruptedException {
		steps.loginRambler(USERNAME, PASSWORD);
		Assert.assertTrue(steps.checkLoggedIn(USERNAME));
		steps.gamesRambler();
	}
	@Test
	public void horoscopesTest() throws InterruptedException {
		steps.loginRambler(USERNAME, PASSWORD);
		Assert.assertTrue(steps.checkLoggedIn(USERNAME));
		steps.horoscopesRambler();
	}
	@Test
	public void datingTest() throws InterruptedException {
		steps.loginRambler(USERNAME, PASSWORD);
		Assert.assertTrue(steps.checkLoggedIn(USERNAME));
		steps.datingRambler();
	}
	@AfterMethod(description = "Stop Browser")
	public void stopBrowser()
	{
		steps.closeDriver();
	}

}
