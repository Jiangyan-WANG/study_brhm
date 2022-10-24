package exercise_6;

import java.util.Scanner;

public class MathTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MathTest mathTest = new MathTest();

        System.out.print("Enter an integer >> ");
        int testInt = sc.nextInt();
//        System.out.println();

        System.out.print("Enter a floating-point number >> ");
        double testDouble = sc.nextDouble();
//        System.out.println();

        System.out.printf("The square root of %d is %f",testInt,Math.sqrt(testInt));
        System.out.println();

        System.out.printf("A random number between 0 and %d is %f", testInt,Math.random()*testInt);
        System.out.println();

        System.out.printf("The floor of %f is %.1f",testDouble,Math.floor(testDouble));
        System.out.println();

        System.out.printf("The ceiling of %f is %.1f",testDouble,Math.ceil(testDouble));
        System.out.println();

        System.out.printf("The round of %f is %d",testDouble,Math.round(testDouble));
        System.out.println();

        System.out.printf("The larger of %d and %f is ",testInt,testDouble);
        System.out.println(testInt>testDouble?testInt:testDouble);

        System.out.printf("The smaller of %d and %f is ",testInt,testDouble);
        System.out.println(testInt<testDouble?testInt:testDouble);

    }

}
