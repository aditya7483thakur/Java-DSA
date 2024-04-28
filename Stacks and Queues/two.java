
// class Solution
// {
//     //Function to evaluate a postfix expression.
//     public static int evaluatePostFix(String S)
//     {
//         int size = S.length();
//         Stack <Integer> stack = new Stack<>();
//         for(int i = 0;i<size;i++){
//             if(S.charAt(i) == '+' || S.charAt(i) == '-' || S.charAt(i) == '*' || S.charAt(i) == '/'){
                
//                 int b = stack.pop();
//                 int a = stack.pop();
//                 if(S.charAt(i)=='*'){
//                     stack.push(a*b);
//                 }
//                 else if(S.charAt(i)=='-'){
//                     stack.push(a-b);
//                 }
//                 else if(S.charAt(i)=='/'){
//                     stack.push(a/b);
//                 }
//                 else if(S.charAt(i)=='+'){
//                     stack.push(a+b);
//                 }
//             }
//             else{
                
//                 stack.push(Character.getNumericValue(S.charAt(i)));
//             }
//         }
//         return stack.peek();
//     }
// }