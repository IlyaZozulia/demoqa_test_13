package docs;

import static utils.RandomUtils.getRandomEmail;
import static utils.RandomUtils.getRandomString;

public class RandomUtilsExamples {
    public static void main(String[] args) {
        System.out.println("Random string 10: " + getRandomString(10));
        System.out.println(getRandomEmail());
    }
}
