// Condition: A number is Happy if repeatedly replacing it with the sum of squares of its digits eventually results in 1.

class Main {
    public static void main(String[] args) {
        int x = 17;
        int n = x;
        while (n != 1 && n != 4) {
            int sum = 0;
            while (n > 0) {
                int digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }
            n = sum;
        }
        if (n == 1) {
            System.out.println("Happy Number");
        } else {
            System.out.println("Not a Happy Number");
        }
    }
}
