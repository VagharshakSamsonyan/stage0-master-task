package com.epam.langSyntax;

public class NumberReverter {
    public void revert(int number) {
        // Convert the number to a string
        String numberStr = String.valueOf(number);

        // Reverse the string
        StringBuilder reversedStr = new StringBuilder();
        reversedStr.append(numberStr);
        reversedStr = reversedStr.reverse();

        // Convert the reversed string back to an integer
        int reversedNumber = Integer.parseInt(reversedStr.toString());

        // Print the reversed number
        System.out.println(reversedNumber);
    }
}
