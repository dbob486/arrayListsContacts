package com.company.arrayListsContacts;

import java.util.ArrayList;
import java.util.Scanner;

public class Phone {
    static Scanner scanner = new Scanner(System.in);
    private static Options option = new Options();
    static ArrayList <String> contacts = new ArrayList<String>();


    public static void main(String[] args) {
        choice();
    }

    private static void choice() {
        System.out.println("\nDo you want to: \n-'ADD' Add a contact * \n- 'RM' Remove a contact * \n- 'UPDATE' Update a contact' *\n- 'PRINT' Print your contacts *\n- 'Q' Quit ");
        String c = scanner.nextLine();

        switch (c.toLowerCase()) {
            case "add":
                option.addOption();
                choice();
            case "rm":
                option.rmOption();
                choice();
            case "update":
                option.updateOption();
                choice();
            case "print":
                option.printContacts();
                choice();
            case "find":
                int i = option.findContacts();
                 if (i > 0)
                     System.out.println("The contact you are looking for is in element: " + i);
                 choice();
            case "q":
                option.quit();
                break;
            default:
                choice();
        }

    }
}
