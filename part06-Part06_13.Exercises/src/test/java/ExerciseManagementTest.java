

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author Jere
 */
public class ExerciseManagementTest {
    
    private ExerciseManagement management;
        
    @Before
    public void initialize(){
        management = new ExerciseManagement(); 
    }
    
    @Test
    public void exerciseListEmptyAtBeginning() {
        assertEquals(0, management.exerciseList().size());
    }                        
    
    @Test
    public void addingExerciseGrowsListByOne() {
        management.add("Write a test");        
        assertEquals(1, management.exerciseList().size());
    }
    
    @Test
    public void addedExerciseIsInList(){
        management.add("Write a test");
        assertTrue(management.exerciseList().contains("Write a test"));   
    }
    
    @Test
    public void exerciseCanBeMarkedAsCompleted() {
        management.add("new exercise");
        management.markAsCompleted("new exercise");
        assertTrue(management.isCompleted("new exercise"));
    }
    
    @Test
    public void ifNotMarkedIsNotCompleted() {
        management.add("new exercise");
        management.markAsCompleted("New exercise");
        assertFalse(management.isCompleted("some exercise"));
    }
}
