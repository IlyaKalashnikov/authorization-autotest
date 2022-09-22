import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authorization extends Data {

    private By login = By.xpath("//div[@class='container']//input[@name='username']");
    private By password = By.xpath("//div[@class='container']//input[@name='password']");
    private By submit = By.className("btn-primary");

    @Test
    void authorization (){
        System.setProperty("webdriver.chrome.driver","/Users/ilakalasnikov/selenium/chromedriver");
        ChromeDriver driver = new ChromeDriver();
        Data data = new Data();

        driver.get(data.authorizationUrl);
        driver.findElement(login).sendKeys(data.email);
        driver.findElement(password).sendKeys(data.password);
        driver.findElement(submit).click();
    }
}
