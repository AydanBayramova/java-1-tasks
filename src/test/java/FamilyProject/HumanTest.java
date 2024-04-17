package FamilyProject;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class HumanTest {
    @Test
    @DisplayName("Test toString")
    void toStringTest() {
        Human mother = new Human("Jane", "watson", LocalDate.of(1980, 9, 7));
        String test="Human{name='Jane', surname='watson', birthDate=1980-09-07, iqLevel=0.0, schedule=null, family=null}";
        assertEquals(test,mother.toString());
    }
}
