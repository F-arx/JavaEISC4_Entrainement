package fr.univ_eiffel.entrainement.heritage;

public class Main {
    public static void main(String[] args){
        //testSet();
        testInterface();
    }
    public static void testSet(){
        Person person = new Person("Alice",1998);
        Person person2 = new Person("Bob");
        System.out.println(person.getName() +" "+ person.getBirthYear());
        System.out.println(person2.getName() +" "+ person2.getBirthYear());
        person2.setName("Boby");
        System.out.println(person2.getName() +" "+ person2.getBirthYear());
    }

    public static void testInterface(){
        Person personne = new Person("Alice",2001);
        System.out.println(personne.describe());

    }
}
