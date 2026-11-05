class Solution {
    public int maxArea(int[] heights) {
         int size =  heights.length;
        int max=-1;
        // for(int i=0;i<size;i++){
        //     for(int j=i+1;j<size;j++){
        //         int length = Math.min(heights[i],heights[j]);
        //         int width = j-i;
        //         int area = length * width;

        //         if(area>max){
        //             max=area;
        //         }
        //     }
        // }
        // return max;

        // Approach 2

        int left = 0; int right = size-1;
        while(left<right){
            int l = Math.min(heights[left],heights[right]);
            int w = right-left;
            int area = l*w;
            max = Math.max(area,max);
           
            while(left<right && heights[left] <= l){
                left++;
            }
            while(left<right && heights[right]<=l){
                right--;
            }
        }
        return max;
    }
}
