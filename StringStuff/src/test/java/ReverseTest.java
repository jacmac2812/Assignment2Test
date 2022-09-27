import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseTest {

    @Test
    public void reverseTextTest(){
        String reversed=StringUtillities.reverseText("hej");
        assertEquals(reversed,"jeh");
    }
}
