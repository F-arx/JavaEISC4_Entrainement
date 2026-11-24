package fr.univ_eiffel.entrainement.heritage;

public class Person implements Named{
    private String name;
    private final int birthYear;

    public Person(String name,int birthYear){
        this.name = name;
        this.birthYear = birthYear;
    }

    public Person(String name){
        this(name,2000);
    }

    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String describe() {
        return Named.super.describe();
    }
}
