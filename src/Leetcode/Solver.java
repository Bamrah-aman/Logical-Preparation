package Leetcode;

public class Solver {

    public boolean canJump(int[] nums) {
        //2,3,1,1,4
        int endPosition = nums.length - 1;
        int temp =0;
        boolean flag = false;
        if(nums.length == 1 || nums.length == 2) {
            return true;
        }
        for(int i=1; i< nums.length; i++) {
            temp = temp + nums[i];
            if(temp == endPosition) {
                flag = true;
                break;
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        boolean i = new Solver().canJump(new int[]{2, 0});
        System.out.println(i);
    }
}
