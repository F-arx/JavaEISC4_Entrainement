package V2_entrainement.gasPump;

public class Main {
    public static void main(String[] args){
        testGasPump();
    }

    public static void testGasPump(){
        GasPump pompe = new GasPump(100,2.5);
        System.out.println(pompe.getCapacityMax()+" "+pompe.getPrice());
        try {
            pompe.fill(101);
        }catch (IllegalArgumentException e){
            System.out.println("Erreur1 : " + e.getMessage());
        }catch (IllegalStateException e1){
            System.out.println("Erreur : " + e1.getMessage());
        }
    }
}
