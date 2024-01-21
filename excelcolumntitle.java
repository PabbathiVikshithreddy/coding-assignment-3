public class ExcelColumnTitle {

    public static String convertToTitle(int A) {
        StringBuilder result = new StringBuilder();

        while (A > 0) {
            A--; // Adjust to convert 1-based index to 0-based index
            char ch = (char) ('A' + A % 26);
            result.insert(0, ch);
            A /= 26;
        }

        return result.toString();
    }

    public static void main(String[] args) {
        int input1 = 1;
        System.out.println("Input 1: " + convertToTitle(input1));

        int input2 = 28;
        System.out.println("Input 2: " + convertToTitle(input2));
    }
}
