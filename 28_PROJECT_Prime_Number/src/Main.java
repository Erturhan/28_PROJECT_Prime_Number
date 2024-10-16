import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double num = 0;

        while (true) {
            System.out.print("Please, enter any number: ");
            num = scan.nextDouble();

            if (num < 2 || num != (int) num) {
                System.out.println("Wrong entry, try again!");
            } else {
                break;
            }
        }

        int j = (int) Math.ceil(Math.sqrt(num));
        int a = 0;

        for (int i = 2; i <= j; i++) {
            if (num % i == 0) {
                a++;
            }
        }


        if (a == 0) {
            System.out.println((int) num + " is prime  ");
        } else {
            System.out.println((int) num + " isn't prime ");
        }


    }
}