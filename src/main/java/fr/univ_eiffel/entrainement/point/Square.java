package fr.univ_eiffel.entrainement.point;

public record Square(double cote) implements Shape{
    @Override
    public double area() {
        return cote * cote ;
    }

    @Override
    public double perimeter() {
        return 4 * cote;
    }
}
