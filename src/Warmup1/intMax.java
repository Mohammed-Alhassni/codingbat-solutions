package src.Warmup1;

public class intMax {
    public int intMax(int a, int b, int c) {
        if (a>b && a > c){
            return a;
        } else if (b > a && b > c){
            return b;
        } else {
            return c;
        }
    }
}
