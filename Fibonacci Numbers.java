// Condition: Prints the first n Fibonacci numbers.

class Main {
    public static void main(String[] args) {
        int n = 3;
        int a1 = 0;
        int a2 = 1;
        System.out.print(a1 + " ");
        System.out.print(a2 + " ");
        for (int i = 2; i < n; i++) {
            int a = a1 + a2;
            System.out.print(a + " ");
            a1 = a2;
            a2 = a;
        }
    }
}
