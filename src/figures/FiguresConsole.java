package figures;

import figures.base.Console;
import figures.base.IArea;
import figures.base.Perimeter;

import java.util.HashSet;

public class FiguresConsole extends Console {
    private HashSet<String> figureTypes;
    private FiguresList figures;

    private void viewCommand() {
        commands.add(" Добавить новую фигуру");
        commands.add(" Удалить фигуру");
        commands.add(" Посчитать периметр всех фигур");
        commands.add(" Посчитать площадь всех фигур");
        commands.add(" Вывести информацию о фигурах");
        commands.add(" Изменить фигуру");
//        commands.add(" Сортировать фигуры по площади");

    }

    private void viewFigurelList() {
        figureTypes.add("Треугольник");
        figureTypes.add("Квадрат");
        figureTypes.add("Прямоугольник");
        figureTypes.add("Круг");
    }

    public FiguresConsole() {
        super();
        this.figureTypes = new HashSet<>();
        figures = new FiguresList();
        viewCommand();
        viewFigurelList();
        start();
    }

    @Override
    protected void compel(int num) {
        switch (num) {
            case 0:
                addFigure();
                break;
            case 1:
                removeFigure();
                break;
            case 2:
                getAllPerimeter();
                break;
            case 3:
                getAllAreas();
                break;
            case 4:
                getInfoAll();
                break;
            case 5:
                changeFigure();
        }
    }

    private void getAllAreas() {
        figures.getArea();
    }

    private void getAllPerimeter() {
        figures.getPerimeter();
    }

    private void getInfoAll() {
        figures.getInfoAll();
    }

    private void removeFigure() {
        System.out.println("Введите индекс фигуры, которую хотите удалить: ");
        int index = scanner.nextInt();
        figures.remove(index);
    }

    private void changeFigure() {
        System.out.println("Укажите индекс изменяемой фигуры: ");
        int index = scanner.nextInt();
        figures.remove(index);
        addFigure();
    }


    private void addFigure() {
        System.out.println("Выберите фигуру: ");
        for (var element : figureTypes) {
            System.out.println(element);
        }
        String typeName = scanner.next();
        while (!figureTypes.contains(typeName)) {
            System.out.println("Такой фигуры нет");
            System.out.println("Выберите фигуру: ");
            for (var element : figureTypes) {
                System.out.println(element);
            }
            typeName = scanner.next();
        }
        System.out.println("Введите название фигуры");
        String figureName = scanner.next();
        if (typeName.equals("Треугольник")) {
            System.out.println("Укажите длину первого катета: ");
            double firstCathet = scanner.nextDouble();
            System.out.println("Укажите длину второго катета: ");
            double secondCathet = scanner.nextDouble();
            System.out.println("Укажите длину гипотенузы: ");
            double hypotenuse = scanner.nextDouble();
            figures.add(new Triangle(figureName, firstCathet, secondCathet, hypotenuse));
        }
        if (typeName.equals("Квадрат")) {
            System.out.println("Укажите длину стороны квадрата: ");
            double side = scanner.nextDouble();
            figures.add(new Square(figureName, side));
        }
        if (typeName.equals("Прямоугольник")) {

            System.out.println("Укажите длину прямоугольника: ");
            double length = scanner.nextDouble();
            System.out.println("Укажите ширину прямоугольника: ");
            double width = scanner.nextDouble();
            figures.add(new Rectangle(figureName, length, width));
        }
        if (typeName.equals("Круг")) {
            System.out.println("Укажите радиус круга: ");
            double radius = scanner.nextDouble();
            figures.add(new NoAngles(figureName, radius));
        }
    }
}
