package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AtmPage {

    public AtmPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "a[href='/login']")
    public WebElement login;

    @FindBy(xpath = "//input[@placeholder='Name']")
    public WebElement name;

    @FindBy(xpath = "//input[@data-qa='signup-email']")
    public WebElement email;
    @FindBy(xpath = "//button[normalize-space()='Signup']")
    public WebElement signup;

    @FindBy(xpath = "//input[@id='id_gender1']")
    public WebElement gender;

    @FindBy(xpath = "//input[@id='customer_firstname']")
    public WebElement firstName;

    @FindBy(xpath = "//input[@id='customer_lastname']")
    public WebElement lastName;

    @FindBy(xpath = "//input[@id='passwd']")
    public WebElement password;

    @FindBy(xpath = "//select[@id='days']")
    public WebElement ddmDay;

    @FindBy(xpath = "//select[@id='months']")
    public WebElement ddmMonth;

    @FindBy(xpath = "//select[@id='years']")
    public WebElement ddmYear;

    @FindBy(xpath = "//input[@id='firstname']")
    public WebElement firstName2;

    @FindBy(xpath = "//input[@id='lastname']")
    public WebElement lastName2;

    @FindBy(xpath = "//input[@id='company']")
    public WebElement company;

    @FindBy(xpath = "//input[@id='address1']")
    public WebElement address1;

    @FindBy(xpath = "//input[@id='address2']")
    public WebElement address2;

    @FindBy(xpath = "//input[@id='city']")
    public WebElement city;

    @FindBy(xpath = "//select[@id='id_state']")
    public WebElement ddmState;

    @FindBy(xpath = "//input[@id='postcode']")
    public WebElement zip;

    @FindBy(xpath = "//select[@id='id_country']")
    public WebElement ddmCountry;

    @FindBy(xpath = "//textarea[@id='other']")
    public WebElement info;

    @FindBy(xpath = "//input[@id='phone']")
    public WebElement homePhone;

    @FindBy(xpath = "//input[@id='phone_mobile']")
    public WebElement mobilePhone;

    @FindBy(xpath = "//input[@id='alias']")
    public WebElement myAddress;

    @FindBy(xpath = "//*[text()='Register']")
    public WebElement registerButton;

    @FindBy(css = "button[data-qa='create-account']")
    public WebElement create;


    @FindBy(xpath = "//*[text()='Account Created!']")
    public WebElement accountCreated;

    @FindBy(xpath = "//*[text()='Invalid email address.']")
    public WebElement negativeResultText;

    @FindBy(xpath = "//a[normalize-space()='Home']")
    public WebElement home;

    @FindBy(xpath = "//a[contains(text(),'Test Cases')]")
    public WebElement testcase;

    @FindBy(xpath = "//b[normalize-space()='Test Cases']")
    public WebElement caseVisible;

}