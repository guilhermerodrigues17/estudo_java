package Exercises.pensionato.application;

import Exercises.pensionato.entities.Rent;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rent[] rooms = new Rent[10];

        System.out.print("How many rooms will be rented? ");
        int rents = sc.nextInt();

        for (int i = 1; i<=rents; i++) {
        System.out.println("Rent #" + i + ":");
        System.out.print("Name: ");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.next();
        System.out.print("Room: ");
        int roomNumber = sc.nextInt();

        rooms[roomNumber] = new Rent(name, email);
        }
        System.out.println();
        System.out.println("Busy rooms: ");

        for (int i=0; i<10; i++) {
            if (rooms[i] != null) {
                System.out.println(i + ": " + rooms[i]);
            }
        }

        sc.close();
    }
}
