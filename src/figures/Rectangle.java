package figures;

public class Rectangle extends Polygon implements Perimeter{
    public Rectangle(String name,Integer sidesCount, double[] sides) {
        super(name,sidesCount,sides);
    }

    @Override
    public String getPerimeter() {
        Double per = 0.0;
        for (int i = 0; i < sides.length; i++) {
            per+=sides[i];
        }
        return "Периметр " + name + "а"+ ": " + per.toString();
    }

}
