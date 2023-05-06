package figures;

public class Square extends Polygon {
    private double side;
    public Square(String name, double side) {
        super(name, 4);
        this.side=side;
    }

    @Override
    public double getArea() {
        return Math.pow(side,2);
    }

    @Override
    public double getPerimeter() {
        return 4*side;
    }

    @Override
    public String toString() {
        return "Квадрат " + name + ", длина стороны: " + side + ", площадь фигуры: " +getArea() + ", периметр фигуры: " + getPerimeter() ;
    }
}
