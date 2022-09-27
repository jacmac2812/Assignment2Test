import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class CapitilizeTest {
    @Test
    public void capitilizeTextTest(){
        String capitilize=StringUtillities.capitilize("hej");
        assertEquals(capitilize,"HEJ");
    }
}
