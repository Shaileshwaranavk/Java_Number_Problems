// Condition: A number is perfect if the sum of its proper divisors equals the number.

class Main {
    public static void main(String[] args) {
        int x = 12;
        int sum = 0;
        for (int i = 1; i < x; i++) {
            if (x % i == 0) {
                sum += i;
            }
        }
        if (sum == x) {
            System.out.println("Perfect Number");
        } else {
            System.out.println("Not a Perfect Number");
        }
    }
}
