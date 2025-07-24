// Condition: A number is Emirp if it is prime and its reverse is also prime (and not the same).

class Main {
    public static void main(String[] args) {
        int x = 13;
        int rev = 0;
        int n = x;
        while (n > 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        if (isPrime(x) && isPrime(rev) && x != rev) {
            System.out.println("Emirp Number");
        } else {
            System.out.println("Not an Emirp Number");
        }
    }

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
