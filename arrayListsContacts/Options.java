package com.company.arrayListsContacts;

public class Options extends Phone{

    public void addOption() {
        System.out.println("What is the name of the contact you want to add: ");
        boolean add = contacts.add(scanner.nextLine());
        if (add == true)
            System.out.println("Successfully Added");
        else
            System.out.println("Failed to add");
    }
    public void rmOption() {
        System.out.println("What is the name of the contact you want to delete: ");
        boolean remove = contacts.remove(scanner.nextLine().toLowerCase());
        if (remove == true)
            System.out.println("Successfully Removed");
        else
            System.out.println("Not in contact list");
    }
    public void updateOption() {
        if(contacts.size() > 0) {
            System.out.println("What is the name of the contact you want to update: ");

            int i = contacts.indexOf(scanner.nextLine().toLowerCase());

            if (i >= 0) {
                System.out.println("What is the name you want to replace the contact with: ");
                contacts.set(i, scanner.nextLine());
                System.out.println("Successfully Added ");
            }
            else
                System.out.println("That is not on the contact list");
        }
        else
            System.out.println("You have no contacts to replace!");

    }

    public void printContacts() {
        System.out.println("These are the people in your contact: ");
        contacts.forEach(System.out :: println);
    }

    public int findContacts() {
        if(contacts.size() > 0) {
            System.out.println("What is the name of the contact you want to find: ");

            int i = contacts.indexOf(scanner.nextLine().toLowerCase());

            if (i >= 0)
                return i;
            else
                System.out.println("That is not on the contact list");
        }
        else
            System.out.println("You have no contacts!");
        return (-1);
    }

    public void quit() {
        System.exit(0);
    }


}
