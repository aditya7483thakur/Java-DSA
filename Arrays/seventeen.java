// public class seventeen {
//     class Solution {
//         public int maxArea(int[] height) {
//             int water = Integer.MIN_VALUE;
//             int l=0;
//             int r=height.length-1;
//             while(l<r){
//                 water = Math.max(water,(r-l)*Math.min(height[l],height[r]));
//                 if(height[l]>=height[r]){
//                     r--;
//                 }
//                 else{
//                     l++;
//                 }
//             }
//             return water;
//         }
//     }
// }
