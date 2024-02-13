package unitTes;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

/**
 kita bisa melakukan testing berdasarkan kondisi tertentu seperti di bawah ini
 */

public class TestKondisi {

    /**
     Kondisi berdasarkan system operasi,
     */

    @Test
    @EnabledOnOs(OS.MAC)//kita juga bisa memasukan beberap OS sekaligus dengan array ex @EnabledOnOs(value ={isi OS})
//    @DisplayName("testOsWindows")
    public void testEnableOsMac(){

    }

    @Test
    @EnabledOnOs(OS.WINDOWS)
    public void testEnableOnWindows(){

    }


    @Test
    @DisabledOnOs({OS.MAC,OS.LINUX})// kita bisa mengisinya dengan array
    public void testDisable(){

    }


    /**
     Kondisi berdasarkan JRE atau Versi Java yang digunakan

     */

    @Test
    @EnabledForJreRange(min = JRE.JAVA_11,max = JRE.JAVA_19) //ini contoh yang menggunakan range dalam enablednya
    public void onlyRunOnJava(){

    }


    @Test
    @DisabledForJreRange(min = JRE.JAVA_8, max = JRE.JAVA_14)
    public void onlyRunOnJavaVersi(){

    }


    @Test
    @EnabledOnJre(JRE.JAVA_8)// ini contoh yang tidak menggunakan range
    void testEnableOnJava8() {

    }


    @Test
    @DisabledOnJre(JRE.JAVA_8)
    void testDisableOnJava19() {

    }


    @Test
    @EnabledForJreRange(min = JRE.JAVA_11,max = JRE.JAVA_19)
    void testEnableOnJava11to15() {
    }


    @Test
    @DisabledForJreRange(min = JRE.JAVA_11,max = JRE.JAVA_19)
    void testDisableOnJava11to15() {
    }


    /**
     Kondisi berdasarkan System Property yang digunakan
     */

   @Test
   @EnabledIfSystemProperties({
           @EnabledIfSystemProperty(named = "java.vendor", matches = "Oracle Corporation")
   })
    public void testEnableOnJavaVendorOracle(){

    }

    @Test
    @DisabledIfSystemProperties({//jika akhirnya menggunakan Properties kita boleh masukkanya lebih dari 1 dengan array
            @DisabledIfSystemProperty(named = "java.vendor", matches = "Oracle Corporation")

    })
    public void testDisableOnJavaVendorOracle(){

    }



    // test kondisi enviroment variable

    @Test
    @EnabledIfEnvironmentVariables({
            @EnabledIfEnvironmentVariable(named = "PROFILE",matches = "DEV")
    })
    public void testEnableEnviromentVariable(){

    }


    @Test
    @DisabledIfEnvironmentVariables({
            @DisabledIfEnvironmentVariable(named = "PROFILE", matches = "DEV")
    })
    public void testDisableEnviromentVariabel(){

    }









}
