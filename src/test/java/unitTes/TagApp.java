package unitTes;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;


// dibawah ini adalah contoh pemberian tag pada class
@Tags({
        @Tag("Integration")
})
public class TagApp {


    @Test
    @Tag("test1tag")
    void test1() {

    }


    @Test
    @Tag("test2tag")
    void test2() {

    }
}
