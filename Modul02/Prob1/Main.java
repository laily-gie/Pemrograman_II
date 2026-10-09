package Modul02.Prob1;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

                Fruit apple = new Fruit("Apel", 0.4, 7000, 40.0);
                Fruit mango = new Fruit("Mangga", 0.2, 3500, 15.0);
                Fruit avocado = new Fruit("Alpukat", 0.25, 10000, 12.0);

                apple.printInfo();
                mango.printInfo();
                avocado.printInfo();
            }
        }
