package com.propose.easy;

/**
 * @author js_liuyangchao@163.com
 * @create 2018-03-26 20:42
 * @desc
 * 给定一个整数数列，找出其中和为特定值的那两个数。
 * 你可以假设每个输入都只会有一种答案，同样的元素不能被重用。
 * 示例:
 * 给定 nums = [2, 7, 11, 15], target = 9
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 * 状态：已通过
 **/
public class Solution {

    public int[] twoSum(int[] nums, int target){
        for(int i=0; i<nums.length; i++){
            for(int j=nums.length-1; j>0; j--){
                if(i<j && (nums[i]+nums[j])==target)
                    return new int[]{i, j};
            }
        }
        return new int[]{-1, -1};
    }

}
