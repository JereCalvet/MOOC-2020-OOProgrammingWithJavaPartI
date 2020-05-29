
public class ArrayPrinter {

    public static void main(String[] args) {
        // You can test your method here
        int[] array = {5, 1, 3, 4, 2};
        printNeatly(array);
    }

    public static void printNeatly(int[] array) {
        String result = "";
        for (int i : array) {
            result += i + ", ";
        }
        System.out.println(result.substring(0, result.length() - 2));
    }
}
