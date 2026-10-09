package Modul02.Prob3;
    //Pada baris ini terdapat error karena nama file tidak sama dengan nama class yang ada
    //public class Pegawai {
    public class Employee {

        public String name;
        //Pada baris ini atribut origin menerima tipe data char, padahal seharusnya origin menerima tipe data string. karena atribut origin akan digunakan untuk menyimpan input berupa asal.
        //public char origin;
        public String origin;
        public String role;
        public int age;

        public String getName() {
            return name;
        }

        public String getOrigin() {
            return origin;
        }

        //Pada baris ini terdapat setter Role yang belum mendeklarasikan parameter r
        //public void setRole() {
        public void setRole(String r) {
            this.role = r;
        }

        }
