import java.util.ArrayList;
import java.util.Arrays;

public class InterestingDigits {
    public static int[] digits(int base){
        ArrayList<Integer> array = new ArrayList<Integer>();
        for(int i=2;i<base;i++){
            if((base-1) % i == 0){
                array.add(i);
            }
        }

        int[] result = array.stream().mapToInt(i -> i).toArray();
        return result;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(digits(10)));
    }
}
