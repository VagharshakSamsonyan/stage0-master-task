package com.epam.langSyntax;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        // Initialize sum to zero
        int sum = 0;

        // Iterate over each digit of the number
        while (number != 0) {
            // Extract the last digit
            int digit = number % 10;

            // Add the digit to the sum
            sum += digit;

            // Remove the last digit from the number
            number /= 10;
        }

        // Print the sum of digits
        System.out.println(sum);
    }
}

