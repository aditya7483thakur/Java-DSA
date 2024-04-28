// public class twelve {
//     class Solution {
//         public int[] productExceptSelf(int[] nums) {
//             int answer[] = new int[nums.length];
//             int product = 1;
//             for(int i=0;i<nums.length;i++){
//                 product=product*nums[i];
//                 answer[i] = product;
//             }
    
//             product = 1;
//             for(int i=nums.length-1;i>0;i--){
//                 answer[i]=product*answer[i-1];
//                 product *= nums[i];
//             }
//             answer[0]=product;
//             return answer;
//         }
        
//     }
// }
