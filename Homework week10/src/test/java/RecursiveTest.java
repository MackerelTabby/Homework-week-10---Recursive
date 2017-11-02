import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class RecursiveTest {
    @Test
    public void testPrintEveryOther() throws Exception {
        Recursive peo = new Recursive();
        peo.printEveryOther(new int[] {1,2,3,4,5,6,7,8,9,10}, 2);
    }

    @Test
    public void TestPrintStars() throws Exception {
        Recursive ps = new Recursive();
        assertEquals("Hel*lo" , ps.printStars("Hel*lo"));
    }

}