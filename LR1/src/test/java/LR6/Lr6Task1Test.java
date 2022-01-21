package LR6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Lr6Task1Test {

    @Test
    public  void testRepeat1(){
        var result = Task1.repeat(3, 42, Integer[]::new);
        Assertions.assertArrayEquals(new Integer[]{42,42,42},result);
    }
    @Test
    public  void testRepeat2(){
        var result = Task1.repeat(0, 42, Integer[]::new);
        Assertions.assertArrayEquals(new Integer[]{},result);
    }

}