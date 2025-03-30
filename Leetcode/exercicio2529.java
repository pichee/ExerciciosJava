class Solution {
    public int maximumCount(int[] nums) {
        int ContMaior=0;
        int ContMenor=0;        
        for(int i = 0;i<nums.length;i++){
            if(nums[i]>0){
                ContMaior++;
            }

            if(nums[i]<0){
                ContMenor++;
            }
        }
        if(ContMaior>ContMenor){
            return ContMaior;
        }else{
            return ContMenor;
        }
        
    }
}
