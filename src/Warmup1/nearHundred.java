package src.Warmup1;

public class nearHundred {
    public boolean nearHundred(int n) {
        return Math.abs(n-100) <= 10 || Math.abs(n-200) <= 10 ;
    }
}
