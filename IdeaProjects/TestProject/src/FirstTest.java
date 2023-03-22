import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTest {
    public static void main(String[] args){
        FirefoxDriver driver=new FirefoxDriver();
        driver.get("https://app2.qa.salesintel.io/");


        WebElement element=driver.findElement(By.xpath("//input[@formcontrolname='userEmail']"));
        element.sendKeys("abc@gmail.com");

       // WebElement button=driver.findElement(By.xpath("//input[@formcontrolname='password']"));
       // button.click();
    }
}
