package figures;

import figures.base.Figure;
import figures.base.ICollection;
import figures.base.Perimeter;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FiguresList implements ICollection {
    private List<Figure> figuresList;

    public FiguresList() {
        figuresList = new ArrayList<>();
    }

    public FiguresList(List<Figure> figures) {
        this.figuresList = figures;
    }

    @Override
    public void add(Figure element) {
        figuresList.add(element);
    }

    @Override
    public void add(Object element) {

    }

    @Override
    public void getInfoAll() {
        for (var figure : figuresList) {
            System.out.println(figure.toString());
        }
    }

    @Override
    public Object get(int index) {
        var result = figuresList.get(index);
        System.out.println(result);
        return result;
    }

    @Override
    public Figure remove(int index) {
        return figuresList.remove(index);
    }


    public void getPerimeter() {
        for (var element : figuresList) {
            element.getPerimeter();
        }
    }

    public void getArea() {
        for (var element : figuresList) {
            System.out.println(element.getArea());
        }
    }
}
