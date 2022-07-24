package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class RegistrationFormWithPageObjectTests extends TestBase{


    @Test
    void successfullTest() {
        String firstName = "Ivan";
        String lastName = "Pochva";
        String userEmail = "qwerty3006@mailinator.com";
        String userNumber = "3753345474";
        String subjectName = "English";

        registrationFormPage.openPage()
                .setFirstName(firstName)
                .setLastName(lastName)
                .setUserEmail(userEmail)
                .setUserNumber(userNumber)
                .setGender("Male");

        registrationFormPage.setDateOfBirth("10", "September", "2000");
        registrationFormPage.setSubjectName(subjectName);
        registrationFormPage.setHobbies("Sports");
        registrationFormPage.setHobbies("Music");
        registrationFormPage.setStreet("Street 1");
        registrationFormPage.setState("NCR");
        registrationFormPage.setCity("Delhi");
        registrationFormPage
                .checkResult("Student Name", firstName + " " + lastName)
                .checkResult("Student Email", userEmail);
                //.checkResult("Date of Birth", "10 September 2000");

    }
}
