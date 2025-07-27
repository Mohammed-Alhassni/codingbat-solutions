package src.W;

public class stringE {
    public boolean stringE(String str) {
        int eCount=0;
        for (char eChar: str.toCharArray()){
            if (eChar == 'e'){
                eCount += 1;
            }
        }

        if (eCount >= 1 && eCount <= 3){
            return true;
        } else {
            return false;
        }
    }
}
