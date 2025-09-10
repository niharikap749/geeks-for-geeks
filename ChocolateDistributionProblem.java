class Solution {
    public int findMinDiff(ArrayList<Integer> arr, int m) {
        if (arr == null || arr.size() < m || m == 0) return 0;

        Collections.sort(arr);
        int min = Integer.MAX_VALUE;

        for (int i = 0; i + m - 1 < arr.size(); i++) {
            int diff = arr.get(i + m - 1) - arr.get(i);
            min = Math.min(min, diff);
        }

        return min;
    }
}