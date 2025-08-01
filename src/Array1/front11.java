package src.Array1;

public class front11 {
    public int[] front11(int[] a, int[] b) {
        if (a.length > 0 && b.length > 0){
            int[] newArr={a[0], b[0]};
            return newArr;
        } else if  (a.length > 0 || b.length > 0){
            int[] newArr= new int[1];
            if (a.length > 0) newArr[0]=a[0];
            if (b.length > 0) newArr[0]=b[0];
            return newArr;
        }
        return new int[0];
    }
}
