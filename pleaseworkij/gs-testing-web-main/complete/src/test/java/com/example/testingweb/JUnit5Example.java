package com.example.testingweb;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.stream.Stream;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class JUnit5Example {

    // Before all tests - runs once before all test methods in the current class
    @BeforeAll
    static void initAll() {
        System.out.println("Before all tests.");
    }

    // Before each test - runs before each test method
    @BeforeEach
    void init() {
        System.out.println("Before each test.");
    }

    // Simple test method with assertion
    @Test
    void simpleTest() {
        System.out.println("Running simple test...");
        assertEquals(4, 2 + 2, "2 + 2 should equal 4");
    }

    // Test with assertThrows for exception testing
    @Test
    void testThrowsException() {
        System.out.println("Running exception test...");
        assertThrows(IllegalArgumentException.class, () -> {
            throw new IllegalArgumentException("Invalid Argument");
        }, "Should throw IllegalArgumentException");
    }

    // Test with assumptions (will skip test if the assumption fails)
    @Test
    void testAssumptions() {
        System.out.println("Running assumption test...");
        Assumptions.assumeTrue("production".equals(System.getenv("ENV")), "Skipping test unless 'ENV' is production.");
        assertEquals(1, 1);
    }

    // Test with parameterized inputs
    @ParameterizedTest
    @CsvSource({"1, 2, 3", "4, 5, 9", "7, 3, 10"})
    void parameterizedTest(int a, int b, int sum) {
        System.out.println("Running parameterized test...");
        assertEquals(sum, a + b);
    }

    // Nested tests to organize related tests together
    @Nested
    @DisplayName("Nested Test Suite")
    class NestedTests {

        @Test
        void nestedTest1() {
            System.out.println("Running nested test 1...");
            assertTrue(2 > 1, "2 is greater than 1");
        }

        @Test
        void nestedTest2() {
            System.out.println("Running nested test 2...");
            assertFalse(1 > 2, "1 is not greater than 2");
        }
    }

    // After each test - runs after each test method
    @AfterEach
    void tearDown() {
        System.out.println("After each test.");
    }

    // After all tests - runs once after all tests in the current class
    @AfterAll
    static void tearDownAll() {
        System.out.println("After all tests.");
    }

    // Dynamic tests (example of using dynamic test generation)
    @TestFactory
    Stream<DynamicTest> dynamicTests() {
        return Stream.of(
                DynamicTest.dynamicTest("Dynamic Test 1", () -> assertEquals(1, 1)),
                DynamicTest.dynamicTest("Dynamic Test 2", () -> assertTrue(2 > 1))
        );
    }
}

/*
@BeforeAll: This is a static method that runs once before all test methods in the class. It's useful for initializing shared resources that need to be set up before any tests run.

@BeforeEach: This runs before each test method. It's typically used for setting up state or mock objects before each test.

@Test: The core annotation used to mark a method as a test. The method can contain assertions to verify if the behavior is correct.

Assertions:

assertEquals(expected, actual) checks that two values are equal.
assertThrows verifies that the expected exception is thrown.
assertTrue and assertFalse check if conditions are true or false, respectively.
@Assumptions: Assumptions.assumeTrue(condition) is used to skip a test if the assumption fails (in this case, it depends on the environment variable ENV being "production"). If the assumption fails, the test is skipped instead of failing.

@ParameterizedTest: This is used to run the same test with different input values. Here, @CsvSource provides data to the test method, testing multiple combinations of values.

@Nested: This allows grouping related tests together in a nested structure. This helps in organizing tests that are logically grouped, keeping the test suite readable.

@AfterEach: Runs after each test method. It's typically used for cleanup activities (like resetting state or closing resources).

@AfterAll: A static method that runs once after all tests in the class. It is useful for cleaning up shared resources.

@TestFactory: This creates dynamic tests at runtime. Unlike static tests (which are defined upfront), dynamic tests are generated dynamically using Java streams. Each test is defined as a DynamicTest.


Before all tests, the initAll() method runs once.
Before each test, init() will execute before each test method.

Each test will execute:
simpleTest: Verifies basic addition.
testThrowsException: Verifies that an exception is thrown when expected.
testAssumptions: Assumes a certain condition is true, and if not, skips the test.
parameterizedTest: Runs with various combinations of input parameters.
NestedTests: Nested tests verify basic conditions related to logical assertions.
After each test, tearDown() runs.
After all tests, tearDownAll() runs once.

Dynamic tests are generated and executed from dynamicTests().

*/

