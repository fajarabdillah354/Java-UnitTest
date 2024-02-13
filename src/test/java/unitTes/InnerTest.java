package unitTes;

import org.junit.jupiter.api.*;

import java.util.LinkedList;
import java.util.Queue;

@DisplayName("A Queue")
public class InnerTest {

    private Queue<String> queue;

    @Nested
    @DisplayName("when new")
    public class WhenNew{

        @BeforeEach
        void setUp() {
            queue = new LinkedList<>();
        }

        @Test
        @DisplayName("when offer, size must be 1")
        void size1() {
            queue.offer("fajar");
            Assertions.assertEquals(1, queue.size());
        }

        @Test
        @DisplayName("when offer again, size must be 2")
        public void size2 () {
            queue.offer("ujeh");
            queue.offer("abdillah");
            Assertions.assertEquals(2, queue.size());
        }
    }
    
}
