// public class seven {

//     class Solution {
//         public void nextPermutation(int[] nums) {
//             int index=-1;

//             // it will find the breakpoint
//             for(int i=nums.length-1;i>0;i--){
//                 if(nums[i]>nums[i-1]){
//                     index = i-1;
//                     break;
//                 }
//             }
//             // if no break point is found that means the array is sorted then we will reverse it
//             if(index == -1){
//                 reverse(nums,0);
//                 return;
//             }

//             // here we will swap the break point with the just greater number and will reverse the array to find the next permutation
//             for(int j=nums.length-1;j>index;j--){
//                 if(nums[index]<nums[j]){
//                     swap(nums,index,j);
//                     reverse(nums,index+1);
//                     break;
//                 }
//             }
//         }
//         void swap (int []nums ,int i ,int j){
//             int temp = nums[i];
//             nums[i]=nums[j];
//             nums[j]=temp;
//         }
//         void reverse(int []nums ,int k){
//             int j=nums.length-1;
//             while(k<j){
//                 swap(nums ,k,j);
//                 k++;
//                 j--;
//             }
//         }
//     }