package src.Warmup2;

public class stringSplosion {
    public String stringSplosion(String str) {
        String newStr="";
        for (int i =0; i <= str.length()-1; i++){
            newStr = newStr + str.substring(0, i+1);
        }
        return newStr;
    }
}
