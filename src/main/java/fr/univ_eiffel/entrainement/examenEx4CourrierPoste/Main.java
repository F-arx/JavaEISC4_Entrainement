package fr.univ_eiffel.entrainement.examenEx4CourrierPoste;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Paper> A4= new ArrayList<Paper>();
        A4.add(new Paper(210,297,80));
        A4.add(new Paper(210,297,90));
        A4.add(new Paper(210,297,120));

        Enveloppe enveloppe = new Enveloppe(230,320,6);

        enveloppe.addPaper(A4.get(0));
        enveloppe.addPaper(A4.get(1));
        enveloppe.addPaper(A4.get(2));

        enveloppe.addPaper(new Paper(2000,2222,3));


        Mail mail = new Mail("Marie Dupont", "12 rue des Fleurs, Paris", enveloppe);
        System.out.println( "papers : " + enveloppe.getPaperCount() +  "  " +
                                "weight : " + enveloppe.getTotalWeight() +  "  g" +
                                "cost : " + mail.getPostageCost() + "  €");

        System.out.println(A4);

    }
}
