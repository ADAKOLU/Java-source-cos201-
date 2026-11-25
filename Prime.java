public class Primes {
    public static void main(String[] args) {
        for (int num = 2; num <= 500; num++) {
            boolean isPrime = true;

            for (int d = 2; d * d <= num; d++) {
                if (num % d == 0) {   
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    }
}
