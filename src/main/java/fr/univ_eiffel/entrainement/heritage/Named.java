package fr.univ_eiffel.entrainement.heritage;

public interface Named {
    String getName();
    default String describe(){
        return "Nom : "+ getName();
    }
}
