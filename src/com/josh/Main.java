package com.josh;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        LinkedList languages = new LinkedList();
        languages.push("Python");
        languages.push("Java");
        languages.push("C#");
        while (true) {
            try {
                String oneLanguage = (String) languages.pop();
                System.out.println(oneLanguage);
            } catch (NoSuchElementException e) {
                System.out.println("The list is empty");
                break;
            }
            continue;
        }
    }
}
