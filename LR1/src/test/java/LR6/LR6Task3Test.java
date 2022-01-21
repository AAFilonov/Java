package LR6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Lr6Task3Test {

    @Test
    public void testRepeat1() {
        var result = Task3.repeat(3, 1);
        Assertions.assertArrayEquals(new Integer[]{1, 1, 1}, result);
    }

    @Test
    public void testRepeat2() {
        var result = Task3.repeat(3, 1, 2, 3);
        Assertions.assertArrayEquals(new Integer[]{1, 2, 3}, result);
    }

    @Test
    public void testRepeat3() {
        var result = Task3.repeat(6, 1, 2, 3);
        Assertions.assertArrayEquals(new Integer[]{1, 2, 3, 1, 2, 3}, result);
    }
    @Test
    public void testRepeat4() {
        var result = Task3.repeat(4, 1, 2, 3);
        Assertions.assertArrayEquals(new Integer[]{1, 2, 3, 1}, result);
    }
    @Test
    public void testRepeat_WhenN_IsZero() {
        //те передается массив для расширения, при n=0 должно вернуть сам массив
        var result = Task3.repeat(0, 1, 2, 3);
        Assertions.assertArrayEquals(new Integer[]{1, 2, 3}, result);
    }


}