package first_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class Elementserchbar {

    public static void main(String[] args) throws Exception {
        String projectPath = System.getProperty("user.dir");
        String geckoDriverPath = projectPath + File.separator + "drivers" + File.separator + "geckodriver.exe";
        String chromeDriverPath = projectPath + File.separator + "drivers" + File.separator + "chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        System.setProperty("webdriver.gecko.driver", geckoDriverPath);

        ChromeDriver driver = new ChromeDriver();

        String url = "https://www.etsy.com";
        driver.get(url);
        driver.manage().window().maximize();
       WebElement elm= driver.findElement(By.id("global-enhancements-search-query"));
       elm.sendKeys("anis");
       Thread.sleep(2000);
       driver.close();
       driver.quit();


    }
}
