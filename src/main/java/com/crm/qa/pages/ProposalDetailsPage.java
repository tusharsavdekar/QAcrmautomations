package com.crm.qa.pages;

import com.crm.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import com.crm.qa.utilities.TestUtil;

public class ProposalDetailsPage extends TestBase{
    @FindBy(xpath="//h2[text()='Proposal Detail']")
    WebElement ProposalDetail_Label;

    @FindBy(xpath="//input[@name='edit' and @type='button']")
    WebElement EditBtn;

    public ProposalDetailsPage()
    {
        PageFactory.initElements(driver, this);
    }

    public boolean ValidateProposalDetailLabel()
    {
        TestUtil.WaitForElementToBeVisible(driver,ProposalDetail_Label,50);
        return ProposalDetail_Label.isDisplayed();
    }

    public boolean ValidateVisibilityofEditButton()
    {
        TestUtil.WaitForElementToBeVisible(driver,EditBtn,50);
        return EditBtn.isDisplayed();
    }

}
