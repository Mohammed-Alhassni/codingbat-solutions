package src.Warmup2;

public class stringTimes {
    public String stringTimes(String str, int n) {
        String newStr= "";
        for (int i=1; i <= n ; i++ ){
            newStr= newStr + str;
        }
        return newStr;
    }
}
