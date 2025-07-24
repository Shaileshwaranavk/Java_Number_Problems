// Condition: A number is Spy if the sum and product of its digits are equal.

class Main {
    public static void main(String[] args) {
        int x = 123;
        int sum = 0;
        int prod = 1;
        while (x > 0) {
            sum += x % 10;
            prod *= x % 10;
            x /= 10;
        }
        if (sum == prod) {
            System.out.println("Spy Number");
        } else {
            System.out.println("Not a Spy Number");
        }
    }
}
