package com.random;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The {@code UniqueRandomNumbers} class provides a method to generate a list of unique integers
 * in a random order within a specified range.
 *
 * <p>This class is primarily intended to demonstrate efficient list generation and 
 * shuffling, ensuring uniqueness and randomness of elements.</p>
 *
 * <p>Example usage:</p>
 * <pre>{@code
 * UniqueRandomNumbers generator = new UniqueRandomNumbers();
 * List<Integer> randomList = generator.generateRandomList(10000);
 * }</pre>
 */
public class UniqueRandomNumbers {

    /**
     * Generates a list of unique numbers between 1 and {@code maxNumber}, inclusive,
     * in random order.
     *
     * @param maxNumber the maximum number for the range, also indicating the list size
     * @return a list of unique numbers between 1 and {@code maxNumber} in random order
     */
    public List<Integer> generateRandomList(int maxNumber) {
        List<Integer> numbers = new ArrayList<>(maxNumber);
        for (int i = 1; i <= maxNumber; i++) {
            numbers.add(i);
        }
        Collections.shuffle(numbers);
        return numbers;
    }

    
}


