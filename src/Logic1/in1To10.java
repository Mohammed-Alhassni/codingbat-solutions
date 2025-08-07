package src.Logic1;

public class in1To10 {
    public boolean in1To10(int n, boolean outsideMode) {
        if (!outsideMode && n >= 1 && n <= 10){
            return true;
        } else if (outsideMode && (n <= 1 || n >= 10)){
            return true ;
        }
        return false;
    }
}
