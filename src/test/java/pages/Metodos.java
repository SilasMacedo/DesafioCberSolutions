package pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;




public class Metodos extends AbrirNavegador{


	
	/**
	 * Metodo para escrever texto
	 * @param elemento
	 * @param texto
	 */
	public void escrever (By elemento, String texto) {
		try {
			driver.findElement(elemento).sendKeys(texto);	
		} catch (Exception e) {
			System.out.println("========== Erro ao digitar ============" + e.getMessage());
		}
	}
	
	/**
	 * Metodo para clicar em um elemento
	 * @param elemento
	 */
	public void clicar (By elemento) {
		try {
			driver.findElement(elemento).click();		
		} catch (Exception e) {
			System.out.println("========== Erro ao clicar ==========" + e.getMessage());
		}
	}
	
	/**
	 * Metodo para capturar screenshot da pagina
	 * @param nome
	 */
	public void screenShot (String nome) {
		try {
		TakesScreenshot ss = ((TakesScreenshot) driver);
		File srcFile = ss.getScreenshotAs(OutputType.FILE);
		File destFile = new File ("./target/" +nome+".png");
		FileUtils.copyFile(srcFile, destFile);
		} catch (IOException e) {
			System.err.println("========== Erro ao tirar screenShot ==========" + e.getMessage());	
		}
	}
	
	/**
	 * Metodo para clicar varias vezes
	 * @param elemento
	 * @param n1
	 * @param descricao
	 */
	public void clicks (By elemento, int n1) {
		int n2 = 0;
		while(n1>n2) {
			driver.findElement(elemento).click();
			n2++;
		}
	}
		
	/**
	 * Metodo para mover barra
	 * @param elemento
	 * @param NH
	 * @param NV
	 */
	public void moverElemento (int NH, int NV) {
		try {
			WebElement move = driver.findElement(By.id("slider"));
			Actions slide = new Actions(driver);
			slide.dragAndDropBy(move, NH, NV).build().perform();
		} catch (Exception e) {
			System.err.println("========== Erro ao mover barra ==========" + e.getMessage());
		}
	}
	
	/**
	 * Metodo para fechar navegador
	 */
	public void fecharNavegador () {
		try {
			driver.quit();
		} catch (Exception e) {
			System.out.println("========= TESTE FINALIZADO COM SUCESSO =========" + e.getMessage());
		}
	}

	/**
	 * Metodo para esperar elemento
	 * @param elemento
	 */

	@SuppressWarnings("deprecation")
	public void esperaExplicita(By elemento) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(elemento));
	}
	
	/**
	 * Metodo para fechar popup
	 * @param site
	 */
	public void fecharPopupDinamico (String site) {
		@SuppressWarnings("deprecation")
		WebDriverWait wait = new WebDriverWait(driver, 3);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("(//li)[4]/a")));
		driver.findElement(By.id("//li)[4]/a")).click();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("(//li)[7]/a")));
		driver.findElement(By.xpath("(//li)[7]/a")).click();
		driver.navigate().to(site);
	}
	
	/**
	 * Metodo para navegar
	 * @param site
	 */
	public void fecharpopup(String site) {
		try {
			driver.navigate().to(site);
		} catch (Exception e) {
			System.err.println("========== Erro ao navegar ==========" + e.getMessage());
		}
	}
	
	
	/**
	 * Metodo para escrever no frame
	 * @param elemento
	 * @param texto
	 */
	
	public void escreverComSwitch (By elemento, String texto) {
		try {
			driver.switchTo().frame("singleframe");
			
			driver.findElement(elemento).sendKeys(texto);	
			
		} catch (Exception e) {
			System.out.println("========== Erro ao digitar ============" + e.getLocalizedMessage());
		}
	}
	
}










