/**
 *
 * @author Jere
 */
public class Bird {
    private String name;
    private String latinName;
    private int observationCounter;
    
    //constructor
    public Bird(String name, String latinName){
        this.name = name;
        this.latinName = latinName;
        this.observationCounter = 0;
    }

    //getter-setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLatinName() {
        return latinName;
    }
    
    public void setLatinName(String latinName) {
        this.latinName = latinName;
    }

    public void setObservationCounter(int observationCounter) {
        this.observationCounter = observationCounter;
    }

    public int getObservationCounter() {
        return observationCounter;
    }

    @Override
    public String toString(){
        return this.name+" ("+this.latinName+"): "+this.observationCounter+" observations";
    }
}