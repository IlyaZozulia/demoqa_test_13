package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static tests.TestData.*;

public class RegistrationFormWithPageObjectTests extends TestBase{


    @Test
    void successfullTest() {
        String firstName = "Ivan";
        String lastName = "Pochva";
        String userEmail = "qwerty3006@mailinator.com";
        String userNumber = "3753345474";
        String subjectName = "English";

        registrationFormPage.openPage()
                .setFirstName(FIRST_NAME)
                .setLastName(LAST_NAME)
                .setUserEmail(USER_EMAIL)
                .setUserNumber(USER_NUMBER)
                .setGender(GET_GENDER);

        registrationFormPage.setDateOfBirth("10", "September", "2000");
        registrationFormPage.setSubjectName(SUBJECT_NAME);
        registrationFormPage.setHobbies("Sports");
        registrationFormPage.setHobbies("Music");
        registrationFormPage.setStreet("Street 1");
        registrationFormPage.setState("NCR");
        registrationFormPage.setCity("Delhi");
        registrationFormPage
                .checkResult("Student Name", FIRST_NAME + " " + LAST_NAME)
                .checkResult("Student Email", USER_EMAIL);
                //.checkResult("Date of Birth", "10 September 2000");

    }
}
