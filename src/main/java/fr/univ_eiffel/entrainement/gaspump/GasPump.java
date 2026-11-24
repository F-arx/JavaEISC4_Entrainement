
package fr.univ_eiffel.entrainement.gaspump;
import java.util.HashMap;
import java.util.Objects;

public class GasPump {

    // Les informations de la pompe
    private final double capacityMax;
    private double capacityAvailable;
    private double price;
    private double basketTotal;
    private HashMap<Integer, Integer> billets = new HashMap<>();

    // Constructeur : création de la pompe
    public GasPump(double capacityMax, double price) {
        if (capacityMax <= 0 || price <= 0) {
            throw new IllegalArgumentException("Capacité ou prix invalide");
        }
        this.capacityMax = capacityMax;
        this.capacityAvailable = 0;
        this.price = price;
        this.basketTotal = 0;

        billets.put(5,0);
        billets.put(10,0);
        billets.put(20,0);
        billets.put(50,0);
        billets.put(100,0);
        billets.put(200,0);

    }

    // Voir la quantité d'essence disponible
    public double getCapacityAvailable() {
        return capacityAvailable;
    }

    // Voir le prix du litre
    public double getPrice() {
        return price;
    }

    // Voir l'argent dans la caisse
    public double getBasketTotal() {
        return basketTotal;
    }

    public HashMap<Integer, Integer> getBillets( ) {

        return billets;
    }

    @Override
    public String toString() {
        return "GasPump{" +
                "capacityMax=" + capacityMax +
                ", capacityAvailable=" + capacityAvailable +
                ", price=" + price +
                ", basketTotal=" + basketTotal +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        GasPump gasPump = (GasPump) o;
        return Double.compare(capacityMax, gasPump.capacityMax) == 0 && Double.compare(capacityAvailable, gasPump.capacityAvailable) == 0 && Double.compare(price, gasPump.price) == 0 && Double.compare(basketTotal, gasPump.basketTotal) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(capacityMax, capacityAvailable, price, basketTotal);
    }

    // Changer le prix
    void setPrice(double price) {
        if(price<=0){
            throw new IllegalArgumentException("Prix invalide");
        }
        this.price = price;
    }

    // Remplir le réservoir
    public void fill(double quantity) {


        if (quantity <= 0) {
            throw new IllegalArgumentException("Quantité invalide");
        }

        if ((quantity + capacityAvailable) > capacityMax) {
            System.out.println("Quantité maximum acceptée : " + (capacityMax - capacityAvailable));
            throw new IllegalArgumentException("Capacité dépassée");
        }

        capacityAvailable += quantity;

        System.out.println("Le réservoir a été rempli");
    }

    // Le client achète de l'essence
    public double takeGas(int bankNote) {

        // Vérifier si le billet est valide
        if (bankNote != 5 &&
                bankNote != 10 &&
                bankNote != 20 &&
                bankNote != 50 &&
                bankNote != 100 &&
                bankNote != 200) {

            throw new IllegalArgumentException("Billet invalide");
        }

        // Calculer combien de litres le client peut acheter
        double quantity = bankNote / price;

        // Vérifier s'il reste assez d'essence

        if (quantity > capacityAvailable) {
            throw new IllegalStateException("Stock insuffisant");
        }

        int nombre = billets.get(bankNote);
        nombre ++;
        billets.put(bankNote,nombre);
        // Retirer l'essence du réservoir
        capacityAvailable -= quantity;

        // Ajouter l'argent dans la caisse
        basketTotal += bankNote;

        // Retourner la quantité d'essence vendue
        return quantity;
    }
}
