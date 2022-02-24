public class ThePalindrome {
    public static int find(String s){
        int end = s.length() - 1;
        String addString = "";

        for(int i=0;i<s.length();i++){
            if(i == end){
                break;
            }
            // System.out.println(start + ", " + s.charAt(start));
            // System.out.println(end + ", " + s.charAt(end));
            // 양쪽 끝에서부터 비교 / 데칼코마니처럼
            if(s.charAt(i) != s.charAt(end)){ // start , end 가 다르면 start +=1
                addString = s.charAt(i) + addString;
            }else{
                end -= 1;
            }
            // System.out.println(addString);
        }  
        
        return s.length() + addString.length();      
    }

    public static void main(String[] args) {
        System.out.println(find("query"));
        System.out.println(find("abab"));
    }

}
