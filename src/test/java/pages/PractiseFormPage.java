package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PractiseFormPage {
    public PractiseFormPage(){


        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//input[@name='username']")
    public WebElement  username;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement password;

    @FindBy(xpath = "//textarea[@name='comments']")
    public WebElement textarea;

    @FindBy(xpath = "//input[@name='filename']")
    public WebElement filename;

    @FindBy(xpath = "(//input[@value='cb1'])[1]")
    public WebElement checkBox1;

    @FindBy(xpath = "(//input[@value='cb1'])[2]")
    public WebElement checkBox2;

    @FindBy(xpath = "(//input[@value='cb1'])[3]")
    public WebElement checkBox3;

    @FindBy(xpath = "(//input[@value='rd1'])[1]")
    public WebElement radioButton1;

    @FindBy(xpath = "(//input[@value='rd1'])[2]")
    public WebElement radioButton2;

    @FindBy(xpath = "(//input[@value='rd1'])[3]")
    public WebElement radioButton3;

    @FindBy(xpath = "(//option[@value='ms1'])[1]")
    public WebElement multiple;

    @FindBy(xpath = "(//select[@name='dropdown'])[1]")
    public WebElement drop;

    @FindBy(xpath = "(//input[@value='submit'])[1]")
    public WebElement submit;


}
