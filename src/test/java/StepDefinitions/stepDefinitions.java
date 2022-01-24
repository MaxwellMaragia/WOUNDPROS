package StepDefinitions;

import Pages.*;
import Pages.AddPatient;
import dataProvider.ConfigFileReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

import static org.testng.Assert.assertEquals;


public class stepDefinitions extends BaseClass {

    ConfigFileReader read = new ConfigFileReader();
    Properties pro = read.ConfigFile();
    Login log = new Login();
    AddPatient addPatient = new AddPatient();
    AddConsultant addConsultant = new AddConsultant();
    AddFacility addFacility = new AddFacility();
    AddAppointment addAppointment = new AddAppointment();

    @Given("Navigate to Woundpros login page")
    public void Navigate_to_Woundpros() {
        try {
            GetUrl(pro.getProperty("Url"));
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @When("^Enter username \"(.*)\" and Password \"(.*)\"$")
    public void enter_username_and_password(String uid, String pwd) {
        wait(20).until(ExpectedConditions.visibilityOf(log.username())).sendKeys(uid);
        implicitWait(2);
        log.password().sendKeys(pwd);

    }

    @And("Click on login button")
    public void click_on_log_in_button() {

        javascriptClick(log.Click_login_button());

    }


    @Then("User should be logged in with success message {string}")
    public void userShouldBeLoggedInWithSuccessMessage(String expected) {

        String Actual = wait(30).until(ExpectedConditions.visibilityOf(log.validLogin())).getText();
        assertEquals(expected, Actual);
    }

    @Given("User clicks on patient menu from dashboard")
    public void userClicksOnPatientMenuFromDashboard() throws InterruptedException {
        wait(30).until(ExpectedConditions.visibilityOf(addPatient.getPatientsMenu())).click();
        Thread.sleep(1000);
    }

    @Then("User clicks add patient button")
    public void userClicksAddPatientButton() {
        wait(30).until(ExpectedConditions.visibilityOf(addPatient.getAddPatient()));
        javascriptClick(addPatient.getAddPatient());
        implicitWait(3);
    }

    @Then("Enters patient first name")
    public void entersPatientFirstdName() {
        sharedatastep.PatientFirstName = randomCaps(1) + randomSmall(6);
        wait(30).until(ExpectedConditions.visibilityOf(addPatient.getFirstNameField())).sendKeys(sharedatastep.PatientFirstName);
        implicitWait(1);
    }

    @Then("Enters patient last name")
    public void entersPatientLastName() {
        sharedatastep.PatientLastName = randomCaps(1) + randomSmall(6);
        wait(30).until(ExpectedConditions.visibilityOf(addPatient.getLastNameField())).sendKeys(sharedatastep.PatientLastName);
        implicitWait(1);
        System.out.println("Patient names provided are: " + sharedatastep.PatientFirstName + " " + sharedatastep.PatientLastName);
    }

    @Then("Enters patient date of birth as {string}")
    public void entersPatientDateOfBirthAs(String dob) throws InterruptedException {
        Thread.sleep(1000);
        addPatient.getDateOfBirthField().sendKeys(dob);
        actionEnter();
    }

    @Then("Select patient gender")
    public void selectPatientGender() throws InterruptedException {
        addPatient.getGenderField().click();
        Thread.sleep(2000);
//        actionDown();
        actionEnter();
    }

    @Then("Enters SSN number")
    public void entersSSNNumber() throws InterruptedException {
        addPatient.getSsnField().sendKeys(randomNumber(9));
    }

    @Then("Enters patient email")
    public void entersPatientEmail() {
        String email = sharedatastep.PatientFirstName + "_" + sharedatastep.PatientLastName + "@gmail.com";
        addPatient.getEmailFieldField().sendKeys(email);
    }

    @Then("Enters patient phone number")
    public void entersPatientPhoneNumber() {
        addPatient.getPhoneNumberField().sendKeys("+(1)(713) 644-" + randomNumber(4));
    }

    @Then("Selects Facility")
    public void selectsFacility() throws InterruptedException {
        wait(20).until(ExpectedConditions.visibilityOf(addPatient.getFacilityField()));
//        addFacility.getSalesManager().sendKeys("Xfuookv");
        addPatient.getFacilityField().sendKeys(sharedatastep.FacilityName);
        Thread.sleep(2000);
        actionDown();
        Thread.sleep(600);
        actionEnter();
    }

    @Then("Enters patient date can bill")
    public void entersPatientDateCanBill() {
        addPatient.getBillField().sendKeys(todaysDate("MM-dd-yyyy"));
        actionEnter();
    }

    @Then("Enters patient address as {string}")
    public void entersPatientAddressAs(String address) throws InterruptedException {
        addPatient.getAddressField().sendKeys(address);
        Thread.sleep(2000);
        actionTab();
    }

    @Then("Clicks create")
    public void clicksCreate() {
        javascriptClick(addPatient.getCreate());
    }

    @Then("Verify success message alert {string}")
    public void verifySuccessMessageAlert(String expected) {
        String Actual = wait(30).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='" + expected + "']"))).getText();
        assertEquals(expected, Actual);
    }

    @Then("Verify added patient populates in table")
    public void verifyAddedPatientPopulatesInTable() {
        String Actual = wait(30).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='" + sharedatastep.PatientFirstName + " " + sharedatastep.PatientLastName + "']"))).getText();
        assertEquals(sharedatastep.PatientFirstName + " " + sharedatastep.PatientLastName, Actual);
    }

