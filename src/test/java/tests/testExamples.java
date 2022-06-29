package tests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class testExamples {

    @BeforeAll
    static  void beforeAll(){
        System.out.println("something before all tests");
    }

    @Test
    void firstTest(){
        System.out.println("Started firstTest");
    }

    @Test
    void secondTest(){
        System.out.println("Started secondTest");
    }

    @AfterAll
    static  void afterAll(){
        System.out.println("something after all tests");
    }

}
