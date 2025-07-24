package src;

public class missingChar {
    public String missingChar(String str, int n) {
        String newStr= "";
        if (str.length() > 0 && n < str.length()){
            for (int i= 0; i < str.length(); i++){
                if (str.charAt(i) != str.charAt(n)){
                    newStr+= str.charAt(i);
                }
            }
        }
        return newStr;
    }
}
