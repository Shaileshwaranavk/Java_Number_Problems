// Condition: A number is Pandigital if it contains all digits from 1 to n exactly once.

class Main {
    public static void main(String[] args) {
        int x = 12346;
        boolean Pandigital = false;
        String str = Integer.toString(x);
        for (int i = 0; i < str.length() - 1; i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    Pandigital = false;
                    break;
                } else {
                    Pandigital = true;
                }
            }
            if (!Pandigital) {
                break;
            }
        }
        if (Pandigital) {
            for (int i = 1; i <= str.length(); i++) {
                String h = Integer.toString(i);
                if (!str.contains(h)) {
                    Pandigital = false;
                    break;
                }
            }
        }
        if (Pandigital) {
            System.out.println("Pandigital");
        } else {
            System.out.println("Not Pandigital");
        }
    }
}
