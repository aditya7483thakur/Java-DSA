// class Solution {
//     public String largestNumber(int[] arr) {
//           String ans = "";
//           String[] stringArr = new String[arr.length];
//           for (int i = 0; i < arr.length; i++) {
//             stringArr[i] = String.valueOf(arr[i]);
//           }
        
//           Arrays.sort(stringArr,(a,b) -> (b+a).compareTo(a+b));
//           for(int i = 0;i<stringArr.length;i++){
//             ans+=stringArr[i];
//           }

//          if (ans.charAt(0) == '0') {
//     return "0";
// }

//           return ans;


//     }
// }