    @Given("User clicks on consultant menu from dashboard")
    public void userClicksOnConsultantMenuFromDashboard() throws InterruptedException {
        wait(30).until(ExpectedConditions.visibilityOf(addConsultant.getConsultantsMenu())).click();
        Thread.sleep(1000);
    }

    @Then("User clicks add consultant button")
    public void userClicksAddConsultantButton() {
        wait(30).until(ExpectedConditions.visibilityOf(addConsultant.getAddConsultant()));
        javascriptClick(addConsultant.getAddConsultant());
        implicitWait(3);
    }

    @Then("Enters consultant first name")
    public void entersConsultantFirstName() {
        sharedatastep.ConsultantFirstName = randomCaps(1) + randomSmall(6);
        wait(30).until(ExpectedConditions.visibilityOf(addConsultant.getFirstNameField())).sendKeys(sharedatastep.ConsultantFirstName);
        implicitWait(1);
    }

    @Then("Enters consultant last name")
    public void entersConsultantLastName() {
        sharedatastep.ConsultantLastName = randomCaps(1) + randomSmall(6);
        wait(30).until(ExpectedConditions.visibilityOf(addConsultant.getLastNameField())).sendKeys(sharedatastep.ConsultantLastName);
        implicitWait(1);
        System.out.println("Consultant names provided are: " + sharedatastep.ConsultantFirstName + " " + sharedatastep.ConsultantLastName);
    }

    @Then("Enters consultant date of birth as {string}")
    public void entersConsultantDateOfBirthAs(String dob) throws InterruptedException {
        Thread.sleep(1000);
        addConsultant.getDateOfBirthField().sendKeys(dob);
        actionEnter();
    }

    @Then("Select consultant gender")
    public void selectConsultantGender() throws InterruptedException {
        addConsultant.getGenderField().click();
        Thread.sleep(2000);
//        actionDown();
        actionEnter();
    }

    @Then("Enters consultant date of hire")
    public void entersConsultantDateOfHire() throws InterruptedException {
        Thread.sleep(1000);
        addConsultant.getDohField().sendKeys(daysBeforeToday(10,"yyyy-MM-dd"));
        actionEnter();

    }

    @Then("Enters consultant NPI")
    public void entersConsultantNPI() {
        addConsultant.getNpiNumberField().sendKeys(randomNumber(5));
        implicitWait(1);
    }

    @Then("Enters consultants CAQH ID")
    public void entersConsultantsCAQHID() {
        addConsultant.getCidField().sendKeys(randomNumber(6));
        implicitWait(1);
    }

    @Then("Enters consultants BHPN Practitioner ID")
    public void entersConsultantsBHPNPractitionerID() {
        addConsultant.getBidField().sendKeys(randomNumber(6));
        implicitWait(1);
    }

    @Then("Enters consultant email")
    public void entersConsultantEmail() {
        String email = sharedatastep.ConsultantFirstName + "_" + sharedatastep.ConsultantLastName + "@gmail.com";
        addConsultant.getEmailField().sendKeys(email);
    }

