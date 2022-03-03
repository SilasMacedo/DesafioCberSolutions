package tests;

import elementos.Elementos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AbrirNavegador;
import pages.Metodos;

public class PreencherFormulario {
	
	AbrirNavegador browser = new AbrirNavegador();
	Metodos metodo = new Metodos();
	Elementos el = new Elementos();
	

	@Given("que steja no site {string}")
	public void que_steja_no_site(String site) {
	   browser.abrirNavegador(site);
	}

	@Given("preencher first name {string}")
	public void preencher_first_name(String firstName) {
	    metodo.escrever(el.getFirstname(), firstName);
	}

	@Given("preencher last name {string}")
	public void preencher_last_name(String lastName) {
	    metodo.escrever(el.getLastname(), lastName);
	}

	@Given("preencher adress {string}")
	public void preencher_adress(String adress) {
	    metodo.escrever(el.getAdress(), adress);
	}

	@Given("preencher email {string}")
	public void preencher_email(String email) {
	    metodo.escrever(el.getEmiladress(), email);
	}

	@Given("preencher celular {string}")
	public void preencher_celular(String phone) {
		metodo.escrever(el.getPhone(), phone);
	}

	@Given("clicar gender")
	public void clicar_gender() {
		metodo.clicar(el.getGender());
	}

	@Given("clicar hobbies")
	public void clicar_hobbies() {
	    metodo.clicar(el.getHobbies());
	}

	@Given("selecionar language")
	public void selecionar_language() {
	    metodo.clicar(el.getSelectLanguage());
	    metodo.clicar(el.getLanguage());
	}

	@Given("selecionar country")
	public void selecionar_country() {
	    metodo.clicar(el.getSelectCountry());
	    metodo.clicar(el.getCountry());
	}

	@Given("selecionar date of birth")
	public void selecionar_date_of_birth() {
	    metodo.clicar(el.getSelectYear());
	    metodo.clicar(el.getAno());
	    
	    metodo.clicar(el.getSelectMonth());
	    metodo.clicar(el.getMes());
	    
	    metodo.clicar(el.getSelectDay());
	    metodo.clicar(el.getDia());
	}

	@Given("preencher password {string}")
	public void preencher_password(String password) {
	    metodo.escrever(el.getPassword(), password);
	}

	@Given("preencher confirm password {string}")
	public void preencher_confirm_password(String confirmPassword) {
	    metodo.escrever(el.getConfirmPassword(), confirmPassword);
	}

	@When("clicar no botao submit")
	public void clicar_no_botao_submit() {
	    metodo.clicar(el.getSubmit());
	}

	@Then("dados enviado com sucesso")
	public void dados_enviado_com_sucesso() {
	    metodo.screenShot("form");
	}
}
