package fr.univ_eiffel.entrainement.point;

public record Triangle(Point a, Point b, Point c) implements Polygon {
    @Override
    public Point[] vertices() {
        return new Point[]{a,b,c};
    }

    @Override
    public double perimeter() {
        return Polygon.super.perimeter();
    }

    @Override
    public int vertexNumber() {
        return Polygon.super.vertexNumber();
    }

    @Override
    public double area(){
        Point[] points = vertices();
        double a = points[0].distanceTo(points[1]);
        double b = points[1].distanceTo(points[2]);
        double c = points[2].distanceTo(points[0]);

        double s = perimeter()/2;
        double A = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        return A;
    }
}
