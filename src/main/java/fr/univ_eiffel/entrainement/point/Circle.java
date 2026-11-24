package fr.univ_eiffel.entrainement.point;

public record Circle(Point center,double radius) implements Shape {
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return Math.PI * 2 * radius;
    }
}
