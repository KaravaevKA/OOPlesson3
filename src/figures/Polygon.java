package figures;

public class Polygon extends Figure implements Perimeter{

    protected Integer sidesCount;
    protected double[] sides;

    public Polygon(String name,Integer sidesCount, double[] sides) {
        super(name);
        this.sidesCount = sidesCount;
        this.sides = sides;
    }

    @Override
    public String getPerimeter() {

        return null;
    }
}
