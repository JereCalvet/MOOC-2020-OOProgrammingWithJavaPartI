/**
 *
 * @author Jere
 */
import java.util.ArrayList;

public class Statics {

    private ArrayList<Bird> birdList;

    public Statics() {
        this.birdList = new ArrayList<Bird>();
    }

    public void add(Bird bird) {    
        this.birdList.add(bird);
    }

    public void observation(Bird bird) {     
        if (bird != null) {
            bird.setObservationCounter(bird.getObservationCounter() + 1);
        }
    }

    public Bird search(String name) {
        for (Bird bird : birdList) {
            if (StringUtils.EqualsIgnoreCase(bird.getName(), name)) {
               return bird; 
            }
        }
        return null;
    }

    public void printList() {
        for (Bird bird : birdList) {
            System.out.println(bird);
        }
    }
}