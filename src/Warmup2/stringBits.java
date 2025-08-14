package src.Warmup2;

public class stringBits {
    public String stringBits(String str) {
        String newStr= "";
        for (int i=0; i <= str.length()-1; i+=2){
            newStr+= str.charAt(i);
        }
        return newStr;
    }
}
