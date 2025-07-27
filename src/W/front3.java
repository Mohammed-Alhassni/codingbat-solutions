package src.W;

public class front3 {
    public String front3(String str) {
        if (str.length()>=3){
            String front3= str.substring(0, 3);
            return front3+front3+front3;
        }
        return str+str+str;
    }
}
