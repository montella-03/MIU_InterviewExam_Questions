public class array {

    
public static void main(String[] args) {
    System.out.println(primeCount(3, 21));
}

public static int primeCount(int start, int end) {
        int count = 0, i, j, prime;
        if(start < 2) start = 2;
        
        for(i = start; i <= end; i++) {
            if(i == 2) {
                count++;
                continue;
            }
            prime = 1;
            for(j = 2; j < i; j++) {
                if(i % j == 0) {
                    prime = 0;
                    break;
                }
            }
            if(prime == 1) 
              count++ ;
        }
        
        return count;
    }
}
