package Login;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.DriverManagerType;

public class LoginAndMessage {
@Test
public void Login() {
WebDriverManager manager = null;
DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
LocalDateTime now = LocalDateTime.now();
System.out.println(dtf.format(now));
manager.chromedriver().setup();
ChromeOptions op=new ChromeOptions();
op.addArguments("--disable-notifications");
WebDriver driver=new ChromeDriver(op);
driver.manage().window().maximize();
driver.get("https://www.facebook.com");
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.findElement(By.name("email")).sendKeys("varunsn9@gmail.com");
driver.findElement(By.id("pass")).sendKeys("8147993558FACEBOOKvarun");
driver.findElement(By.name("login")).click();
//driver.findElement(By.xpath("//div[@role='banner']/descendant::div[@class='x9f619 x1n2onr6 x1ja2u2z']/child::div[contains(@aria-label,'Messenger')]")).click();
//driver.findElement(By.xpath("//input[@type='search' and @aria-label='Search Messenger']")).sendKeys("hemanth");
driver.findElement(By.xpath("//span[.='Hëmåñth Hêm']")).click();
driver.findElement(By.xpath("//p[@class='xat24cr xdj266r']")).sendKeys(dtf.format(now)+""+"hi",Keys.RETURN);
driver.close();
}
}
