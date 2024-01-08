package guru.qa;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SimpleJUnitTest {

  @BeforeAll
    static void beforeAll() {
        System.out.println("### @BeforeAll\n");
    }

    @AfterAll
    static void AfterAll() {
        System.out.println("###     @AfterAll");
    }

@BeforeEach
void beforeEach() {
 System.out.println("###     @BeforeEach");
}

    @AfterEach
    void afterEach() {
        System.out.println("###       @AfterEach\n");
    }

    @Test
    void firstTest() {
        System.out.println("###             @Test firstTest\n");
        Assertions.assertTrue(2 * 2 == 4);
    }

    @Test
    void secondTest() {
        System.out.println("###                @Test secondTest\n");
        Assertions.assertTrue(2 + 2 == 4);
    }

}