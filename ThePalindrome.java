public class ThePalindrome {
    public static int find(String s){
        int start = 0;
        int end = s.length() - 1;
        String addString = "";

        for(int i=0;i<s.length();i++){
            if(start == end){
                break;
            }
            // System.out.println(start + ", " + s.charAt(start));
            // System.out.println(end + ", " + s.charAt(end));
            // 양쪽 끝에서부터 비교 / 데칼코마니처럼
            if(s.charAt(start) != s.charAt(end)){ // start , end 가 다르면 start +=1
                addString = s.charAt(i) + addString;
                start += 1;
            }else{
                start += 1;
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
