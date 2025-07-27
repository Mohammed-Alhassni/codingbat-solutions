package src;

public class startOz {
    public String startOz(String str) {
        boolean first = false;
        boolean second = false;

        if (str.length()>0){
            first = str.charAt(0) == 'o';
        }
        if (str.length()>1){
            second = str.charAt(1)== 'z';
        }

        if (first && second){
            return "" + str.substring(0,1) + str.substring(1,2);
        } if (first){
            return str.substring(0,1);
        } else if (second){
            return str.substring(1,2);
        } else

            return "";
    }
}
