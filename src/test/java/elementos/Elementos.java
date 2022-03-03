package elementos;

import org.openqa.selenium.By;

public class Elementos {

	private By firstname = By.xpath("//input[contains(@placeholder,'First Name')]");
	private By lastname = By.xpath("//input[contains(@placeholder,'Last Name')]");
	private By adress = By.xpath("//textarea[contains(@rows,'3')]");
	private By emiladress = By.xpath("//input[contains(@type,'email')]");
	private By phone = By.xpath("//input[contains(@type,'tel')]");
	private By gender = By.xpath("//input[@value='Male']");
	private By hobbies = By.xpath("//input[contains(@value,'Movies')]");
	private By language = By.xpath("//div[@class='ui-autocomplete-multiselect-item'][contains(.,'Portuguese')]");
	private By skills = By.xpath("//option[@value='Java'][contains(.,'Java')]");
	private By country = By.xpath("//span[@class='select2-selection__rendered'][contains(.,'Japan')]");
	private By ano = By.xpath("//option[@value='1982'][contains(.,'1982')]");
	private By mes = By.xpath("//option[@value='September'][contains(.,'September')]");
	private By dia = By.xpath("//option[@value='21'][contains(.,'21')]");	
	private By selectCountry = By.xpath("//span[contains(@class,'select2-selection select2-selection--single')]");
	private By selectLanguage = By.xpath("//div[contains(@class,'ui-autocomplete-multiselect ui-state-default ui-widget')]");
	private By selectYear = By.xpath("//select[contains(@placeholder,'Year')]");
	private By selectMonth = By.xpath("//select[contains(@placeholder,'Month')]");
	private By selectDay = By.xpath("//select[contains(@placeholder,'Day')]");
	private By password = By.xpath("//input[contains(@class,'form-control ng-pristine ng-untouched ng-invalid ng-invalid-required ng-valid-minlength')]");
	private By confirmPassword = By.xpath("//input[@class='form-control ng-pristine ng-untouched ng-invalid ng-invalid-required']");
	private By submit = By.xpath("//button[@type='submit'][contains(.,'Submit')]");
	private By switchTo = By.xpath("//a[contains(.,'SwitchTo')]");
	private By frame = By.xpath("//a[contains(.,'Frames')]");
	private By textFrame = By.xpath("//input[contains(@type,'text')]");
			
	private By widgets = By.xpath("//a[contains(.,'Widgets')]");
	private By datePicker = By.xpath("//a[contains(.,'Datepicker')]");
	private By datePickerDis = By.xpath("//input[contains(@class,'form-control hasDatepicker')]");
	private By prevDate = By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w'][contains(.,'Prev')]");
	private By setdia = By.xpath("//a[@class='ui-state-default'][contains(.,'21')]");
		
	private By datePickerEnb = By.xpath("//input[contains(@class,'form-control is-datepick')]");
	private By hojeDia = By.xpath("//a[contains(@class,'dp1646319600000  datepick-selected  datepick-highlight')]");
	
	private By closeSpan = By.xpath("//*[@id=\"dismiss-button\"]");
	private By slider = By.xpath("//a[contains(.,'Slider')]");
	private By barra = By.id("slider");
	

	public By getFirstname() {
		return firstname;
	}

	public By getLastname() {
		return lastname;
	}

	public By getAdress() {
		return adress;
	}

	public By getEmiladress() {
		return emiladress;
	}

	public By getPhone() {
		return phone;
	}

	public By getGender() {
		return gender;
	}

	public By getHobbies() {
		return hobbies;
	}

	public By getLanguage() {
		return language;
	}

	public By getSkills() {
		return skills;
	}

	public By getSelectCountry() {
		return selectCountry;
	}

	public By getAno() {
		return ano;
	}

	public By getMes() {
		return mes;
	}

	public By getDia() {
		return dia;
	}

	public By getSelectYear() {
		return selectYear;
	}

	public By getSelectMonth() {
		return selectMonth;
	}

	public By getSelectDay() {
		return selectDay;
	}

	public By getPassword() {
		return password;
	}

	public By getConfirmPassword() {
		return confirmPassword;
	}

	public By getSubmit() {
		return submit;
	}

	public By getSelectLanguage() {
		return selectLanguage;
	}

	public By getCountry() {
		return country;
	}

	public By getSwitchTo() {
		return switchTo;
	}

	public By getFrame() {
		return frame;
	}

	public By getTextFrame() {
		return textFrame;
	}

	public By getWidgets() {
		return widgets;
	}

	public By getDatePicker() {
		return datePicker;
	}

	public By getDatePickerDis() {
		return datePickerDis;
	}

	public By getDatePickerEnb() {
		return datePickerEnb;
	}

	public By getSlider() {
		return slider;
	}

	public By getBarra() {
		return barra;
	}

	public By getPrevDate() {
		return prevDate;
	}

	public By getCloseSpan() {
		return closeSpan;
	}


	public By getSetdia() {
		return setdia;
	}

	public By getHojeDia() {
		return hojeDia;
	}
	
	
	
	
	
	
	
}
