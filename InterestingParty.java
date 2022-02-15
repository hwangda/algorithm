import java.util.Arrays;
import java.util.stream.Stream;

public class InterestingParty{
    public static int bestInvitation(String[] first, String[] second){
        int max = 0;
        
        String[] all = Stream.of(first, second).flatMap(Stream::of).toArray(String[]::new);

        String[] kinds = Arrays.stream(all).distinct().toArray(String[]::new); 

        for(String kind :kinds){
            int tmpMax = 0;
            for(int i=0; i<first.length;i++){
                if(first[i].equals(kind) || second[i].equals(kind)){
                    tmpMax += 1;
                }
            }

            if(max < tmpMax){
                max = tmpMax;
            }
        }
        

        return max;
    }

    public static void main(String[] args) {
        String[] first = {"a","b","c"};
        String[] second = {"b","d","ac"};
        int a = bestInvitation(first, second);
        System.out.println(a);
    }
}