package Modul01;

import java.util.Locale;
import java.util.Scanner;

public class PRAK105_2510817220020_LailyAzizahIslami {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jari-jari: ");
        double radius = input.nextDouble();

        System.out.print("Masukkan tinggi: ");
        double height = input.nextDouble();

        double volume;
        final double PHI = 3.14;
        volume = PHI * radius * radius * height;

        System.out.printf("Volume tabung dengan jari-jari " + radius +" cm dan tinggi " +  height + " cm adalah %.3f m3", volume);
    }
}