import java.util.*;

class Solution {
    public int solution(int[] nums) {
        HashSet<Integer> hash = new HashSet<>();
        
        for(int i = 0;i < nums.length; i++){
            hash.add(nums[i]);
        }
        
        if(hash.size() > nums.length/2){
            return nums.length/2;
        }else{
            return hash.size();
        }
    }
}