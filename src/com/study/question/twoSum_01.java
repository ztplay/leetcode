package com.study.question;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: zhant
 * @Date: 2019/6/5/0005 16:52
 * @Description:
 */
public class twoSum_01 {
    public int[] towSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int num = target - nums[i];
            if (map.containsKey(num)) {
                return new int[]{map.get(num), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("no solution!");
    }
}