    @Then("Enters consultant phone number")
    public void entersConsultantPhoneNumber() {
        addConsultant.getPhoneNumberField().sendKeys("+(1)(713) 644-" + randomNumber(4));
    }

    @Then("Selects consultant degree as {string}")
    public void selectsConsultantDegreeAs(String degree) throws InterruptedException {
        addConsultant.getDegreeField().click();
        Thread.sleep(1000);
        wait(5).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='"+degree+"']"))).click();
        implicitWait(1);
        actionTab();
    }

    @Then("Enters consultant language as {string}")
    public void entersConsultantLanguageAs(String language) {
        addConsultant.getLanguageField().sendKeys(language);
    }

    @Then("Selects consultant designation as {string}")
    public void selectsConsultantDesignationAs(String designation) throws InterruptedException {
       addConsultant.getDesignationField().click();
        Thread.sleep(1000);
//        WebElement desg = wait(30).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='"+designation+"']")));
//        javascriptClick(desg);
        actionDown();
        actionDown();
        actionEnter();
        implicitWait(1);

    }

    @And("Enters consultant role as {string}")
    public void entersConsultantRoleAs(String role) throws InterruptedException {
        addConsultant.getRoleField().sendKeys(role);
        Thread.sleep(3000);
        actionEnter();
        actionTab();
    }

    @Then("Enters consultant address as {string}")
    public void entersConsultantAddressAs(String address) throws InterruptedException {
        addConsultant.getAddressField().sendKeys(address);
        Thread.sleep(2000);
        actionTab();
        actionTab();
    }

    @Then("Verify added consultant populates in table")
    public void verifyAddedConsultantPopulatesInTable() {
        String Actual = wait(30).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='" + sharedatastep.ConsultantFirstName + " " + sharedatastep.ConsultantLastName + "']"))).getText();
        assertEquals(sharedatastep.ConsultantFirstName + " " + sharedatastep.ConsultantLastName, Actual);
    }

    @Given("User clicks on facility menu from dashboard")
    public void userClicksOnFacilityMenuFromDashboard() {
        wait(30).until(ExpectedConditions.visibilityOf(addFacility.getFacilityMenu())).click();
    }

    @Then("User clicks add facility button")
    public void userClicksAddFacilityButton() {
        wait(30).until(ExpectedConditions.visibilityOf(addFacility.getAddFacility()));
        javascriptClick(addFacility.getAddFacility());
        implicitWait(3);
    }

    @Then("Enters Sales manager name")
    public void entersSalesManagerName() throws InterruptedException {
        wait(20).until(ExpectedConditions.visibilityOf(addFacility.getSalesManager()));
//        addFacility.getSalesManager().sendKeys("Xfuookv");
        addFacility.getSalesManager().sendKeys(sharedatastep.ConsultantFirstName);
        Thread.sleep(6000);
        actionDown();
        Thread.sleep(600);
        actionEnter();
    }

    @Then("Enters facility name")
    public void entersFacilityName() {
        sharedatastep.FacilityName = randomCaps(1)+randomSmall(6);
        addFacility.getFacilityName().sendKeys(sharedatastep.FacilityName);
    }

    @Then("Enters contact person")
    public void entersContactPerson() {
        addFacility.getContactPerson().sendKeys("Xjnhypj Lufirkj");
        //addFacility.getContactPerson().sendKeys(sharedatastep.ConsultantFirstName+" "+sharedatastep.ConsultantLastName);
    }

    @Then("Select facility type as {string}")
    public void selectFacilityTypeAs(String facility) throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//label[span='"+facility+"']")).click();
    }

    @Then("Click add facility document")
    public void clickAddFacilityDocument() {
         addFacility.getFacilityDocument().click();
    }

    @Then("Enter document title and document type as {string}")
    public void enterDocumentTitleAndDocumentTypeAs(String docType) throws InterruptedException {
        wait(30).until(ExpectedConditions.visibilityOf(addFacility.getDocumentTitle())).sendKeys(randomCaps(1)+randomSmall(6));
        implicitWait(3);
        addFacility.getDocumentType().click();
        Thread.sleep(1500);
        WebElement type = wait(30).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='"+docType+"']")));
        type.click();
    }

    @Then("Selects facility document")
    public void selectsFacilityDocument() throws InterruptedException {
        addFacility.getUploadButton().sendKeys(filepath);
        Thread.sleep(4000);
        driver.findElement(By.xpath("//button[text()='Add']")).click();
    }

    @Then("Enters facility address as {string}")
    public void entersFacilityAddressAs(String address) throws InterruptedException {
        Thread.sleep(2000);
        addFacility.getAddressField().sendKeys(address);
        Thread.sleep(2000);
        actionTab();
        actionTab();
    }

    @Then("Enters facility primary email")
    public void entersFacilityPrimaryEmail() {
        String email = sharedatastep.FacilityName +"@gmail.com";
        addFacility.getEmailField().sendKeys(email);
    }

    @Then("Enters facility primary phone number")
    public void entersFacilityPrimaryPhoneNumber() {
        addFacility.getPhoneNumberField().sendKeys("+(1)(713) 644-" + randomNumber(4));
    }

    @Then("Clicks create to add facility")
    public void clicksCreateToAddFacility() {
        addFacility.getCreate().click();
    }

    @Then("Verify added facility populates in table")
    public void verifyAddedFacilityPopulatesInTable() {
        String Actual = wait(30).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[text()='" + sharedatastep.FacilityName + "']"))).getText();
        assertEquals(sharedatastep.FacilityName, Actual);
    }


    @Then("User selects newly created patient")
    public void userSelectsNewlyCreatedPatient() {
        wait(30).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='" + sharedatastep.PatientFirstName + " " + sharedatastep.PatientLastName+"']"))).click();
