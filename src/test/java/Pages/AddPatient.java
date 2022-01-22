package Pages;

import StepDefinitions.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddPatient extends BaseClass {
    public AddPatient(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[@id=\"main-menu\"]/div[1]/div[3]")
    WebElement patientsMenu;
    public WebElement getPatientsMenu() {
        return patientsMenu;
    }

    @FindBy(xpath = "//button[text()='New Patient']")
    WebElement addPatient;
    public WebElement getAddPatient(){
        return addPatient;
    }

    @FindBy(id = "new-patient_first")
    WebElement firstNameField;
    public WebElement getFirstNameField(){
        return firstNameField;
    }

    @FindBy(id = "new-patient_last")
    WebElement lastNameField;
    public WebElement getLastNameField(){
        return lastNameField;
    }

    @FindBy(id = "new-patient_email")
    WebElement emailField;
    public WebElement getEmailFieldField(){
        return emailField;
    }

    @FindBy(id = "new-patient_birth_date")
    WebElement dateOfBirthField;
    public WebElement getDateOfBirthField(){
        return dateOfBirthField;
    }

    @FindBy(id = "new-patient_gender")
    WebElement genderField;
    public WebElement getGenderField(){
        return genderField;
    }

    @FindBy(id = "new-patient_ssn")
    WebElement ssnField;
    public WebElement getSsnField(){
        return ssnField;
    }

    @FindBy(id = "new-patient_phone_no")
    WebElement phoneNumberField;
    public WebElement getPhoneNumberField(){
        return phoneNumberField;
    }

    @FindBy(id = "new-patient_facility_id")
    WebElement facilityField;
    public WebElement getFacilityField(){
        return facilityField;
    }

    @FindBy(id = "new-patient_billable_from")
    WebElement billField;
    public WebElement getBillField(){
        return billField;
    }

    @FindBy(className = "mapboxgl-ctrl-geocoder--input")
    WebElement addressField;
    public WebElement getAddressField(){
        return addressField;
    }

    @FindBy(xpath = "//button[text()='Create']")
    WebElement create;
    public WebElement getCreate(){
        return create;
    }
}
