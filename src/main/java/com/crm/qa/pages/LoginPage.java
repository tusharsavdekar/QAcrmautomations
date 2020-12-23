package com.crm.qa.pages;

import com.crm.qa.utilities.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {


    //Page Factory -OR

    @FindBy(name="username")
    @CacheLookup
    WebElement Username;


    @FindBy(name="pw")
    @CacheLookup
    WebElement Password;


    @FindBy(name="Login")
    @CacheLookup
    WebElement LogInToSandbox;



    public LoginPage()
    {
        PageFactory.initElements(driver, this);
    }

    public HomePage login(String un, String pw) throws InterruptedException {

        Username.sendKeys("deepika.joshi@sunrun.com.installops");
        Password.sendKeys("Welcome@1234");
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);
        LogInToSandbox.click();



        return new HomePage();
    }
}
