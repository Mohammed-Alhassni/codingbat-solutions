package src.String1;

public class lastChars {
    public String lastChars(String a, String b) {
        String finalStr= "";
        if(a.length()>0){ finalStr= a.substring(0,1);} else {finalStr= "@";}
        if(b.length()>0){finalStr+= b.charAt(b.length()-1);} else {finalStr+= "@";}
        return finalStr;
    }
}
