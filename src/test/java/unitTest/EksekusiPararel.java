package unitTest;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

import java.util.concurrent.TimeUnit;

@Execution(ExecutionMode.CONCURRENT)//harus menggunakan annotation ini jika ingin menggunakan fitur running pararel yang sudah kita buat
public class EksekusiPararel {

    // TODO:DIBAWAH INI ADALAH CONTOH RUNNIT UNIT TEST YANG SEQUENTIAL(BERURUTAN), jika menggunakan ini akan memakan banyak waktu karna harus 1 per 1 dulu sehingga total untuk merunning class EksekusiPararel adalah 4x3=12second

    /*

    @Test
    @Timeout(value = 5, unit = TimeUnit.SECONDS)// Ini bertujuan kita untuk menentukan unit test berjalan
    void slowTest1() throws InterruptedException {// TODO: saat menggunakan method sleep maka wajib override try catch
        Thread.sleep(4000);//class Thread.sleep menandakan program ini akan selesai setelah 10 detik
    }

    @Test
    @Timeout(value = 5, unit = TimeUnit.SECONDS)// Ini bertujuan kita untuk menentukan unit test berjalan
    void slowTest2() throws InterruptedException {// TODO: saat menggunakan method sleep maka wajib override try catch
        Thread.sleep(4000);//class Thread.sleep menandakan program ini akan selesai setelah 10 detik
    }

    @Test
    @Timeout(value = 5, unit = TimeUnit.SECONDS)// Ini bertujuan kita untuk menentukan unit test berjalan
    void slowTest3() throws InterruptedException {// TODO: saat menggunakan method sleep maka wajib override try catch
        Thread.sleep(4000);//class Thread.sleep menandakan program ini akan selesai setelah 10 detik
    }

    */



    //TODO: INI ADALAH CONTOH PENGGUNAAN FITUR PARAREL YANG ADA DI JUnit DENGAN SYARAT MENAMBAHKAN @Execution(ExecutionMode.CONCURRENT) PADA CLASSNYA, SETELAH ITU PROGRAM AKAN DIJALANKAN SEKALIGUS


    @Test
    @Timeout(value = 5, unit = TimeUnit.SECONDS)
    void slowTest1() throws InterruptedException {
        Thread.sleep(4000);
    }

    @Test
    @Timeout(value = 5, unit = TimeUnit.SECONDS)
    void slowTest2() throws InterruptedException {
        Thread.sleep(4000);
    }

    @Test
    @Timeout(value = 5, unit = TimeUnit.SECONDS)
    void slowTest3() throws InterruptedException {
        Thread.sleep(4000);
    }






}
