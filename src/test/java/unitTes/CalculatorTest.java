package unitTes;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.function.Executable;
import org.opentest4j.TestAbortedException;
import unitTes.generator.GeneratorDisplay;
import static org.junit.jupiter.api.Assumptions.*;

import static org.junit.jupiter.api.Assertions.*;

//kita bisa membuat displayName saat unit tes dijalankan, ada 2 cara yang pertama langsung dengan membuat annotation displayName yang kedua dengan menggunakan interface DisplayNameGenerator
/*
ketika kita menggunakan display name maka ketika program running akan menampil name yang sudah kita set sebelumnya
 */

//@DisplayName("Test Class Calculator")
@Tag("Calculator-Test")
@DisplayNameGeneration(GeneratorDisplay.class)
public class CalculatorTest {

    private Calculator calculator = new Calculator();


    // BEFOREACH DAN AFTEREACH, KITA JUGA BISA MENGGUNAKAN BEFOREALL DAN AFTERALL(kalo ini harus menggunakan static)

    //BEROFE AFTER EACH
    @BeforeEach
    public void setUp(){

        System.out.println("Before");
    }

    @BeforeEach
    public void calmDown(){

        System.out.println("After");
    }

    // BEFORE AFTER ALL(HARUS STATIC)
    @BeforeAll
    public static void beforeAll(){

        System.out.println("beforeALL running");
    }

    @AfterAll
    public static void afterAll(){

        System.out.println("afterAll running");
    }


    //MENGGUNAKAN TESTABORTEDEXCEPTION, jika terdapat env Profile dengan value DEV maka program akan berjalan
    @Test
    public void testAborted(){
        var getEnv = System.getenv("Profile");
        if (!"DEV".equals(getEnv)){
            throw new TestAbortedException("env DEV tidak ditemukan");
        }
        // ini akan berjalan karna dalam config name Profile dan value DEV tersedia
    }

    // cara selain aborted yaitu cara yang tidak manual dengan menggunakan Assumtions
    @Test
    public void testUnAborted(){
        assumeTrue("cebol".equals(System.getenv("Profile")));

    }




//    @DisplayName("Test addSuccess Method")
    @Test
    public void testAddSuccess(){
        var result = calculator.add(11,10);
        /*
        assertEquals digunakan untuk mengetes sebuah data harus dengan ekspetasi yang kita mau harus menggunakan assertEquals
         */
        assertEquals(21,result);
    }


    /*
    kita dapat mengetes dengan ber anggapan jika terjadi salah dengan assertThrows
     */

//    @DisplayName("Test failedDivide")
    @Test
    public void testDivideFailed(){

        assertThrows(IllegalArgumentException.class,() -> {
            // justru kalo disini tidak error maka akan gagal karna kita ber anggapan terjadi error pada program kita
            calculator.divide(10,0);
        });
    }

//    @DisplayName("Test successDivide")
    @Test
    public void testDivideSucces(){
        var result = calculator.divide(50,5);
        assertEquals(10,result);
    }



    // MENDISBLE UNIT TEST
    @Test
    @Disabled
    public void testMultiple(){

    }







}
