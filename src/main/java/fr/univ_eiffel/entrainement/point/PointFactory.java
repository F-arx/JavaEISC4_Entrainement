package fr.univ_eiffel.entrainement.point;

import java.util.Random;

public class PointFactory {

    private final Random random = new Random();

    public Point creerPoint(){
        double x = random.nextDouble();
        double y = random.nextDouble();
        return new Point(x,y);
    }


}