package unitTes.Resolver;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.Extensions;
import unitTes.Calculator;

import java.util.Random;

@Extensions({
        @ExtendWith(RandomParameterResolver.class)
})// kalo kita hapus extention ini maka program akan error karna Class Random blm di inject

public class CobaParemeterResolver {
    Calculator calculator = new Calculator();
    @Test
    void InjectDependencyRandom(Random random) {
        var a = random.nextInt();
        var b = random.nextInt();
        var result = calculator.add(a,b);
        var expected = result;
        Assertions.assertEquals(expected,result);
    }
}
