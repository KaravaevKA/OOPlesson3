package figures;

public class Rectangle extends Polygon {
    private Double length;
    private Double width;

    public Rectangle(String name, Double length, Double width) {
        super(name, 4);
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length*width;
    }

    @Override
    public double getPerimeter() {
        return 2*length+2*width;
    }

    @Override
    public String toString() {
        return  "Прямоугольник " + name +
                ", длина " + length +
                ", ширина " + width + ", площадь фигуры: " + getArea() + ", периметр фигуры: " + getPerimeter();
    }
}

