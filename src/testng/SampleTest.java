package testng;

import org.testng.Assert;

import org.testng.annotations.Test;

public class SampleTest {

    String message = "Hello Universe";

    MessageUtil messageUtil = new MessageUtil(message);


    @Test
    public void testString() {

        String str = "testng is testing";
        Assert.assertEquals("testng is testing1", str);


        /*
         * public void testPrintMessage() {
         * 
         * Assert.assertEquals(message, messageUtil.printMessage());
         * 
         * }
         */
    }


}
