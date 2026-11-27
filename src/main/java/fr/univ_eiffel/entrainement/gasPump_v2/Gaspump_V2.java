package fr.univ_eiffel.entrainement.gasPump_v2;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class Gaspump_V2 {
    private final double limit;
    private double price;
    private double avalaible;
    private double totalSale;
    private HashMap<Integer, Integer> bills = new HashMap<>();

    int NoOperation = 0;




    public Gaspump_V2(double limit, double price) {
        if(limit <= 0 ||  price <= 0)
        {
            throw new IllegalArgumentException("invalid limit or price");
        } else {
            this.limit = limit;
            this.price = price;
            this.avalaible = 0;
            this.totalSale = 0;
        }

        bills.put(5,0);
        bills.put(10,0);
        bills.put(20,0);
        bills.put(50,0);
        bills.put(100,0);
        bills.put(200,0);
    }

    public double getLimit() {
        return limit;
    }

    public double getPrice() {
        return price;
    }

    public double getAvalaible() {
        return avalaible;
    }

    public double getTotalSale() {
        return totalSale;
    }

    private HashMap<Integer, Integer> getBills() {
        return bills;
    }

    void setPrice(double price) {
        if(price <= 0){
            throw new IllegalArgumentException("invalid price");
        }
        this.price = price;
    }

    @Override
    public String toString() {
        return "Gaspump_V2{" +
                "limit=" + limit +
                ", price=" + price +
                ", avalaible=" + avalaible +
                ", totalSale=" + totalSale +
                ", bills=" + bills +
                ", NoOperation=" + NoOperation +
                '}';
    }

    public void fill(double input_quantity){
        if(input_quantity <= 0){
            throw new IllegalArgumentException("input error");
        } else if(this.avalaible + input_quantity > this.limit){
            throw new IllegalArgumentException("overfill");
        }
        this.avalaible += input_quantity;
    }

    public void sell(double quantity){
        if(quantity <=0){
            throw new IllegalArgumentException("unvalid value of quantity");
        }else if(avalaible - quantity < 0){
            throw new IllegalArgumentException("can't sell, not enough availability");
        }
        this.avalaible -= quantity;
        this.totalSale += quantity*this.price;
    }

    public void display_all(){
        NoOperation += 1;
        System.out.print(" OPERATION N°" + NoOperation + "   ");

        System.out.print(this.avalaible + "  ");
        System.out.print(this.limit + "  ");
        System.out.print(this.price + "  ");
        System.out.print(this.totalSale + "  ");
        System.out.print(this.bills + "  ");
        System.out.println();
    }

    public void addBills(int denomination, int quantity){
        if(quantity <= 0){
            throw new IllegalArgumentException("invalid quantity");
        }
        if(!Set.of(5, 10, 20, 50, 100, 200).contains(denomination)){
            throw new IllegalArgumentException("Invalid bill");
        }

        if(bills.get(denomination) != null){
            bills.replace(denomination,(quantity+bills.get(denomination)));

        } else{
            bills.put(denomination,quantity);
        }
    }

    public double takeGas(int bankNote){
        if(!Set.of(5, 10, 20, 50, 100, 200).contains(bankNote)){
            throw new IllegalArgumentException("Invalid bill");
        }
        double quantity_to_sell = bankNote/price;
        if(avalaible < quantity_to_sell){
            throw new IllegalArgumentException("not enough fuel avalaible");
        }

            avalaible -= quantity_to_sell;
            addBills(bankNote,1);
            totalSale += bankNote;
        return quantity_to_sell;
    }

    public double getTotalBillsValue(){
        double value = 0;
        for(Map.Entry<Integer, Integer> entry : bills.entrySet())
        {
            value += entry.getKey() * entry.getValue();
        }
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Gaspump_V2 gaspumpV2 = (Gaspump_V2) o;
        return Double.compare(getLimit(), gaspumpV2.getLimit()) == 0 && Double.compare(getPrice(), gaspumpV2.getPrice()) == 0 && Double.compare(getAvalaible(), gaspumpV2.getAvalaible()) == 0 && Double.compare(getTotalSale(), gaspumpV2.getTotalSale()) == 0 && Objects.equals(getBills(), gaspumpV2.getBills());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLimit(), getPrice(), getAvalaible(), getTotalSale(), getBills());
    }
}
