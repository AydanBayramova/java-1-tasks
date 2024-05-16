package LeetCode;

public class sum {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int target = 4;
        int[] result = sum(nums, target);

        if (result != null) {
            System.out.println("Indices of the two numbers that add up to " + target + " are: " + result[0] + " and " + result[1]);
        } else {
            System.out.println("No two numbers found that add up to " + target);
        }
    }

    public static int[] sum(int[] sum, int target) {
        for (int i = 0; i <sum.length; i++) {
            for (int j = 1; j < sum.length-1; j++) {
             if (i!=j && sum[i] + sum[j] == target){
                     return new int[]{i,j};
             }
            }
        }
        return null;
    }
    }


