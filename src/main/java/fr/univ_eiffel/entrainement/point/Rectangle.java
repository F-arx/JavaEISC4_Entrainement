package fr.univ_eiffel.entrainement.point;

public record Rectangle(double longueur,double largeur) implements Shape {
    @Override
    public double area() {
        return longueur * largeur;
    }

    @Override
    public double perimeter() {
        return 2*(longueur+largeur);
    }
}
