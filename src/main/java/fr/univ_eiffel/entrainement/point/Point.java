package fr.univ_eiffel.entrainement.point;

import java.util.Objects;

public class Point implements Comparable<Point>{
    private final double x;
    private final double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public static final Point ORIGIN = new Point(0, 0);

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return Double.compare(x, point.x) == 0 && Double.compare(y, point.y) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    public double distanceTo(Point p){

        double dx = p.getX() - this.x;
        double dy = p.getY() - this.y;
        double distance = Math.sqrt(
                Math.pow(dx,2) + Math.pow(dy,2)
                );
        return distance;
    }


    public double distanceToOrigin() {
        return this.distanceTo(ORIGIN);
    }

    @Override
    public int compareTo(Point o) {
        int a = Double.compare(this.x,o.x);
        if(a!=0){
            return a;
        }
        return Double.compare(this.y,o.y);
    }
}

