import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinPerimeterRectangleTest {
    @Test
    void solution() {
        //Simple Tests to verify correctness
        assertEquals(22,MinPerimeterRectangle.solution(30));

        assertEquals(8,MinPerimeterRectangle.solution(4));

        assertEquals(16,MinPerimeterRectangle.solution(16));

        assertEquals(26,MinPerimeterRectangle.solution(40));

        assertEquals(4,MinPerimeterRectangle.solution(1));
    }
}