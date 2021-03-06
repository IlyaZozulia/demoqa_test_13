package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class TextBoxTests {

    @BeforeAll
    static void beforeAll(){
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void successfullTest(){
        String name = "Ilya";

        open("/text-box");
        executeJavaScript("$('footer').remove()");
        executeJavaScript("$('#fixedban').remove()");

        $("[id=userName]").setValue("name");
        $("[id=userEmail]").setValue("ilya93@gmail.com");
        $("[id=currentAddress]").setValue("Some adress 1");
        $("[id=permanentAddress]").setValue("Another adress 2");
        $("[id=submit]").click();

        $("[id=output]").shouldHave(text(name), text("ilya93@gmail.com"), text("Some adress 1"), text("Another adress 2"));






    }
}
