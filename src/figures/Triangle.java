package figures;

public class Triangle extends Polygon {
private Double firstCathet;
private Double secondCathet;
private Double hypotenuse;

    public Triangle(String name,  Double firstCathet, Double secondCathet, Double hypotenuse) {
        super(name, 3);
        this.firstCathet = firstCathet;
        this.secondCathet = secondCathet;
        this.hypotenuse = hypotenuse;
    }

    @Override
    public double getArea() {
        double p = (firstCathet+secondCathet+hypotenuse)/2;
        return Math.sqrt((p*(p-firstCathet)*(p-secondCathet)*(p-hypotenuse)));
    }

    @Override
    public double getPerimeter() {
        return firstCathet+secondCathet+hypotenuse;
    }

    @Override
    public String toString() {
        return "Треугольник " + name +
                ", длина первого катета: " + firstCathet +
                ", длина второго катета: " + secondCathet +
                ", длина гипотенузы: " + ", площадь фигуры: " + getArea() + ", периметр фигуры: " + getPerimeter();
    }
}
