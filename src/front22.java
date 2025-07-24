package src;

public class front22 {
    public String front22(String str) {
        if (str.length()>2){
            String first2Char = str.substring(0, 2);
            return first2Char+str+first2Char;
        }
        return str+str+str;
    }
}
