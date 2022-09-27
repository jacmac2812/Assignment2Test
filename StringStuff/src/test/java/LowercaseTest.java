import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class LowercaseTest {
    @Test
    public void LowercaseTextTest(){
        String lowercase=StringUtillities.lowercase("HELLO");
        assertEquals("hello",lowercase);
    }
}
