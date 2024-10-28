import java.util.Scanner;

public class PermutationCombinationUtils {

    public static long factorial(int number) {
        long result = 1;
        for (int factor = 2; factor <= number; factor++) {
            result *= factor;
        }
        return result;
    }

    public static long permutation(int n, int r) {
        if (n < r) return 0;  // Return 0 for invalid cases
        return factorial(n) / factorial(n - r);
    }

    public static long combination(int n, int r) {
        if (n < r) return 0;  // Return 0 for invalid cases
        return factorial(n) / (factorial(r) * factorial(n - r));
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter total items n: ");
        int n = scanner.nextInt();
        System.out.print("Enter items to be chosen or arranged r: ");
        int r = scanner.nextInt();

        if (n < r) {
            System.out.println("r cannot be greater than n.");
        } else {
            long permutations = permutation(n, r);
            long combinations = combination(n, r);

            System.out.println("Permutations P(" + n + ", " + r + "): " + permutations);
            System.out.println("Combinations C(" + n + ", " + r + "): " + combinations);
        }
    }
}
