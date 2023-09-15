package Mius;

public class array {
    public static void main(String[] args) {

        System.out.println(reverse(-1891));

    }

    public static int reverse(int n) {
        int sign = -1;
        n *= sign;
       int reverse = 0;
       int rem;
       while (n != 0) {
           rem = n % 10;
           reverse = (reverse * 10) + rem;
           n = n / 10;

       }
       return reverse * sign;
    }
    
}
