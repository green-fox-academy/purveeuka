
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumTest {
    Sum sum;
    ArrayList<Integer> list;

   @BeforeEach
    public void init() {
        sum = new Sum();
    }

    @Test
    public void shouldReturnSumWhenArrayHasMultipleElement() {
        list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
       assertEquals(15, sum.sum(list));
    }

    @Test
    public void shouldReturn0WhenArrayIsEmpty() {
        list = new ArrayList<>();
        assertEquals(0, sum.sum(list));
    }

    @Test
    public void shouldReturnSumWhenArrayHasOneElement() {
        list = new ArrayList<>(Arrays.asList(1));
        assertEquals(1, sum.sum(list));
    }

    @Test
    public void shouldReturn0whenArrayIsNull() {
        list = null;
        assertEquals(0, sum.sum(list));
    }
}