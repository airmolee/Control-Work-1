//1)	Напишите программу, проверяющую, является ли введенная строка десятичным числом с целой и дробной частью (шаблон: состоит из одной или нескольких цифр, одной десятичной точки, которая может быть в начале, в середине или в конце числа,  и, кроме того, первым символом числа может быть знак "+" или "-"). Если это так, то программа должна вывести количество знаков в целой и количество знаков в дробной части числа.

package org.example;
import java.util.Scanner;

public class DecimalCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string");
        String input = scanner.nextLine();

        String decimalPattern = "^[+-]?\\d+\\.?\\d+$";

        if(input.matches(decimalPattern)) {
            String[] parts = input.split("\\.");
            int wholePartLength = parts[0].replaceAll("[+-]", "").length();
            int fractionalPartLength = parts.length > 1? parts[1].length() : 0;

            System.out.println("Number of characters in an whole part: " + wholePartLength);
            System.out.println("Number of characters in a fractional part: " + fractionalPartLength);
        }
        else {
            System.out.println("Not a decimal number");
        }

        scanner.close();
        }
}
