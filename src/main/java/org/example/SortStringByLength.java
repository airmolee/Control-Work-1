////3. Ввести строки из файла, записать в список ArrayList. Выполнить сортировку строк по длине.
// Расположение файла "src/main/resources/SortStringByLength.txt"
package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;


public class SortStringByLength {
    public static void main(String[] args){
        ArrayList<String> lines = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\PC\\Desktop\\SortStringByLength.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e){
            e.printStackTrace();
        }

        Collections.sort(lines, (s1,s2) -> Integer.compare(s1.length(), s2.length()));

        for (String line : lines) {
            System.out.println(line);
        }
    }
}
