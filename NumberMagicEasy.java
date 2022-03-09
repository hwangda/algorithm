public class NumberMagicEasy {
    public int theNumber(String answer){
        String binary = "";
        for(int i=0;i<answer.length();i++){ // Y면 0, N이면 1로 치환
            if(answer.charAt(i) == 'Y'){
                binary += "0";
            } else{
                binary += "1";
            }
        }
        int val = Integer.parseInt(binary, 2) + 1; // 치환 후, 1을 더한 값이 답
        return val;
    }
    
    public static void main(String[] args) {
        NumberMagicEasy numberMagicEasy = new NumberMagicEasy();
        
        int answer = numberMagicEasy.theNumber("YYYY");
        System.out.println(answer);
    }
}
