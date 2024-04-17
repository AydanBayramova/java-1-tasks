package LeetCode;

public class sum {
    public static void main(String[] args) {
//        int[] nums={6,8,0,6,3};
//        int target=9;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i]+nums[i+1]==target){
//                System.out.println(i+" "+(i+1));
//                break;
//            }
//        }
        System.out.println(twoSum(new int[]{3, 3, 5}, 6));
        int sums[]=twoSum(new int[]{2,3,4},5);
        System.out.println();
    }
    public static int[] twoSum(int[] nums, int target) {
        int[] sum = new int[0];
        int i;
        for (i = 0; i < nums.length; i++) {
            if (nums[i] + nums[i + 1] == target) {
                int sum1 = nums[i];
                int sum2 = nums[i + 1];
                break;
            }
        }
        return new int[]{nums[i],nums[i+1]};
    }

    }
