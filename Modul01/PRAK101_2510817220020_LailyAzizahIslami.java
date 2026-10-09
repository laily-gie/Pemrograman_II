package Modul01;
import java.util.Scanner;

public class PRAK101_2510817220020_LailyAzizahIslami {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Masukkan Nama Lengkap: ");
            String name = input.nextLine();

            System.out.print("Masukkan Tempat Lahir: ");
            String birthPlace = input.nextLine();

            System.out.print("Masukkan Tanggal Lahir: ");
            int birthDate = input.nextInt();

            System.out.print("Masukkan Bulan Lahir: ");
            int birthMonth = input.nextInt();

            System.out.print("Masukkan Tahun Lahir: ");
            int birthYear = input.nextInt();

            System.out.print("Masukkan Tinggi Badan: ");
            int height = input.nextInt();

            System.out.print("Masukkan Berat Badan: ");
            Float weight = input.nextFloat();

            String monthName = switch (birthMonth) {
                case 1 -> "Januari";
                case 2 -> "Februari";
                case 3 -> "Maret";
                case 4 -> "April";
                case 5 -> "Mei";
                case 6 -> "Juni";
                case 7 -> "Juli";
                case 8 -> "Agustus";
                case 9 -> "September";
                case 10 -> "Oktober";
                case 11 -> "November";
                case 12 -> "Desember";
                default -> "Bulan Invalid";
            };

            System.out.print("Nama Lengkap " + name + ", Lahir di " + birthPlace + " pada Tanggal " + birthDate + " " + monthName + " " + birthYear +
                    "\nTinggi Badan " + height + " dan Berat Badan " + weight);
        }
}