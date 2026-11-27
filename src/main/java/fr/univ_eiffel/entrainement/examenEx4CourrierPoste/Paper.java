package fr.univ_eiffel.entrainement.examenEx4CourrierPoste;

public class Paper {
    private double height_mm;
    private double length_mm;
    private double grammage; //g/m2

    public Paper(double height_mm, double length_mm, double grammage) {
        if( length_mm<= 0 || height_mm <= 0 || grammage <= 0){
            throw new IllegalArgumentException("Arguments be positive");
        }
        this.height_mm = height_mm;
        this.length_mm = length_mm;
        this.grammage = grammage;
    }

    public double getHeight_mm() {
        return height_mm;
    }

    public void setHeight_mm(double height_mm) {
        this.height_mm = height_mm;
    }

    public double getLength_mm() {
        return length_mm;
    }

    public void setLength_mm(double length_mm) {
        this.length_mm = length_mm;
    }

    public double getGrammage() {
        return grammage;
    }

    public void setGrammage(double grammage) {
        this.grammage = grammage;
    }

    @Override
    public String toString() {
        return "Paper{" +
                "height_mm=" + height_mm +
                ", length_mm=" + length_mm +
                ", grammage=" + grammage +
                '}';
    }

    public double getWeight(){
        final double m2 = 1000000; //mm2
        double area = (this.height_mm * this.length_mm )/m2;
        return this.grammage * area;
    }
}
