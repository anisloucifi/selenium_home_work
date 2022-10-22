package first_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class SingIn {
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
        WebElement elmsingin= driver.findElement(By.xpath("//*[@id=\"gnav-header-inner\"]/div[4]/nav/ul/li[1]/button"));
        elmsingin.click();
        Thread.sleep(3000);
        driver.close();
        driver.quit();

    }
}
