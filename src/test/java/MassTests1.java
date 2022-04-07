import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MassTests1 {
    public static Stream<Arguments> after4() {
        List<Arguments> listArg = new ArrayList<>();
        listArg.add(Arguments.arguments(new int[]{1, 2, 4, 4, 2, 3, 4, 1, 7}, new int[]{1,7}));
        listArg.add(Arguments.arguments(new int[]{1, 2, 4, 4, 2, 4}, new int[]{}));
        listArg.add(Arguments.arguments(new int[]{1, 2, 4, 4, 1, 7, 5, 6, 1}, new int[]{1,7,5,6,1}));
        listArg.add(Arguments.arguments(new int[]{1, 2, 1, 7, 444, 44, 14}, new int[]{}));
        return listArg.stream();
    }
    @ParameterizedTest
    @MethodSource("after4")
    public void testAfter4(int[] in, int[] out) {
        Assertions.assertArrayEquals(out. Main.chekingArr(in));
    }
}
