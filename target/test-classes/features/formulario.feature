#Author: arqvimedes@gmail.com

@formulario
Feature:  Prencher formulario
  Eu COMO usuario QUERO preencher o formulario PARA enviar o cadastro

  
  Scenario: Abrir site e preencher formulario
   Given que steja no site "http://demo.automationtesting.in/Register.html"
	 And preencher first name "Silas"
	 And preencher last name "Macedo"
	 And preencher adress "Alameda Araguaia, 2190 - Cj 1208 - Barueri - SP"
   And preencher email "arqvimedes@gmail.com"
	 And preencher celular "1397108415"
	 And clicar gender 
	 And clicar hobbies
	 And selecionar language
	 And selecionar country
	 And selecionar date of birth
	 And preencher password "Cyber123"
	 And preencher confirm password "Cyber123"
   When clicar no botao submit
   Then dados enviado com sucesso
    
   

