package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AbrirNavegador {

	
	public static WebDriver driver;

	/**
	 * Metodo para abrir navegador chrome
	 * 
	 * @param site
	 */
	public void abrirNavegador(String site) {
		try {
			
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver = new FirefoxDriver();
			driver.get(site);
			driver.manage().window().maximize();
			
			System.out.println("------------Iniciando teste-------------");

		} catch (Exception e) {
			System.out.println("========== Erro ao abrir navegador ===========" + e.getMessage());
			System.out.println("========= Causa do erro =========" + e.getCause());
		}

	}
}
