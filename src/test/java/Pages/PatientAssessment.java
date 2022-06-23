package Pages;

import StepDefinitions.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PatientAssessment extends BaseClass {
    public PatientAssessment(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//button[text()='Start Assessment']")
    WebElement assessmentButton;
    public WebElement getAssessmentButton(){
        return assessmentButton;
    }

    @FindBy(xpath = "//*[@id=\"appointmentForm\"]/div/div[2]/div[5]/div/div[2]/div/div/div/div/span[2]")
    WebElement woundStatus;
    public WebElement getWoundStatus(){
        return woundStatus;
    }

    @FindBy(xpath = "//*[@id=\"appointmentForm\"]/div/div[4]/div/div/div[1]/span/div/div/span/input")
    WebElement uploadWound;
    public WebElement getUploadWound(){
        return uploadWound;
    }

    @FindBy(xpath = "//*[@id=\"appointmentForm\"]/div/div[4]/div/div/div[2]/img")
    WebElement bodyImage;
    public WebElement getBodyImage(){
        return bodyImage;
    }

    @FindBy(xpath = "//div[text()='Save']")
    WebElement saveWoundLocation;
    public WebElement getSaveWoundLocation() {
        return saveWoundLocation;
    }

    @FindBy(id = "Right_Leg")
    public WebElement wouldLocation;
    public WebElement getWouldLocation() {
        return wouldLocation;
    }

    @FindBy(id = "new-asssessment_length")
    WebElement assessmentLength;
    public WebElement getAssessmentLength(){
        return assessmentLength;
    }

    @FindBy(id = "new-asssessment_width")
    WebElement assessmentWidth;
    public WebElement getAssessmentWidth(){
        return assessmentWidth;
    }

    @FindBy(id = "new-asssessment_depth")
    WebElement assessmentDepth;
    public WebElement getAssessmentDepth(){
        return assessmentDepth;
    }

    @FindBy(id = "new-asssessment_area")
    WebElement assessmentArea;
    public WebElement getAssessmentArea(){
        return assessmentArea;
    }

    @FindBy(id = "new-asssessment_volume")
    WebElement assessmentVolume;
    public WebElement getAssessmentVolume(){
        return assessmentVolume;
    }

    @FindBy(id = "new-asssessment_size")
    WebElement size;
    public WebElement getSize(){
        return size;
    }

    @FindBy(id = "new-asssessment_wound_type")
    WebElement woundType;
    public WebElement getWoundType(){
        return woundType;
    }

    @FindBy(id = "new-asssessment_stage")
    WebElement assessmentStage;
    public WebElement getAssessmentStage(){
        return assessmentStage;
    }

    @FindBy(id = "new-asssessment_exudate_amount")
    WebElement exudateAmount;
    public WebElement getExudateAmount(){
        return exudateAmount;
    }

//    @FindBy(id = "new-asssessment_wound_side")
    @FindBy(xpath = "//*[@id=\"appointmentForm\"]/div/div[2]/div[2]/div/div[2]/div/div/div/div/span[2]")
    WebElement woundSide;
    public WebElement getWoundSide(){
        return woundSide;
    }

    @FindBy(xpath = "//*[@id=\"appointmentForm\"]/div/div[2]/div[3]/div/div[2]/div/div/div/div/span[2]")
    WebElement woundPosition;
    public WebElement getWoundPosition(){
        return woundPosition;
    }

    @FindBy(id = "new-asssessment_granulation_tissue")
    WebElement granularTissue;
    public WebElement getGranularTissue(){
        return granularTissue;
    }

    @FindBy(id = "new-asssessment_necrotic_tissue")
    WebElement necroticTissue;
    public WebElement getNecroticTissue(){
        return necroticTissue;
    }

    @FindBy(id = "new-asssessment_fibrous_tissue")
    WebElement fibrousTissue;
    public WebElement getFibrousTissue(){
        return fibrousTissue;
    }

    @FindBy(id = "new-asssessment_slough_tissue")
    WebElement sloughTissue;
    public WebElement getSloughTissue(){
        return sloughTissue;
    }

    @FindBy(id = "new-asssessment_eschar_tissue")
    WebElement escharTissue;
    public WebElement getEscharTissue(){
        return escharTissue;
    }

    @FindBy(id = "new-asssessment_conservative_treatment")
    WebElement conservativeTreatment;
    public WebElement getConservativeTreatment(){
        return conservativeTreatment;
    }

    @FindBy(id = "new-asssessment_wound_duration")
    WebElement woundDuration;
    public WebElement getWoundDuration(){
        return woundDuration;
    }

    @FindBy(id = "new-asssessment_wound_condition")
    WebElement woundCondition;
    public WebElement getWoundCondition(){
        return woundCondition;
    }

    @FindBy(id = "new-asssessment_wound_dressing")
    WebElement woundDressing;
    public WebElement getWoundDressing(){
        return woundDressing;
    }

    @FindBy(xpath = "//*[@id=\"#1\"]/div[12]/div/div[2]/div/div/div/div")
    WebElement therapyResponse;
    public WebElement getTherapyResponse(){
        return therapyResponse;
    }

    @FindBy(id = "new-asssessment_wound_edges")
    WebElement woundEdges;
    public WebElement getWoundEdges(){
        return woundEdges;
    }

    @FindBy(id = "new-asssessment_wound_bed")
    WebElement woundBed;
    public WebElement getWoundBed(){
        return woundBed;
    }

    @FindBy(id = "new-asssessment_undermining")
    WebElement assessmentUndermining;
    public WebElement getAssessmentUndermining(){
        return assessmentUndermining;
    }

    @FindBy(id = "new-asssessment_tunneling_size")
    WebElement tunnelingSize;
    public WebElement getTunnelingSize(){
        return tunnelingSize;
    }

    @FindBy(id = "new-asssessment_tunneling_direction")
    WebElement tunnelingDirection;
    public WebElement getTunnelingDirection(){
        return tunnelingDirection;
    }

    @FindBy(id = "new-asssessment_sinus_tract")
    WebElement sinnusTract;
    public WebElement getSinnusTract(){
        return sinnusTract;
    }

    @FindBy(id = "new-asssessment_exposed_structures")
    WebElement exposedStructures;
    public WebElement getExposedStructures(){
        return exposedStructures;
    }

    @FindBy(id = "new-asssessment_periwound_color")
    WebElement periwoundColor;
    public WebElement getPeriwoundColor(){
        return periwoundColor;
    }

    @FindBy(id = "new-asssessment_pain_level")
    WebElement painLevel;
    public WebElement getPainLevel(){
        return painLevel;
    }

    @FindBy(id = "new-asssessment_exudate_type")
    WebElement exudateType;
    public WebElement getExudateType(){
        return exudateType;
    }

    @FindBy(id = "new-asssessment_epithelialization")
    WebElement epithelialization;
    public WebElement getEpithelialization(){
        return epithelialization;
    }

    @FindBy(id = "new-asssessment_odor")
    WebElement odor;
    public WebElement getOdor(){
        return odor;
    }

    @FindBy(id = "new-asssessment_infection")
    WebElement infection;
    public WebElement getInfection(){
        return infection;
    }

    @FindBy(id = "new-asssessment_other_interventions")
    WebElement otherInterventions;
    public WebElement getOtherInterventions(){
        return otherInterventions;
    }

    @FindBy(id = "new-asssessment_other_related_factors")
    WebElement otherRelatedFactors;
    public WebElement getOtherRelatedFactors(){
        return otherRelatedFactors;
    }

    @FindBy(id = "new-asssessment_referral_recommendations")
    WebElement referralRecommendations;
    public WebElement getReferralRecommendations(){
        return referralRecommendations;
    }

    @FindBy(id = "new-asssessment_extra_notes")
    WebElement treatmentFilter;
    public WebElement getTreatmentFilter(){
        return treatmentFilter;
    }

    @FindBy(xpath = "//button[span=' Get Treatment ']")
    WebElement getTreatment;
    public WebElement getGetTreatment(){
        return getTreatment;
    }

    @FindBy(xpath = "//span[text()='search for treatment protocols']/preceding-sibling::span/input")
    WebElement treatmentScenario;
    public WebElement getTreatmentScenario(){
        return treatmentScenario;
    }

    @FindBy(xpath = "//div[text()='Add Treatment order items']")
    WebElement orderItems;
    public WebElement getOrderItems(){
        return orderItems;
    }

    @FindBy(id = "rc_select_28")
    WebElement orderItemField;
    public WebElement getOrderItemField(){
        return orderItemField;
    }

    @FindBy(xpath = "//div[text()='Add Plan of Care items']")
    WebElement planOfCare;
    public WebElement getPlanOfCare(){
        return planOfCare;
    }

    @FindBy(xpath = "//span[text()='Search for plan of care step']/preceding-sibling::span/input")
    WebElement planOfCareField;
    public WebElement getPlanOfCareField(){
        return planOfCareField;
    }

    @FindBy(xpath = "//button[text()='Create Assessment']")
    WebElement createAssessment;
    public WebElement getCreateAssessment(){
        return createAssessment;
    }

    @FindBy(xpath = "//button[text()='Update Assessment']")
    WebElement updateAssessment;
    public WebElement getUpdateAssessment(){
        return updateAssessment;
    }

    @FindBy(xpath = "//*[@id=\"appointmentForm\"]/div/div[2]/div[1]/div/div[2]/div/div/div")
    WebElement procedueDropdown;
    public WebElement getProcedueDropdown(){
        return procedueDropdown;
    }

    @FindBy(id = "new-asssessment_new_length")
    WebElement postDebridementLength;
    public WebElement getPostDebridementLength(){
        return postDebridementLength;
    }

    @FindBy(id = "new-asssessment_new_width")
    WebElement postDebridementWidth;
    public WebElement getPostDebridementWidth(){
        return postDebridementWidth;
    }

    @FindBy(id = "new-asssessment_new_depth")
    WebElement postDebridementDepth;
    public WebElement getPostDebridementDepth(){
        return postDebridementDepth;
    }

    @FindBy(xpath = "//*[@id=\"appointmentForm\"]/div/div[13]/div[1]/div/div[2]/div/div/div/div")
    WebElement rightDp;
    public WebElement getRightDp(){
        return rightDp;
    }

    @FindBy(xpath = "//*[@id=\"appointmentForm\"]/div/div[13]/div[2]/div/div[2]/div/div/div/div")
    WebElement leftDp;
    public WebElement getLeftDp(){
        return leftDp;
    }

    @FindBy(xpath = "//*[@id=\"appointmentForm\"]/div/div[13]/div[3]/div/div[2]/div/div/div/div")
    WebElement rightPt;
    public WebElement getRightPt(){
        return rightPt;
    }

    @FindBy(xpath = "//*[@id=\"appointmentForm\"]/div/div[13]/div[4]/div/div[2]/div/div/div/div")
    WebElement leftPt;
    public WebElement getLeftPt(){
        return leftPt;
    }

    @FindBy(xpath = "//*[@id=\"appointmentForm\"]/div/div[13]/div[5]/div/div[2]/div/div/div/div")
    WebElement skinTemperatureRight;
    public WebElement getSkinTemperatureRight(){
        return skinTemperatureRight;
    }

    @FindBy(xpath = "//*[@id=\"appointmentForm\"]/div/div[13]/div[6]/div/div[2]/div/div/div/div")
    WebElement skinTemperatureLeft;
    public WebElement getSkinTemperatureLeft(){
        return skinTemperatureLeft;
    }

    @FindBy(xpath = "//*[@id=\"appointmentForm\"]/div/div[13]/div[7]/div/div[2]/div/div/div/div")
    WebElement digitalHairRight;
    public WebElement getDigitalHairRight(){
        return digitalHairRight;
    }

    @FindBy(xpath = "//*[@id=\"appointmentForm\"]/div/div[13]/div[8]/div/div[2]/div/div/div/div")
    WebElement digitalHairLeft;
    public WebElement getDigitalHairLeft(){
        return digitalHairLeft;
    }

    @FindBy(xpath = "//*[@id=\"appointmentForm\"]/div/div[15]/div[1]/div/div[2]/div/div/div/div")
    WebElement monofilamentTestingRight;
    public WebElement getMonofilamentTestingRight(){
        return monofilamentTestingRight;
    }

    @FindBy(xpath = "//*[@id=\"appointmentForm\"]/div/div[15]/div[2]/div/div[2]/div/div/div/div")
    WebElement monofilamentTestingLeft;
    public WebElement getMonofilamentTestingLeft(){
        return monofilamentTestingLeft;
    }

    @FindBy(xpath = "//*[@id=\"appointmentForm\"]/div/div[15]/div[3]/div/div[2]/div/div/div/div")
    WebElement pinPrickRight;
    public WebElement getPinPrickRight(){
        return pinPrickRight;
    }

    @FindBy(xpath = "//*[@id=\"appointmentForm\"]/div/div[15]/div[4]/div/div[2]/div/div/div/div")
    WebElement pinPrickLeft;
    public WebElement getPinPrickLeft(){
        return pinPrickLeft;
    }

    @FindBy(xpath = "//*[@id=\"appointmentForm\"]/div/div[15]/div[5]/div/div[2]/div/div/div/div")
    WebElement softTouchRight;
    public WebElement getSoftTouchRight(){
        return softTouchRight;
    }

    @FindBy(xpath = "//*[@id=\"appointmentForm\"]/div/div[15]/div[6]/div/div[2]/div/div/div/div")
    WebElement softTouchLeft;
    public WebElement getSoftTouchLeft(){
        return softTouchLeft;
    }

    @FindBy(id = "new-asssessment_kits_0_product")
    WebElement biologic;
    public WebElement getBiologic(){
        return biologic;
    }

    @FindBy(xpath = "//*[@id=\"appointmentForm\"]/div/div[10]/div[2]/div[2]/div/div[1]/div/div[1]/div/div/div/div/div/div/div")
    WebElement graftsize;
    public WebElement getGraftsize(){
        return graftsize;
    }

    @FindBy(id = "new-asssessment_kits_0_biologic_kits_0_quantity")
    WebElement quantity;
    public WebElement getQuantity(){
        return quantity;
    }

    @FindBy(xpath = "//*[@id=\"appointmentForm\"]/div/div[16]/div[1]/div/div[2]/div/div/div/div")
    WebElement circulation;
    public WebElement getCirculation(){
        return circulation;
    }

    @FindBy(xpath = "//*[@id=\"appointmentForm\"]/div/div[16]/div[2]/div/div[2]/div/div/div/div")
    WebElement neurologic;
    public WebElement getNeurologic(){
        return neurologic;
    }

    @FindBy(id = "new-asssessment_comorbidities")
    WebElement comorbidities;
    public WebElement getComorbidities(){
        return comorbidities;
    }

    @FindBy(id = "new-asssessment_primary_care_physician")
    WebElement physician;
    public WebElement getPhysician(){
        return physician;
    }

    @FindBy(xpath = "//*[@id=\"appointmentForm\"]/div/div[2]/div[6]/div/div[2]/div/div/div/div")
    WebElement treatmentNumber;
    public WebElement getTreatmentNumber(){
        return treatmentNumber;
    }

    @FindBy(xpath = "//*[@id=\"#1\"]/div[12]/div/div[2]/div/div/div/div")
    WebElement anaesthesiaUsed;
    public WebElement getAnaesthesiaUsed() { return anaesthesiaUsed; }

    @FindBy(xpath = "//*[@id=\"#1\"]/div[27]/div/div[2]/div/div/div/div/div")
    WebElement debridementType;
    public WebElement getDebridementType() { return debridementType; }
}
