// public class thirteen {
//     class Solution {
//         public int maxProduct(int[] nums) {
//             int product=Integer.MIN_VALUE,preffix=1,suffix=1,n=nums.length;
//             for(int i=0;i<n;i++){
//                 if(preffix==0){
//                     preffix=1;
//                 }
//                 if(suffix==0){
//                     suffix=1;
//                 }
//                 preffix=preffix*nums[i];
//                 suffix=suffix*nums[n-i-1];
//                 product = Math.max(product,Math.max(preffix,suffix));
//             }
//             return product;
//         }
//     }
// }
