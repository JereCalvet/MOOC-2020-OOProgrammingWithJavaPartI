  
/**
 *
 * @author Jere
 */
public class StringUtils {
   public static boolean EqualsIgnoreCase(String command, String input){
        if (command.isEmpty() || input.isEmpty()){
            return false;
        } 
        return command.toUpperCase().equals(input.toUpperCase());
    }  
}