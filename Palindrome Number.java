// Condition: A number is Palindrome if it reads the same forward and backward.

class Main {
    public static void main(String[] args) {
        int x = 1221;
        int n = x;
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        if (rev == x) {
            System.out.println("Palindrome Number");
        } else {
            System.out.println("Not a Palindrome Number");
        }
    }
}
