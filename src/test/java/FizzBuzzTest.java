import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzTest {

    @Test
    void fizzBuzzTestFor4(){
        // GIVEN
        int number = 4;

        // WHEN
        String actual = FizzBuzz.fizzBuzz(number);

        // THEN
        assertEquals("4", actual);
    }

}
