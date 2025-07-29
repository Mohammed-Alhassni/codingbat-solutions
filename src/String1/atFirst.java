package src.String1;

public class atFirst {
    public String atFirst(String str) {
        String finalStr= "@@";
        if (str.length()>0) finalStr= str.substring(0,1);
        if (str.length()>1) finalStr+= str.charAt(1);
        if (finalStr.length()==1) finalStr+= "@";
        return finalStr;
    }
}
