package src.String1;

public class seeColor {
    public String seeColor(String str) {
        boolean redCol= false;
        boolean blueCol= false;
        if (str.length()>2){
            redCol= str.substring(0,3).equals("red");
        }

        if (str.length()>3){
            blueCol = str.substring(0,4).equals("blue");
        }

        if ( redCol || blueCol ){
            if (redCol) return str.substring(0,3);
            return str.substring(0,4);
        }
        return "";
    }
}
