package figures;

import java.util.ArrayList;
import java.util.List;

public class Repos {
    Figure[] figures = {new Rectangle("Прямоугольник",4, new double[]{2.2, 3.0, 2.2, 3.0}),
            new Square("Квадрат",4,new double[]{4.0,4.0,4.0,4.0})};

    public List<String> getInfoRepos() {
        List<String> listResult = new ArrayList<>();
        for (Figure figure : figures) {
            if (figure instanceof Perimeter perimeter) {
                listResult.add(perimeter.getPerimeter().toString());
            }
        }
        return listResult;
    }
}
