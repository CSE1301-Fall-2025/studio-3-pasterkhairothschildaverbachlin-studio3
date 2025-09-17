import java.util.*;

public class Sieve {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("what number do you want to choose?");
        int n = scan.nextInt();
        boolean[] prime = new boolean[n];

        for (int i = 1; i <= prime.length; i++){
            prime[i-1] = true;
        }

        for (int i = 2; i <= Math.sqrt(n); i++){
            int test = i+i;
            while (test <= n){
                prime[test-1] = false;
                test = test + i;
            }
        }

        for (int i = 1; i <= prime.length; i++){
            if(prime[i-1]){
                System.out.println(i);
        }
    }
}
}
