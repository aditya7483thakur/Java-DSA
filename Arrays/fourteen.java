// public class fourteen {
//     class Solution {
//         public int findMin(int[] nums) {
//             int low=0,high=nums.length-1,answer=Integer.MAX_VALUE;
//             while(low<=high){
//                 int mid=(low+high)/2;
//                 if(nums[mid]<=nums[high]){
//                     answer=Math.min(answer,nums[mid]);
//                     high = mid-1;
//                 }
//                 else{
//                     answer = Math.min(answer,nums[low]);
//                     low = mid+1;
//                 }
//             }
//             return answer;
//         }
//     }
// }
