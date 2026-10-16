package Modul03.Prob3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            // TODO: Inisialiasi ArrayList dengan new
            ArrayList<Student> students = new ArrayList<>();

            while (true) {
                System.out.println("Menu:");
                System.out.println("1. Tambah Mahasiswa");
                System.out.println("2. Hapus Mahasiswa Berdasarkan NIM");
                System.out.println("3. Cari Mahasiswa Berdasarkan NIM");
                System.out.println("4. Tampilkan Daftar Mahasiswa");
                System.out.println("0. Keluar");
                System.out.print("Pilihan: ");

                int option = Integer.parseInt(input.nextLine());

                switch (option) {
                    case 1:
                        System.out.print("Masukkan Nama Mahasiswa: ");
                        String getName = input.nextLine();

                        System.out.print("Masukkan NIM Mahasiswa (harus unik): ");
                        String getId = input.nextLine();

                        boolean doesIdAlreadyExist = false;

                        for(Student student : students) {
                            if (getId.equals(student.getId())) {
                                doesIdAlreadyExist = true;
                            }
                        }

                        if (doesIdAlreadyExist){
                            System.out.println("Mahasiswa" + getName + "Telah Terdaftar");
                        }

                        else{
                            Student student = new Student(getName, getId);
                            students.add(student);
                            System.out.println("Mahasiswa " + getName + " ditambahkan.");

                        }

                        break;

                    case 2:
                        System.out.print("Masukkan NIM Mahasiswa yang akan dihapus: ");
                        String deleteID = input.nextLine();

                        boolean IdFound = false;
                        Student deleteIDStudent = null;

                        for(Student student : students) {
                            if (deleteID.equals(student.getId())) {
                                IdFound = true;
                                deleteIDStudent = student;
                            }
                        }

                            if(IdFound){
                                students.remove(deleteIDStudent);
                                System.out.println("Mahasiswa dengan NIM " + deleteID + " dihapus");
                            }

                            else {
                                System.out.println("Nim tidak ditemukan");
                            }

                        break;

                    case 3:
                        System.out.print("Masukkan NIM Mahasiswa yang akan dicari:");
                        String inputID = input.nextLine();

                        boolean seacrhID = false;

                        for(Student student : students) {
                            if (inputID.equals(student.getId())) {
                                seacrhID = true;
                            }

                            if (seacrhID) {
                                System.out.println("Berikut merupakan Mahasiswa dengan NIM " + seacrhID + "bernama " + student.getName());
                            }
                        }

                        if (seacrhID == false) {
                                System.out.println("Nim tidak ditemukan");
                            }

                        break;

                    case 4:
                        System.out.println("Daftar Mahasiswa: ");
                        for (Student student : students){
                            System.out.println("NIM : " + student.getId() + ", Nama: " + student.getName());
                        }

                        break;

                    case 0:
                        students.clear();
                        System.out.println("Terimakasih!");

                        return; // Break itu untuk menghentikan case dari infinite looping sedangkan return untuk menghentikan method yang berjalan pada suatu class. Apa bedanya break dengan return?

                    default:
                        System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                        break;
                }
            }
        }
    }
