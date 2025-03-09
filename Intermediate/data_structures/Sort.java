public class Sort {
    public static void main(String[] args) {
        int arr[] = { 6, 5, 2, 8, 9, 4 };
        BubbleSort(arr);
        SelectionSort(arr);
        InsertionSort(arr);
    }

    public static int[] BubbleSort(int nums[]) {
        int step = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                step += 1;
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        System.out.println("Bubble sort: " + step);
        System.out.println();
        return nums;
    }

    public static int[] SelectionSort(int nums[]) {
        int temp = 0;
        int MinIndex = 0;
        int step = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            MinIndex = i;
            for (int j = i + 1; j < nums.length - 1 - i; j++) {
                step += 1;
                if (nums[MinIndex] > nums[j]) {
                    MinIndex = j;
                }
            }
            temp = nums[i];
            nums[i] = nums[MinIndex];
            nums[MinIndex] = temp;
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        System.out.println("Selection sort: " + step);
        return nums;
    }

    public static int[] InsertionSort(int nums[]) {
        int step = 0;
        for (int i = 1; i < nums.length; i++) {
            step++;
            int key = nums[i];
            int j = i - 1;
            while ((nums[j] > key) && (j >= 0)) {
                step++;
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = key;
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        System.out.println("Insertion Sort: " + step);
        return nums;
    }
}
