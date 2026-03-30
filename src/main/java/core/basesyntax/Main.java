package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        final int size = 6;
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure [] figures = new Figure[size];
        for (int i = 0; i < figures.length; i++) {
            if (i < figures.length / 2) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
        }
        for (Figure value : figures) {
            value.draw();
        }
    }
}
