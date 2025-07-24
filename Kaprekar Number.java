// Condition: A number is Kaprekar if its square can be split into two parts that sum to the number.

class Main {
    public static void main(String[] args) {
        int x = 12;
        int y = x * x;
        int n = y;
        int digit_count = 0;
        while (n > 0) {
            digit_count++;
            n /= 10;
        }
        int mod = 1;
        for (int i = 0; i < digit_count / 2; i++) {
            mod *= 10;
        }
        int g = y % mod;
        int h = y / mod;
        if (g + h == x && g != 0) {
            System.out.println("Kaprekar Number");
        } else {
            System.out.println("Not a Kaprekar Number");
        }
    }
}
