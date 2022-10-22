package first_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class Email {
    public static void main(String[] args) throws  Exception {
        String projectPath = System.getProperty("user.dir");
        String geckoDriverPath = projectPath + File.separator + "drivers" + File.separator + "geckodriver.exe";
        String chromeDriverPath = projectPath + File.separator + "drivers" + File.separator + "chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        System.setProperty("webdriver.gecko.driver", geckoDriverPath);

        ChromeDriver driver = new ChromeDriver();

        String url = "https://www.etsy.com";
        driver.get(url);
        driver.manage().window().maximize();
        WebElement elmEmail= driver.findElement(By.id("email-list-signup-email-input"));
        elmEmail.sendKeys("anis@gmail.com");
        Thread.sleep(3000);
        WebElement suscribe = driver.findElement(By.xpath("//*[@id=\"collage-footer\"]/footer/div[2]/div/form/div[2]/div/button"));
        suscribe.click();
        Thread.sleep(5000);
        driver.close();
        driver.quit();
    }
}
