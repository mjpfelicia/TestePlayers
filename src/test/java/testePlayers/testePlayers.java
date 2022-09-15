package testePlayers;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




public class testePlayers {
		
	private WebDriver driver;

	
	
	@Before
	public void abrirNavegador() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\cromerdrave\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://localhost:4200/e-players-angular/login");
		driver.manage().window().maximize();
	}
	
	
	
	@Test
	public void testeNavegador() {
		
		String[] listaSenhas = {"primeiraTentativa", "segundatentativa", "terceiratentativa", "12345"};
		
		
		
		
		for(int tentativa = 0; tentativa < listaSenhas.length; tentativa++) {
			
			try {
				WebElement inputNome 	= this.driver.findElement(By.id("nome")); 
				WebElement inputEmail	= this.driver.findElement(By.id("email")); 
				WebElement inputSenha 	= this.driver.findElement(By.id("senha")); 
				WebElement inputBtn 	= this.driver.findElement(By.xpath("/html/body/app-root/main/app-login/div/form/button")); 
				
				inputNome.clear();
				inputEmail.clear();
				inputSenha.clear();
				
				inputNome.sendKeys("sandra");
				inputEmail.sendKeys("sandra@sandra.com");
				inputSenha.sendKeys( listaSenhas[tentativa] );
			
				inputBtn.click();
				
				Thread.sleep(3000);
				
			} catch(InterruptedException e) {
				e.printStackTrace();
				
			}	
			

						
		}
	}
}
	


