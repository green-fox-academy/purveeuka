import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class SharpieTest {

    @Test
    public void sharpieAdd_WithRedColorAndTenWidth() {
        Sharpie sharpie = new Sharpie("red", 10f);
        assertEquals("red", sharpie.color);
    }

    @Test
    public void useWithFullInkAmountSharpie(){
        Sharpie sharpie = new Sharpie("red", 10f);
        sharpie.use();
        assertEquals(90, sharpie.inkAmount);
    }
    @Test
    public void useTenTimesUse(){
        Sharpie sharpie = new Sharpie("black", 10f);

        for (int i = 0; i < 10; i++) {
            sharpie.use();
        }

        assertEquals(0, sharpie.inkAmount);
    }

    @Test
    public void exceedingUse(){
        Sharpie sharpie = new Sharpie("brown", 10);

        for (int i = 0; i < 11; i++) {
            sharpie.use();
        }

        assertEquals(0, sharpie.inkAmount);
    }

    @Test
    public void useSharpieWithNullColor(){
        Sharpie sharpie = new Sharpie(null, 10);
        assertNull(sharpie.color);
    }

    @Test
    public void sharpieWith0WidthReturnException(){
        Sharpie sharpie = new Sharpie(null, 0);
        Class<NullPointerException> expected;
        expected = NullPointerException.class;

        sharpie.use();
    }
}
