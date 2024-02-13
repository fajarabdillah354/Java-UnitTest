package unitTes;

import org.junit.jupiter.api.*;

@Tags({
        @Tag("EksekusiTest")
})
//@TestMethodOrder(MethodOrderer.MethodName.class)// jika kita menggunakan MethodName maka hasi test akan diurut berdasarkan hurufnya
//@TestMethodOrder(MethodOrderer.Random.class)// ketika menggunakan method ini maka hasilnya akan random dalam artian kita tidak bisa menentukan urutannya

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)// jika kita menggunakan OrderAnnotation maka kita dapat menentukan urutan methodnya
public class EksekusiTestApp {

    /*
    dalam unit test setiap method hanya boleh menggunakan
     */


    private String temp;
    @Test
    @Order(2)
    void name1() {
        temp = "fajar abdillah ahmad";
    }

    @Test// nilai dari test ini akan null karna  dalam unit test tidak memakai object yang sama lalu di panggil, lifecyclenya independen antar method yaitu tidak ada hubunganya ketika kalian set di method mana lalu di method lain kalian panggil
    @Order(3)
    void name2() {
        System.out.println(temp);
    }


    // JIKA MENGGUNAKAN METHODNAME



    @Order(1)
    @Test
    void name3() {

    }
}
