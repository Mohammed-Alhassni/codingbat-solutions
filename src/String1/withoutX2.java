package src.String1;

public class withoutX2 {
    public String withoutX2(String str) {
        String newStr= "";
        for (int i=0; i< str.length(); i++){
            if (i != 0 && i != 1){
                newStr+= str.charAt(i);
            } else if ((i == 0 || i == 1) && (str.charAt(i)!='x')){
                newStr+= str.charAt(i);
            }
        }
        return newStr;
    }
}
