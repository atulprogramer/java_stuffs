package testng;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;


public class TestNGSimpleTest {

    @Test
    public void testAdd() {

        String str = "Testng is working fine";
        assertEquals("Testng is working fine", str, "String is not matching");
    }
}
