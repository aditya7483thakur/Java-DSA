// import java.util.List;
// import java.util.Comparator;
// import java.util.ArrayList;
// import java.util.Arrays;
// public class Solution {
//     public static List< List< Integer > > mergeOverlappingIntervals(int [][]arr){
//         Arrays.sort(arr,new Comparator<int []>(){
//             public int compare(int[] a, int[] b){
//                 return a[0]-b[0];
//             }
//         });
//         List<List<Integer>> answer = new ArrayList<>();
//         int n = arr.length;
//         for(int i=0;i<n;i++){
//             if(answer.isEmpty()||answer.get(answer.size()-1).get(1)<arr[i][0]){
//                 answer.add(Arrays.asList(arr[i][0],arr[i][1]));
//             }
//             else{
//                 answer.get(answer.size()-1).set(1,Math.max(answer.get(answer.size()-1).get(1),arr[i][1]));
//             }
//         }
//         return answer;
//     }
// }
