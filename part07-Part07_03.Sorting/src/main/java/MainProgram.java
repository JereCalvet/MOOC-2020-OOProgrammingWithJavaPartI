
import java.util.Arrays;

public class MainProgram {

    public static int smallest(int[] ar) {  
        int smallest = Arrays.stream(ar).min().getAsInt();
//        int smallest = Integer.MAX_VALUE;
//        for (int i = 0; i < ar.length; i++) {
//            if (smallest > ar[i]) {
//                smallest = ar[i];
//            }
//        }
        return smallest;
    }

    public static int indexOfSmallest(int[] ar) {
        int index = Integer.MAX_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < ar.length; i++) {
            if (smallest > ar[i]) {
                smallest = ar[i];
                index = i;
            }
        }
        return index;
    }

    public static int indexOfSmallestFrom(int[] ar, int startIndex) {
        int index = Integer.MAX_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = startIndex; i < ar.length; i++) {
            if (smallest > ar[i]) {
                smallest = ar[i];
                index = i;
            }
        }
        return index;
    }
    
    public static void swap(int[] ar, int index1, int index2) {
        int temp = ar[index1];
        ar[index1] = ar[index2];
        ar[index2] = temp;
//        ar[index1] = ar[index1] + ar[index2];
//        ar[index2] = ar[index1] - ar[index2];
//        ar[index1] = ar[index1] - ar[index2];
    }
    
    public static void sort(int[] ar) {
        for (int i = 0; i < ar.length; i++) {
            int indexOfSmallest = indexOfSmallestFrom(ar, i);
            swap(ar, i, indexOfSmallest);
        }
    }
    
    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 2, 5, 99, 3, 12};
        System.out.println(smallest(array));
    }

}
