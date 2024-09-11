package org.example;

import java.util.Scanner;
import newpackage.Phone;

public class jlab2 {
    public static void main(String[] args) {
        Phone[] phones = createPhonesArray();

        System.out.println("\nSubscriber Data:");
        for (Phone phone : phones) {
            System.out.println(phone);
        }

        System.out.println("\nChoose an option:");
        System.out.println("1) Information about subscribers whose local call time exceeds the specified time");
        System.out.println("2) Information about subscribers who used long distance communication");
        System.out.println("3) Information about subscribers whose account number is in the specified range");

        Scanner scan = new Scanner(System.in);
        int option = scan.nextInt();

        if(option == 1){

        } else if(option == 2){

        } else if(option == 3){

        } else {
            System.out.println("There is no such choice");
        }
    }

    public static Phone[] createPhonesArray() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of subscribers: ");
        int number = scan.nextInt();
        scan.nextLine();

        Phone[] phones = new Phone[number];

        for (int i = 0; i < number; i++) {
            System.out.println("Enter data for subscriber " + (i + 1) + ":");

            System.out.print("ID: ");
            int id = scan.nextInt();
            scan.nextLine();

            System.out.print("Last Name: ");
            String lastName = scan.nextLine();

            System.out.print("First Name: ");
            String firstName = scan.nextLine();

            System.out.print("Middle Name: ");
            String middleName = scan.nextLine();

            System.out.print("Account Number: ");
            int accountNum = scan.nextInt();

            System.out.print("Time for Town Talks (in minutes): ");
            int timeForTownTalks = scan.nextInt();

            System.out.print("Long Distance Call Time (in minutes): ");
            int longDistanceCallTime = scan.nextInt();
            scan.nextLine();

            phones[i] = new Phone(id, lastName, firstName, middleName, accountNum, timeForTownTalks, longDistanceCallTime);
        }

        return phones;
    }

    public static void getSubs
}

