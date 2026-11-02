class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> n=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(n.containsKey(nums[i])){
                n.put(nums[i], n.get(nums[i])+1);
            }
            else{
                n.put(nums[i],1);
            }
        }
        
        int[] res=new int[k];
        for(int j=0;j<k;j++){
            int maxfreq=0;
            int maxKey=0;

            for(int i:n.keySet()){
                int freq=n.get(i);
            
                if(freq>maxfreq){
                maxfreq=freq;
                maxKey=i;

            }}
            res[j]=maxKey;
            n.remove(maxKey);
            
        }

        return res;
    }
}