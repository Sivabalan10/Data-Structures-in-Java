public class Search {
    public static void main(String[] args) {
        int a[] = { 3, 2, 14, 45, 6, 53, 14 };
        int target = 45;
        int res = LinearSearch(a, target);
        int res2 = BinarySearch(a, target);
        System.out.println("Linear Search: " + res);
        System.out.println("Binary Search: " + res2);
    }

    public static int LinearSearch(int a[], int target) {
        int steps_linear = 0;
        for (int i = 0; i < a.length; i++) {
            steps_linear += 1;
            if (a[i] == target) {
                System.out.println("Found!");
                break;
            }
        }
        return steps_linear;
    }

    public static int BinarySearch(int a[], int target) {
        int steps_binary = 0;
        int start = 0;
        int end = a.length - 1;
        int mid = (start + end) / 2;
        while (start < end) {
            steps_binary += 1;
            if (a[mid] == target) {
                System.out.println("Found!");
                return steps_binary;
            } else if (a[mid] > target) {
                end = mid - 1;
                mid = (start + end) / 2;
            } else {
                start = mid + 1;
                mid = (start + end) / 2;
            }
        }
        return steps_binary;
    }
}
