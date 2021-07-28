package com.emisdep;

import java.util.HashMap;

public class MajorityElement {

    class Solution {
        public int majorityElement(int[] nums) {
            HashMap<Integer, Integer> numsMap = new HashMap<>();

            for(Integer num : nums) {
                if(!numsMap.containsKey(num)) {
                    numsMap.put(num, 1);
                } else {
                    int counter = numsMap.get(num);
                    counter++;
                    numsMap.put(num, counter);
                }
            }

            int majorityElement = nums.length / 2;
            int output = 0;

            for(int num : numsMap.keySet()) {
                if (numsMap.get(num) > majorityElement) {
                    output = num;
                }
            }

            return output;
        }
    }
}
