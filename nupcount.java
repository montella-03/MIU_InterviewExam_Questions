

public class array {
    public static void main(String[] args) {
        int[] arr = { 6, 3, 1 };
    System.out.println(name(arr,6));
        
    }

    public static int name(int[] a, int n) {
        int count = 0, flag = 0, sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];

        }
        if (sum > n && flag == 0) {
            ++count;
            flag = 1;
        }
        if (sum < n) {
            flag=0;
        }
        return count;
        
    }
}
