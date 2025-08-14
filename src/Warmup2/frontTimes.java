package src.Warmup2;

public class frontTimes {
    public String frontTimes(String str, int n) {
        String newStr= "";
        for (int i= 1; i <= n; i++){
            if (str.length() <= 3){
                newStr += str;
            } else {
                newStr += str.substring(0, 3);
            }
        }
        return newStr;
    }
}
