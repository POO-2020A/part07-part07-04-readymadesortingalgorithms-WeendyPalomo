
import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // insert test code here
        int[] arrayNumbers = {3, 1, 5, 99, 3, 12};
        String[] arrayString = {"arbol", "casa", "abeja", "dado"};
        Main.sort(arrayNumbers);
        System.out.println(Arrays.toString(arrayNumbers));
        Main.sort(arrayString);
        System.out.println(Arrays.toString(arrayString));
        
        ArrayList<Integer> listNumbers = new ArrayList<>();
        listNumbers.add(25); listNumbers.add(2); listNumbers.add(5); 
        listNumbers.add(11); listNumbers.add(5); listNumbers.add(0);  
        Main.sortIntegers(listNumbers);
        System.out.println(listNumbers);
        
        ArrayList<String> listString = new ArrayList<>();
        listString.add("f"); listString.add("z"); listString.add("w");
        listString.add("e"); listString.add("i"); listString.add("h");
        Main.sortStrings(listString);
        System.out.println(listString);

    }

    public static void sort(int[] array) {
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
    }

    public static void sort(String[] array) {
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);

    }

    public static void sortIntegers(ArrayList<Integer> integers) {
        System.out.println(integers);
        Collections.sort(integers);
    }

    public static void sortStrings(ArrayList<String> strings) {
        System.out.println(strings);
        Collections.sort(strings);
    }

}
