import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class LoginEmailSenhaIncorretos
{
private WebDriver driver;
@Before //Acessar o site
public void SetUp()
{
 driver = new ChromeDriver();
 driver.get("https://www.facebook.com");
 driver.manage().window().maximize();
}

@Test //iniciando o test
public void loginUsuario()
{
 WebElement loginUser = driver.findElement(By.id("email"));
  loginUser.sendKeys("Email Incorreto");
 
 WebElement loginSenha = driver.findElement(By.id("pass"));
  loginSenha.sendKeys("Senha Incorreta");
  
 WebElement realizandoLogin = driver.findElement(By.id("loginbutton"));
  realizandoLogin.click();
 
	}
}

