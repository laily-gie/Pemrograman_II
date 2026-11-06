package Modul05.shapes;

public class Rectangle extends Shape {
    private double lenght;
    private double width;

    public Rectangle(double l, double w){
        super("Rectangle");
        this.lenght = l;
        this.width = w;
    }

    @Override
    public double area() {
        return lenght * width;
    }

    @Override
    public String toString(){
        return shapeName;
    }
}