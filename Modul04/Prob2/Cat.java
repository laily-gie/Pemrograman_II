package Modul04.Prob2;

public class Cat extends Pet {
    private String furColor;

    public Cat(String n, String r, String w){
        super(n, r);

        this.furColor = w;
    }

    public void displayCatDetails() {
        super.display();
        System.out.println("Memiliki warna bulu : " + furColor);
    }
}