import org.junit.Assert;
import org.junit.Test;

public class String_CalculatorTest {
    @Test
    public void testForaddition() {

            String_Calculator.add("1,2,3");


        }




    @Test
    public void name() {
        String_Calculator.add("1,2");
        Assert.assertTrue(true);
    }

    @Test
    public void name5() {
        Assert.assertEquals(3+6, String_Calculator.add("3,6"));
    }

    @Test
    public void name3() {
        Assert.assertEquals(0, String_Calculator.add(""));
    }

    @Test
    public void name4() {
        Assert.assertEquals(3, String_Calculator.add("3"));
    }

    @Test
    public void name6() {
        Assert.assertEquals(3+6+15+18+46+33, String_Calculator.add("3,6,15,18,46,33"));
    }

    @Test
    public void name7() {
        Assert.assertEquals(3+6+15, String_Calculator.add("3,6n15"));
    }

    @Test
    public void name9() {
        String_Calculator.add("3,-6,15,18,46,33");
    }

    @Test
    public void name11() {
        Assert.assertEquals(3+1000+6, String_Calculator.add("3,1000,1001,6,1234"));
    }

    @Test
    public void name10() {
        RuntimeException exception = null;
        try {
            String_Calculator.add("3,-6,15,-18,46,33");
        } catch (RuntimeException e) {
            exception = e;
        }
        Assert.assertNotNull(exception);
        Assert.assertEquals("Negatives not allowed: [-6, -18]", exception.getMessage());
    }

    @Test
    public void name8() {
        Assert.assertEquals(3+6+15, String_Calculator.add("//;n3;6;15"));
    }






}
