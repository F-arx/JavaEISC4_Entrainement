package fr.univ_eiffel.entrainement.point;

public interface Polygon extends Shape {

    Point[] vertices();

    default int vertexNumber() {
        return vertices().length;
    }

    @Override
    default double perimeter() {

        Point[] points = vertices();
        double sum = 0;

        for (int i = 0; i < points.length - 1; i++) {

            // Additionne la distance entre
            // points[i] et points[i + 1]
            sum += points[i].distanceTo(points[i+1]);
        }
        // Ajoute la distance entre
        // le dernier point et le premier
        sum += points[0].distanceTo(points[points.length-1]);
        return sum;
    }

    @Override
    default double area() {
        return 0;
    }
}
