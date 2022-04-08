package TestSomeMethods;

import lesson6.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Testing {
    @Test
    public void test1() {
        int[] in = new int[] {1,3,4,5,5,6,8};
        int[] out = new int[] {5,5,6,8};
        Assertions.assertArrayEquals(out, Main.checkingArr(in));
    }
    @Test
    public void test2() {
        int[] in = new int[]{1,3,5,5,6,8};
        Assertions.assertThrows(RuntimeException.class, ()->{
            Main.checkingArr2(in);
        });
    }
}
