package V2_entrainement.eval;

import java.util.HashMap;

public class GasPump {
    private final double capacityMax;
    private double capacityAvailable;
    private double totalSold;
    private double price;
    private HashMap<Integer,Integer> billets = new HashMap<>();

    public GasPump(double capacityMax, double price) {

        if(capacityMax <=0 || price<=0){
            throw new IllegalArgumentException("Invalide price or capacityMax");
        }
        this.capacityMax = capacityMax;
        this.capacityAvailable=0;
        this.price = price;
        this.totalSold =0;

        billets.put(5,0);
        billets.put(10,0);
        billets.put(20,0);
        billets.put(50,0);
        billets.put(100,0);
        billets.put(200,0);
    }
    @Override
    public String toString() {
        return "GasPump{" +
                "capacityMax=" + capacityMax +
                ", capacityAvailable=" + capacityAvailable +
                ", totalSolt=" + totalSold +
                ", price=" + price +
                ", billets=" + billets +
                '}';
    }
    public double getCapacityMax() {
        return capacityMax;
    }

    public double getCapacityAvailable() {
        return capacityAvailable;
    }

    public double getTotalSold() {
        return totalSold;
    }

    public double getPrice() {
        return price;
    }

    public HashMap<Integer, Integer> getBillets() {
        return billets;
    }

    public void setCapacityAvailable(double capacityAvailable) {
        this.capacityAvailable = capacityAvailable;
    }

    public void setTotalSold(double totalSold) {
        this.totalSold = totalSold;
    }

    public void setPrice(double price) {
        if(price<0){
            throw new IllegalArgumentException("Invalid value");
        }
        this.price = price;
    }

    public void setBillets(HashMap<Integer, Integer> billets) {
        this.billets = billets;
    }

    public void fill(double quantity){

        if(quantity<=0){
            throw new IllegalArgumentException("Invalid quantity");
        }
        if ((quantity+capacityAvailable)>capacityMax){
            throw new IllegalStateException("capacity overflow");
        }
        capacityAvailable += quantity;
    }
    public double takeGaz(double bankNote){
        if((bankNote != 5)&&
                (bankNote !=10)&&
                (bankNote!=20)&&
                (bankNote!=50)&&
                (bankNote!=100)&&
                (bankNote!=200)){
            throw new IllegalArgumentException("T'as pas de billet espèce de sale pauvre ?");
        }
        int incNote = billets.get(bankNote);
        incNote++;

        billets.put((int) bankNote,incNote);
        double gasQuantity = bankNote / price;
        capacityAvailable -= gasQuantity;
        return gasQuantity;
    }


}
