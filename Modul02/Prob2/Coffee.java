package Modul02.Prob2;
import java.util.Locale;

public class Coffee {
    private String name;
    private String size;
    private double price;
    private String customer;

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public void printInfo() {
        Locale.setDefault(Locale.US);
        System.out.println("Nama Kopi: " + name);
        System.out.println("Ukuran: " + size);
        System.out.println("Harga: Rp. " + price);
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCustomer() {
        return customer;
    }

    public double getTax() {
        return (0.11 * price);
    }
}