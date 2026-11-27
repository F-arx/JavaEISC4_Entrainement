package fr.univ_eiffel.entrainement.examenEx3_Celebrity;

public class Celebrity {
    private final String name;
    private final int birthYear;
    private int deathYear;

    public Celebrity(String name, int birthYear, int deathYear) {
        if(name == null){
            throw new IllegalArgumentException("name can't be null");
        }
        if(name.isBlank() || birthYear <= 0 || (deathYear < birthYear && deathYear !=0))
        {
            throw new IllegalArgumentException("name empty or Incoherent years");
        }

        this.name = name;
        this.birthYear = birthYear;
        this.deathYear = deathYear;
    }

    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public int getDeathYear() {
        return deathYear;
    }

    public void setDeathYear(int deathYear) {
        this.deathYear = deathYear;
    }

    @Override
    public String toString() {
        return "Celebrity{" +
                "name='" + name + '\'' +
                ", birthYear=" + birthYear +
                ", deathYear=" + deathYear +
                '}';
    }


}
