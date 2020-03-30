import org.junit.Assert;
import org.junit.Test;

public class String_CalculatorTest {
    @Test
    public void testForaddition() {
        String_Calculator c=new String_Calculator();
        Assert.assertEquals(c.add("0"),c.add(""));
        Assert.assertEquals(c.add("1,1"),c.add("2"));
        Assert.assertEquals(c.add("1"),c.add("1"));
        Assert.assertEquals(c.add("1,2,3,4"),c.add("10"));
        Assert.assertEquals(c.add("1\n2,3"),c.add("6"));
        Assert.assertEquals(c.add("//;\n1;2"),c.add("3"));
        Assert.assertEquals(c.add("//4\n142"),c.add("3"));
        


    }


}
