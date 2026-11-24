package fr.univ_eiffel.entrainement.comparable;

public class Colis implements Comparable<Colis> {
    private final String nom;
    private final double poids;


    public Colis(String nom, double poids) {
        this.nom = nom;
        this.poids = poids;
    }
    public String getNom(){
        return nom;
    }
    public double getPoids() {
        return poids;
    }

    @Override
    public int compareTo(Colis o) {

        return Double.compare(this.poids,o.getPoids());
    }
}
