
package fr.univ_eiffel.entrainement.point;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // Active uniquement les exercices souhaités
        // exercice1();
        // exercice2();
        // exercice3();
        // exercice4();
        // exercice5();
        // exercice6();
        // exercice7();
        // exercice8();
        // exercice9();
        // exercice10();
        // exercice11();
        // exercice12();
        exercice13();
    }

    // EXERCICE 1 : Constructeur, getters, toString
    public static void exercice1() {
        Point p1 = new Point(3, 2);
        Point p2 = new Point(5, 7);

        System.out.println(p1.getX());
        System.out.println(p1.getY());

        System.out.println(p1);
        System.out.println(p2);
    }

    // EXERCICE 2 : equals et hashCode
    public static void exercice2() {
        Point p1 = new Point(3, 2);
        Point p2 = new Point(5, 7);
        Point p3 = new Point(3, 2);

        //System.out.println(p3 == p2);
        //System.out.println(p3 == p1);

        System.out.println(p3.equals(p2));
        System.out.println(p3.equals(p1));

        System.out.println(p1.hashCode());
        System.out.println(p3.hashCode());
    }

    // EXERCICE 3 : Records
    public static void exercice3() {
        PointRecord p1 = new PointRecord(3, 5);
        System.out.println(p1);
        //test de ce qui est generer automatiquement
        System.out.println(p1.x());
        System.out.println(p1.y());
        System.out.println(p1.hashCode());
        PointRecord p2 = new PointRecord(3, 5);
        System.out.println(p2.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p1.equals(p2));

        //Le contructeur, hash code, la methode get, toString et equals sont automatiquement crées avec Record
    }

    // EXERCICE 4 : Calcul distance d'un point
    public static void exercice4() {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(3, 1);

        double d = p1.distanceTo(p2);
        double d2 = p2.distanceTo(p1);
        System.out.println("Distance = " + d);
        System.out.println("Distance = " + d2);

        //Methode distanceToOrigin
        double d3 = p1.distanceToOrigin();
        double d4 = p2.distanceToOrigin();
        System.out.println("Distance = " + d3);
        System.out.println("Distance = " + d4);

    }

    // EXERCICE 5 : Generer des point aleatoire :

    public static void exercice5() {

        PointFactory factory = new PointFactory();

        for (int i = 0; i < 10; i++) {
            Point p = factory.creerPoint();
            System.out.println("Point " + (i + 1) + " : " + p);
        }
    }

    // EXERCICE 6 : forme cercle:
    public static void exercice6() {

        Point centre = new Point(0, 0);
        Circle cercle = new Circle(centre, 3);

        System.out.println("Aire cercle = " + cercle.area());
        System.out.println("Périmètre cercle = " + cercle.perimeter());
    }

    // EXERCICE 7 : forme carré:

    public static void exercice7() {
        Square carre = new Square(4);

        System.out.println(" Aire du carré = " + carre.area());
        System.out.println(" Périmètre du carré = " + carre.perimeter());

    }

    // EXERCICE 8 : forme carré:

    public static void exercice8() {
        Rectangle rectangle = new Rectangle(3,2);

        System.out.println(" Aire du rectangle = " + rectangle.area());
        System.out.println(" Périmètre du rectangle = " + rectangle.perimeter());

    }

    // EXERCICE 9 : trois variables de type Shape
    public static void exercice9() {
        Shape forme1 = new Circle(new Point(0,0),1);
        Shape forme2 = new Square(2);
        Shape forme3 = new Rectangle(2,3);

        System.out.println("Air du cercle = " + forme1.area());
        System.out.println("Périmètre du cercle = " + forme1.perimeter());
        System.out.println();
        System.out.println("Air du carre = " + forme2.area());
        System.out.println("Périmètre du carre = " + forme2.perimeter());
        System.out.println();
        System.out.println("Air du rectangle = " + forme3.area());
        System.out.println("Périmètre du rectangle = " + forme3.perimeter());
    }
    // EXERCICE 10 :

    public static void exercice10(){
        Shape[] forme = {
                new Circle(new Point(0,0),1),
                new Square(2),
                new Rectangle(3,2)
        };

        for(int i=0;i<3;i++){
            System.out.println();
            System.out.println("Périmètre = " + forme[i].perimeter());
            System.out.println("Aire = " + forme[i].area());
        }
    }

    // EXERCICE 11 : For each
    public static void exercice11() {
        Shape[] forme = {
                new Circle(new Point(0,0),1),
                new Square(2),
                new Rectangle(3,2)
        };

        for(Shape f : forme)
        {
            System.out.println();
            System.out.println("Aire = " + f.area());
            System.out.println("Périmètre = " + f.perimeter());
        }

    }
    // EXERCICE 12 : Polygon
    public static void exercice12() {
        Polygon f1 = new Triangle(
                new Point(0,0),
                new Point(0,1),
                new Point(1,1)
        );
        System.out.println(f1.perimeter());
        System.out.println((f1.area()));
        System.out.println((Math.round(10*f1.area()))/10.0
        );
        System.out.printf("Aire = %.1f", f1.area());
    }
    // EXERCICE 13 : CompareTo et tri
    public static void exercice13() {
        Point p1 = new Point(2,5);
        Point p2 = new Point(3,5);
        Point p3 = new Point(2,7);

        int a = p1.compareTo(p2);
        int b = p1.compareTo(p3);
        System.out.println(a);
        System.out.println(b);
        int c = p2.compareTo(p1);
        int d = p3.compareTo(p1);
        System.out.println(c);
        System.out.println(d);

        Point[] points = {
                new Point(3, 2),
                new Point(1, 5),
                new Point(3, 1),
                new Point(0, 4)
        };
        System.out.println();

        for (Point p : points){
            System.out.println(p);
        }
        System.out.println();

        Arrays.sort(points);

        for(Point p : points) {
            System.out.println(p);
        }



    }

}