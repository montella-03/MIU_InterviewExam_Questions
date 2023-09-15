package Mius;

public class array {

    
    public static void main(String[] args) {
        int[] arr = { 4, 8, 2, 7, 0 };
    System.out.println(madhav(arr));
}


public static int madhav(int[] a) {
    if (a.length < 3) {
        return 0;
    }
    int sum = 0, p,i,k;
    for ( i = 2;; i++) {
        sum = i * (i + 1) / 2;
        if (sum == a.length) {
            break;

        }
        if (sum > a.length) {
            return 0;
        }
    }
    p = i;

    for (i = 1, k = 1; i < p; i++) {
        sum = 0;
        for (int j = 0; j < i + 1; j++) {
            sum += a[k++];
        }
        if (sum != a[0]) {
            return 0;
        }
    }
    return 1;
        
    }
}
