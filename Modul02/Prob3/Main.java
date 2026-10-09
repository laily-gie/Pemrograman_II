package Modul02.Prob3;

    public class Main {
        public static void main(String[] args) {

            Employee e = new Employee();
            //Tidak ada semicolon diakhir line code ini
            //e.name = "Roi"
            e.name = "Roi";
            e.origin = "Kingdom of Orvel";
            e.setRole("Assasin");
            //Pada lembar praktikum, tidak terdapat input nilai untuk atribut age, sehingga nilai age yang akan ditampilkan adalah 0
            e.age = 17;

            //Pada lembar praktikum, output yang dihasilkan adalah Nama bukan Nama Pegawai
            //System.out.println("Nama Pegawai: " + e.getName());
            System.out.println("Nama: " + e.name);
            System.out.println("Asal: " + e.getOrigin());
            System.out.println("Jabatan: " + e.role);
            //Karna pada lembar praktikum terdapat kalimat tahun, jadi baris codingan dibawah ini masih memiliki kekurangan
            //System.out.println("Umur: " + e.age);
            System.out.println("Umur: " + e.age + " tahun");
        }
    }