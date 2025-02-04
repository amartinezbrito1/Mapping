/*
from leetCode series
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

 

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]

Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
*/

import java.util.Map;
import java.util.HashMap;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        // map to store our numbers after first iteration thru the array
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            // math solution is: current + x = target
            // x = target - current
            int x = target - nums[i]; // Changed 'cur' to 'nums[i]'
            if (map.containsKey(x)) {
                return new int[] { map.get(x), i };
            }
            // if above statement is false just keep storing the values|index to the map
            // value, index(seen)
            map.put(nums[i], i); // Changed 'cur' to 'nums[i]'
        }
        return null;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        int[] result = solution.twoSum(nums, target);
        System.out.println(java.util.Arrays.toString(result));
    }
}
