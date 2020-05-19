import org.junit.Test;
import static org.junit.Assert.assertEquals;

    public final class test_FirstNonConsecutive {
        @Test public void basicTests() {
            assertEquals(Integer.valueOf(6), FirstNonConsecutive.find1(new int[]{1, 2, 3, 4, 6, 7, 8}));
            assertEquals(null, FirstNonConsecutive.find1(new int[]{1, 2, 3, 4, 5, 6, 7, 8}));
            assertEquals(Integer.valueOf(6), FirstNonConsecutive.find1(new int[]{4, 6, 7, 8, 9, 11}));
            assertEquals(Integer.valueOf(11), FirstNonConsecutive.find1(new int[]{4, 5, 6, 7, 8, 9, 11}));
            assertEquals(null, FirstNonConsecutive.find1(new int[]{31, 32}));
            assertEquals(Integer.valueOf(0), FirstNonConsecutive.find1(new int[]{-3, -2, 0, 1}));
            assertEquals(Integer.valueOf(-1), FirstNonConsecutive.find1(new int[]{-5, -4, -3, -1}));
        }
}
