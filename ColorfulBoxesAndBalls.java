
public class ColorfulBoxesAndBalls {
    public static int getMaximum(int numRed, int numBlue, int onlyRed, int onlyBlue, int bothColors){
        int answer = onlyRed * numRed + onlyBlue * numBlue;
        if(numRed > numBlue){
            int sum = onlyRed * (numRed - numBlue) + 2 * numBlue * bothColors;

            answer = Math.max(answer, sum);
        }else{
            int sum = onlyBlue * (numBlue - numRed) + 2 * numRed * bothColors;

            answer = Math.max(answer, sum);
        }
        //색이 맞춰져 있게 들어가 있는 상태 vs 최대한 색상을 바꾼 상태 중 높은 것을 고르면 됐다.
        return answer;
    }
    
    public static void main(String[] args) {
        System.out.println(getMaximum(2, 3, 100, 400, 200));
    }
}
