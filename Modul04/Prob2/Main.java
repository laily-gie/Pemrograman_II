package Modul04.Prob2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Pilih jenis hewan yang ingin diinputkan:\n" +
                "1 = Kucing\n" +
                "2 = Anjing\n");

        System.out.print("Masukkan pilihan: ");
        int option = input.nextInt();
        input.nextLine();

        System.out.print("Nama hewan peliharaan: ");
        String name = input.nextLine();

        System.out.print("Ras: ");
        String breed = input.nextLine();

        if (option == 1) {
            System.out.print("Warna Bulu: ");
            String furColor = input.nextLine();

            Cat cat = new Cat(name, breed, furColor);
            cat.displayCatDetails();
        }

        else if (option == 2) {
            System.out.print("Warna Bulu: ");
            String furColor = input.nextLine();

            System.out.print("Memiliki Kemampuan: ");
            String[] skills = input.nextLine().split(",");

            Dog dog = new Dog(name, breed, furColor, skills);
            dog.displayDogDetails();

        }
    }
}