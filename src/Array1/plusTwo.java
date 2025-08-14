package src.Array1;

public class plusTwo {
    public int[] plusTwo(int[] a, int[] b) {
        int[] newArr= new int[a.length+b.length];
        for(int i=0;  i < a.length + b.length ; i++){
            if (i < 2){
                newArr[i]= a[i];
            } else {
                newArr[i]= b[i-2];
            }
        }
        return newArr;
    }
}
