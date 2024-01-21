import java.util.ArrayList;
import java.util.List;

public class IntersectionOfArrays {

    public static List<Integer> findIntersection(int[] A, int[] B) {
        List<Integer> result = new ArrayList<>();
        int i = 0, j = 0;

        while (i < A.length && j < B.length) {
            if (A[i] == B[j]) {
                result.add(A[i]);
                i++;
                j++;
            } else if (A[i] < B[j]) {
                i++;
            } else {
                j++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] input_A = {1, 2, 3, 3, 4, 5, 6};
        int[] input_B = {3, 3, 5};

        List<Integer> output = findIntersection(input_A, input_B);

        System.out.println(output);
    }
}
