package unitTest;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

public class IntroMockito {


    /*
    ENAKNYA MEMBUAT MOCKING(OBJECT TIRUAN) KITA BISA MENAMBAHKAN BEHAVIOR APAPUN YANG KITA MAU KEPADA OBJECT TERSEBUT, INI SANGAT COCOK KETIKA MEMBUAT UNIT DIMANA CLASS YANG AKAN KITA TEST BUTUH CLASS YANG LAIN,KEBUTUHAN KELAS LAIN TERSEBUT KITA BISA MEMBUAT OBJECT TIRUANNYA DENGAN MOCKITO
     */
    @Test
    void testMock(){
        List<String> list = Mockito.mock(List.class);//Pembuatan mocking class pada List(class tiruan)

        Mockito.when(list.get(0)).thenReturn("fajar");//menambah behavior ke Mock object
        Mockito.when(list.get(10)).thenReturn("abdillah");



        System.out.println(list.get(0));//Test Mock
        System.out.println(list.get(10));


        //Untuk memverifikasi berapa kali method dipanggil, ini hanya untuk menjaga2 jika kode kita hanya boleh memanggil suatu method sekali dengan ini akan terlihat jika memanggil 2x
        Mockito.verify(list, Mockito.times(1)).get(0);//verify pada Mock untuk  method get(0) sehingga method ini tidak bisa dipanggil lebih dari sekali
    }



}
