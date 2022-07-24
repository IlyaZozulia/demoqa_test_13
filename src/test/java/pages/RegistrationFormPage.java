package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import pages.components.CalenderComponent;
import pages.components.ResultsTableComponent;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.executeJavaScript;

public class RegistrationFormPage {

    CalenderComponent calenderComponent = new CalenderComponent();
    ResultsTableComponent resultsTableComponent = new ResultsTableComponent();

    SelenideElement firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            userEmail = $("#userEmail"),
            genterWrapper = $("#genterWrapper"),
            userNumber = $("[id=userNumber]"),
            subjectNameInput = $("[id=subjectsInput]"),
            subjectNameButton = $("[id=subjectsInput]");

    public RegistrationFormPage openPage(){
        open("/automation-practice-form");
        $(".practice-form-wrapper").shouldHave(text("Student Registration"));
        executeJavaScript("$('footer').remove()");
        executeJavaScript("$('#fixedban').remove()");

        return this;
    }
    public RegistrationFormPage setFirstName(String value){
        firstNameInput.setValue(value);

        return this;
    }

    public RegistrationFormPage setLastName(String value){
        lastNameInput.setValue(value);

        return this;
    }

    public RegistrationFormPage setUserEmail(String value){
        userEmail.setValue(value);

        return this;
    }

    public RegistrationFormPage setUserNumber(String value){
        userNumber.setValue(value);

        return this;
    }

    public RegistrationFormPage setGender(String value){
        genterWrapper.$(byText(value)).click();

        return this;
    }
    public RegistrationFormPage setDateOfBirth(String day, String month, String year){
        $("#dateOfBirthInput").click();
        calenderComponent.setDate(day, month, year);

        return this;
    }
    public RegistrationFormPage setSubjectName(String value){
        subjectNameInput.sendKeys(value);
        subjectNameButton.pressEnter();

        return this;
    }
    public RegistrationFormPage setHobbies(String value){
        $("#hobbiesWrapper").$(byText(value)).click();
        return this;
    }
    public RegistrationFormPage setStreet(String value){
        $("#currentAddress").setValue(value);
        $("#state").click();
        return this;
    }
    public RegistrationFormPage setState(String value){
        $("#stateCity-wrapper").$(byText(value)).click();
        $("#city").click();
        return this;
    }
    public RegistrationFormPage setCity(String value){
        $("#stateCity-wrapper").$(byText(value)).click();
        $("#submit").click();
        return this;
    }

    public RegistrationFormPage checkResult(String key, String value){
        resultsTableComponent.checkResult(key, value);
        return this;
    }


}

