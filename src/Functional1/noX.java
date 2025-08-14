package src.Functional1;
import java.util.List;

public class noX {
    public List<String> noX(List<String> strings) {
        strings.replaceAll(str-> removeX(str));
        return strings;
    }

    public String removeX(String str){
        String newStr="";
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)!= 'x'){
                newStr+= str.charAt(i);
            }
        }
        return newStr;
    }
}
