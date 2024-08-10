public class bin {
    static String toBinaryString(int n) {
        // Convert the number to its binary string representation
        return Integer.toBinaryString(n);
    }

    static boolean hasConsecutiveOnes(String bin) {
        for (int i = 0; i < bin.length() - 1; i++) {
            if (bin.charAt(i) == '1' && bin.charAt(i + 1) == '1') {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // Iterate through all numbers from 1 to 100
        for (int i = 1; i <= 100; i++) {
            String binaryString = toBinaryString(i);
            if (hasConsecutiveOnes(binaryString)) {
                System.out.println(i + " in binary: " + binaryString);
            }
        }
    }
}
