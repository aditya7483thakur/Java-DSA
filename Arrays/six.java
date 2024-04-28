// public class six {
//     class Solution {
//         public int search(int[] nums, int target) {
//             int low=0,high=nums.length-1;
//             while(low<=high){
//                 int mid = (high+low)/2;
//                 if(nums[mid]==target){
//                     return mid;
//                 }

//                 // this will check that whether left side of mid is sorted or not.
//                 else if(nums[low]<=nums[mid]){

//                     // if the left side is sorted we will check that whether the target lies in it or not
//                     if(nums[low]<=target && target<=nums[mid]){
//                         high = mid-1;
//                     }
//                     else{
//                         low = mid+1;
//                     }
//                 }

//                 // this will check that whether right side of mid is sorted or not.
//                 else{

//                     // if the left side is sorted we will check that whether the target lies in it or not
//                     if(nums[mid]<=target && target<=nums[high]){
//                         low = mid+1;
//                     }
//                     else{
//                         high = mid-1;
//                     }
//                 }
//             }
//             return -1;
//         }
//     }
// }
// // did it from striver search in rotated sorted array
// // as it says sorted and rotated we will use somekind of binary search



// // This is for duplicate numbers (In this they will not ask for  the index of number because for that we need to do linear search , instead of this they will ask that whether the number exists or not.
// public class six {
//     class Solution {
//         public boolean search(int[] nums, int target) {
//             int low=0,high=nums.length-1;
//             while(low<=high){
//                 int mid = (high+low)/2;
//                 if(nums[mid]==target){
//                     return true;
//                 }

//                 // test case could be - {3 1 2 3 3 3 3}
//                 // and this condition can handle these type of cases .
//                 if(nums[mid]==nums[low] && nums[mid]==nums[high]){
//                     low++;
//                     high--;
//                     continue;
//                 }


//                 // this will check that whether left side of mid is sorted or not.
//                 if(nums[low]<=nums[mid]){

//                     // if the left side is sorted we will check that whether the target lies in it or not
//                     if(nums[low]<=target && target<=nums[mid]){
//                         high = mid-1;
//                     }
//                     else{
//                         low = mid+1;
//                     }
//                 }

//                 // this will check that whether right side of mid is sorted or not.
//                 else{

//                     // if the left side is sorted we will check that whether the target lies in it or not
//                     if(nums[mid]<=target && target<=nums[high]){
//                         low = mid+1;
//                     }
//                     else{
//                         high = mid-1;
//                     }
//                 }
//             }
//             return false;
//         }
//     }
// }