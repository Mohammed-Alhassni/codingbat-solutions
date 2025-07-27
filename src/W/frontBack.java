package src.W;

public class frontBack {
    public String frontBack(String str) {
        char first;
        char last;
        if (str.length() > 1){
            first=str.charAt(0);
            last=str.charAt(str.length()-1);
        } else {
            return str;
        }

        return last+str.substring(1, str.length()-1)+first;
    }
}
