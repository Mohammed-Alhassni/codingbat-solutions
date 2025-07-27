package src.W;

public class close10 {
    public int close10(int a, int b) {
        int first = Math.abs(10 - a);
        int second = Math.abs(10 - b);

        if (first < second){
            return a;
        } else if (first > second) {
            return b;
        } else {
            return 0;
        }
    }
}
