class Solution {
    public int maxCircularSum(int arr[]) {
        int totalSum = 0;
        int maxEnding = arr[0];
        int minEnding = arr[0];
        int maxKadane = arr[0];
        int minKadane = arr[0];
        for(int i=0;i<arr.length;i++) {
            totalSum+=arr[i];
            if(i>0) {
                maxEnding = Math.max(arr[i],arr[i]+maxEnding);
                maxKadane = Math.max(maxKadane,maxEnding);
                minEnding = Math.min(arr[i],arr[i]+minEnding);
                minKadane = Math.min(minKadane,minEnding);
            }
        }
        if(maxKadane<0) return maxKadane;
        return Math.max(maxKadane,totalSum-minKadane);
    }
}
