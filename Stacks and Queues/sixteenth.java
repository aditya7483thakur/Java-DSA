// import java.util.Stack;

// public class sixteenth {
    
// class Solution
// { 
//     //Function to find if there is a celebrity in the party or not.
//     int celebrity(int M[][], int n)
//     {
//         Stack<Integer> s = new Stack<>();
//         for(int i = 0;i<n;i++){
//             s.push(i);
//         }
        
//         while(s.size() != 1){
//             int a = s.pop();
//             int b = s.pop();
            
//             if(M[a][b]==1){
//                 s.push(b);
//             }else{
//                 s.push(a);
//             }
//         }
        
//         int candidate = s.peek();
        
//         int zeroCount = 0;
//         for(int i = 0;i<n;i++){
//             if(M[candidate][i]==0){
//                 zeroCount++;
//             }
//         }
        
//         if(zeroCount != n){
//             return -1;
//         }
        
//         int oneCount = 0;
        
//         for(int i = 0;i<n;i++){
//             if(M[i][candidate]==1){
//                 oneCount++;
//             }
//         }
        
//         if(oneCount != n-1){
//             return -1;
//         }
        
//         return candidate;
//     }
// }
// }
