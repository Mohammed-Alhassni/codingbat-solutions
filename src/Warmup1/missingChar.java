package src.Warmup1;

public class missingChar {
    public String missingChar(String str, int n) {
        String newStr= "";
        if (str.length() > 0 && n <= str.length()-1){
            for (int i= 0; i <= str.length()-1; i++){
                if (str.charAt(i) != str.charAt(n)){
                    newStr= newStr+str.charAt(i);
                }
            }
        }
        return newStr;
    }
}
