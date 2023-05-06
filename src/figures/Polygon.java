package figures;

import figures.base.Figure;
import figures.base.IArea;
import figures.base.Perimeter;

public abstract class Polygon extends Figure implements Perimeter, IArea {
   private Integer sidesCount;

    public Polygon(String name, Integer sidesCount) {
        super(name);
        this.sidesCount = sidesCount;
    }

    @Override
    public abstract double getPerimeter();

    @Override
    public abstract double getArea();
}
