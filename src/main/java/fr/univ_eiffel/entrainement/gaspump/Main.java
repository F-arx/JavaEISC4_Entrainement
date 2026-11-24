package fr.univ_eiffel.entrainement.gaspump;

public class Main {
    public static void main(String[] args) {

        //testGasPomp();
        //testTakeGaz();
        testBillets();


    }

    public static void testGasPomp() {
        GasPump pompe = new GasPump(100,2.0);
        System.out.println(pompe.getCapacityAvailable());
        pompe.fill(20);
        System.out.println(pompe.getCapacityAvailable());
        pompe.fill(81);
        System.out.println(pompe.getCapacityAvailable());
        pompe.fill(-20);
        System.out.println(pompe.getCapacityAvailable());
        pompe.fill(80);
        System.out.println(pompe.getCapacityAvailable());

        System.out.println(pompe.getBillets());

    }

    public static void testTakeGaz(){


        GasPump pompe = new GasPump(100, 2);

        try {
            pompe.fill(110);
        } catch (IllegalArgumentException e){
            System.out.println("Erreur : "+ e.getMessage());
        }
        try {
            pompe.takeGas(10);
        } catch (IllegalStateException e){
            System.out.println("Erreur : "+ e.getMessage());
        }
        try {
            pompe.takeGas(-10);
        } catch (IllegalArgumentException e){
            System.out.println("Erreur : "+ e.getMessage());
        }
    }

    public static void testBillets() {
        GasPump pompe = new GasPump(100,3);
        System.out.println(pompe.getBillets());
        //Remplir la pompe
        pompe.fill(100);
        //Trois client qui achette  10 / 20 / 10
        pompe.takeGas(10);
        pompe.takeGas(20);
        pompe.takeGas(10);
        //aficher le nombre de bille de 10 et 20
        System.out.println(pompe.getBillets());
        System.out.println("Caisse : "+ pompe.getBasketTotal());
        System.out.println(pompe); // ToString
        GasPump pompe1 = new GasPump(100, 2);
        GasPump pompe2 = new GasPump(100, 2);

        System.out.println(pompe1.equals(pompe2));
        System.out.println(pompe1.hashCode());
        System.out.println(pompe2.hashCode());
    }




}
