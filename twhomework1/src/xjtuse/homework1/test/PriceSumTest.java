package xjtuse.homework1.test;

import org.junit.Test;
import xjtuse.homework1.code.PriceSum;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: nex
 * Date: 5/18/12
 * Time: 5:39 AM
 * To change this template use File | Settings | File Templates.
 */
public class PriceSumTest {

    @Test
    public void test() {
        PriceSum priceSum =new PriceSum();
        assertEquals(0, priceSum.price(""));
        assertEquals(50, priceSum.price("A"));
        assertEquals(80, priceSum.price("AB"));
        assertEquals(115, priceSum.price("CDBA"));

        assertEquals(100, priceSum.price("AA"));

        System.out.println(priceSum.price("AAA"));
        assertEquals(130, priceSum.price("AAA"));

        assertEquals(180, priceSum.price("AAAA"));
        assertEquals(230, priceSum.price("AAAAA"));
        assertEquals(260, priceSum.price("AAAAAA"));

        assertEquals(160, priceSum.price("AAAB"));
        assertEquals(175, priceSum.price("AAABB"));
        assertEquals(190, priceSum.price("AAABBD"));
        assertEquals(190, priceSum.price("DABABA"));
        //fail("Not yet implemented");
    }

}
