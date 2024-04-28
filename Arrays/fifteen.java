// class Solution{
//     public int[] pairFind(int [] arr,int x, int n){
//         int pivot = 0;
//         int ans[] = new int[2];
//         for(int i = 1;i<n;i++){
//             if(arr[i-1]>arr[i]){
//                 pivot = i-1;
//                 break;
//             }
//         }
//         int left = pivot;
//         int right = pivot+1;
//         while(left != right){
//             if(arr[left]+arr[right]==x){
//                 ans[0] = arr[left];
//                 ans[1] = arr[right];
//                 break;
//             }else if(arr[left]+arr[right]<x){
//                 right = (right+1)%n;
//             }else{
//                 left = (left-1+n)%n;
//             }
//         }
//         return ans;
//     }
    
//     public static void main(String[] args){
//         Solution obj = new Solution();
//         int [] arr = {11, 15, 26, 38, 9, 10};
//         int n = 6;
//         int x = 45;
//         int [] ans = obj.pairFind(arr,x,n);
//         System.out.println(ans[0]+"   "+ans[1]);
//     }
// }