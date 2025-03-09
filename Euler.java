public class Euler {
    public static void main(String[] args) {
        // 1 to 1000 - 3 or 5 == 0. store then sum = sum+i
        int sum = 0;
        for (int i = 1; i < 1000; i++) {
            if ((i % 3 == 0) || (i % 5 == 0)) {
                sum += i;
            }
        }
        System.out.println(sum);
        System.out.println(3 % 3);
        int nums[] = { 0, 1, 2, 2, 3, 0, 4, 2 };
        int val = 2;

        // int res = removeElement(nums, val);
        // System.out.println(res);

        int[] nums2 = { -3, -1, -1, 0, 0, 0, 0, 0, 2 };
        int res2 = removeDuplicates(nums2);
        System.out.println(res2);
    }

    public static int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                k++;
            }
        }
        k = nums.length - k;
        int i = 0;
        while (i < nums.length) {
            if (nums[i] == val) {
                int j = i;
                System.out.println("new:" + nums[i]);
                while (j < nums.length - 1) {
                    nums[j] = nums[j + 1];

                    System.out.println("it" + nums[i]);

                }
                i = i + 1;
            }
        }
        for (int x = 0; x < nums.length; x++) {
            System.out.print(nums[x] + " ");
        }

        return k;
    }

    public static int removeDuplicates(int[] nums) {
        int k = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                k++;
            }
        }
        k = nums.length - k;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                int j = i;
                while (j < nums.length - 1) {
                    nums[j] = nums[j + 1];
                    j = j + 1;
                }
            }
            if (i > 0) {
                if (nums[i - 1] == nums[i]) {
                    int j = i - 1;
                    while (j < nums.length - 1) {
                        nums[j] = nums[j + 1];
                        j = j + 1;
                    }
                }
            }
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        return k;
    }
}
