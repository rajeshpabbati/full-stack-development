package com.rajesh;

import java.util.*;

public class CollectionManagementSystem {
    private List<String> list;
    private Set<String> set;
    private Map<Integer, String> map;
    private Scanner scanner;

    public CollectionManagementSystem() {
        list = new ArrayList<>();
        set = new HashSet<>();
        map = new HashMap<>();
        scanner = new Scanner(System.in);
    }

    public void run() {
        while (true) {
            try {
                System.out.println("\nCollection Management System");
                System.out.println("1. Manage List");
                System.out.println("2. Manage Set");
                System.out.println("3. Manage Map");
                System.out.println("4. Exit");
                System.out.print("Choose an option: ");

                if (!scanner.hasNextInt()) {
                    System.out.println("Invalid input! Please enter a number.");
                    scanner.nextLine(); // Clear invalid input
                    continue;
                }

                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1 -> manageList();
                    case 2 -> manageSet();
                    case 3 -> manageMap();
                    case 4 -> {
                        System.out.println("Exiting program.");
                        return;
                    }
                    default -> System.out.println("Invalid choice! Try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a valid number.");
                scanner.nextLine(); // Clear invalid input
            }
        }
    }

    private void manageList() {
        while (true) {
            System.out.println("\nManage List");
            System.out.println("1. Add Element");
            System.out.println("2. Remove Element");
            System.out.println("3. Display Elements");
            System.out.println("4. Back");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter element to add: ");
                    String element = scanner.nextLine();
                    list.add(element);
                    System.out.println("Element added to list.");
                }
                case 2 -> {
                    System.out.print("Enter element to remove: ");
                    String element = scanner.nextLine();
                    if (list.remove(element)) {
                        System.out.println("Element removed from list.");
                    } else {
                        System.out.println("Element not found in list.");
                    }
                }
                case 3 -> {
                    System.out.println("List Elements: " + list);
                }
                case 4 -> { return; }
                default -> System.out.println("Invalid choice! Try again.");
            }
        }
    }

    private void manageSet() {
        while (true) {
            System.out.println("\nManage Set");
            System.out.println("1. Add Element");
            System.out.println("2. Remove Element");
            System.out.println("3. Display Elements");
            System.out.println("4. Back");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter element to add: ");
                    String element = scanner.nextLine();
                    if (set.add(element)) {
                        System.out.println("Element added to set.");
                    } else {
                        System.out.println("Element already exists in set.");
                    }
                }
                case 2 -> {
                    System.out.print("Enter element to remove: ");
                    String element = scanner.nextLine();
                    if (set.remove(element)) {
                        System.out.println("Element removed from set.");
                    } else {
                        System.out.println("Element not found in set.");
                    }
                }
                case 3 -> {
                    System.out.println("Set Elements: " + set);
                }
                case 4 -> { return; }
                default -> System.out.println("Invalid choice! Try again.");
            }
        }
    }

    private void manageMap() {
        while (true) {
            System.out.println("\nManage Map");
            System.out.println("1. Add Entry");
            System.out.println("2. Remove Entry");
            System.out.println("3. Display Entries");
            System.out.println("4. Back");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter key (integer): ");
                    if (scanner.hasNextInt()) {
                        int key = scanner.nextInt();
                        scanner.nextLine();
                        if (map.containsKey(key)) {
                            System.out.println("Key already exists. Use a different key.");
                        } else {
                            System.out.print("Enter value: ");
                            String value = scanner.nextLine();
                            map.put(key, value);
                            System.out.println("Entry added to map.");
                        }
                    } else {
                        System.out.println("Invalid input! Please enter an integer for the key.");
                        scanner.nextLine();
                    }
                }
                case 2 -> {
                    System.out.print("Enter key to remove: ");
                    if (scanner.hasNextInt()) {
                        int key = scanner.nextInt();
                        scanner.nextLine();
                        if (map.remove(key) != null) {
                            System.out.println("Entry removed from map.");
                        } else {
                            System.out.println("Key not found in map.");
                        }
                    } else {
                        System.out.println("Invalid input! Please enter an integer.");
                        scanner.nextLine();
                    }
                }
                case 3 -> {
                    System.out.println("Map Entries: " + map);
                }
                case 4 -> { return; }
                default -> System.out.println("Invalid choice! Try again.");
            }
        }
    }

    public static void main(String[] args) {
        CollectionManagementSystem cms = new CollectionManagementSystem();
        cms.run();
    }
}