package com.rajesh;

import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an operation:");
            System.out.println("1. Extract Substring");
            System.out.println("2. Split a Sentence");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter a string: ");
                    String inputString = scanner.nextLine();
                    System.out.print("Enter starting index: ");
                    int start = scanner.nextInt();
                    System.out.print("Enter ending index: ");
                    int end = scanner.nextInt();

                    if (start >= 0 && end <= inputString.length() && start < end) {
                        System.out.println("Substring: " + inputString.substring(start, end));
                    } else {
                        System.out.println("Invalid indices!");
                    }
                    break;
                
                case 2:
                    System.out.print("Enter a sentence: ");
                    String sentence = scanner.nextLine();
                    String[] words = sentence.split(" ");
                    System.out.println("Words in the sentence:");
                    for (String word : words) {
                        System.out.println(word);
                    }
                    break;
                
                case 3:
                    System.out.println("Exiting program...");
                    scanner.close();
                    return;
                
                default:
                    System.out.println("Invalid choice! Please enter 1, 2, or 3.");
            }
        }
    }
}
