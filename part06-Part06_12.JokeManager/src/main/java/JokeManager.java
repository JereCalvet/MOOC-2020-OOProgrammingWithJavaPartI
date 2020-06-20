
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Jere
 */
public class JokeManager {
    private List<String> jokes;
    
    public JokeManager() {
        this.jokes = new ArrayList<>();
    }
  
    public void addJoke(String joke) {
        jokes.add(joke);
    }
    
    public String drawJoke() {
        Random random = new Random();
        int size = jokes.size();
        return jokes.isEmpty() ? "Jokes are in short supply." : jokes.get(random.nextInt(size));
    }
    
    public void printJokes() {
       // jokes.stream().forEach(System.out::println);
        for (String joke : jokes) {
            System.out.println(joke);
        }
    }
}
