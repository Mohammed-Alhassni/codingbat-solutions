package src.Warmup2;

public class altPairs {
    public String altPairs(String str) {
        int[] indexes = {0,1,4,5,8,9,12,13};
        String newStr="";
        for (int index: indexes){
            if (index < str.length()){ newStr += str.charAt(index);}
        }
        return newStr;
    }
}
