package Modul04.Prob2;

public class Dog extends Pet{
    private String furColor;
    private String[] skills;

    public Dog(String n, String r, String w, String[] k){
        super(n, r);

        this.furColor = w;
        this.skills = k;
    }

    public void displayDogDetails() {
        super.display();
        System.out.println("Memiliki warna bulu : " + furColor);
        System.out.print("Kemampuan: ");

        for (String skill : skills){
            System.out.print(skill + " ");
        }

    }
}
