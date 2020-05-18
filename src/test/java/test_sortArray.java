import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class test_sortArray {
    @Test
    public void exampleTest1() {
//        int aux[] = orderArray.sortArray(new int[]{ 5, 3, 2, 8, 1, 4 });
//        for (int i = 0; i<aux.length; i++){
//            System.out.println(aux[i]);
//        }
        assertArrayEquals(new int[]{ 1, 3, 2, 8, 5, 4 }, orderArray.sortArray(new int[]{ 5, 3, 2, 8, 1, 4 }));
    }

    @Test
    public void exampleTest2() {
        assertArrayEquals(new int[]{ 1, 3, 5, 8, 0 }, orderArray.sortArray(new int[]{ 5, 3, 1, 8, 0 }));
    }

    @Test
    public void exampleTest3() {
        assertArrayEquals(new int[]{}, orderArray.sortArray(new int[]{}));
    }
}
