// public class five {
//     class Solution
//     {
//         public long findMinDiff (ArrayList<Integer> a, int n, int m)
//         {
//             long mindiff = Integer.MAX_VALUE; //return is long as they asked for it.
//             Collections.sort(a); // this is the method to sort an arrayList.
//             for(int i=0;i<n-m+1;i++){
//                 mindiff=Math.min(a.get(i+m-1)-a.get(i),mindiff); // this will give the minimum value
//             }
//             return mindiff;
//         }
//     }
// }

// // the main intution is that it will sort and give the will find the minmum difference at the number of students gap.