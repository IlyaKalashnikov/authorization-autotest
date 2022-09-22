import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registration extends Data{
    private By writeFirstName = By.xpath("//div[@class='container']//input[@id='firstName']");
    private By writeSecName = By.xpath("//div[@class='container']//input[@id='lastName']");
    private By writeEmail = By.xpath("//div[@class='container']//input[@id='email']");
    private By writePassword = By.xpath("//div[@class='container']//input[@id='password']");
    private By writeMatchPassword = By.xpath("//div[@class='container']//input[@id='matchPassword']");
    private By clickButton = By.className("btn-primary");

    @Test
    void registration(){
        System.setProperty("webdriver.chrome.driver","/Users/ilakalasnikov/selenium/chromedriver");
        ChromeDriver driver = new ChromeDriver();
        Data data = new Data();

        driver.get(data.registrationUrl);
        driver.findElement(writeFirstName).sendKeys(data.firstName);
        driver.findElement(writeSecName).sendKeys(data.secName);
        driver.findElement(writeEmail).sendKeys(data.email);
        driver.findElement(writePassword).sendKeys(data.password);
        driver.findElement(writeMatchPassword).sendKeys(data.password);
        driver.findElement(clickButton).click();
    }
}
