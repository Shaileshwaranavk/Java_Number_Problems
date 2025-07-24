// Condition: A number is Automorphic if its square ends with the number itself.

class Main {
    public static void main(String[] args) {
        int x = 76;
        int n = x * x;
        int mod = 1;
        int digit_count = 0;
        int a = x;
        while (a > 0) {
            digit_count++;
            a /= 10;
        }
        for (int i = 0; i < digit_count; i++) {
            mod *= 10;
        }
        if ((n % mod) == x) {
            System.out.println("Automorphic Number");
        } else {
            System.out.println("Not an Automorphic Number");
        }
    }
}
