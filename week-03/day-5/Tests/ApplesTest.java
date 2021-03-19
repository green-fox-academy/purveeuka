
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ApplesTest {

    @Test
    public void TestgetApple() {
        Apples greenApple = new Apples("apple");
        assertEquals("apple", greenApple.getApple());
    }
}