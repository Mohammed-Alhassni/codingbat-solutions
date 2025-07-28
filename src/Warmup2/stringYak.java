package src.Warmup2;

public class stringYak {
    public String stringYak(String str) {
        String newStr= "";
        for(int i=0; i < str.length(); i++){
            if (i <= str.length()-3 && str.charAt(i)=='y' && str.charAt(i+2)=='k'){
                i =  i + 2;
            } else {
                newStr += str.charAt(i);
            }
        }
        return newStr;
    }
}
