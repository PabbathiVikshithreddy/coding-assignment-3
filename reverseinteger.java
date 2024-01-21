public class ReverseInteger {

    public static int reverse(int x) {
        int result = 0;

        while (x != 0) {
            int digit = x % 10;

            // Check for overflow before updating the result
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && digit > 7))
                return 0;
            if (result < Integer.MIN_VALUE / 10 || (result == Integer.MIN_VALUE / 10 && digit < -8))
                return 0;

            result = result * 10 + digit;
            x /= 10;
        }

        return result;
    }

    public static void main(String[] args) {
        int input1 = 123;
        System.out.println("Input 1: " + reverse(input1));

        int input2 = -123;
        System.out.println("Input 2: " + reverse(input2));
    }
}
