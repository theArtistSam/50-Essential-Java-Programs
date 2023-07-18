/*
Question 06:
*/

import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int rdmInt = random.nextInt(12) + 1;

        switch (rdmInt) {
            case 1:
                System.out.println("The English month is: January");
                break;
            case 2:
                System.out.println("The English month is: February");
                break;
            case 3:
                System.out.println("The English month is: March");
                break;
            case 4:
                System.out.println("The English month is: April");
                break;
            case 5:
                System.out.println("The English month is: May");
                break;
            case 6:
                System.out.println("The English month is: June");
                break;
            case 7:
                System.out.println("The English month is: July");
                break;
            case 8:
                System.out.println("The English month is: August");
                break;
            case 9:
                System.out.println("The English month is: September");
                break;
            case 10:
                System.out.println("The English month is: October");
                break;
            case 11:
                System.out.println("The English month is: November");
                break;
            case 12:
                System.out.println("The English month is: December");
                break;
        }
    }
}
