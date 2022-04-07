import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MassTest2 {
    public static Stream<Arguments> argumentsStream() {
        List<Arguments> argumentsList = new ArrayList<>();
        argumentsList.add(new int[]{1, 1, 1, 4, 4, 1, 4, 4 }, true));
        argumentsList.add(new int[]{1, 1, 1, 1, 1, 1 }, false));
        argumentsList.add(new int[]{4,4,4,4 }, false));
        argumentsList.add(new int[]{1, 4, 4, 1, 1, 4, 3}, false));
    }
    @ParameterizedTest
    @MethodSource("argumentsStream")
    public void massTest2(int[] in, boolean out) {
        Assertions.assertEquals(out, Main.checkingArr2(in));
    }
}
