// Condition: A number is Armstrong if the sum of the cubes of its digits equals the

class Main {
    public static void main(String[] args) {
        int n = 253;
        int x = n;
        int sum = 0;
        while (x > 0) {
            int y = x % 10;
            sum += y * y * y;
            x /= 10;
        }
        if (sum == n) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }
    }
}
