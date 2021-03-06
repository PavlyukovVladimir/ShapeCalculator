package model.quadrangle;

import model.ISquare;
import model.ShapeType;

public class Parallelogram extends Quadrangle implements ISquare {

    protected double height;

    public Parallelogram(double side, double base, double height) {
        super(ShapeType.PARALLELOGRAM, side, base, side, base);
        this.height = height;
    }

    @Override
    public double getPerimeter() {
        return (firstSide + secondSide) * 2;
    }

    @Override
    public double getSquare() {
        return secondSide * height;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder(this.getName());
        builder.append("\nСторона: ").append(firstSide);
        builder.append("\nОснование: ").append(thirdSide);
        builder.append("\nВысота: ").append(height);
        builder.append("\nПериметр: ").append(getPerimeter());
        builder.append("\nПлощадь: ").append(getSquare());
        return builder.toString();
    }
}
