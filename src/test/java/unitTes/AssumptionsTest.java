package unitTes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assumptions.*;

public class AssumptionsTest {

    @Test
    public void testAssumption(){
//        assumeTrue("Fajar".equals(System.getenv("Myname")));// disini kita berasumsi bener gampangnya bener kalo true
        assumeFalse("Ujeh".equals(System.getenv("Myname")));// disini kita berasumsi salah gampangnya bener kalo false



        // menjelankan lanjutan untuk Fajar
    }

}
