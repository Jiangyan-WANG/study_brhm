package main.exercise_2;

import java.util.Scanner;

public class LeaseInput {
    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        Lease aLease;
        while (true) {
            System.out.print("Enter lessee name >> ");
            String name = myInput.nextLine();
            System.out.print("Enter apartment number >> ");
            int number = myInput.nextInt();
            System.out.print("Enter rent >> ");
            double rent = myInput.nextDouble();
            System.out.print("Enter lease term in months >> ");
            int term = myInput.nextInt();
            Lease currentLease = new Lease(name, number, rent, term);
            showLease(currentLease);
            }
        }

        public static void showLease(Lease aLease){
            System.out.println("#############################");
            System.out.println("Your lease results:");
            System.out.println("Name      : " + aLease.getName());
            System.out.println("Apartment : " + aLease.getNumber());
            System.out.println("Rent      : " + aLease.getRent());
            System.out.println("Term      : " + aLease.getTerm());
            Lease.explainPetPolicy(aLease.getFee());
            System.out.println("#############################");
        }
}
