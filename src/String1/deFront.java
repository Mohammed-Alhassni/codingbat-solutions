package src.String1;

public class deFront {
    public String deFront(String str) {
        if (str.length()>2) {
            String strEnd= str.substring(2);
            String firstChars="";
            if (str.charAt(0)=='a') firstChars+= str.charAt(0);
            if (str.charAt(1)=='b') firstChars+= str.charAt(1);
            return firstChars+strEnd;
        }
        String newStr="";
        if (str.charAt(0)=='a') newStr+= str.charAt(0);
        if (str.charAt(1)=='b') newStr+= str.charAt(1);
        return newStr;
    }
}
