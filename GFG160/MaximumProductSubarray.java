class Solution {
    int maxProduct(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        int ans = arr[0];
        for(int i=1;i<arr.length;i++) {
            if(arr[i]>0) {
                max = Math.max(arr[i],arr[i]*max);
                min = Math.min(arr[i],arr[i]*min);
            }else if(arr[i]==0) {
                max = 0;
                min = 0; 
            }else {
                int temp = max;
                max = Math.max(arr[i],arr[i]*min);
                min = Math.min(arr[i],arr[i]*temp);
            }
            ans = Math.max(ans,max);
        }
        return ans;
    }
}