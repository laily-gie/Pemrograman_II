package Modul04.Prob1;

public class Pet {
    private String name;
    private String breed;

    public Pet(String n, String r) {
        this.name = n;
        this.breed = r;

    }

    public void display() {
        System.out.println("Detail Hewan Peliharaan: ");
        System.out.println("Nama hewan peliharaanku adalah: " + name);
        System.out.println("Dengan ras: " + breed);
    }
}