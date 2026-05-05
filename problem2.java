    import java.util.*;

    public class problem2 {
    public static int minOperations(int[] arr, int k) {
        int n = arr.length;
        int minOps = Integer.MAX_VALUE;

        for (int target : arr) {
            int operations = 0;
            boolean possible = true;

            for (int i = 0; i < n; i++) {
                int diff = Math.abs(arr[i] - target);

                if (diff % k != 0) {
                    possible = false;
                    break;
                }

                operations += diff / k;
            }

            if (possible) {
                minOps = Math.min(minOps, operations);
            }
        }

        return (minOps == Integer.MAX_VALUE) ? -1 : minOps;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        System.out.println(minOperations(arr, k));
    }
}
