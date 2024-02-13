package unitTes;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;

/*
jika kita ingin mengatasi masalah ini kita harus menggunakan  TestInstance dengan value Lifecycle.PER_CLASS karna ini  secara default adalah Lifecycle.PER_METHOD
 */

@Tags({
        @Tag("lifecycle")
})
@TestInstance(value = TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)// PENGGUNAAN ORDER ANNTOTATION(jika ini OrderAnnotation harus menambahkan alphanumeric pada tiap2 methodnya
public class LifecycleTest {

    private Integer counter=0;

    @BeforeAll
    void beforeAll() {// kita bisa tanpa menggunakan static method

    }

    @AfterAll
    void afterAll() {

    }

    /**
     berikut adalah contoh penggunaan order dalam test membuat kita bisa menentukan mana test yang ingin di running dahulu
     */
    @Test
    @Order(2) // akan dirunning urutan ke dua
    void hitung1() {

        /*
        secara default kita membuat 3 object berbeda sehingga kita tidak bisa terhubung antara ke tiga method ini

        contoh;
        LifecycleTest test1 = new LifecycleTest;
        test1.hitung1()

        LifecycleTest test2 = new LifecycleTest;
        test2.hitung2()

        LifecycleTest test3 = new LifecycleTest;
        test3.hitung3()

        diatas adalah pembuatan object untuk masing2 test method, jika kita print maka hasilnya 1 semua
         */

        counter++;
        System.out.println(counter);
    }

    @Test
    @Order(1)// akan dirunning urutan pertama
    void hitung2() {

        counter++;
        System.out.println(counter);
    }


    @Test
    @Order(3)//akan dirunning urutan ketiga
    void hitung3() {

        counter++;
        System.out.println(counter);

    }


}
