package hsn.hrank;

import org.junit.Assert;
import org.junit.Test;

public class CountingValleysTest {
    @Test
    public void testValleyCounting()
    {
        Assert.assertEquals(1, CVResult.countingValleys(8, "UDDDUDUU"));
        Assert.assertEquals(2, CVResult.countingValleys(12, "DDUUDDUDUUUD"));
        Assert.assertEquals(2, CVResult.countingValleys(10, "DUDDDUUDUU"));
        Assert.assertEquals(2, CVResult.countingValleys(100, "DUDUUUUUUUUDUDDUUDUUDDDUUDDDDDUUDUUUUDDDUUUUUUUDDUDUDUUUDDDDUUDDDUDDDDUUDDUDDUUUDUUUDUUDUDUDDDDDDDDD"));
    }
}
