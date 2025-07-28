package src.String1;

public class minCat {
    public String minCat(String a, String b) {
        if (a.length()!=b.length()){
            String newStr;
            if (a.length()>b.length()){
                newStr= a.substring(a.length()-b.length(), a.length());
                return newStr+b;
            } else {
                newStr= b.substring(b.length()-a.length(), b.length());
                return a+newStr;
            }
        }
        return a+b;
    }
}
