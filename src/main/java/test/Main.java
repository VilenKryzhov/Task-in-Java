package test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        List<Form> figureList = new ArrayList<>();
        HashSet<Form> randomFigureList = new HashSet<>();

        int randomIntegerIterator1 = random.getRandomValue(20, 1);
        int randomIntegerIterator2 = random.getRandomValue(20, 1);

        for (int i = 0; i < randomIntegerIterator1; i++) {
            figureList.add(new Circle());
            figureList.add(new Square());
            figureList.add(new Trapeze());
            figureList.add(new Triangle());
        }

        for (int i = 0; i < randomIntegerIterator2; i++) {
            Form randomFigure = figureList.get(random.getRandomNextInt(figureList.size()));
            randomFigureList.add(randomFigure);
        }

            randomFigureList.forEach(Form::getParameters);
    }
}
