package org.example;

import java.util.Scanner;

public class Main {
    static final int SHOWCONTACTSFROMDATABASE = 1;
    static final int ADDCONTACTSINADDRESSBOOK = 2;
    static final int EDITCONTACT = 3;
    static final int EXIT = 0;

    public static void main(String[] args) {
        System.out.println("welcome to Addressbook with jdbc");
        Scanner sc = new Scanner(System.in);
        Addressbook addressbook = new Addressbook();
        while (true) {
            System.out.println("\n\t\t--------- Welcome to Addressbook ---------\n");
            System.out.print("0. Exit.\n1. Show all contacts from database.\n2. Add contacts in ContactList.\n3. Edit Contact. ");
            System.out.print("\nInput your Choice : ");
            switch (sc.nextInt()) {
                case SHOWCONTACTSFROMDATABASE:
                    addressbook.showAllContactFromDatabase();
                    break;
                case ADDCONTACTSINADDRESSBOOK:
                    addressbook.addContactInAddressBookDatabase();
                    break;
                case EDITCONTACT:
                    addressbook.editContact();
                    break;
                case EXIT:
                    return;
                default:
                    System.out.println("invalid input");
                    break;
            }
        }
    }
}