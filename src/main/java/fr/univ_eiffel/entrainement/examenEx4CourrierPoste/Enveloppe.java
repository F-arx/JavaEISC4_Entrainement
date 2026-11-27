package fr.univ_eiffel.entrainement.examenEx4CourrierPoste;

import java.util.ArrayList;

public class Enveloppe{
    private final ArrayList<Paper> papers = new ArrayList<Paper>();
    private double height;
    private double length;
    private double emptyWeight; //g/m2


    /*
    public Enveloppe(double height_mm, double length_mm, double grammage, ArrayList<Paper> papers, double height, double length, double emptyWeight) {
        if( length<= 0 || height <= 0 || emptyWeight <= 0 || papers.isEmpty()){
            throw new IllegalArgumentException("Arguments be positive");
        }
        super(height_mm, length_mm, grammage);
        this.papers = papers;
        this.height = height;
        this.length = length;
        this.emptyWeight = emptyWeight;
    }
    */



    public Enveloppe(double height, double length, double emptyWeight) {
        if( length<= 0 || height <= 0 || emptyWeight <= 0){
            throw new IllegalArgumentException("Arguments be positive");
        }
        this.height = height;
        this.length = length;
        this.emptyWeight = emptyWeight;
    }


    public void addPaper(Paper paper){
        if(paper == null){
            throw new IllegalArgumentException("Paper cant be null");
        }
        if((paper.getLength_mm() <= this.height && paper.getHeight_mm() <= this.length)
        || (paper.getLength_mm() <= this.length && paper.getHeight_mm() <= this.height)){
            this.papers.add(paper);
        } else{
            throw new IllegalArgumentException("paper wrong dimensions");
        }


    }

    public int getPaperCount(){
        return this.papers.size();
    }

    public double getTotalWeight(){
        double totalWeight = this.emptyWeight;
        for(int i = 0; i < this.papers.size(); i++){
          totalWeight += this.papers.get(i).getWeight();
        }
        return totalWeight;
    }

}
