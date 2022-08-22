package testng;

import org.testng.annotations.Test;

public class GroupTestExample {

    String message = ".com";
    MessageUtil messageUtil = new MessageUtil(message);


    @Test(groups = { "functest", "checkintest" })

    public void testPrintMessage() {

        System.out.println("This is testPrintMessage method");

    }

    @Test(groups = { "functest" })
    public void testSignInfunction() {

        System.out.println("this is signinfunction testing method");

    }

    @Test(groups = { "checkintest" })
    public void testSmokefunction() {

        System.out.println("this is Smoke testing method");

    }
}