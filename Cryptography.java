import java.util.Arrays;

public class Cryptography {
    public static long encrypt(int[] numbers){
        Arrays.sort(numbers);
        numbers[0] += 1;

        long max = 1;
        for(int val : numbers){
            max *= val;
        }

        return max;
    }

    public static void main(String[] args) {
        int[] numbers = {1,3,2,1,1,3};

        System.out.println(encrypt(numbers));
    }
}
