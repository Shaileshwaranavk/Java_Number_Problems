//Condition:
//If the sum of proper divisors is greater than the number → Abundant
//If less → Deficient
//If equal → Perfect

class Main {
    public static void main(String[] args) {
        int x = 21;
        int sum = 0;
        for (int i = 1; i < x; i++) {
            if (x % i == 0) {
                sum += i;
            }
        }
        if (sum > x) {
            System.out.println("Abundant Number");
        } else if (sum < x) {
            System.out.println("Deficient Number");
        } else {
            System.out.println("Perfect Number");
        }
    }
}
