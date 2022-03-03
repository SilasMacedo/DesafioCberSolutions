#Author: arqvimedes@gmail.com

@frame
Feature: Preencher
  Eu COMO analista QUERO preencher os campos PARA automatizar o teste
  
  Background: Abrir site
    Given que esteja na home "http://demo.automationtesting.in/Register.html"
  
  Scenario: Preencher frame  
    And acessar a page SwitchTo>Frames
    When preencher campo do frame
    Then valido frame

  Scenario: Preencher data 
	  And acessar a page Widdgets>Datapicker
    When preencher campos de date
    Then valido date
    
  Scenario: Mover barra
	  And acessar a page Widdgets>Slider
    When mover a barra
    Then valido slider  
    
    