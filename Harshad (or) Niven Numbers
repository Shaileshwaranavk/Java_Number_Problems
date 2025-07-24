// Condition: A number is Harshad if it is divisible by the sum of its digits.

class Main {
    public static void main(String[] args) {
        int n = 15;
        int x = n;
        int sum = 0;
        while (x > 0) {
            sum += x % 10;
            x /= 10;
        }
        if (n % sum == 0) {
            System.out.println("Harshad Number");
        } else {
            System.out.println("Not a Harshad Number");
        }
    }
}
