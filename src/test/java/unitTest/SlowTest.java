package unitTest;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

public class SlowTest {

    @Test
    @Timeout(value = 5, unit = TimeUnit.SECONDS)// Ini bertujuan kita untuk menentukan unit test berjalan
    void slowTest() throws InterruptedException {// TODO: saat menggunakan method sleep maka wajib override try catch
        Thread.sleep(10_000);//class Thread.sleep menandakan program ini akan selesai setelah 10 detik
    }


    /**
     @author fajar01
     saat kita merunning program maka setelah 5 second jika program belum selesai maka akan throw error Interrep...
     */
}
