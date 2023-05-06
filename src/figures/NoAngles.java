package figures;

import figures.base.CurveLength;
import figures.base.Figure;
import figures.base.IArea;
import figures.base.Perimeter;

public class NoAngles extends Figure implements CurveLength, IArea, Perimeter {
    public final double pi = 3.1415;
    private double radius;

    public NoAngles(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public void getCurveLength() {
        System.out.println(2 * pi * radius);
    }


    @Override
    public double getArea() {
        return pi * Math.pow(radius, 2.0);
    }

    @Override
    public String toString() {
        return  "Фигура без углов " + name + ", радиус = " + radius + ", площадь фигуры: " + getArea();
    }

    @Override
    public double getPerimeter() {
        System.out.println("У данной фигуры невозможно посчитать периметр");
        return 0;
    }
}
