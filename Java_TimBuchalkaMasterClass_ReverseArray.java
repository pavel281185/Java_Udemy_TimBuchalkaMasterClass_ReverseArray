import java.util.Arrays;

public class ReverseArray {
    private static void reverse(int[] array){
        System.out.println("Array = " + Arrays.toString(array));
        
        for(int i = 0; i < array.length / 2; i++){
            int holdNumber = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = holdNumber;
        }
        
        System.out.println("Reversed array = " + Arrays.toString(array));
    }
}
