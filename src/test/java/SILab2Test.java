import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class SILab2Test {

    @Test
    public void testMultipleCondition() {


        List<Item> items1 = new ArrayList<>().reversed();
        items1.add(new Item("Item1", "0123456789", 250, 0.1f));
        assertTrue(SILab2.checkCart(items1, 500));


        List<Item> items2 = new ArrayList<>().reversed();
        items2.add(new Item("Item2", "0123456789", 400, 0.0f));
        assertTrue(SILab2.checkCart(items2, 500));


        List<Item> items3 = new ArrayList<>().reversed();
        items3.add(new Item("Item3", "1123456789", 320, 0.1f));
        assertTrue(SILab2.checkCart(items3, 400));


        List<Item> items4 = new ArrayList<>().reversed();
        items4.add(new Item("Item4", "0123456789", 350, 0.05f));
        assertTrue(SILab2.checkCart(items4, 350));
    }
}
