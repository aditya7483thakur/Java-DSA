// public class nine {
//     public class Solution {
//         // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
//         public int[] repeatedNumber(final int[] A) {
//             int a=-1,b=-1;
//             int [] arr= new int[A.length];
//             int [] ans = new int[2];
//             for(int i=0;i<A.length;i++){
//                 arr[i]=0;
//             }
//             for(int i=0;i<A.length;i++){
//                 arr[A[i]-1]+=1;
//             }
//             for(int i=0;i<A.length;i++){
//                 if(arr[i]==2){
//                     a=i+1;
//                 }
//                 else if(arr[i]==0){
//                     b=i+1;
//                 }
//             }
//             ans[0]=a;
//             ans[1]=b;
//             return ans;
//         }
//     }
// }
