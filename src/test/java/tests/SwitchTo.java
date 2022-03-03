package tests;

import elementos.Elementos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AbrirNavegador;
import pages.Metodos;

public class SwitchTo {

	AbrirNavegador browser = new AbrirNavegador();
	Metodos metodo = new Metodos();
	Elementos el = new Elementos();

	@Given("que esteja na home {string}")
	public void que_esteja_na_home(String site) {
		browser.abrirNavegador(site);
	}

	@Given("acessar a page SwitchTo>Frames")
	public void acessar_a_page_switch_to_frames() {
		metodo.clicar(el.getSwitchTo());
		metodo.clicar(el.getFrame());
		metodo.fecharpopup("http://demo.automationtesting.in/Frames.html");
	}

	@When("preencher campo do frame")
	public void preencher_campo_do_frame() {
		metodo.escreverComSwitch(el.getTextFrame(), "Analista de Qualidade");
	}

	@Then("valido frame")
	public void valido_frame() {
		metodo.screenShot("frame");
		metodo.fecharNavegador();
	}

	@Given("acessar a page Widdgets>Datapicker")
	public void acessar_a_page_widdgets_datapicker() {
		metodo.clicar(el.getWidgets());
		metodo.clicar(el.getDatePicker());
		metodo.fecharpopup("http://demo.automationtesting.in/Datepicker.html");
	}

	@When("preencher campos de date")
	public void preencher_campos_de_date() {
		metodo.clicar(el.getDatePickerDis());
		metodo.clicks(el.getPrevDate(), 474);
		metodo.clicar(el.getSetdia());

		metodo.clicar(el.getDatePickerEnb());
		metodo.clicar(el.getHojeDia());
	}

	@Then("valido date")
	public void valido_date() {
		metodo.screenShot("date");
		metodo.fecharNavegador();
	}

	@Given("acessar a page Widdgets>Slider")
	public void acessar_a_page_widdgets_slider() {
		metodo.clicar(el.getWidgets());
		metodo.clicar(el.getSlider());
		metodo.fecharpopup("http://demo.automationtesting.in/Slider.html");
	}

	@When("mover a barra")
	public void mover_a_barra() {
		metodo.moverElemento(00, 500);
	}

	@Then("valido slider")
	public void valido_slider() {
		metodo.screenShot("slider");
		metodo.fecharNavegador();
	}

}