//        wait(30).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='Mercie Bright']"))).click();
    }

    @Then("User clicks add appointment button")
    public void userClicksAddAppointmentButton() {
        wait(30).until(ExpectedConditions.visibilityOf(addAppointment.getAddAppointmentButton())).isDisplayed();
        javascriptClick(addAppointment.getAddAppointmentButton());
    }

    @Then("User selects visit type as {string}")
    public void userSelectsVisitTypeAs(String visitType) {
        wait(20).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[span='"+visitType+"']"))).click();
    }

    @Then("User enters date as today")
    public void userEntersDateAsToday() throws InterruptedException {
        Thread.sleep(1000);
        addAppointment.getAppointmentDate().sendKeys(todaysDate("MM-dd-yyyy"));
        actionEnter();
    }

    @Then("User enters timeslot as {string} to {string}")
    public void userEntersTimeslotAsTo(String from, String to) throws InterruptedException {
        Thread.sleep(1000);
        addAppointment.getAppointmentFrom().sendKeys(from);
        actionEnter();
        addAppointment.getAppointmentTo().sendKeys(to);
        actionEnter();
    }

    @Then("User Selects newly created consultant")
    public void userSelectsNewlyCreatedConsultant() throws InterruptedException {
        addAppointment.getConsultantField().sendKeys(sharedatastep.ConsultantFirstName);
//        addAppointment.getConsultantField().sendKeys("Melanie Ping");
        Thread.sleep(4000);
        actionDown();
        Thread.sleep(600);
        actionEnter();
    }

    @Then("User Selects wound location as {string}")
    public void userSelectsWoundLocationAs(String woundLocation) throws InterruptedException {
        addAppointment.getWoundsLocation().click();
        Thread.sleep(1000);
        wait(5).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='"+woundLocation+"']"))).click();
        implicitWait(1);
        actionTab();

    }

    @Then("User Selects Procedue as {string}")
    public void userSelectsProcedueAs(String procedue) throws InterruptedException {
        addAppointment.getProcedue().click();
        Thread.sleep(1000);
//        wait(5).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='"+procedue+"']"))).click();
        actionDown();
        actionEnter();
        implicitWait(1);
        actionTab();
    }

    @Then("User Enters reason as {string}")
    public void userEntersReasonAs(String reason) {
        implicitWait(2);
        addAppointment.getReason().sendKeys(reason);
    }

    @Then("User Saves appointment")
    public void userSavesAppointment() {
        implicitWait(2);
        addAppointment.getSaveAppointment().click();
    }
}




