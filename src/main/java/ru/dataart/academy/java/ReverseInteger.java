package ru.dataart.academy.java;

public class ReverseInteger {
    /**
     * @param inputNumber - any integer value
     * @return - inputNumber in reversed order
     * Example: 1234 -> 4321
     * -23 -> -32
     * 120 -> 21
     * -2,147,483,648 -> exception and error message
     * If result (number in reversed order) is out of int range [-2,147,483,648,  2,147,483,647] throw custom
     * unchecked exception. In main method (Main class) if exception happened output message with problem to user.
     */
    public int reverse(int inputNumber) {
        long reversed = 0;

        while (inputNumber != 0) {
            reversed = reversed * 10 + inputNumber % 10;
            inputNumber = inputNumber / 10;
        }

        if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) {
            throw new IntegerOutOfBoundsException("The number cannot be converted");
        }
        return (int) reversed;
    }

    public static class IntegerOutOfBoundsException extends RuntimeException {
        public IntegerOutOfBoundsException(String message) {
            super(message);
        }
    }
}
