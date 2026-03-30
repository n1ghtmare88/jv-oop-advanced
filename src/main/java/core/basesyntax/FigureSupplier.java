package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final Random random;
    private final Figure defaultFigure;
    private final ColorSupplier colorSupplier;

    {
        random = new Random();
        defaultFigure = new Circle(Color.WHITE.name(),10);
        colorSupplier = new ColorSupplier();
    }

    public Figure getRandomFigure() {
        int index = random.nextInt(5);
        String randomColor = colorSupplier.getRandomColor();
        switch (index) {
            case 0:
                double radius = random.nextDouble() * 5;
                return new Circle(randomColor,radius);
            case 1:
                double baseA = random.nextDouble() * 5;
                double baseB = random.nextDouble() * 5;
                double height = random.nextDouble() * 5;
                return new IsoscelesTrapezoid(randomColor, baseA, baseB, height);
            case 2:
                double length = random.nextDouble() * 5;
                double width = random.nextDouble() * 5;
                return new Rectangle(randomColor, length, width);
            case 3:
                double firstLeg = random.nextDouble() * 5;
                double secondLeg = random.nextDouble() * 5;
                return new RightTriangle(randomColor, firstLeg, secondLeg);
            case 4:
                double side = random.nextDouble() * 5;
                return new Square(randomColor, side);
            default:
                return null;
        }
    }

    public Figure getDefaultFigure() {
        return defaultFigure;
    }
}
