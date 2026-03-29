package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public Figure getRandomFigure() {
        Random random = new Random();
        int index = random.nextInt(5);
        return new Circle("efefef",5);
    }
}
