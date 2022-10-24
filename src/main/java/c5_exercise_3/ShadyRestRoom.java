package c5_exercise_3;

import java.util.Scanner;

public class ShadyRestRoom {
    int price;

    public static void main(String[] args) {
        ShadyRestRoom sRR = new ShadyRestRoom();
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("(1) Queen bed");
        System.out.println("(2) King bed");
        System.out.println("(3) Suite with a king bed and pull-out couch");
        System.out.print("Enter Selection (1, 2, or 3) >> ");
        int flag = sc.nextInt();
        /*
        Menu
        (1) Queen bed
        (2) King bed
        (3) Suite with a king bed and pull-out couch
        Enter Selection (1, 2, or 3) >> 1
        You selected Queen bed  $125
        */
        sRR.checkInput(flag);
    }

    public void checkInput(int i){
        if (i>=1 && i<=3){
            switch (i){
                case 1:
                    this.price = 125;
                    System.out.printf("You selected Quene bed $%d",this.price);
                    System.out.println();
                break;
                case 2:
                    this.price = 139;
                    System.out.printf("You selected King bed $%d",this.price);
                    System.out.println();
                break;
                case 3:
                    this.price = 165;
                    System.out.printf("You selected Suite with a king bed and pull-out couch $%d",this.price);
                    System.out.println();
                break;
            }

        }
        else{
            System.out.println("Please choose from 1-3!");
        }
    }
}
