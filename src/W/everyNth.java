package src.W;

public class everyNth {
    public String everyNth(String str, int n) {
        String newString="";
        for (int i=0; i <= str.length()-1; i+=n ){
            newString+= str.charAt(i);
        }
        return newString;
    }
}
