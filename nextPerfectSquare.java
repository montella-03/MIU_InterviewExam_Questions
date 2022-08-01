

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
