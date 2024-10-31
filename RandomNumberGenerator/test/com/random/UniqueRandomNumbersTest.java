package com.random;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class UniqueRandomNumbersTest {

    private UniqueRandomNumbers uniqueRandomNumbers;
    private List<Integer> randomList;

    @BeforeEach
    void setUp() {
        uniqueRandomNumbers = new UniqueRandomNumbers();
        randomList = uniqueRandomNumbers.generateRandomList(10_000);
    }

    @Test
    void testListSize() {
        // Test that the list has exactly 10,000 elements
        assertEquals(10_000, randomList.size(), "The list should contain 10,000 elements.");
    }

    @Test
    void testUniqueness() {
        // Test that all elements in the list are unique
        Set<Integer> uniqueNumbers = new HashSet<>(randomList);
        assertEquals(10_000, uniqueNumbers.size(), "The list should contain 10,000 unique elements.");
    }

    @Test
    void testRange() {
        // Test that all elements are within the specified range [1, 10,000]
        assertTrue(randomList.stream().allMatch(num -> num >= 1 && num <= 10_000),
                   "All elements should be within the range 1 to 10,000.");
    }

    @Test
    void testRandomOrder() {
        // Test randomness by generating another list and ensuring it's not in the same order
        List<Integer> anotherRandomList = uniqueRandomNumbers.generateRandomList(10_000);
        assertNotEquals(randomList, anotherRandomList, "The order of elements should differ between runs.");
    }

    @Test
    void testCompleteRangePresence() {
        // Test that the list contains every number in the range [1, 10,000]
        for (int i = 1; i <= 10_000; i++) {
            assertTrue(randomList.contains(i), "The list should contain every number from 1 to 10,000.");
        }
    }
}

