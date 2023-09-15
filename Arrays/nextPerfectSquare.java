package Mius;

public class array {
    public static void main(String[] args) {

        System.out.println(perfectNextNumber(10));

    }

    public static int perfectNextNumber(int n) {
        if (n < 0) {
            return 0;
        }
        int next = (int) Math.sqrt(n) + 1;
        return next * next;
    }
    
}
// 
public class array {

    public static void main(String[] args) {
        System.out.println(name(6));
    }

    public static int name(int n) {
        if (n < 0) {
            return 0;
        }
        int ans = 1;
        for (int i = 0;; i++) {
            ans = i * i;
            if (n < ans) {
                break;
            }
        }
        return ans;
        
        
    }
}
