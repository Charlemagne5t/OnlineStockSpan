import org.junit.Assert;
import org.junit.Test;

public class StockSpannerTest {
    @Test
    public void test1(){
        StockSpanner stockSpanner = new StockSpanner();
        Assert.assertEquals(1, stockSpanner.next(100));
        Assert.assertEquals(1, stockSpanner.next(80));
        Assert.assertEquals(1, stockSpanner.next(60));
        Assert.assertEquals(2, stockSpanner.next(70));
        Assert.assertEquals(1, stockSpanner.next(60));
        Assert.assertEquals(4, stockSpanner.next(75));
        Assert.assertEquals(6, stockSpanner.next(85));
    }
    @Test
    public void test2(){
        StockSpanner stockSpanner = new StockSpanner();
        Assert.assertEquals(1, stockSpanner.next(31));
        Assert.assertEquals(2, stockSpanner.next(41));
        Assert.assertEquals(3, stockSpanner.next(48));
        Assert.assertEquals(4, stockSpanner.next(59));
        Assert.assertEquals(5, stockSpanner.next(79));

    }
}
