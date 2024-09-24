//3)	Пользователь вводит текст, состоящий из слов, разделенных пробелами. В словах, начинающихся на «А» заменить эту букву на «а». В полученном текст подсчитать количество слов, начинающихся на «а».

package org.example;
import java.util.Scanner;

public class WordCountReplace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word");
        String input = scanner.nextLine();

        String[] words = input.split("\\s+");
        int count = 0;

        for( int i = 0; i < words.length; i++){
            if(words[i].startsWith("A")) {
                count++;
                words[i] = words[i].replaceFirst("A", "a");
            }
        }

        System.out.println("Number of words beginning with A:" +count);
        System.out.println("Received text:"+ String.join(" ", words));
    }

}
