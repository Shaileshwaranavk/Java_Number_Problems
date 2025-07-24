// Condition: A number is Neon if the sum of the digits of its square equals the number itself.

class Main {
    public static void main(String[] args) {
        int n = 4;
        int x = n * n;
        int sum = 0;
        while (x > 0) {
            sum += x % 10;
            x /= 10;
        }
        if (sum == n) {
            System.out.println("Neon Number");
        } else {
            System.out.println("Not a Neon Number");
        }
    }
}
