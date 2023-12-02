package paraBankCustReg;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ParaBankCustReg {
    WebDriver driver;
    WebDriverWait wait;

    public void openUrl(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(Selectors.url);
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public void reg(){
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(Selectors.usrnamelogin)));
        driver.findElement(By.linkText(Selectors.regBtn)).click();

    }

    public void newCust(){
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(Selectors.usrnamelogin)));
        driver.findElement(By.id(Selectors.firstNameField)).sendKeys(Selectors.firstNametxt);
        driver.findElement(By.id(Selectors.lastNameField)).sendKeys(Selectors.lastNametxt);
        driver.findElement(By.id(Selectors.addressField)).sendKeys(Selectors.addrtxt);
        driver.findElement(By.id(Selectors.cityField)).sendKeys(Selectors.citytxt);
        driver.findElement(By.id(Selectors.stateField)).sendKeys(Selectors.statetxt);
        driver.findElement(By.id(Selectors.zipcodeField)).sendKeys(Selectors.zipcodetxt);
        driver.findElement(By.id(Selectors.phonenumField)).sendKeys(Selectors.phnumtxt);
        driver.findElement(By.id(Selectors.ssnField)).sendKeys(Selectors.ssntxt);
        driver.findElement(By.id(Selectors.usernameField)).sendKeys(Selectors.usrntxt);
        driver.findElement(By.id(Selectors.passwordField)).sendKeys(Selectors.pwdtxt);
        driver.findElement(By.id(Selectors.confirmPasswordField)).sendKeys(Selectors.pwdtxt);
        driver.findElement(By.xpath(Selectors.registerBtn)).click();
    }

    public void verifySuccess(String element,String originalText){
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(element)));
        WebElement verifiableElement = driver.findElement(By.cssSelector(element));
        String verifiableText = verifiableElement.getText();
        Assert.assertEquals(originalText,verifiableText);

    }

    public void verifySignUp(){
        verifySuccess(Selectors.confirmMessageTitle,Selectors.confirmMessagetxt);
    }

    public void tearDown(){
        driver.quit();
    }
}
