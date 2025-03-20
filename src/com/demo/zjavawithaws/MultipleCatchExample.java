package com.demo.zjavawithaws;

public class MultipleCatchExample {

    public static void main(String[] args) {
    	
    	
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]); 
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: Division by zero is not allowed.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: Index out of bounds for the array.");
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}
