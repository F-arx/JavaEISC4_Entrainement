package fr.univ_eiffel.entrainement.examenEx4CourrierPoste;

public class Mail {
    private final String destination;
    private final String address;
    public final Enveloppe enveloppe;


    public Mail(String destination, String address, Enveloppe enveloppe) {
        if(destination.isBlank() || address.isBlank() || enveloppe == null){
            throw new IllegalArgumentException("illegal address or destination or enveloppe");
        }
        this.destination = destination;
        this.address = address;
        this.enveloppe = enveloppe;
    }

    public String getDestination() {
        return destination;
    }

    public String getAddress() {
        return address;
    }

    public Enveloppe getEnveloppe() {
        return enveloppe;
    }
    public double getPostageCost(){
        double price = 0;
        if(enveloppe.getTotalWeight() <= 20){
            price = 1.50;
        } else if (enveloppe.getTotalWeight() <= 100) {
            price = 3.00;
        } else if (enveloppe.getTotalWeight() <= 250) {
            price = 5.00;
        } else {
            price = 8.00;
        }
        return price;
    }

}
