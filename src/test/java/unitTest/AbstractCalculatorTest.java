package unitTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.Extensions;
import unitTest.Resolver.RandomParameterResolver;

@Extensions({
        @ExtendWith(RandomParameterResolver.class)//membuat parent dengan class RandomParameter...
})
public class AbstractCalculatorTest {
    protected Calculator calculator = new Calculator();

    @BeforeEach
    void setUp(){
        System.out.println("BEFORE EACH");
    }
    /**
     saat program kita jalankann maka semua class  yang merupakan child dari class ini akan berjalan dan akan menampilkan BEFORE EACH
     */

}
