package Modul01;
import java.util.Scanner;

public class PRAK103_2510817220020_LailyAzizahIslami {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            int n = input.nextInt();
            int startingNum = input.nextInt();

            do {
                if (startingNum % 2 == 0) {
                    startingNum += 1;
                }

                    System.out.print(startingNum);

                if (n > 1) {
                    System.out.print(", ");
                }
                startingNum += 2;
                n--;
            } while (n > 0);
        }
    }