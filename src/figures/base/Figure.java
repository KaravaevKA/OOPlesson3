package figures.base;

public abstract class Figure {
protected String name;

    public Figure(String name) {
        this.name = name;
    }



    public abstract double getPerimeter();

    public abstract double getArea();
}
