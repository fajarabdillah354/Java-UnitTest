package unitTest.Resolver;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import unitTest.AbstractCalculatorTest;

import java.util.List;
import java.util.Random;

//@Extensions({
//        @ExtendWith(RandomParameterResolver.class)
//})// kalo kita hapus extention ini maka program akan error karna Class Random blm di inject

public class CobaParemeterResolver extends AbstractCalculatorTest {

    @Test
    void InjectDependencyRandom(Random random) {// untuk random tetep akan dapat karna di parent ada Extentions Random...
        var a = random.nextInt();
        var b = random.nextInt();
        var result = calculator.add(a,b);
        var expected = result;
        Assertions.assertEquals(expected,result);
    }

//    INI ADALAH CONTOH TEST BERULANG
    @DisplayName("testRandom")//kita bisa gunakan @DisplayName jika {displayName} mau di costum
    @RepeatedTest(
        value = 10,//ini akan menjadi banyak total repetisi test
        name = "{displayName} ke {currentRepetition} dari total {totalRepetitions}"//ini bagian tentang spesifiknya berualang
    )
    void testRepetion(Random random) {// untuk random tetep akan dapat karna di parent ada Extentions Random...
        var a = random.nextInt();
        var b = random.nextInt();
        var result = calculator.add(a,b);
        var expected = result;
        Assertions.assertEquals(expected,result);



    }


    @DisplayName("testRandomWithRepetitionsInfo")//kita bisa gunakan @DisplayName jika {displayName} mau di costum
    @RepeatedTest(
            value = 10,name = "{displayName}"
    )
    // kita bisa meng Inject RepetitionInfo dan TestInfo untuk mendapatka totaltest dan testsaat ini
    void testRepetionInfo(Random random, RepetitionInfo repetitionInfo, TestInfo info) {// untuk random tetep akan dapat karna di parent ada Extentions Random...
        System.out.println(info.getDisplayName()+"ke "+repetitionInfo.getCurrentRepetition()+"dari total "+repetitionInfo.getTotalRepetitions());
        var a = random.nextInt();
        var b = random.nextInt();
        var result = calculator.add(a,b);
        var expected = result;
        Assertions.assertEquals(expected,result);

    }



//    PENGGUNAAN PARAMETERIZED(CARA JIKA PARAMETERRESOLVER KITA TERLALU BANYAK) INI JIKA KITA TERLALU BANYAK MENG INJEC
    @DisplayName("testParameterized")
    @ParameterizedTest(name = "{displayName} dengan parameter {0}")
    @ValueSource(ints = {1,2,45,5,7,10,100})// ini adalah contoh dari valueSource

    /**
     Hasilnya program akan menampilkan test dengan masing2 parameter yang telah kita tulih di @ValueSource
     */
    void testParameterized(int value){
        var expeted = value + value;
        var result = calculator.add(value,value);
        Assertions.assertEquals(expeted,result);

    }


    public static List<Integer> testParameterizedMethod() {// kita harus membuat variable sebagai nama method yang nanti akan dipanggil di @MethodSource
        return List.of(1,2,4,5,6,7,10);
    }

    @DisplayName("testParameterized")
    @ParameterizedTest(name = "{displayName} dengan parameter {0}")
    @MethodSource("testParameterizedMethod")// ini adalah contoh penggunaann @MethodSource nama ini harus sama dengan nama method yang sudah kita buat(pastikan dulu sudah terbuat)

    /**
     Hasilnya program akan menampilkan test dengan masing2 parameter yang telah kita tulih di @ValueSource
     */
    void testParameterizedMethon(int value){
        var expeted = value + value;
        var result = calculator.add(value,value);
        Assertions.assertEquals(expeted,result);

    }



}
